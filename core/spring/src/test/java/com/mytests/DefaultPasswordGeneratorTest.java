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

import org.apache.syncope.common.lib.policy.AbstractPasswordRuleConf;
import org.apache.syncope.common.lib.policy.DefaultPasswordRuleConf;
import org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy;
import org.apache.syncope.core.provisioning.api.rules.PasswordRule;
import org.apache.syncope.core.spring.security.DefaultPasswordGenerator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

// Test suite per il metodo generate della classe DefaultPasswordGenerator.
public class DefaultPasswordGeneratorTest {

    // Sottoclasse di test per avere il controllo sulle regole restituite
    static class TestablePasswordGenerator extends DefaultPasswordGenerator {
        private final List<PasswordRule> rulesToReturn = new ArrayList<>();

        // Metodo per impostare le regole simulate prima di ogni test
        public void setRulesToReturn(List<PasswordRule> rules) {
            this.rulesToReturn.clear();
            if (rules != null) {
                this.rulesToReturn.addAll(rules);
            }
        }

        @Override
        protected List<PasswordRule> getPasswordRules(final PasswordPolicy policy) {
            if (policy == null) {
                throw new NullPointerException("policy cannot be null");
            }
            return this.rulesToReturn;
        }

        public DefaultPasswordRuleConf testableMerge(List<DefaultPasswordRuleConf> confs) {
            return super.merge(confs);
        }
    }

    // Tipi di liste di policy
    private enum PolicyInputType {
        EMPTY_LIST,
        SINGLE_POLICY,
        MERGE_MIN_LENGTH,
        MERGE_MAX_LENGTH,
        CONFLICTING_LENGTHS,
        MERGE_CHARACTER_RULES,
        ZERO_MIN_LENGTH,
        LIST_WITH_NULL,
        NO_COMPATIBLE_RULES,
        ILLEGAL_CHARS,
        WORDS_NOT_PERMITTED,
        ALPHABETICAL_LOWERCASE_SPECIAL,
        USERNAME_ALLOWED_MIN_ZERO,
        MIN_GREATER_THAN_MAX,
        REPEAT_SAME,
        MERGE_COMBINED,
        NO_MIN_AND_LOW_MAX
    }

    private TestablePasswordGenerator passwordGenerator;

    @BeforeEach
    void setUp() {
        passwordGenerator = new TestablePasswordGenerator();
    }

    // Metodo helper per creare una configurazione di regola
    private static DefaultPasswordRuleConf createRuleConf(Consumer<DefaultPasswordRuleConf> customizer) {
        DefaultPasswordRuleConf conf = new DefaultPasswordRuleConf();
        customizer.accept(conf);
        return conf;
    }

    // Metodo helper per creare un mock di PasswordRule a partire da una configurazione
    private static PasswordRule createMockRule(DefaultPasswordRuleConf conf) {
        PasswordRule rule = Mockito.mock(PasswordRule.class);
        when(rule.getConf()).thenReturn(conf);
        return rule;
    }

    // Metodo che fornisce i dati per il test parametrico
    private static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of(PolicyInputType.EMPTY_LIST, (Consumer<String>) pw -> {
                    assertTrue(pw.length() >= 8 && pw.length() <= 64);
                }),
                Arguments.of(PolicyInputType.SINGLE_POLICY, (Consumer<String>) pw -> {
                    assertTrue(pw.length() >= 10);
                    assertTrue(pw.chars().anyMatch(Character::isDigit));
                    assertTrue(pw.chars().anyMatch(Character::isUpperCase));
                }),
                Arguments.of(PolicyInputType.MERGE_MIN_LENGTH, (Consumer<String>) pw -> {
                    assertTrue(pw.length() >= 12);
                }),
                Arguments.of(PolicyInputType.MERGE_MAX_LENGTH, (Consumer<String>) pw -> {
                    assertTrue(pw.length() <= 15);
                }),
                Arguments.of(PolicyInputType.CONFLICTING_LENGTHS, (Consumer<String>) pw -> {
                    assertEquals(15, pw.length());
                }),
                Arguments.of(PolicyInputType.MERGE_CHARACTER_RULES, (Consumer<String>) pw -> {
                    assertTrue(pw.chars().filter(Character::isDigit).count() >= 3);
                    assertTrue(pw.chars().filter(Character::isUpperCase).count() >= 1);
                }),
                Arguments.of(PolicyInputType.ZERO_MIN_LENGTH, (Consumer<String>) pw -> {
                    assertTrue(pw.length() >= 8);
                }),
                Arguments.of(PolicyInputType.NO_COMPATIBLE_RULES, (Consumer<String>) pw -> {
                    assertTrue(pw.length() >= 8);
                }),
                Arguments.of(PolicyInputType.LIST_WITH_NULL, NullPointerException.class),
                Arguments.of(PolicyInputType.ILLEGAL_CHARS, (Consumer<String>) pw -> {
                    assertFalse(pw.contains("$"));
                    assertFalse(pw.contains("#"));
                }),
                Arguments.of(PolicyInputType.WORDS_NOT_PERMITTED, (Consumer<String>) pw -> {
                    assertFalse(pw.contains("abc"));
                }),

                // Test aggiuntivi dopo Jacoco
                Arguments.of(PolicyInputType.ALPHABETICAL_LOWERCASE_SPECIAL, (Consumer<String>) pw -> {
                    assertTrue(pw.chars().filter(Character::isLowerCase).count() >= 3);
                }),
                Arguments.of(PolicyInputType.USERNAME_ALLOWED_MIN_ZERO, (Consumer<String>) pw -> {
                    assertTrue(pw.length() >= 8);
                }),
                Arguments.of(PolicyInputType.MIN_GREATER_THAN_MAX, (Consumer<String>) pw -> {
                    assertTrue(pw.length() >= 20);
                }),
                Arguments.of(PolicyInputType.REPEAT_SAME, (Consumer<String>) pw -> {
                    assertNotNull(pw);
                    assertFalse(pw.isEmpty());
                }),
                Arguments.of(PolicyInputType.MERGE_COMBINED, (Consumer<String>) pw -> {
                    assertTrue(pw.length() >= 12);
                    assertFalse(pw.contains("$"));
                    assertTrue(pw.chars().anyMatch(c -> "@#!".indexOf(c) >= 0));
                }),
                Arguments.of(PolicyInputType.NO_MIN_AND_LOW_MAX, (Consumer<String>) pw -> {
                    assertEquals(5, pw.length());
                })

                // Test failure
                //Arguments.of(PolicyInputType.NO_COMPATIBLE_RULES, IllegalArgumentException.class)
        );
    }

    @ParameterizedTest
    @MethodSource("data")
    void testGenerate(PolicyInputType inputType, Object expectedOutput) {
        List<PasswordPolicy> policies = new ArrayList<>();
        List<PasswordRule> rules = new ArrayList<>();

        switch (inputType) {
            case EMPTY_LIST, NO_COMPATIBLE_RULES:
                if (inputType == PolicyInputType.NO_COMPATIBLE_RULES) {
                    policies.add(Mockito.mock(PasswordPolicy.class));
                }
                break;

            case SINGLE_POLICY:
                policies.add(Mockito.mock(PasswordPolicy.class));
                rules.add(createMockRule(createRuleConf(conf -> {
                    conf.setMinLength(10);
                    conf.setDigit(1);
                    conf.setUppercase(1);
                })));
                break;

            case MERGE_MIN_LENGTH:
                policies.add(Mockito.mock(PasswordPolicy.class));
                policies.add(Mockito.mock(PasswordPolicy.class));
                rules.add(createMockRule(createRuleConf(conf -> conf.setMinLength(8))));
                rules.add(createMockRule(createRuleConf(conf -> conf.setMinLength(12))));
                break;

            case MERGE_MAX_LENGTH:
                policies.add(Mockito.mock(PasswordPolicy.class));
                policies.add(Mockito.mock(PasswordPolicy.class));
                rules.add(createMockRule(createRuleConf(conf -> conf.setMaxLength(20))));
                rules.add(createMockRule(createRuleConf(conf -> conf.setMaxLength(15))));
                break;

            case CONFLICTING_LENGTHS:
                policies.add(Mockito.mock(PasswordPolicy.class));
                policies.add(Mockito.mock(PasswordPolicy.class));
                rules.add(createMockRule(createRuleConf(conf -> conf.setMinLength(15))));
                rules.add(createMockRule(createRuleConf(conf -> conf.setMaxLength(10))));
                break;

            case MERGE_CHARACTER_RULES:
                policies.add(Mockito.mock(PasswordPolicy.class));
                policies.add(Mockito.mock(PasswordPolicy.class));
                rules.add(createMockRule(createRuleConf(conf -> conf.setDigit(2))));
                rules.add(createMockRule(createRuleConf(conf -> {
                    conf.setUppercase(1);
                    conf.setDigit(3);
                })));
                break;

            case ZERO_MIN_LENGTH:
                policies.add(Mockito.mock(PasswordPolicy.class));
                rules.add(createMockRule(createRuleConf(conf -> conf.setMinLength(0))));
                break;

            case LIST_WITH_NULL:
                policies.add(Mockito.mock(PasswordPolicy.class));
                policies.add(null);
                break;

            case ILLEGAL_CHARS:
                policies.add(Mockito.mock(PasswordPolicy.class));
                rules.add(createMockRule(createRuleConf(conf -> {
                    conf.getIllegalChars().addAll(Set.of('$', '#'));
                })));
                break;

            case WORDS_NOT_PERMITTED:
                policies.add(Mockito.mock(PasswordPolicy.class));
                rules.add(createMockRule(createRuleConf(conf ->
                        conf.getWordsNotPermitted().add("abc"))));
                break;

            case ALPHABETICAL_LOWERCASE_SPECIAL:
                policies.add(Mockito.mock(PasswordPolicy.class));
                rules.add(createMockRule(createRuleConf(conf -> {
                    conf.setAlphabetical(2);
                    conf.setLowercase(3);
                    conf.setSpecial(1);
                    conf.getSpecialChars().add('@');
                })));
                break;

            case USERNAME_ALLOWED_MIN_ZERO:
                policies.add(Mockito.mock(PasswordPolicy.class));
                rules.add(createMockRule(createRuleConf(conf -> {
                    conf.setMinLength(0);
                    conf.setUsernameAllowed(true);
                })));
                break;

            case MIN_GREATER_THAN_MAX:
                policies.add(Mockito.mock(PasswordPolicy.class));
                rules.add(createMockRule(createRuleConf(conf -> {
                    conf.setMinLength(20);
                    conf.setMaxLength(10);
                })));
                break;

            case REPEAT_SAME:
                policies.add(Mockito.mock(PasswordPolicy.class));
                rules.add(createMockRule(createRuleConf(conf -> conf.setRepeatSame(3))));
                break;

            case MERGE_COMBINED:
                policies.add(Mockito.mock(PasswordPolicy.class));
                policies.add(Mockito.mock(PasswordPolicy.class));

                rules.add(createMockRule(createRuleConf(conf -> {
                    conf.setUsernameAllowed(true);
                    conf.getSpecialChars().addAll(Set.of('@', '!'));
                    conf.setSpecial(1);
                    conf.getIllegalChars().add('$');
                    conf.getWordsNotPermitted().add("password");
                })));

                rules.add(createMockRule(createRuleConf(conf -> {
                    conf.setMinLength(12);
                    conf.setUsernameAllowed(false);
                    conf.getSpecialChars().addAll(Set.of('!', '#'));
                    conf.setSpecial(1);
                    conf.getIllegalChars().add('%');
                    conf.getWordsNotPermitted().add("admin");
                })));
                break;

            case NO_MIN_AND_LOW_MAX:
                policies.add(Mockito.mock(PasswordPolicy.class));
                policies.add(Mockito.mock(PasswordPolicy.class));
                rules.add(createMockRule(createRuleConf(conf -> {})));
                rules.add(createMockRule(createRuleConf(conf -> {
                    conf.setMaxLength(5);
                })));
                break;

        }

        passwordGenerator.setRulesToReturn(rules);

        // Gestione di output con eccezione
        if (expectedOutput instanceof Class && Throwable.class.isAssignableFrom((Class<?>) expectedOutput)) {
            assertThrows((Class<? extends Throwable>) expectedOutput,
                    () -> passwordGenerator.generate(policies));
        }
        // Gestione di output valido
        else if (expectedOutput instanceof Consumer) {
            String generatedPassword = assertDoesNotThrow(() -> passwordGenerator.generate(policies));
            assertNotNull(generatedPassword);
            assertFalse(generatedPassword.isEmpty());

            System.out.println("Scenario: " + inputType + " -> Password Generata: " + generatedPassword);

            @SuppressWarnings("unchecked")
            Consumer<String> validator = (Consumer<String>) expectedOutput;
            validator.accept(generatedPassword);
        }
    }

    // Test aggiuntivo dopo PIT
    @Test
    void testMergeLogicAndBoundaries() {
        DefaultPasswordRuleConf rule1 = createRuleConf(conf -> {
            conf.setMinLength(10);
            conf.setMaxLength(20);
            conf.setAlphabetical(2);
            conf.setUppercase(2);
            conf.setLowercase(2);
            conf.setDigit(3);
            conf.setSpecial(1);
            conf.getSpecialChars().addAll(Set.of('@', '$'));
            conf.getIllegalChars().add('a');
            conf.getWordsNotPermitted().add("pass");
            conf.setUsernameAllowed(true);
            conf.setRepeatSame(2);
        });

        DefaultPasswordRuleConf rule2 = createRuleConf(conf -> {
            conf.setMinLength(12);       // Maggiore di rule1
            conf.setMaxLength(20);       // Uguale a rule1
            conf.setAlphabetical(1);     // Minore di rule1
            conf.setUppercase(3);        // Maggiore di rule1
            conf.setLowercase(2);        // Uguale a rule1
            conf.setDigit(1);            // Minore di rule1
            conf.setSpecial(4);          // Maggiore di rule1
            conf.getSpecialChars().addAll(Set.of('!', '@')); // '@' è un duplicato
            conf.getIllegalChars().add('b');
            conf.getWordsNotPermitted().add("word");
            conf.setUsernameAllowed(false);
            conf.setRepeatSame(3);
        });

        DefaultPasswordRuleConf merged = passwordGenerator.testableMerge(List.of(rule1, rule2));

        assertEquals(12, merged.getMinLength());
        assertEquals(20, merged.getMaxLength());
        assertEquals(2, merged.getAlphabetical());
        assertEquals(3, merged.getUppercase());
        assertEquals(2, merged.getLowercase());
        assertEquals(3, merged.getDigit());
        assertEquals(4, merged.getSpecial());
        assertEquals(3, merged.getRepeatSame());
        assertTrue(merged.isUsernameAllowed());
        assertEquals(3, merged.getSpecialChars().size());
        assertTrue(merged.getSpecialChars().containsAll(Set.of('@', '$', '!')));
        assertEquals(2, merged.getIllegalChars().size());
        assertTrue(merged.getIllegalChars().containsAll(Set.of('a', 'b')));
        assertEquals(2, merged.getWordsNotPermitted().size());
        assertTrue(merged.getWordsNotPermitted().containsAll(List.of("pass", "word")));
    }

    @Test
    void testFilterOnIncompatibleRuleType() {
        DefaultPasswordRuleConf validConf = createRuleConf(conf -> conf.setMinLength(10));
        PasswordRule validRule = createMockRule(validConf);

        class AnotherPasswordRuleConf extends AbstractPasswordRuleConf {}

        PasswordRule incompatibleRule = Mockito.mock(PasswordRule.class);
        when(incompatibleRule.getConf()).thenReturn(new AnotherPasswordRuleConf());

        List<PasswordPolicy> policies = List.of(Mockito.mock(PasswordPolicy.class));
        passwordGenerator.setRulesToReturn(List.of(validRule, incompatibleRule));

        String generatedPassword = assertDoesNotThrow(() -> passwordGenerator.generate(policies));

        assertNotNull(generatedPassword);
        assertTrue(generatedPassword.length() >= 10);
    }
}
