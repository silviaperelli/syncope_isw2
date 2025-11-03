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

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import org.apache.syncope.common.lib.policy.DefaultPasswordRuleConf;
import org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy;
import org.apache.syncope.core.provisioning.api.rules.PasswordRule;
import org.apache.syncope.core.spring.policy.DefaultPasswordRule;
import org.apache.syncope.core.spring.security.DefaultPasswordGenerator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Suite di test per DefaultPasswordGenerator.
 *
 * Utilizza una sottoclasse interna per isolare la logica di business dai layer
 * di persistenza, permettendo di testare il comportamento dei metodi protetti
 * attraverso l'interfaccia pubblica.
 */
class LLMDefaultPasswordGeneratorTest {

    private PasswordGeneratorForTest passwordGenerator;

    /**
     * Sottoclasse di DefaultPasswordGenerator specifica per i test.
     * Permette di iniettare regole di password simulate e di ispezionare
     * la configurazione finale dopo il processo di merge.
     */
    private static class PasswordGeneratorForTest extends DefaultPasswordGenerator {

        private List<PasswordRule> rulesToApply = new ArrayList<>();
        private DefaultPasswordRuleConf lastMergedConfiguration;

        @Override
        protected List<PasswordRule> getPasswordRules(final PasswordPolicy policy) {
            // Restituisce le regole definite nel test, bypassando la logica reale.
            return rulesToApply;
        }

        @Override
        protected String generate(final DefaultPasswordRuleConf ruleConf) {
            // Cattura la configurazione unificata prima della generazione della password.
            this.lastMergedConfiguration = ruleConf;
            return super.generate(ruleConf);
        }

        public void setRulesToApply(List<PasswordRule> rules) {
            this.rulesToApply = rules;
        }

        public DefaultPasswordRuleConf getLastMergedConfiguration() {
            return lastMergedConfiguration;
        }
    }

    @BeforeEach
    void setUp() {
        passwordGenerator = new PasswordGeneratorForTest();
    }

    private PasswordRule createMockRule(DefaultPasswordRuleConf conf) {
        DefaultPasswordRule rule = mock(DefaultPasswordRule.class);
        when(rule.getConf()).thenReturn(conf);
        return rule;
    }

    @Test
    void generate_withNoPolicies_usesDefaultValues() {
        String password = passwordGenerator.generate(new ArrayList<>());
        assertNotNull(password);
        // La lunghezza minima di default deve essere 8.
        assertEquals(8, password.length());
    }

    @Test
    void generate_withSinglePolicy_respectsMinLength() {
        DefaultPasswordRuleConf conf = new DefaultPasswordRuleConf();
        conf.setMinLength(14);
        passwordGenerator.setRulesToApply(List.of(createMockRule(conf)));

        String password = passwordGenerator.generate(List.of(mock(PasswordPolicy.class)));

        assertNotNull(password);
        assertEquals(14, password.length());
    }

    @Test
    void generate_mergeLogicForNumericProperties_selectsHighestValue() {
        DefaultPasswordRuleConf conf1 = new DefaultPasswordRuleConf();
        conf1.setMinLength(16);
        conf1.setDigit(3);

        DefaultPasswordRuleConf conf2 = new DefaultPasswordRuleConf();
        conf2.setMinLength(9);  // Valore inferiore, verrà ignorato
        conf2.setDigit(5);      // Valore superiore, verrà scelto

        passwordGenerator.setRulesToApply(List.of(createMockRule(conf1), createMockRule(conf2)));

        String password = passwordGenerator.generate(List.of(mock(PasswordPolicy.class)));
        DefaultPasswordRuleConf merged = passwordGenerator.getLastMergedConfiguration();

        assertEquals(16, merged.getMinLength());
        assertEquals(5, merged.getDigit());
        assertEquals(16, password.length());
    }

    @Test
    void generate_maxLengthMergeLogic_selectsSmallestPositiveValue() {
        DefaultPasswordRuleConf conf1 = new DefaultPasswordRuleConf();
        conf1.setMaxLength(40);

        DefaultPasswordRuleConf conf2 = new DefaultPasswordRuleConf();
        conf2.setMaxLength(25); // Questo valore, essendo il minimo positivo, deve essere selezionato.

        DefaultPasswordRuleConf conf3 = new DefaultPasswordRuleConf();
        conf3.setMaxLength(0); // I valori non positivi vengono ignorati.

        passwordGenerator.setRulesToApply(List.of(createMockRule(conf1), createMockRule(conf2), createMockRule(conf3)));

        String password = passwordGenerator.generate(List.of(mock(PasswordPolicy.class)));
        DefaultPasswordRuleConf merged = passwordGenerator.getLastMergedConfiguration();

        // Verifica che il merge abbia selezionato il maxLength corretto (25).
        assertEquals(25, merged.getMaxLength());
        // La lunghezza effettiva è però basata sul minLength calcolato (8), non sul maxLength.
        assertEquals(8, password.length());
    }

    @Test
    void generate_whenMinLengthExceedsMaxLength_maxLengthIsAdjusted() {
        DefaultPasswordRuleConf minConf = new DefaultPasswordRuleConf();
        minConf.setMinLength(22);

        DefaultPasswordRuleConf maxConf = new DefaultPasswordRuleConf();
        maxConf.setMaxLength(11); // In conflitto con minLength.

        passwordGenerator.setRulesToApply(List.of(createMockRule(minConf), createMockRule(maxConf)));

        String password = passwordGenerator.generate(List.of(mock(PasswordPolicy.class)));
        DefaultPasswordRuleConf merged = passwordGenerator.getLastMergedConfiguration();

        // Il sistema deve correggere maxLength portandolo al valore di minLength.
        assertEquals(22, merged.getMinLength());
        assertEquals(22, merged.getMaxLength());
        assertEquals(22, password.length());
    }

    @Test
    void generate_whenMinLengthIsUnset_itDefaultsToEight() {
        DefaultPasswordRuleConf conf = new DefaultPasswordRuleConf();
        conf.setMaxLength(18); // minLength non è impostato, quindi è 0.
        passwordGenerator.setRulesToApply(List.of(createMockRule(conf)));

        String password = passwordGenerator.generate(List.of(mock(PasswordPolicy.class)));
        DefaultPasswordRuleConf merged = passwordGenerator.getLastMergedConfiguration();

        // minLength dovrebbe essere impostato al valore di default (8).
        assertEquals(8, merged.getMinLength());
        assertEquals(8, password.length());
    }

    @Test
    void generate_whenMinLengthIsUnsetAndMaxIsLow_itDefaultsToMax() {
        DefaultPasswordRuleConf conf = new DefaultPasswordRuleConf();
        conf.setMaxLength(6); // max è inferiore al default di 8.
        passwordGenerator.setRulesToApply(List.of(createMockRule(conf)));

        String password = passwordGenerator.generate(List.of(mock(PasswordPolicy.class)));
        DefaultPasswordRuleConf merged = passwordGenerator.getLastMergedConfiguration();

        // In questo caso, minLength deve essere adeguato a maxLength.
        assertEquals(6, merged.getMinLength());
        assertEquals(6, password.length());
    }

    @Test
    void generate_mergingListBasedRules_combinesElementsWithoutDuplicates() {
        DefaultPasswordRuleConf conf1 = new DefaultPasswordRuleConf();
        conf1.getSpecialChars().add('%');
        conf1.getSpecialChars().add('^');
        conf1.getWordsNotPermitted().add("qwerty");

        DefaultPasswordRuleConf conf2 = new DefaultPasswordRuleConf();
        conf2.getSpecialChars().add('^'); // Duplicato
        conf2.getSpecialChars().add('&'); // Nuovo
        conf2.getWordsNotPermitted().add("12345");

        passwordGenerator.setRulesToApply(List.of(createMockRule(conf1), createMockRule(conf2)));

        passwordGenerator.generate(List.of(mock(PasswordPolicy.class)));
        DefaultPasswordRuleConf mergedConf = passwordGenerator.getLastMergedConfiguration();

        // Verifica che gli elementi siano stati uniti e i duplicati scartati.
        assertEquals(3, mergedConf.getSpecialChars().size());
        assertTrue(mergedConf.getSpecialChars().containsAll(List.of('%', '^', '&')));
        assertEquals(2, mergedConf.getWordsNotPermitted().size());
        assertTrue(mergedConf.getWordsNotPermitted().containsAll(List.of("qwerty", "12345")));
    }

    @Test
    void generate_whenNoCharacterRulesExist_usesFallbackMechanism() {
        DefaultPasswordRuleConf conf = new DefaultPasswordRuleConf();
        conf.setMinLength(16);
        conf.setMaxLength(16);
        passwordGenerator.setRulesToApply(List.of(createMockRule(conf)));

        String password = passwordGenerator.generate(List.of(mock(PasswordPolicy.class)));

        // La password deve rispettare la lunghezza e contenere sia lettere che numeri.
        assertEquals(16, password.length());
        assertTrue(password.chars().anyMatch(Character::isLetter));
        assertTrue(password.chars().anyMatch(Character::isDigit));
    }
}