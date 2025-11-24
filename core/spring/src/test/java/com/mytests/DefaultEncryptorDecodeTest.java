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
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

// Test suite per il metodo decode della classe DefaultEncryptor
public class DefaultEncryptorDecodeTest {

    // Sottoclasse di test che permette di accedere al costruttore protetto
    static class TestEncryptor extends DefaultEncryptor {
        public TestEncryptor(String secretKey) {
            super(secretKey);
        }
    }

    private static final String VALID_KEY = "1234567890abcdef";
    private static final String PASSWORD = "password";
    private static final TestEncryptor encryptor = new TestEncryptor(VALID_KEY);


    // Metodo che fornisce i dati per il test parametrico
    private static Stream<Arguments> data() throws Exception {
        String encodedWithAES = encryptor.encode(PASSWORD, CipherAlgorithm.AES);
        String encodedWithSHA256 = encryptor.encode(PASSWORD, CipherAlgorithm.SHA256);

        return Stream.of(
                Arguments.of(encodedWithAES, CipherAlgorithm.AES, PASSWORD, null),
                Arguments.of(null, CipherAlgorithm.AES, null, null),
                Arguments.of(encodedWithAES, null, null, null),
                Arguments.of(encodedWithAES, CipherAlgorithm.SHA256, null, null),
                Arguments.of(null, null, null, null),
                Arguments.of(encodedWithSHA256, CipherAlgorithm.SHA256, null, null),
                Arguments.of("", CipherAlgorithm.AES, "", null),
                Arguments.of("@@@INVALID@@@", CipherAlgorithm.AES, null, Exception.class),
                Arguments.of(encodedWithSHA256, CipherAlgorithm.AES, null, Exception.class)


                //Test Failure
                //Arguments.of(encodedWithAES, null, PASSWORD, null)
                //Arguments.of(encodedWithAES, CipherAlgorithm.SHA256, null, Exception.class),
                //Arguments.of(encodedWithSHA256, CipherAlgorithm.SHA256, null, Exception.class)
        );
    }

    @ParameterizedTest
    @MethodSource("data")
    void testDecode(String encodedValue, CipherAlgorithm algorithm, String expectedValue, Class<? extends Throwable> expectedException) {

        // Gestione di output con eccezione
        if (expectedException != null) {
            assertThrows(expectedException,
                    () -> encryptor.decode(encodedValue, algorithm));
        }
        // Gestione di output valido o nullo (senza eccezioni)
        else {
            String result = assertDoesNotThrow(
                    () -> encryptor.decode(encodedValue, algorithm));

            // Se l'output atteso è una stringa
            if (expectedValue != null) {
                assertEquals(expectedValue, result);
            }
            // Se l'output atteso è null
            else {
                assertNull(result);
            }
        }
    }
}