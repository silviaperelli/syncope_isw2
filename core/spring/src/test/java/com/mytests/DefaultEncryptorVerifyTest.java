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

// Test suite per il metodo verify della classe DefaultEncryptor
public class DefaultEncryptorVerifyTest {

    // Sottoclasse di test che permette di accedere al costruttore protetto
    static class TestEncryptor extends DefaultEncryptor {
        public TestEncryptor(String secretKey) {
            super(secretKey);
        }
    }

    private static final String VALID_KEY = "1234567890abcdef";
    private static final TestEncryptor encryptor = new TestEncryptor(VALID_KEY);

    // Tipi di valore di input
    private enum ValueType {
        NULL(null),
        EMPTY(""),
        VALID("password"),
        WRONG("wrong");

        private final String value;
        ValueType(String value) { this.value = value; }
        public String getValue() { return value; }
    }

    // Metodo che fornisce i dati per il test parametrico
    private static Stream<Arguments> data() throws Exception {
        String encodedWithAES = encryptor.encode(ValueType.VALID.getValue(), CipherAlgorithm.AES);
        String encodedWithSHA256 = encryptor.encode(ValueType.VALID.getValue(), CipherAlgorithm.SHA256);
        String encodedWithBCRYPT = encryptor.encode(ValueType.VALID.getValue(), CipherAlgorithm.BCRYPT);

        return Stream.of(
                Arguments.of(ValueType.NULL.getValue(), CipherAlgorithm.AES, encodedWithAES, false),
                Arguments.of(ValueType.EMPTY.getValue(), CipherAlgorithm.AES, ValueType.EMPTY.getValue(), false),
                Arguments.of(ValueType.VALID.getValue(), CipherAlgorithm.AES, encodedWithAES, true),
                Arguments.of(ValueType.WRONG.getValue(), CipherAlgorithm.AES, encodedWithAES, false),
                Arguments.of(ValueType.VALID.getValue(), null, encodedWithAES, true),
                Arguments.of(ValueType.VALID.getValue(), CipherAlgorithm.SHA256, encodedWithSHA256, true),
                Arguments.of(ValueType.VALID.getValue(), CipherAlgorithm.AES, encodedWithSHA256, false),
                Arguments.of(ValueType.VALID.getValue(), CipherAlgorithm.AES, "@@@INVALID@@@", false),
                Arguments.of(ValueType.VALID.getValue(), CipherAlgorithm.AES, null, false),

                //Arguments.of(ValueType.VALID.getValue(), CipherAlgorithm.AES, "@@@INVALID@@@", Exception.class)

                // Test aggiuntivi dopo Jacoco
                Arguments.of(ValueType.VALID.getValue(), CipherAlgorithm.BCRYPT, encodedWithBCRYPT, true),
                Arguments.of(ValueType.WRONG.getValue(), CipherAlgorithm.BCRYPT, encodedWithBCRYPT, false),
                Arguments.of(ValueType.VALID.getValue(), CipherAlgorithm.BCRYPT, "@@@INVALID@@@", false)
        );
    }

    @ParameterizedTest
    @MethodSource("data")
    void testVerify(String value, CipherAlgorithm algorithm, String encodedValue, Object expectedOutput) {

        // Gestione di output con eccezione
        if (expectedOutput instanceof Class && Throwable.class.isAssignableFrom((Class<?>) expectedOutput)) {
            assertThrows((Class<? extends Throwable>) expectedOutput,
                    () -> encryptor.verify(value, algorithm, encodedValue));
        }
        // Gestione di output valido booleano
        else {
            boolean result = assertDoesNotThrow(
                    () -> encryptor.verify(value, algorithm, encodedValue));

            // Verifica del risultato atteso (true / false)
            assertEquals(expectedOutput, result,
                    "Il valore restituito non corrisponde all'output atteso");
        }
    }
}
