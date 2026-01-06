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

package org.apache.syncope.core.spring.security;

import org.apache.syncope.common.lib.types.CipherAlgorithm;

/**
 * Test Driver per Randoop.
 * Gestisce l'istanziazione di DefaultEncryptor (che è protected) e
 * guida il testing verso scenari significativi (AES RoundTrip, BCRYPT Verification).
 */
public class DefaultEncryptorRandoopSetup {

    // Chiave valida > 16 caratteri per evitare il warning/padding automatico
    private static final String STATIC_SECRET_KEY = "abcdefghijklmnop123456";

    /**
     * Test specifico per AES (Reversibile).
     * Randoop passa una stringa, qui si verifica che encode -> decode torni l'originale.
     */
    public static boolean testAESRoundTrip(String input) {
        if (input == null) return true;

        try {
            // 1. Creazione (Accesso al costruttore protected)
            DefaultEncryptor encryptor = new DefaultEncryptor(STATIC_SECRET_KEY);

            // 2. Encode
            String encoded = encryptor.encode(input, CipherAlgorithm.AES);
            if (encoded == null) return false;

            // 3. Decode
            String decoded = encryptor.decode(encoded, CipherAlgorithm.AES);

            // 4. Verifica invarianza
            return input.equals(decoded);

        } catch (Exception e) {
            return false;
        }
    }

    /**
     * Test specifico per BCRYPT (One-Way).
     * Verifichiamo che encode -> verify torni true.
     */
    public static boolean testBCryptVerification(String input) {
        if (input == null) return true;

        try {
            DefaultEncryptor encryptor = new DefaultEncryptor(STATIC_SECRET_KEY);

            // 1. Encode (Hashing)
            String hash = encryptor.encode(input, CipherAlgorithm.BCRYPT);
            if (hash == null) return false;

            // 2. Verify (Check password)
            return encryptor.verify(input, CipherAlgorithm.BCRYPT, hash);

        } catch (Exception e) {
            return false;
        }
    }

    /**
     * Test di robustezza: prova a verificare una password sbagliata.
     */
    public static boolean testVerifyFailure(String input, String wrongInput) {
        if (input == null || wrongInput == null || input.equals(wrongInput)) return true;

        try {
            DefaultEncryptor encryptor = new DefaultEncryptor(STATIC_SECRET_KEY);
            String hash = encryptor.encode(input, CipherAlgorithm.BCRYPT);

            // Deve tornare FALSE perché l'input è diverso
            boolean check = encryptor.verify(wrongInput, CipherAlgorithm.BCRYPT, hash);
            return check == false;

        } catch (Exception e) {
            return false;
        }
    }
}