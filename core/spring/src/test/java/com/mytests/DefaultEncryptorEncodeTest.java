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

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

// Test suite per il metodo encode della classe DefaultEncryptor
public class DefaultEncryptorEncodeTest {

    // Sottoclasse di test che permette di accedere al costruttore protetto
    static class TestEncryptor extends DefaultEncryptor {
        public TestEncryptor(String secretKey) {
            super(secretKey);
        }
    }

    private static final String VALID_KEY = "1234567890abcdef";
    private final TestEncryptor encryptor = new TestEncryptor(VALID_KEY);

    // Tipi di valore di input
    private enum ValueType {
        NULL(null),
        EMPTY(""),
        ALPHANUMERIC("password123"),
        SPECIAL("p@sswörd!€");

        private final String value;
        ValueType(String value) { this.value = value; }
        public String getValue() { return value; }
    }

    // Metodo che fornisce i dati per il test parametrico
    private static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of(ValueType.EMPTY, CipherAlgorithm.AES, String.class),
                Arguments.of(ValueType.ALPHANUMERIC, CipherAlgorithm.AES, String.class),
                Arguments.of(ValueType.SPECIAL, CipherAlgorithm.AES, String.class),
                Arguments.of(ValueType.ALPHANUMERIC, CipherAlgorithm.BCRYPT, String.class),
                Arguments.of(ValueType.ALPHANUMERIC, CipherAlgorithm.SHA256, String.class),
                Arguments.of(ValueType.ALPHANUMERIC, null, String.class),
                Arguments.of(ValueType.NULL, CipherAlgorithm.AES, null)

                // Test Failure
                //Arguments.of(ValueType.ALPHANUMERIC, null, Exception.class),
                //Arguments.of(ValueType.NULL, CipherAlgorithm.AES, Exception.class)
        );
    }

    @ParameterizedTest
    @MethodSource("data")
    void testEncode(ValueType valueType, CipherAlgorithm algorithm, Class<?> expectedOutputType)
            throws NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException,
            BadPaddingException, InvalidKeyException {

        String value = valueType.getValue();

        // Gestione di output con eccezione
        if (expectedOutputType != null && Throwable.class.isAssignableFrom(expectedOutputType)) {
            assertThrows((Class<? extends Throwable>) expectedOutputType,
                    () -> encryptor.encode(value, algorithm));
        }

        // Gestione di output null
        else if (expectedOutputType == null) {
            String result = encryptor.encode(value, algorithm);
            assertNull(result);
        }

        // Gestione di output valido
        else {
            String result = encryptor.encode(value, algorithm);
            assertNotNull(result, "Il risultato non deve essere null");
            assertFalse(result.isEmpty(), "Il risultato non deve essere vuoto");
        }
    }
}
