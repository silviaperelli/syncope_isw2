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

import java.util.List;
import org.apache.syncope.common.lib.policy.DefaultPasswordRuleConf;

/**
 * Test Driver per guidare Randoop nel testare la logica interna di DefaultPasswordGenerator.
 */
public class DefaultPasswordGeneratorRandoopSetup {

    /**
     * Sottoclasse per rendere visibili i metodi protected `merge` e `generate`.
     */
    private static class TestablePasswordGenerator extends DefaultPasswordGenerator {
        public DefaultPasswordRuleConf publicMerge(List<DefaultPasswordRuleConf> confs) {
            return super.merge(confs);
        }

        public String publicGenerate(DefaultPasswordRuleConf conf) {
            return super.generate(conf);
        }
    }

    /**
     * Metodo driver principale. Randoop chiamerà questo passando vari interi.
     */
    public static String testGenerateWithSingleRule(
            int minLength, int maxLength, int digit, int uppercase, int lowercase, int special) {

        try {
            TestablePasswordGenerator generator = new TestablePasswordGenerator();

            // 1. Costruiamo la regola con i dati primitivi di Randoop
            DefaultPasswordRuleConf ruleConf = new DefaultPasswordRuleConf();
            ruleConf.setMinLength(minLength);
            ruleConf.setMaxLength(maxLength);
            ruleConf.setDigit(digit);
            ruleConf.setUppercase(uppercase);
            ruleConf.setLowercase(lowercase);
            ruleConf.setSpecial(special);

            // 2. Chiamiamo la logica di merge
            DefaultPasswordRuleConf mergedConf = generator.publicMerge(List.of(ruleConf));

            // 3. Generiamo la password
            return generator.publicGenerate(mergedConf);
        } catch (Exception e) {
            return null;
        }
    }
}