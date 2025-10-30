/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package com.mytests;

import org.apache.syncope.common.lib.types.CipherAlgorithm;
import org.apache.syncope.core.spring.security.DefaultEncryptor;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import javax.crypto.BadPaddingException;
import java.util.Base64;

import static org.junit.jupiter.api.Assertions.*;

/**
 * JUnit 5 test suite for the DefaultEncryptor class.
 * This suite is designed to achieve maximum statement and conditional coverage and
 * to kill a high number of PIT mutants.
 */
class LLMDefaultEncryptorTest {

    // Helper subclass to access the protected constructor of DefaultEncryptor.
    private static class TestEncryptor extends DefaultEncryptor {
        public TestEncryptor(final String secretKey) {
            super(secretKey);
        }
    }

    // A secret key longer than 16 bytes to avoid random padding logic, ensuring repeatable tests.
    private static final String SECRET_KEY = "SuperSecretKeyForTesting123!";
    private DefaultEncryptor encryptor;

    @BeforeEach
    void setUp() {
        // Instantiate the helper subclass instead of the base class directly.
        encryptor = new TestEncryptor(SECRET_KEY);
    }

    // --- Test cases for encode() method ---

    @Test
    @DisplayName("Encode with null value should return null")
    void encodeNullValueReturnsNull() throws Exception {
        // This test covers the initial null check and kills mutants that alter this condition.
        assertNull(encryptor.encode(null, CipherAlgorithm.AES));
    }

    @Test
    @DisplayName("Encode with null algorithm should default to AES")
    void encodeWithNullAlgorithmIsAES() throws Exception {
        // This test covers the `cipherAlgorithm == null` branch and ensures it behaves like AES.
        String plainValue = "password";
        String encoded = encryptor.encode(plainValue, null);
        assertNotNull(encoded);
        String decoded = encryptor.decode(encoded, CipherAlgorithm.AES);
        assertEquals(plainValue, decoded);
    }

    @Test
    @DisplayName("Encode and Decode with AES should work correctly (happy path)")
    void encodeAndDecodeAESSuccessfully() throws Exception {
        // This round-trip test validates the core AES functionality and kills mutants
        // in the encryption/decryption logic.
        String plainValue = "a_very_secret_password";
        String encoded = encryptor.encode(plainValue, CipherAlgorithm.AES);
        assertNotNull(encoded);
        assertNotEquals(plainValue, encoded);

        String decoded = encryptor.decode(encoded, CipherAlgorithm.AES);
        assertEquals(plainValue, decoded);
    }

    @Test
    @DisplayName("Encode with BCRYPT should return a valid hash")
    void encodeBCryptSuccessfully() throws Exception {
        // This test covers the BCRYPT branch and ensures it produces a non-null, valid hash.
        String plainValue = "password12345";
        String encoded = encryptor.encode(plainValue, CipherAlgorithm.BCRYPT);
        assertNotNull(encoded);
        assertTrue(encoded.startsWith("$2a$"));
    }

    @Test
    @DisplayName("Encode with an empty string should work for AES")
    void encodeWithEmptyStringAES() throws Exception {
        // Edge case: Tests encoding of an empty string.
        String plainValue = "";
        String encoded = encryptor.encode(plainValue, CipherAlgorithm.AES);
        assertNotNull(encoded);
        String decoded = encryptor.decode(encoded, CipherAlgorithm.AES);
        assertEquals(plainValue, decoded);
    }

    @Test
    @DisplayName("Encode with a plain digest algorithm (SHA-1) should work")
    void encodePlainDigestAlgorithm() throws Exception {
        // This covers the final `else` branch in encode() using a non-salted digest algorithm,
        // which avoids the dependency on the Spring context.
        String plainValue = "text_to_hash";
        String encoded = encryptor.encode(plainValue, CipherAlgorithm.SHA1);
        assertNotNull(encoded);
        // A SHA-1 hash in hex is 40 characters long.
        assertEquals(40, encoded.length());
    }

    // --- Test cases for decode() method ---

    @Test
    @DisplayName("Decode with null encoded value should return null")
    void decodeNullValueReturnsNull() throws Exception {
        // Covers the `encoded != null` condition in decode.
        assertNull(encryptor.decode(null, CipherAlgorithm.AES));
    }

    @Test
    @DisplayName("Decode with a non-AES algorithm should return null")
    void decodeWithNonAESAlgorithmReturnsNull() throws Exception {
        // Covers the `cipherAlgorithm == CipherAlgorithm.AES` check.
        // Kills mutants that would allow decoding with other algorithms.
        String encodedWithBCrypt = encryptor.encode("test", CipherAlgorithm.BCRYPT);
        assertNull(encryptor.decode(encodedWithBCrypt, CipherAlgorithm.BCRYPT));
        assertNull(encryptor.decode("somevalue", CipherAlgorithm.SHA1));
    }

    @Test
    @DisplayName("Decode with an invalid Base64 string should throw IllegalArgumentException")
    void decodeWithInvalidBase64StringThrowsException() {
        // Edge case: Tests robustness against malformed input.
        // Kills mutants that might suppress exceptions during decoding.
        String invalidBase64 = "this is not base64";
        assertThrows(IllegalArgumentException.class, () ->
                encryptor.decode(invalidBase64, CipherAlgorithm.AES)
        );
    }

    @Test
    @DisplayName("Decode with a corrupted AES payload should throw BadPaddingException")
    void decodeWithCorruptedPayloadThrowsException() throws Exception {
        // Edge case: Simulates data corruption to ensure crypto exceptions are handled.
        String encoded = encryptor.encode("some data", CipherAlgorithm.AES);
        byte[] corrupted = Base64.getDecoder().decode(encoded);
        corrupted[corrupted.length - 1]++; // Tamper with the last byte (padding)
        String corruptedBase64 = Base64.getEncoder().encodeToString(corrupted);

        assertThrows(BadPaddingException.class, () ->
                encryptor.decode(corruptedBase64, CipherAlgorithm.AES)
        );
    }


    // --- Test cases for verify() method ---

    @Test
    @DisplayName("Verify with null value should return false")
    void verifyNullValueReturnsFalse() {
        // Covers the initial null check for the value and kills mutants
        // that change the default return value or the condition.
        assertFalse(encryptor.verify(null, CipherAlgorithm.AES, "someencodedvalue"));
    }

    @Test
    @DisplayName("Verify AES with correct and incorrect password")
    void verifyAESPasswords() throws Exception {
        // Happy path for AES verification and check for incorrect password.
        // Kills mutants that always return true.
        String plainValue = "correct_password";
        String encoded = encryptor.encode(plainValue, CipherAlgorithm.AES);

        assertTrue(encryptor.verify(plainValue, CipherAlgorithm.AES, encoded));
        assertFalse(encryptor.verify("wrong_password", CipherAlgorithm.AES, encoded));
    }

    @Test
    @DisplayName("Verify BCRYPT with correct and incorrect password")
    void verifyBCryptPasswords() throws Exception {
        // Happy path for BCRYPT verification.
        String plainValue = "bcrypt_password";
        String encoded = encryptor.encode(plainValue, CipherAlgorithm.BCRYPT);

        assertTrue(encryptor.verify(plainValue, CipherAlgorithm.BCRYPT, encoded));
        assertFalse(encryptor.verify("wrong_bcrypt_password", CipherAlgorithm.BCRYPT, encoded));
    }

    @Test
    @DisplayName("Verify plain digest (SHA-1) with correct and incorrect password")
    void verifyPlainDigestPasswords() throws Exception {
        // Covers the `else` branch in verify() for digest algorithms.
        String plainValue = "digest_password";
        String encoded = encryptor.encode(plainValue, CipherAlgorithm.SHA1);

        assertTrue(encryptor.verify(plainValue, CipherAlgorithm.SHA1, encoded));
        assertFalse(encryptor.verify("wrong_digest_password", CipherAlgorithm.SHA1, encoded));
    }

    @Test
    @DisplayName("Verify should return false and not throw when an exception occurs internally")
    void verifyExceptionInUnderlyingCallReturnsFalse() {
        // This covers the generic `catch (Exception e)` block in verify().
        // Kills mutants that remove the try-catch block.
        // BCRYPT.checkpw throws an exception for malformed hashes.
        String malformedHash = "not-a-bcrypt-hash";
        assertFalse(encryptor.verify("any_password", CipherAlgorithm.BCRYPT, malformedHash));
    }

    @Test
    @DisplayName("Verify with AES should fail if encryptors have different keys")
    void verifyWithDifferentEncryptorInstanceFailsForAES() throws Exception {
        // Edge case: Validates that the secret key is fundamental to the encryption.
        String plainValue = "shared_secret";
        String encodedWithKey1 = this.encryptor.encode(plainValue, CipherAlgorithm.AES);

        // Create another encryptor with a different secret key.
        DefaultEncryptor encryptor2 = new TestEncryptor("AnotherSecretKeyThatIsDifferent!");

        assertFalse(encryptor2.verify(plainValue, CipherAlgorithm.AES, encodedWithKey1));
    }
}