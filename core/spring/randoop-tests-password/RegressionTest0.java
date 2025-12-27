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

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        org.apache.syncope.core.spring.security.DefaultPasswordGenerator defaultPasswordGenerator0 = new org.apache.syncope.core.spring.security.DefaultPasswordGenerator();
        org.apache.syncope.core.persistence.api.entity.ExternalResource externalResource1 = null;
        org.apache.syncope.core.persistence.api.entity.Realm[] realmArray2 = new org.apache.syncope.core.persistence.api.entity.Realm[] {};
        java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.Realm> realmList3 = new java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.Realm>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.persistence.api.entity.Realm>) realmList3, realmArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = defaultPasswordGenerator0.generate(externalResource1, (java.util.List<org.apache.syncope.core.persistence.api.entity.Realm>) realmList3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.persistence.api.entity.ExternalResource.getPasswordPolicy()\" because \"resource\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(realmArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        org.apache.syncope.core.spring.security.DefaultPasswordGenerator defaultPasswordGenerator0 = new org.apache.syncope.core.spring.security.DefaultPasswordGenerator();
        java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy> passwordPolicyList1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = defaultPasswordGenerator0.generate(passwordPolicyList1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.forEach(java.util.function.Consumer)\" because \"policies\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        org.apache.syncope.core.spring.security.DefaultPasswordGenerator defaultPasswordGenerator0 = new org.apache.syncope.core.spring.security.DefaultPasswordGenerator();
        java.lang.Class<?> wildcardClass1 = defaultPasswordGenerator0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        org.apache.syncope.core.spring.security.DefaultPasswordGenerator defaultPasswordGenerator0 = new org.apache.syncope.core.spring.security.DefaultPasswordGenerator();
        org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] passwordPolicyArray1 = new org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] {};
        java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy> passwordPolicyList2 = new java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList2, passwordPolicyArray1);
        java.lang.String str4 = defaultPasswordGenerator0.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList2);
        java.lang.Class<?> wildcardClass5 = defaultPasswordGenerator0.getClass();
        org.junit.Assert.assertNotNull(passwordPolicyArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "KShp0436" + "'", str4, "KShp0436");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        org.apache.syncope.core.spring.security.DefaultPasswordGenerator defaultPasswordGenerator0 = new org.apache.syncope.core.spring.security.DefaultPasswordGenerator();
        org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] passwordPolicyArray1 = new org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] {};
        java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy> passwordPolicyList2 = new java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList2, passwordPolicyArray1);
        java.lang.String str4 = defaultPasswordGenerator0.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList2);
        org.apache.syncope.core.persistence.api.entity.ExternalResource externalResource5 = null;
        org.apache.syncope.core.persistence.api.entity.Realm[] realmArray6 = new org.apache.syncope.core.persistence.api.entity.Realm[] {};
        java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.Realm> realmList7 = new java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.Realm>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.persistence.api.entity.Realm>) realmList7, realmArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = defaultPasswordGenerator0.generate(externalResource5, (java.util.List<org.apache.syncope.core.persistence.api.entity.Realm>) realmList7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.persistence.api.entity.ExternalResource.getPasswordPolicy()\" because \"resource\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(passwordPolicyArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "zH40f8t3" + "'", str4, "zH40f8t3");
        org.junit.Assert.assertNotNull(realmArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        org.apache.syncope.core.spring.security.DefaultPasswordGenerator defaultPasswordGenerator0 = new org.apache.syncope.core.spring.security.DefaultPasswordGenerator();
        org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] passwordPolicyArray1 = new org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] {};
        java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy> passwordPolicyList2 = new java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList2, passwordPolicyArray1);
        java.lang.String str4 = defaultPasswordGenerator0.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList2);
        org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] passwordPolicyArray5 = new org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] {};
        java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy> passwordPolicyList6 = new java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList6, passwordPolicyArray5);
        java.lang.String str8 = defaultPasswordGenerator0.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList6);
        java.lang.Class<?> wildcardClass9 = defaultPasswordGenerator0.getClass();
        org.junit.Assert.assertNotNull(passwordPolicyArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JOQ42f73" + "'", str4, "JOQ42f73");
        org.junit.Assert.assertNotNull(passwordPolicyArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "66yg36jn" + "'", str8, "66yg36jn");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        org.apache.syncope.core.spring.security.DefaultPasswordGenerator defaultPasswordGenerator0 = new org.apache.syncope.core.spring.security.DefaultPasswordGenerator();
        org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] passwordPolicyArray1 = new org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] {};
        java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy> passwordPolicyList2 = new java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList2, passwordPolicyArray1);
        java.lang.String str4 = defaultPasswordGenerator0.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList2);
        org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] passwordPolicyArray5 = new org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] {};
        java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy> passwordPolicyList6 = new java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList6, passwordPolicyArray5);
        java.lang.String str8 = defaultPasswordGenerator0.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList6);
        java.lang.Class<?> wildcardClass9 = passwordPolicyList6.getClass();
        org.junit.Assert.assertNotNull(passwordPolicyArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "zcV8O635" + "'", str4, "zcV8O635");
        org.junit.Assert.assertNotNull(passwordPolicyArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "08R1Uik3" + "'", str8, "08R1Uik3");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        org.apache.syncope.core.spring.security.DefaultPasswordGenerator defaultPasswordGenerator0 = new org.apache.syncope.core.spring.security.DefaultPasswordGenerator();
        org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] passwordPolicyArray1 = new org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] {};
        java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy> passwordPolicyList2 = new java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList2, passwordPolicyArray1);
        java.lang.String str4 = defaultPasswordGenerator0.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList2);
        java.lang.Class<?> wildcardClass5 = passwordPolicyList2.getClass();
        org.junit.Assert.assertNotNull(passwordPolicyArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "7F4w0yf4" + "'", str4, "7F4w0yf4");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        org.apache.syncope.core.spring.security.DefaultPasswordGenerator defaultPasswordGenerator0 = new org.apache.syncope.core.spring.security.DefaultPasswordGenerator();
        org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] passwordPolicyArray1 = new org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] {};
        java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy> passwordPolicyList2 = new java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList2, passwordPolicyArray1);
        java.lang.String str4 = defaultPasswordGenerator0.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList2);
        org.apache.syncope.core.spring.security.DefaultPasswordGenerator defaultPasswordGenerator5 = new org.apache.syncope.core.spring.security.DefaultPasswordGenerator();
        org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] passwordPolicyArray6 = new org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] {};
        java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy> passwordPolicyList7 = new java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList7, passwordPolicyArray6);
        java.lang.String str9 = defaultPasswordGenerator5.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList7);
        java.lang.String str10 = defaultPasswordGenerator0.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList7);
        org.apache.syncope.core.persistence.api.entity.ExternalResource externalResource11 = null;
        org.apache.syncope.core.persistence.api.entity.Realm[] realmArray12 = new org.apache.syncope.core.persistence.api.entity.Realm[] {};
        java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.Realm> realmList13 = new java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.Realm>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.persistence.api.entity.Realm>) realmList13, realmArray12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = defaultPasswordGenerator0.generate(externalResource11, (java.util.List<org.apache.syncope.core.persistence.api.entity.Realm>) realmList13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.persistence.api.entity.ExternalResource.getPasswordPolicy()\" because \"resource\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(passwordPolicyArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "pH9797PD" + "'", str4, "pH9797PD");
        org.junit.Assert.assertNotNull(passwordPolicyArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "B87T4m9t" + "'", str9, "B87T4m9t");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "W18c7GV2" + "'", str10, "W18c7GV2");
        org.junit.Assert.assertNotNull(realmArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        org.apache.syncope.core.spring.security.DefaultPasswordGenerator defaultPasswordGenerator0 = new org.apache.syncope.core.spring.security.DefaultPasswordGenerator();
        org.apache.syncope.core.spring.security.DefaultPasswordGenerator defaultPasswordGenerator1 = new org.apache.syncope.core.spring.security.DefaultPasswordGenerator();
        org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] passwordPolicyArray2 = new org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] {};
        java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy> passwordPolicyList3 = new java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList3, passwordPolicyArray2);
        java.lang.String str5 = defaultPasswordGenerator1.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList3);
        org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] passwordPolicyArray6 = new org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] {};
        java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy> passwordPolicyList7 = new java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList7, passwordPolicyArray6);
        java.lang.String str9 = defaultPasswordGenerator1.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList7);
        java.lang.String str10 = defaultPasswordGenerator0.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList7);
        org.apache.syncope.core.persistence.api.entity.ExternalResource externalResource11 = null;
        org.apache.syncope.core.persistence.api.entity.Realm[] realmArray12 = new org.apache.syncope.core.persistence.api.entity.Realm[] {};
        java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.Realm> realmList13 = new java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.Realm>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.persistence.api.entity.Realm>) realmList13, realmArray12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = defaultPasswordGenerator0.generate(externalResource11, (java.util.List<org.apache.syncope.core.persistence.api.entity.Realm>) realmList13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.persistence.api.entity.ExternalResource.getPasswordPolicy()\" because \"resource\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(passwordPolicyArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "653eoKU9" + "'", str5, "653eoKU9");
        org.junit.Assert.assertNotNull(passwordPolicyArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "aC93Ic16" + "'", str9, "aC93Ic16");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10w78kSK" + "'", str10, "10w78kSK");
        org.junit.Assert.assertNotNull(realmArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        org.apache.syncope.core.spring.security.DefaultPasswordGenerator defaultPasswordGenerator0 = new org.apache.syncope.core.spring.security.DefaultPasswordGenerator();
        org.apache.syncope.core.spring.security.DefaultPasswordGenerator defaultPasswordGenerator1 = new org.apache.syncope.core.spring.security.DefaultPasswordGenerator();
        org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] passwordPolicyArray2 = new org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] {};
        java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy> passwordPolicyList3 = new java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList3, passwordPolicyArray2);
        java.lang.String str5 = defaultPasswordGenerator1.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList3);
        org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] passwordPolicyArray6 = new org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] {};
        java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy> passwordPolicyList7 = new java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList7, passwordPolicyArray6);
        java.lang.String str9 = defaultPasswordGenerator1.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList7);
        java.lang.String str10 = defaultPasswordGenerator0.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList7);
        java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy> passwordPolicyList11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = defaultPasswordGenerator0.generate(passwordPolicyList11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.forEach(java.util.function.Consumer)\" because \"policies\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(passwordPolicyArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Y33qr17p" + "'", str5, "Y33qr17p");
        org.junit.Assert.assertNotNull(passwordPolicyArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "4Z483jFF" + "'", str9, "4Z483jFF");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "c91u9M7B" + "'", str10, "c91u9M7B");
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        org.apache.syncope.core.spring.security.DefaultPasswordGenerator defaultPasswordGenerator0 = new org.apache.syncope.core.spring.security.DefaultPasswordGenerator();
        org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] passwordPolicyArray1 = new org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] {};
        java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy> passwordPolicyList2 = new java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList2, passwordPolicyArray1);
        java.lang.String str4 = defaultPasswordGenerator0.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList2);
        org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] passwordPolicyArray5 = new org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] {};
        java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy> passwordPolicyList6 = new java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList6, passwordPolicyArray5);
        java.lang.String str8 = defaultPasswordGenerator0.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList6);
        org.apache.syncope.core.persistence.api.entity.ExternalResource externalResource9 = null;
        org.apache.syncope.core.persistence.api.entity.Realm[] realmArray10 = new org.apache.syncope.core.persistence.api.entity.Realm[] {};
        java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.Realm> realmList11 = new java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.Realm>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.persistence.api.entity.Realm>) realmList11, realmArray10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = defaultPasswordGenerator0.generate(externalResource9, (java.util.List<org.apache.syncope.core.persistence.api.entity.Realm>) realmList11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.persistence.api.entity.ExternalResource.getPasswordPolicy()\" because \"resource\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(passwordPolicyArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "gLES2748" + "'", str4, "gLES2748");
        org.junit.Assert.assertNotNull(passwordPolicyArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "oi608Vr4" + "'", str8, "oi608Vr4");
        org.junit.Assert.assertNotNull(realmArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        org.apache.syncope.core.spring.security.DefaultPasswordGenerator defaultPasswordGenerator0 = new org.apache.syncope.core.spring.security.DefaultPasswordGenerator();
        org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] passwordPolicyArray1 = new org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] {};
        java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy> passwordPolicyList2 = new java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList2, passwordPolicyArray1);
        java.lang.String str4 = defaultPasswordGenerator0.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList2);
        org.apache.syncope.core.spring.security.DefaultPasswordGenerator defaultPasswordGenerator5 = new org.apache.syncope.core.spring.security.DefaultPasswordGenerator();
        org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] passwordPolicyArray6 = new org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] {};
        java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy> passwordPolicyList7 = new java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList7, passwordPolicyArray6);
        java.lang.String str9 = defaultPasswordGenerator5.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList7);
        java.lang.String str10 = defaultPasswordGenerator0.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList7);
        java.lang.Class<?> wildcardClass11 = passwordPolicyList7.getClass();
        org.junit.Assert.assertNotNull(passwordPolicyArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0dxL324M" + "'", str4, "0dxL324M");
        org.junit.Assert.assertNotNull(passwordPolicyArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "56Uqh37f" + "'", str9, "56Uqh37f");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "NE0XM708" + "'", str10, "NE0XM708");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        org.apache.syncope.core.spring.security.DefaultPasswordGenerator defaultPasswordGenerator0 = new org.apache.syncope.core.spring.security.DefaultPasswordGenerator();
        org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] passwordPolicyArray1 = new org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] {};
        java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy> passwordPolicyList2 = new java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList2, passwordPolicyArray1);
        java.lang.String str4 = defaultPasswordGenerator0.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList2);
        org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] passwordPolicyArray5 = new org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] {};
        java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy> passwordPolicyList6 = new java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList6, passwordPolicyArray5);
        java.lang.String str8 = defaultPasswordGenerator0.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList6);
        java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy> passwordPolicyList9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = defaultPasswordGenerator0.generate(passwordPolicyList9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.forEach(java.util.function.Consumer)\" because \"policies\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(passwordPolicyArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "w0P0u4Q4" + "'", str4, "w0P0u4Q4");
        org.junit.Assert.assertNotNull(passwordPolicyArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "8AT7H5g8" + "'", str8, "8AT7H5g8");
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        org.apache.syncope.core.spring.security.DefaultPasswordGenerator defaultPasswordGenerator0 = new org.apache.syncope.core.spring.security.DefaultPasswordGenerator();
        org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] passwordPolicyArray1 = new org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] {};
        java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy> passwordPolicyList2 = new java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList2, passwordPolicyArray1);
        java.lang.String str4 = defaultPasswordGenerator0.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList2);
        org.apache.syncope.core.spring.security.DefaultPasswordGenerator defaultPasswordGenerator5 = new org.apache.syncope.core.spring.security.DefaultPasswordGenerator();
        org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] passwordPolicyArray6 = new org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] {};
        java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy> passwordPolicyList7 = new java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList7, passwordPolicyArray6);
        java.lang.String str9 = defaultPasswordGenerator5.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList7);
        java.lang.String str10 = defaultPasswordGenerator0.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList7);
        java.lang.Class<?> wildcardClass11 = defaultPasswordGenerator0.getClass();
        org.junit.Assert.assertNotNull(passwordPolicyArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "40z2Sd7x" + "'", str4, "40z2Sd7x");
        org.junit.Assert.assertNotNull(passwordPolicyArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "9z7A3T8d" + "'", str9, "9z7A3T8d");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "O6l2Jt78" + "'", str10, "O6l2Jt78");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        org.apache.syncope.core.spring.security.DefaultPasswordGenerator defaultPasswordGenerator0 = new org.apache.syncope.core.spring.security.DefaultPasswordGenerator();
        org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] passwordPolicyArray1 = new org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] {};
        java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy> passwordPolicyList2 = new java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList2, passwordPolicyArray1);
        java.lang.String str4 = defaultPasswordGenerator0.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList2);
        org.apache.syncope.core.spring.security.DefaultPasswordGenerator defaultPasswordGenerator5 = new org.apache.syncope.core.spring.security.DefaultPasswordGenerator();
        org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] passwordPolicyArray6 = new org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] {};
        java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy> passwordPolicyList7 = new java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList7, passwordPolicyArray6);
        java.lang.String str9 = defaultPasswordGenerator5.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList7);
        java.lang.String str10 = defaultPasswordGenerator0.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList7);
        org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] passwordPolicyArray11 = new org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] {};
        java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy> passwordPolicyList12 = new java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList12, passwordPolicyArray11);
        java.lang.String str14 = defaultPasswordGenerator0.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList12);
        org.apache.syncope.core.persistence.api.entity.ExternalResource externalResource15 = null;
        org.apache.syncope.core.persistence.api.entity.Realm[] realmArray16 = new org.apache.syncope.core.persistence.api.entity.Realm[] {};
        java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.Realm> realmList17 = new java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.Realm>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.persistence.api.entity.Realm>) realmList17, realmArray16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = defaultPasswordGenerator0.generate(externalResource15, (java.util.List<org.apache.syncope.core.persistence.api.entity.Realm>) realmList17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.persistence.api.entity.ExternalResource.getPasswordPolicy()\" because \"resource\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(passwordPolicyArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "u03w9kj3" + "'", str4, "u03w9kj3");
        org.junit.Assert.assertNotNull(passwordPolicyArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "9cy367wh" + "'", str9, "9cy367wh");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "kVz3u427" + "'", str10, "kVz3u427");
        org.junit.Assert.assertNotNull(passwordPolicyArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "P0z5hw38" + "'", str14, "P0z5hw38");
        org.junit.Assert.assertNotNull(realmArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        org.apache.syncope.core.spring.security.DefaultPasswordGenerator defaultPasswordGenerator0 = new org.apache.syncope.core.spring.security.DefaultPasswordGenerator();
        org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] passwordPolicyArray1 = new org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] {};
        java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy> passwordPolicyList2 = new java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList2, passwordPolicyArray1);
        java.lang.String str4 = defaultPasswordGenerator0.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList2);
        org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] passwordPolicyArray5 = new org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] {};
        java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy> passwordPolicyList6 = new java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList6, passwordPolicyArray5);
        java.lang.String str8 = defaultPasswordGenerator0.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList6);
        org.apache.syncope.core.spring.security.DefaultPasswordGenerator defaultPasswordGenerator9 = new org.apache.syncope.core.spring.security.DefaultPasswordGenerator();
        org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] passwordPolicyArray10 = new org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] {};
        java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy> passwordPolicyList11 = new java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList11, passwordPolicyArray10);
        java.lang.String str13 = defaultPasswordGenerator9.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList11);
        java.lang.String str14 = defaultPasswordGenerator0.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList11);
        org.apache.syncope.core.persistence.api.entity.ExternalResource externalResource15 = null;
        org.apache.syncope.core.persistence.api.entity.Realm[] realmArray16 = new org.apache.syncope.core.persistence.api.entity.Realm[] {};
        java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.Realm> realmList17 = new java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.Realm>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.persistence.api.entity.Realm>) realmList17, realmArray16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = defaultPasswordGenerator0.generate(externalResource15, (java.util.List<org.apache.syncope.core.persistence.api.entity.Realm>) realmList17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.persistence.api.entity.ExternalResource.getPasswordPolicy()\" because \"resource\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(passwordPolicyArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "7827cgGg" + "'", str4, "7827cgGg");
        org.junit.Assert.assertNotNull(passwordPolicyArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "xh4Q085S" + "'", str8, "xh4Q085S");
        org.junit.Assert.assertNotNull(passwordPolicyArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "4aTI7O46" + "'", str13, "4aTI7O46");
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "EWw15v12" + "'", str14, "EWw15v12");
        org.junit.Assert.assertNotNull(realmArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        org.apache.syncope.core.spring.security.DefaultPasswordGenerator defaultPasswordGenerator0 = new org.apache.syncope.core.spring.security.DefaultPasswordGenerator();
        org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] passwordPolicyArray1 = new org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] {};
        java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy> passwordPolicyList2 = new java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList2, passwordPolicyArray1);
        java.lang.String str4 = defaultPasswordGenerator0.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList2);
        org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] passwordPolicyArray5 = new org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] {};
        java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy> passwordPolicyList6 = new java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList6, passwordPolicyArray5);
        java.lang.String str8 = defaultPasswordGenerator0.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList6);
        org.apache.syncope.core.spring.security.DefaultPasswordGenerator defaultPasswordGenerator9 = new org.apache.syncope.core.spring.security.DefaultPasswordGenerator();
        org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] passwordPolicyArray10 = new org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] {};
        java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy> passwordPolicyList11 = new java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList11, passwordPolicyArray10);
        java.lang.String str13 = defaultPasswordGenerator9.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList11);
        org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] passwordPolicyArray14 = new org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] {};
        java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy> passwordPolicyList15 = new java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList15, passwordPolicyArray14);
        java.lang.String str17 = defaultPasswordGenerator9.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList15);
        org.apache.syncope.core.spring.security.DefaultPasswordGenerator defaultPasswordGenerator18 = new org.apache.syncope.core.spring.security.DefaultPasswordGenerator();
        org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] passwordPolicyArray19 = new org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] {};
        java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy> passwordPolicyList20 = new java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList20, passwordPolicyArray19);
        java.lang.String str22 = defaultPasswordGenerator18.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList20);
        java.lang.String str23 = defaultPasswordGenerator9.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList20);
        org.apache.syncope.core.spring.security.DefaultPasswordGenerator defaultPasswordGenerator24 = new org.apache.syncope.core.spring.security.DefaultPasswordGenerator();
        org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] passwordPolicyArray25 = new org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] {};
        java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy> passwordPolicyList26 = new java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList26, passwordPolicyArray25);
        java.lang.String str28 = defaultPasswordGenerator24.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList26);
        org.apache.syncope.core.spring.security.DefaultPasswordGenerator defaultPasswordGenerator29 = new org.apache.syncope.core.spring.security.DefaultPasswordGenerator();
        org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] passwordPolicyArray30 = new org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] {};
        java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy> passwordPolicyList31 = new java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList31, passwordPolicyArray30);
        java.lang.String str33 = defaultPasswordGenerator29.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList31);
        java.lang.String str34 = defaultPasswordGenerator24.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList31);
        java.lang.String str35 = defaultPasswordGenerator9.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList31);
        java.lang.String str36 = defaultPasswordGenerator0.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList31);
        java.lang.Class<?> wildcardClass37 = passwordPolicyList31.getClass();
        org.junit.Assert.assertNotNull(passwordPolicyArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "mGc4W849" + "'", str4, "mGc4W849");
        org.junit.Assert.assertNotNull(passwordPolicyArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "68r63Kil" + "'", str8, "68r63Kil");
        org.junit.Assert.assertNotNull(passwordPolicyArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0GR3T1i6" + "'", str13, "0GR3T1i6");
        org.junit.Assert.assertNotNull(passwordPolicyArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "dmp03n68" + "'", str17, "dmp03n68");
        org.junit.Assert.assertNotNull(passwordPolicyArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "WR86Xp85" + "'", str22, "WR86Xp85");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "qgxm7272" + "'", str23, "qgxm7272");
        org.junit.Assert.assertNotNull(passwordPolicyArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Br60r3j5" + "'", str28, "Br60r3j5");
        org.junit.Assert.assertNotNull(passwordPolicyArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str33 + "' != '" + "68cRnM20" + "'", str33, "68cRnM20");
// flaky:         org.junit.Assert.assertEquals("'" + str34 + "' != '" + "05zd41Lx" + "'", str34, "05zd41Lx");
// flaky:         org.junit.Assert.assertEquals("'" + str35 + "' != '" + "81EdoO22" + "'", str35, "81EdoO22");
// flaky:         org.junit.Assert.assertEquals("'" + str36 + "' != '" + "NYg2127b" + "'", str36, "NYg2127b");
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        org.apache.syncope.core.spring.security.DefaultPasswordGenerator defaultPasswordGenerator0 = new org.apache.syncope.core.spring.security.DefaultPasswordGenerator();
        org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] passwordPolicyArray1 = new org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] {};
        java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy> passwordPolicyList2 = new java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList2, passwordPolicyArray1);
        java.lang.String str4 = defaultPasswordGenerator0.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList2);
        org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] passwordPolicyArray5 = new org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] {};
        java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy> passwordPolicyList6 = new java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList6, passwordPolicyArray5);
        java.lang.String str8 = defaultPasswordGenerator0.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList6);
        org.apache.syncope.core.spring.security.DefaultPasswordGenerator defaultPasswordGenerator9 = new org.apache.syncope.core.spring.security.DefaultPasswordGenerator();
        org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] passwordPolicyArray10 = new org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] {};
        java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy> passwordPolicyList11 = new java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList11, passwordPolicyArray10);
        java.lang.String str13 = defaultPasswordGenerator9.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList11);
        org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] passwordPolicyArray14 = new org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] {};
        java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy> passwordPolicyList15 = new java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList15, passwordPolicyArray14);
        java.lang.String str17 = defaultPasswordGenerator9.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList15);
        org.apache.syncope.core.spring.security.DefaultPasswordGenerator defaultPasswordGenerator18 = new org.apache.syncope.core.spring.security.DefaultPasswordGenerator();
        org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] passwordPolicyArray19 = new org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] {};
        java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy> passwordPolicyList20 = new java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList20, passwordPolicyArray19);
        java.lang.String str22 = defaultPasswordGenerator18.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList20);
        java.lang.String str23 = defaultPasswordGenerator9.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList20);
        org.apache.syncope.core.spring.security.DefaultPasswordGenerator defaultPasswordGenerator24 = new org.apache.syncope.core.spring.security.DefaultPasswordGenerator();
        org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] passwordPolicyArray25 = new org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] {};
        java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy> passwordPolicyList26 = new java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList26, passwordPolicyArray25);
        java.lang.String str28 = defaultPasswordGenerator24.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList26);
        org.apache.syncope.core.spring.security.DefaultPasswordGenerator defaultPasswordGenerator29 = new org.apache.syncope.core.spring.security.DefaultPasswordGenerator();
        org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] passwordPolicyArray30 = new org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] {};
        java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy> passwordPolicyList31 = new java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList31, passwordPolicyArray30);
        java.lang.String str33 = defaultPasswordGenerator29.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList31);
        java.lang.String str34 = defaultPasswordGenerator24.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList31);
        java.lang.String str35 = defaultPasswordGenerator9.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList31);
        java.lang.String str36 = defaultPasswordGenerator0.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList31);
        org.apache.syncope.core.persistence.api.entity.ExternalResource externalResource37 = null;
        org.apache.syncope.core.persistence.api.entity.Realm[] realmArray38 = new org.apache.syncope.core.persistence.api.entity.Realm[] {};
        java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.Realm> realmList39 = new java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.Realm>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.persistence.api.entity.Realm>) realmList39, realmArray38);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str41 = defaultPasswordGenerator0.generate(externalResource37, (java.util.List<org.apache.syncope.core.persistence.api.entity.Realm>) realmList39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.persistence.api.entity.ExternalResource.getPasswordPolicy()\" because \"resource\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(passwordPolicyArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "DdZ32Y92" + "'", str4, "DdZ32Y92");
        org.junit.Assert.assertNotNull(passwordPolicyArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "5ATjP607" + "'", str8, "5ATjP607");
        org.junit.Assert.assertNotNull(passwordPolicyArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "4G9Jn7m9" + "'", str13, "4G9Jn7m9");
        org.junit.Assert.assertNotNull(passwordPolicyArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "J8B4O34I" + "'", str17, "J8B4O34I");
        org.junit.Assert.assertNotNull(passwordPolicyArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "g3BGH098" + "'", str22, "g3BGH098");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "7cYjD565" + "'", str23, "7cYjD565");
        org.junit.Assert.assertNotNull(passwordPolicyArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "3X549DIa" + "'", str28, "3X549DIa");
        org.junit.Assert.assertNotNull(passwordPolicyArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str33 + "' != '" + "gt656DN3" + "'", str33, "gt656DN3");
// flaky:         org.junit.Assert.assertEquals("'" + str34 + "' != '" + "sMz4775Q" + "'", str34, "sMz4775Q");
// flaky:         org.junit.Assert.assertEquals("'" + str35 + "' != '" + "4w0OH2V9" + "'", str35, "4w0OH2V9");
// flaky:         org.junit.Assert.assertEquals("'" + str36 + "' != '" + "xS530K1s" + "'", str36, "xS530K1s");
        org.junit.Assert.assertNotNull(realmArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        org.apache.syncope.core.spring.security.DefaultPasswordGenerator defaultPasswordGenerator0 = new org.apache.syncope.core.spring.security.DefaultPasswordGenerator();
        org.apache.syncope.core.spring.security.DefaultPasswordGenerator defaultPasswordGenerator1 = new org.apache.syncope.core.spring.security.DefaultPasswordGenerator();
        org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] passwordPolicyArray2 = new org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] {};
        java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy> passwordPolicyList3 = new java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList3, passwordPolicyArray2);
        java.lang.String str5 = defaultPasswordGenerator1.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList3);
        org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] passwordPolicyArray6 = new org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] {};
        java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy> passwordPolicyList7 = new java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList7, passwordPolicyArray6);
        java.lang.String str9 = defaultPasswordGenerator1.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList7);
        java.lang.String str10 = defaultPasswordGenerator0.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList7);
        java.lang.Class<?> wildcardClass11 = defaultPasswordGenerator0.getClass();
        org.junit.Assert.assertNotNull(passwordPolicyArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Xh119zf0" + "'", str5, "Xh119zf0");
        org.junit.Assert.assertNotNull(passwordPolicyArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "79i5kr5l" + "'", str9, "79i5kr5l");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "V84z3H8B" + "'", str10, "V84z3H8B");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        org.apache.syncope.core.spring.security.DefaultPasswordGenerator defaultPasswordGenerator0 = new org.apache.syncope.core.spring.security.DefaultPasswordGenerator();
        org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] passwordPolicyArray1 = new org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] {};
        java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy> passwordPolicyList2 = new java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList2, passwordPolicyArray1);
        java.lang.String str4 = defaultPasswordGenerator0.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList2);
        org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] passwordPolicyArray5 = new org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] {};
        java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy> passwordPolicyList6 = new java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList6, passwordPolicyArray5);
        java.lang.String str8 = defaultPasswordGenerator0.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList6);
        org.apache.syncope.core.spring.security.DefaultPasswordGenerator defaultPasswordGenerator9 = new org.apache.syncope.core.spring.security.DefaultPasswordGenerator();
        org.apache.syncope.core.spring.security.DefaultPasswordGenerator defaultPasswordGenerator10 = new org.apache.syncope.core.spring.security.DefaultPasswordGenerator();
        org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] passwordPolicyArray11 = new org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] {};
        java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy> passwordPolicyList12 = new java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList12, passwordPolicyArray11);
        java.lang.String str14 = defaultPasswordGenerator10.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList12);
        org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] passwordPolicyArray15 = new org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] {};
        java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy> passwordPolicyList16 = new java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList16, passwordPolicyArray15);
        java.lang.String str18 = defaultPasswordGenerator10.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList16);
        java.lang.String str19 = defaultPasswordGenerator9.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList16);
        java.lang.String str20 = defaultPasswordGenerator0.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList16);
        org.apache.syncope.core.persistence.api.entity.ExternalResource externalResource21 = null;
        org.apache.syncope.core.persistence.api.entity.Realm[] realmArray22 = new org.apache.syncope.core.persistence.api.entity.Realm[] {};
        java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.Realm> realmList23 = new java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.Realm>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.persistence.api.entity.Realm>) realmList23, realmArray22);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = defaultPasswordGenerator0.generate(externalResource21, (java.util.List<org.apache.syncope.core.persistence.api.entity.Realm>) realmList23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.persistence.api.entity.ExternalResource.getPasswordPolicy()\" because \"resource\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(passwordPolicyArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Pt978A2z" + "'", str4, "Pt978A2z");
        org.junit.Assert.assertNotNull(passwordPolicyArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "9NC9G46u" + "'", str8, "9NC9G46u");
        org.junit.Assert.assertNotNull(passwordPolicyArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "47Q2f3fl" + "'", str14, "47Q2f3fl");
        org.junit.Assert.assertNotNull(passwordPolicyArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "8k7Dv5H8" + "'", str18, "8k7Dv5H8");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "u3W513ea" + "'", str19, "u3W513ea");
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "kv6b460i" + "'", str20, "kv6b460i");
        org.junit.Assert.assertNotNull(realmArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        org.apache.syncope.core.spring.security.DefaultPasswordGenerator defaultPasswordGenerator0 = new org.apache.syncope.core.spring.security.DefaultPasswordGenerator();
        org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] passwordPolicyArray1 = new org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] {};
        java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy> passwordPolicyList2 = new java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList2, passwordPolicyArray1);
        java.lang.String str4 = defaultPasswordGenerator0.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList2);
        org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] passwordPolicyArray5 = new org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] {};
        java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy> passwordPolicyList6 = new java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList6, passwordPolicyArray5);
        java.lang.String str8 = defaultPasswordGenerator0.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList6);
        org.apache.syncope.core.spring.security.DefaultPasswordGenerator defaultPasswordGenerator9 = new org.apache.syncope.core.spring.security.DefaultPasswordGenerator();
        org.apache.syncope.core.spring.security.DefaultPasswordGenerator defaultPasswordGenerator10 = new org.apache.syncope.core.spring.security.DefaultPasswordGenerator();
        org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] passwordPolicyArray11 = new org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] {};
        java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy> passwordPolicyList12 = new java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList12, passwordPolicyArray11);
        java.lang.String str14 = defaultPasswordGenerator10.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList12);
        org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] passwordPolicyArray15 = new org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] {};
        java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy> passwordPolicyList16 = new java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList16, passwordPolicyArray15);
        java.lang.String str18 = defaultPasswordGenerator10.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList16);
        java.lang.String str19 = defaultPasswordGenerator9.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList16);
        java.lang.String str20 = defaultPasswordGenerator0.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList16);
        java.lang.Class<?> wildcardClass21 = defaultPasswordGenerator0.getClass();
        org.junit.Assert.assertNotNull(passwordPolicyArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "83V8SOE9" + "'", str4, "83V8SOE9");
        org.junit.Assert.assertNotNull(passwordPolicyArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "rg19L37B" + "'", str8, "rg19L37B");
        org.junit.Assert.assertNotNull(passwordPolicyArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "9p923WfR" + "'", str14, "9p923WfR");
        org.junit.Assert.assertNotNull(passwordPolicyArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "sv7Z49m8" + "'", str18, "sv7Z49m8");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "QVb917s5" + "'", str19, "QVb917s5");
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "fH239Ez5" + "'", str20, "fH239Ez5");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        org.apache.syncope.core.spring.security.DefaultPasswordGenerator defaultPasswordGenerator0 = new org.apache.syncope.core.spring.security.DefaultPasswordGenerator();
        org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] passwordPolicyArray1 = new org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] {};
        java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy> passwordPolicyList2 = new java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList2, passwordPolicyArray1);
        java.lang.String str4 = defaultPasswordGenerator0.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList2);
        org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] passwordPolicyArray5 = new org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] {};
        java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy> passwordPolicyList6 = new java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList6, passwordPolicyArray5);
        java.lang.String str8 = defaultPasswordGenerator0.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList6);
        org.apache.syncope.core.spring.security.DefaultPasswordGenerator defaultPasswordGenerator9 = new org.apache.syncope.core.spring.security.DefaultPasswordGenerator();
        org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] passwordPolicyArray10 = new org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] {};
        java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy> passwordPolicyList11 = new java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList11, passwordPolicyArray10);
        java.lang.String str13 = defaultPasswordGenerator9.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList11);
        java.lang.String str14 = defaultPasswordGenerator0.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList11);
        org.apache.syncope.core.spring.security.DefaultPasswordGenerator defaultPasswordGenerator15 = new org.apache.syncope.core.spring.security.DefaultPasswordGenerator();
        org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] passwordPolicyArray16 = new org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] {};
        java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy> passwordPolicyList17 = new java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList17, passwordPolicyArray16);
        java.lang.String str19 = defaultPasswordGenerator15.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList17);
        org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] passwordPolicyArray20 = new org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] {};
        java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy> passwordPolicyList21 = new java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList21, passwordPolicyArray20);
        java.lang.String str23 = defaultPasswordGenerator15.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList21);
        org.apache.syncope.core.spring.security.DefaultPasswordGenerator defaultPasswordGenerator24 = new org.apache.syncope.core.spring.security.DefaultPasswordGenerator();
        org.apache.syncope.core.spring.security.DefaultPasswordGenerator defaultPasswordGenerator25 = new org.apache.syncope.core.spring.security.DefaultPasswordGenerator();
        org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] passwordPolicyArray26 = new org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] {};
        java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy> passwordPolicyList27 = new java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList27, passwordPolicyArray26);
        java.lang.String str29 = defaultPasswordGenerator25.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList27);
        org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] passwordPolicyArray30 = new org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] {};
        java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy> passwordPolicyList31 = new java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList31, passwordPolicyArray30);
        java.lang.String str33 = defaultPasswordGenerator25.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList31);
        java.lang.String str34 = defaultPasswordGenerator24.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList31);
        java.lang.String str35 = defaultPasswordGenerator15.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList31);
        java.lang.String str36 = defaultPasswordGenerator0.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList31);
        org.junit.Assert.assertNotNull(passwordPolicyArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "h76gA19V" + "'", str4, "h76gA19V");
        org.junit.Assert.assertNotNull(passwordPolicyArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "g16ux47E" + "'", str8, "g16ux47E");
        org.junit.Assert.assertNotNull(passwordPolicyArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "549Xb8vo" + "'", str13, "549Xb8vo");
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "L5Bur084" + "'", str14, "L5Bur084");
        org.junit.Assert.assertNotNull(passwordPolicyArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "gU972aH1" + "'", str19, "gU972aH1");
        org.junit.Assert.assertNotNull(passwordPolicyArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "g92o1rS1" + "'", str23, "g92o1rS1");
        org.junit.Assert.assertNotNull(passwordPolicyArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "ES34n73c" + "'", str29, "ES34n73c");
        org.junit.Assert.assertNotNull(passwordPolicyArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str33 + "' != '" + "e5y488pS" + "'", str33, "e5y488pS");
// flaky:         org.junit.Assert.assertEquals("'" + str34 + "' != '" + "W5wX30T9" + "'", str34, "W5wX30T9");
// flaky:         org.junit.Assert.assertEquals("'" + str35 + "' != '" + "083eGBw6" + "'", str35, "083eGBw6");
// flaky:         org.junit.Assert.assertEquals("'" + str36 + "' != '" + "fvV152I8" + "'", str36, "fvV152I8");
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        org.apache.syncope.core.spring.security.DefaultPasswordGenerator defaultPasswordGenerator0 = new org.apache.syncope.core.spring.security.DefaultPasswordGenerator();
        org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] passwordPolicyArray1 = new org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] {};
        java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy> passwordPolicyList2 = new java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList2, passwordPolicyArray1);
        java.lang.String str4 = defaultPasswordGenerator0.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList2);
        org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] passwordPolicyArray5 = new org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] {};
        java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy> passwordPolicyList6 = new java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList6, passwordPolicyArray5);
        java.lang.String str8 = defaultPasswordGenerator0.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList6);
        org.apache.syncope.core.spring.security.DefaultPasswordGenerator defaultPasswordGenerator9 = new org.apache.syncope.core.spring.security.DefaultPasswordGenerator();
        org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] passwordPolicyArray10 = new org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] {};
        java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy> passwordPolicyList11 = new java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList11, passwordPolicyArray10);
        java.lang.String str13 = defaultPasswordGenerator9.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList11);
        java.lang.String str14 = defaultPasswordGenerator0.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList11);
        org.apache.syncope.core.spring.security.DefaultPasswordGenerator defaultPasswordGenerator15 = new org.apache.syncope.core.spring.security.DefaultPasswordGenerator();
        org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] passwordPolicyArray16 = new org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] {};
        java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy> passwordPolicyList17 = new java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList17, passwordPolicyArray16);
        java.lang.String str19 = defaultPasswordGenerator15.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList17);
        org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] passwordPolicyArray20 = new org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] {};
        java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy> passwordPolicyList21 = new java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList21, passwordPolicyArray20);
        java.lang.String str23 = defaultPasswordGenerator15.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList21);
        org.apache.syncope.core.spring.security.DefaultPasswordGenerator defaultPasswordGenerator24 = new org.apache.syncope.core.spring.security.DefaultPasswordGenerator();
        org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] passwordPolicyArray25 = new org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] {};
        java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy> passwordPolicyList26 = new java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList26, passwordPolicyArray25);
        java.lang.String str28 = defaultPasswordGenerator24.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList26);
        java.lang.String str29 = defaultPasswordGenerator15.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList26);
        java.lang.String str30 = defaultPasswordGenerator0.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList26);
        org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] passwordPolicyArray31 = new org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] {};
        java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy> passwordPolicyList32 = new java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList32, passwordPolicyArray31);
        java.lang.String str34 = defaultPasswordGenerator0.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList32);
        org.apache.syncope.core.persistence.api.entity.ExternalResource externalResource35 = null;
        org.apache.syncope.core.persistence.api.entity.Realm[] realmArray36 = new org.apache.syncope.core.persistence.api.entity.Realm[] {};
        java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.Realm> realmList37 = new java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.Realm>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.persistence.api.entity.Realm>) realmList37, realmArray36);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str39 = defaultPasswordGenerator0.generate(externalResource35, (java.util.List<org.apache.syncope.core.persistence.api.entity.Realm>) realmList37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.persistence.api.entity.ExternalResource.getPasswordPolicy()\" because \"resource\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(passwordPolicyArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "D62Vf0W3" + "'", str4, "D62Vf0W3");
        org.junit.Assert.assertNotNull(passwordPolicyArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "xs73l30J" + "'", str8, "xs73l30J");
        org.junit.Assert.assertNotNull(passwordPolicyArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "61V4J6zL" + "'", str13, "61V4J6zL");
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "of8Z060o" + "'", str14, "of8Z060o");
        org.junit.Assert.assertNotNull(passwordPolicyArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "m858hf4i" + "'", str19, "m858hf4i");
        org.junit.Assert.assertNotNull(passwordPolicyArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "q52KF76o" + "'", str23, "q52KF76o");
        org.junit.Assert.assertNotNull(passwordPolicyArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Uur3773A" + "'", str28, "Uur3773A");
// flaky:         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "c89p6q2d" + "'", str29, "c89p6q2d");
// flaky:         org.junit.Assert.assertEquals("'" + str30 + "' != '" + "niW585q1" + "'", str30, "niW585q1");
        org.junit.Assert.assertNotNull(passwordPolicyArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str34 + "' != '" + "1D1EI74J" + "'", str34, "1D1EI74J");
        org.junit.Assert.assertNotNull(realmArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        org.apache.syncope.core.spring.security.DefaultPasswordGenerator defaultPasswordGenerator0 = new org.apache.syncope.core.spring.security.DefaultPasswordGenerator();
        org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] passwordPolicyArray1 = new org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] {};
        java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy> passwordPolicyList2 = new java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList2, passwordPolicyArray1);
        java.lang.String str4 = defaultPasswordGenerator0.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList2);
        org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] passwordPolicyArray5 = new org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] {};
        java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy> passwordPolicyList6 = new java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList6, passwordPolicyArray5);
        java.lang.String str8 = defaultPasswordGenerator0.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList6);
        org.apache.syncope.core.spring.security.DefaultPasswordGenerator defaultPasswordGenerator9 = new org.apache.syncope.core.spring.security.DefaultPasswordGenerator();
        org.apache.syncope.core.spring.security.DefaultPasswordGenerator defaultPasswordGenerator10 = new org.apache.syncope.core.spring.security.DefaultPasswordGenerator();
        org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] passwordPolicyArray11 = new org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] {};
        java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy> passwordPolicyList12 = new java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList12, passwordPolicyArray11);
        java.lang.String str14 = defaultPasswordGenerator10.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList12);
        org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] passwordPolicyArray15 = new org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] {};
        java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy> passwordPolicyList16 = new java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList16, passwordPolicyArray15);
        java.lang.String str18 = defaultPasswordGenerator10.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList16);
        java.lang.String str19 = defaultPasswordGenerator9.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList16);
        java.lang.String str20 = defaultPasswordGenerator0.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList16);
        org.apache.syncope.core.spring.security.DefaultPasswordGenerator defaultPasswordGenerator21 = new org.apache.syncope.core.spring.security.DefaultPasswordGenerator();
        org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] passwordPolicyArray22 = new org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] {};
        java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy> passwordPolicyList23 = new java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList23, passwordPolicyArray22);
        java.lang.String str25 = defaultPasswordGenerator21.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList23);
        org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] passwordPolicyArray26 = new org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] {};
        java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy> passwordPolicyList27 = new java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList27, passwordPolicyArray26);
        java.lang.String str29 = defaultPasswordGenerator21.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList27);
        org.apache.syncope.core.spring.security.DefaultPasswordGenerator defaultPasswordGenerator30 = new org.apache.syncope.core.spring.security.DefaultPasswordGenerator();
        org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] passwordPolicyArray31 = new org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] {};
        java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy> passwordPolicyList32 = new java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList32, passwordPolicyArray31);
        java.lang.String str34 = defaultPasswordGenerator30.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList32);
        java.lang.String str35 = defaultPasswordGenerator21.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList32);
        org.apache.syncope.core.spring.security.DefaultPasswordGenerator defaultPasswordGenerator36 = new org.apache.syncope.core.spring.security.DefaultPasswordGenerator();
        org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] passwordPolicyArray37 = new org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] {};
        java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy> passwordPolicyList38 = new java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList38, passwordPolicyArray37);
        java.lang.String str40 = defaultPasswordGenerator36.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList38);
        org.apache.syncope.core.spring.security.DefaultPasswordGenerator defaultPasswordGenerator41 = new org.apache.syncope.core.spring.security.DefaultPasswordGenerator();
        org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] passwordPolicyArray42 = new org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] {};
        java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy> passwordPolicyList43 = new java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList43, passwordPolicyArray42);
        java.lang.String str45 = defaultPasswordGenerator41.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList43);
        java.lang.String str46 = defaultPasswordGenerator36.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList43);
        java.lang.String str47 = defaultPasswordGenerator21.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList43);
        org.apache.syncope.core.spring.security.DefaultPasswordGenerator defaultPasswordGenerator48 = new org.apache.syncope.core.spring.security.DefaultPasswordGenerator();
        org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] passwordPolicyArray49 = new org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] {};
        java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy> passwordPolicyList50 = new java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList50, passwordPolicyArray49);
        java.lang.String str52 = defaultPasswordGenerator48.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList50);
        org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] passwordPolicyArray53 = new org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] {};
        java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy> passwordPolicyList54 = new java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList54, passwordPolicyArray53);
        java.lang.String str56 = defaultPasswordGenerator48.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList54);
        org.apache.syncope.core.spring.security.DefaultPasswordGenerator defaultPasswordGenerator57 = new org.apache.syncope.core.spring.security.DefaultPasswordGenerator();
        org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] passwordPolicyArray58 = new org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] {};
        java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy> passwordPolicyList59 = new java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList59, passwordPolicyArray58);
        java.lang.String str61 = defaultPasswordGenerator57.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList59);
        java.lang.String str62 = defaultPasswordGenerator48.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList59);
        org.apache.syncope.core.spring.security.DefaultPasswordGenerator defaultPasswordGenerator63 = new org.apache.syncope.core.spring.security.DefaultPasswordGenerator();
        org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] passwordPolicyArray64 = new org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] {};
        java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy> passwordPolicyList65 = new java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList65, passwordPolicyArray64);
        java.lang.String str67 = defaultPasswordGenerator63.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList65);
        org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] passwordPolicyArray68 = new org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] {};
        java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy> passwordPolicyList69 = new java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList69, passwordPolicyArray68);
        java.lang.String str71 = defaultPasswordGenerator63.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList69);
        org.apache.syncope.core.spring.security.DefaultPasswordGenerator defaultPasswordGenerator72 = new org.apache.syncope.core.spring.security.DefaultPasswordGenerator();
        org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] passwordPolicyArray73 = new org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] {};
        java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy> passwordPolicyList74 = new java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList74, passwordPolicyArray73);
        java.lang.String str76 = defaultPasswordGenerator72.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList74);
        java.lang.String str77 = defaultPasswordGenerator63.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList74);
        java.lang.String str78 = defaultPasswordGenerator48.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList74);
        org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] passwordPolicyArray79 = new org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] {};
        java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy> passwordPolicyList80 = new java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList80, passwordPolicyArray79);
        java.lang.String str82 = defaultPasswordGenerator48.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList80);
        java.lang.String str83 = defaultPasswordGenerator21.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList80);
        java.lang.String str84 = defaultPasswordGenerator0.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList80);
        org.apache.syncope.core.persistence.api.entity.ExternalResource externalResource85 = null;
        org.apache.syncope.core.persistence.api.entity.Realm[] realmArray86 = new org.apache.syncope.core.persistence.api.entity.Realm[] {};
        java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.Realm> realmList87 = new java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.Realm>();
        boolean boolean88 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.persistence.api.entity.Realm>) realmList87, realmArray86);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str89 = defaultPasswordGenerator0.generate(externalResource85, (java.util.List<org.apache.syncope.core.persistence.api.entity.Realm>) realmList87);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.persistence.api.entity.ExternalResource.getPasswordPolicy()\" because \"resource\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(passwordPolicyArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "5JXZ406V" + "'", str4, "5JXZ406V");
        org.junit.Assert.assertNotNull(passwordPolicyArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0mb02ke0" + "'", str8, "0mb02ke0");
        org.junit.Assert.assertNotNull(passwordPolicyArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "T5Cv939T" + "'", str14, "T5Cv939T");
        org.junit.Assert.assertNotNull(passwordPolicyArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "9Sy370xa" + "'", str18, "9Sy370xa");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "PcU81n75" + "'", str19, "PcU81n75");
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "t78K60VE" + "'", str20, "t78K60VE");
        org.junit.Assert.assertNotNull(passwordPolicyArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Wp499TC5" + "'", str25, "Wp499TC5");
        org.junit.Assert.assertNotNull(passwordPolicyArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "IEbA3750" + "'", str29, "IEbA3750");
        org.junit.Assert.assertNotNull(passwordPolicyArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str34 + "' != '" + "8a8dL88I" + "'", str34, "8a8dL88I");
// flaky:         org.junit.Assert.assertEquals("'" + str35 + "' != '" + "3Q1k5nC6" + "'", str35, "3Q1k5nC6");
        org.junit.Assert.assertNotNull(passwordPolicyArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str40 + "' != '" + "WX2746oK" + "'", str40, "WX2746oK");
        org.junit.Assert.assertNotNull(passwordPolicyArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str45 + "' != '" + "31LYmb15" + "'", str45, "31LYmb15");
// flaky:         org.junit.Assert.assertEquals("'" + str46 + "' != '" + "T8e037eQ" + "'", str46, "T8e037eQ");
// flaky:         org.junit.Assert.assertEquals("'" + str47 + "' != '" + "V22j41eO" + "'", str47, "V22j41eO");
        org.junit.Assert.assertNotNull(passwordPolicyArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str52 + "' != '" + "7Apg6d34" + "'", str52, "7Apg6d34");
        org.junit.Assert.assertNotNull(passwordPolicyArray53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str56 + "' != '" + "j265Pc1J" + "'", str56, "j265Pc1J");
        org.junit.Assert.assertNotNull(passwordPolicyArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str61 + "' != '" + "8NJ75vE0" + "'", str61, "8NJ75vE0");
// flaky:         org.junit.Assert.assertEquals("'" + str62 + "' != '" + "Af1c3K22" + "'", str62, "Af1c3K22");
        org.junit.Assert.assertNotNull(passwordPolicyArray64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str67 + "' != '" + "4X458KJf" + "'", str67, "4X458KJf");
        org.junit.Assert.assertNotNull(passwordPolicyArray68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str71 + "' != '" + "3O9gwR26" + "'", str71, "3O9gwR26");
        org.junit.Assert.assertNotNull(passwordPolicyArray73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str76 + "' != '" + "B8n41F5G" + "'", str76, "B8n41F5G");
// flaky:         org.junit.Assert.assertEquals("'" + str77 + "' != '" + "x29l10zw" + "'", str77, "x29l10zw");
// flaky:         org.junit.Assert.assertEquals("'" + str78 + "' != '" + "5K9R0X2t" + "'", str78, "5K9R0X2t");
        org.junit.Assert.assertNotNull(passwordPolicyArray79);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str82 + "' != '" + "6yf0s13m" + "'", str82, "6yf0s13m");
// flaky:         org.junit.Assert.assertEquals("'" + str83 + "' != '" + "7y3Oz22L" + "'", str83, "7y3Oz22L");
// flaky:         org.junit.Assert.assertEquals("'" + str84 + "' != '" + "h7Pp98K7" + "'", str84, "h7Pp98K7");
        org.junit.Assert.assertNotNull(realmArray86);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        org.apache.syncope.core.spring.security.DefaultPasswordGenerator defaultPasswordGenerator0 = new org.apache.syncope.core.spring.security.DefaultPasswordGenerator();
        org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] passwordPolicyArray1 = new org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] {};
        java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy> passwordPolicyList2 = new java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList2, passwordPolicyArray1);
        java.lang.String str4 = defaultPasswordGenerator0.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList2);
        org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] passwordPolicyArray5 = new org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] {};
        java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy> passwordPolicyList6 = new java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList6, passwordPolicyArray5);
        java.lang.String str8 = defaultPasswordGenerator0.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList6);
        org.apache.syncope.core.spring.security.DefaultPasswordGenerator defaultPasswordGenerator9 = new org.apache.syncope.core.spring.security.DefaultPasswordGenerator();
        org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] passwordPolicyArray10 = new org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] {};
        java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy> passwordPolicyList11 = new java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList11, passwordPolicyArray10);
        java.lang.String str13 = defaultPasswordGenerator9.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList11);
        java.lang.String str14 = defaultPasswordGenerator0.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList11);
        org.apache.syncope.core.spring.security.DefaultPasswordGenerator defaultPasswordGenerator15 = new org.apache.syncope.core.spring.security.DefaultPasswordGenerator();
        org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] passwordPolicyArray16 = new org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] {};
        java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy> passwordPolicyList17 = new java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList17, passwordPolicyArray16);
        java.lang.String str19 = defaultPasswordGenerator15.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList17);
        org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] passwordPolicyArray20 = new org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] {};
        java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy> passwordPolicyList21 = new java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList21, passwordPolicyArray20);
        java.lang.String str23 = defaultPasswordGenerator15.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList21);
        org.apache.syncope.core.spring.security.DefaultPasswordGenerator defaultPasswordGenerator24 = new org.apache.syncope.core.spring.security.DefaultPasswordGenerator();
        org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] passwordPolicyArray25 = new org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] {};
        java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy> passwordPolicyList26 = new java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList26, passwordPolicyArray25);
        java.lang.String str28 = defaultPasswordGenerator24.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList26);
        java.lang.String str29 = defaultPasswordGenerator15.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList26);
        java.lang.String str30 = defaultPasswordGenerator0.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList26);
        java.lang.Class<?> wildcardClass31 = defaultPasswordGenerator0.getClass();
        org.junit.Assert.assertNotNull(passwordPolicyArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "69VU5hW4" + "'", str4, "69VU5hW4");
        org.junit.Assert.assertNotNull(passwordPolicyArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Q39Vwc83" + "'", str8, "Q39Vwc83");
        org.junit.Assert.assertNotNull(passwordPolicyArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "es31v20m" + "'", str13, "es31v20m");
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "jv164Ff8" + "'", str14, "jv164Ff8");
        org.junit.Assert.assertNotNull(passwordPolicyArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "x37T2r0k" + "'", str19, "x37T2r0k");
        org.junit.Assert.assertNotNull(passwordPolicyArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "7lKq21m3" + "'", str23, "7lKq21m3");
        org.junit.Assert.assertNotNull(passwordPolicyArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "5y43EMR0" + "'", str28, "5y43EMR0");
// flaky:         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "C89Q60sz" + "'", str29, "C89Q60sz");
// flaky:         org.junit.Assert.assertEquals("'" + str30 + "' != '" + "7nX6n50t" + "'", str30, "7nX6n50t");
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        org.apache.syncope.core.spring.security.DefaultPasswordGenerator defaultPasswordGenerator0 = new org.apache.syncope.core.spring.security.DefaultPasswordGenerator();
        org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] passwordPolicyArray1 = new org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] {};
        java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy> passwordPolicyList2 = new java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList2, passwordPolicyArray1);
        java.lang.String str4 = defaultPasswordGenerator0.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList2);
        org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] passwordPolicyArray5 = new org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] {};
        java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy> passwordPolicyList6 = new java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList6, passwordPolicyArray5);
        java.lang.String str8 = defaultPasswordGenerator0.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList6);
        org.apache.syncope.core.spring.security.DefaultPasswordGenerator defaultPasswordGenerator9 = new org.apache.syncope.core.spring.security.DefaultPasswordGenerator();
        org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] passwordPolicyArray10 = new org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] {};
        java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy> passwordPolicyList11 = new java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList11, passwordPolicyArray10);
        java.lang.String str13 = defaultPasswordGenerator9.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList11);
        java.lang.String str14 = defaultPasswordGenerator0.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList11);
        org.apache.syncope.core.spring.security.DefaultPasswordGenerator defaultPasswordGenerator15 = new org.apache.syncope.core.spring.security.DefaultPasswordGenerator();
        org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] passwordPolicyArray16 = new org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] {};
        java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy> passwordPolicyList17 = new java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList17, passwordPolicyArray16);
        java.lang.String str19 = defaultPasswordGenerator15.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList17);
        org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] passwordPolicyArray20 = new org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] {};
        java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy> passwordPolicyList21 = new java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList21, passwordPolicyArray20);
        java.lang.String str23 = defaultPasswordGenerator15.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList21);
        org.apache.syncope.core.spring.security.DefaultPasswordGenerator defaultPasswordGenerator24 = new org.apache.syncope.core.spring.security.DefaultPasswordGenerator();
        org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] passwordPolicyArray25 = new org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] {};
        java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy> passwordPolicyList26 = new java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList26, passwordPolicyArray25);
        java.lang.String str28 = defaultPasswordGenerator24.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList26);
        java.lang.String str29 = defaultPasswordGenerator15.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList26);
        java.lang.String str30 = defaultPasswordGenerator0.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList26);
        org.apache.syncope.core.persistence.api.entity.ExternalResource externalResource31 = null;
        org.apache.syncope.core.persistence.api.entity.Realm[] realmArray32 = new org.apache.syncope.core.persistence.api.entity.Realm[] {};
        java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.Realm> realmList33 = new java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.Realm>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.persistence.api.entity.Realm>) realmList33, realmArray32);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str35 = defaultPasswordGenerator0.generate(externalResource31, (java.util.List<org.apache.syncope.core.persistence.api.entity.Realm>) realmList33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.persistence.api.entity.ExternalResource.getPasswordPolicy()\" because \"resource\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(passwordPolicyArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4B357wfo" + "'", str4, "4B357wfo");
        org.junit.Assert.assertNotNull(passwordPolicyArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "fo872G7y" + "'", str8, "fo872G7y");
        org.junit.Assert.assertNotNull(passwordPolicyArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1w2v2nJ3" + "'", str13, "1w2v2nJ3");
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "P2j61M8c" + "'", str14, "P2j61M8c");
        org.junit.Assert.assertNotNull(passwordPolicyArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "11W8LZ2V" + "'", str19, "11W8LZ2V");
        org.junit.Assert.assertNotNull(passwordPolicyArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "npe9o029" + "'", str23, "npe9o029");
        org.junit.Assert.assertNotNull(passwordPolicyArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "tP06ob03" + "'", str28, "tP06ob03");
// flaky:         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "IU4V982m" + "'", str29, "IU4V982m");
// flaky:         org.junit.Assert.assertEquals("'" + str30 + "' != '" + "9Y2EFZ72" + "'", str30, "9Y2EFZ72");
        org.junit.Assert.assertNotNull(realmArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        org.apache.syncope.core.spring.security.DefaultPasswordGenerator defaultPasswordGenerator0 = new org.apache.syncope.core.spring.security.DefaultPasswordGenerator();
        org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] passwordPolicyArray1 = new org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] {};
        java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy> passwordPolicyList2 = new java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList2, passwordPolicyArray1);
        java.lang.String str4 = defaultPasswordGenerator0.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList2);
        org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] passwordPolicyArray5 = new org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] {};
        java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy> passwordPolicyList6 = new java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList6, passwordPolicyArray5);
        java.lang.String str8 = defaultPasswordGenerator0.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList6);
        org.apache.syncope.core.spring.security.DefaultPasswordGenerator defaultPasswordGenerator9 = new org.apache.syncope.core.spring.security.DefaultPasswordGenerator();
        org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] passwordPolicyArray10 = new org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] {};
        java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy> passwordPolicyList11 = new java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList11, passwordPolicyArray10);
        java.lang.String str13 = defaultPasswordGenerator9.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList11);
        java.lang.String str14 = defaultPasswordGenerator0.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList11);
        org.apache.syncope.core.spring.security.DefaultPasswordGenerator defaultPasswordGenerator15 = new org.apache.syncope.core.spring.security.DefaultPasswordGenerator();
        org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] passwordPolicyArray16 = new org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] {};
        java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy> passwordPolicyList17 = new java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList17, passwordPolicyArray16);
        java.lang.String str19 = defaultPasswordGenerator15.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList17);
        org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] passwordPolicyArray20 = new org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] {};
        java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy> passwordPolicyList21 = new java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList21, passwordPolicyArray20);
        java.lang.String str23 = defaultPasswordGenerator15.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList21);
        org.apache.syncope.core.spring.security.DefaultPasswordGenerator defaultPasswordGenerator24 = new org.apache.syncope.core.spring.security.DefaultPasswordGenerator();
        org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] passwordPolicyArray25 = new org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] {};
        java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy> passwordPolicyList26 = new java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList26, passwordPolicyArray25);
        java.lang.String str28 = defaultPasswordGenerator24.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList26);
        java.lang.String str29 = defaultPasswordGenerator15.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList26);
        java.lang.String str30 = defaultPasswordGenerator0.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList26);
        java.lang.Class<?> wildcardClass31 = passwordPolicyList26.getClass();
        org.junit.Assert.assertNotNull(passwordPolicyArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "6cQE71H5" + "'", str4, "6cQE71H5");
        org.junit.Assert.assertNotNull(passwordPolicyArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "qh9P4N01" + "'", str8, "qh9P4N01");
        org.junit.Assert.assertNotNull(passwordPolicyArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "7NxY403i" + "'", str13, "7NxY403i");
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "s5ht36P4" + "'", str14, "s5ht36P4");
        org.junit.Assert.assertNotNull(passwordPolicyArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "j224mlG5" + "'", str19, "j224mlG5");
        org.junit.Assert.assertNotNull(passwordPolicyArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "w1568gOu" + "'", str23, "w1568gOu");
        org.junit.Assert.assertNotNull(passwordPolicyArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "9cc5u08g" + "'", str28, "9cc5u08g");
// flaky:         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "zX6o16R5" + "'", str29, "zX6o16R5");
// flaky:         org.junit.Assert.assertEquals("'" + str30 + "' != '" + "MQ9G92g7" + "'", str30, "MQ9G92g7");
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        org.apache.syncope.core.spring.security.DefaultPasswordGenerator defaultPasswordGenerator0 = new org.apache.syncope.core.spring.security.DefaultPasswordGenerator();
        org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] passwordPolicyArray1 = new org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] {};
        java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy> passwordPolicyList2 = new java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList2, passwordPolicyArray1);
        java.lang.String str4 = defaultPasswordGenerator0.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList2);
        org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] passwordPolicyArray5 = new org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] {};
        java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy> passwordPolicyList6 = new java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList6, passwordPolicyArray5);
        java.lang.String str8 = defaultPasswordGenerator0.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList6);
        org.apache.syncope.core.spring.security.DefaultPasswordGenerator defaultPasswordGenerator9 = new org.apache.syncope.core.spring.security.DefaultPasswordGenerator();
        org.apache.syncope.core.spring.security.DefaultPasswordGenerator defaultPasswordGenerator10 = new org.apache.syncope.core.spring.security.DefaultPasswordGenerator();
        org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] passwordPolicyArray11 = new org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] {};
        java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy> passwordPolicyList12 = new java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList12, passwordPolicyArray11);
        java.lang.String str14 = defaultPasswordGenerator10.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList12);
        org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] passwordPolicyArray15 = new org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] {};
        java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy> passwordPolicyList16 = new java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList16, passwordPolicyArray15);
        java.lang.String str18 = defaultPasswordGenerator10.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList16);
        java.lang.String str19 = defaultPasswordGenerator9.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList16);
        java.lang.String str20 = defaultPasswordGenerator0.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList16);
        org.apache.syncope.core.spring.security.DefaultPasswordGenerator defaultPasswordGenerator21 = new org.apache.syncope.core.spring.security.DefaultPasswordGenerator();
        org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] passwordPolicyArray22 = new org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] {};
        java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy> passwordPolicyList23 = new java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList23, passwordPolicyArray22);
        java.lang.String str25 = defaultPasswordGenerator21.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList23);
        org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] passwordPolicyArray26 = new org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] {};
        java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy> passwordPolicyList27 = new java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList27, passwordPolicyArray26);
        java.lang.String str29 = defaultPasswordGenerator21.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList27);
        org.apache.syncope.core.spring.security.DefaultPasswordGenerator defaultPasswordGenerator30 = new org.apache.syncope.core.spring.security.DefaultPasswordGenerator();
        org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] passwordPolicyArray31 = new org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] {};
        java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy> passwordPolicyList32 = new java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList32, passwordPolicyArray31);
        java.lang.String str34 = defaultPasswordGenerator30.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList32);
        java.lang.String str35 = defaultPasswordGenerator21.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList32);
        org.apache.syncope.core.spring.security.DefaultPasswordGenerator defaultPasswordGenerator36 = new org.apache.syncope.core.spring.security.DefaultPasswordGenerator();
        org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] passwordPolicyArray37 = new org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] {};
        java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy> passwordPolicyList38 = new java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList38, passwordPolicyArray37);
        java.lang.String str40 = defaultPasswordGenerator36.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList38);
        org.apache.syncope.core.spring.security.DefaultPasswordGenerator defaultPasswordGenerator41 = new org.apache.syncope.core.spring.security.DefaultPasswordGenerator();
        org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] passwordPolicyArray42 = new org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] {};
        java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy> passwordPolicyList43 = new java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList43, passwordPolicyArray42);
        java.lang.String str45 = defaultPasswordGenerator41.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList43);
        java.lang.String str46 = defaultPasswordGenerator36.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList43);
        java.lang.String str47 = defaultPasswordGenerator21.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList43);
        org.apache.syncope.core.spring.security.DefaultPasswordGenerator defaultPasswordGenerator48 = new org.apache.syncope.core.spring.security.DefaultPasswordGenerator();
        org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] passwordPolicyArray49 = new org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] {};
        java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy> passwordPolicyList50 = new java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList50, passwordPolicyArray49);
        java.lang.String str52 = defaultPasswordGenerator48.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList50);
        org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] passwordPolicyArray53 = new org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] {};
        java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy> passwordPolicyList54 = new java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList54, passwordPolicyArray53);
        java.lang.String str56 = defaultPasswordGenerator48.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList54);
        org.apache.syncope.core.spring.security.DefaultPasswordGenerator defaultPasswordGenerator57 = new org.apache.syncope.core.spring.security.DefaultPasswordGenerator();
        org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] passwordPolicyArray58 = new org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] {};
        java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy> passwordPolicyList59 = new java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList59, passwordPolicyArray58);
        java.lang.String str61 = defaultPasswordGenerator57.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList59);
        java.lang.String str62 = defaultPasswordGenerator48.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList59);
        org.apache.syncope.core.spring.security.DefaultPasswordGenerator defaultPasswordGenerator63 = new org.apache.syncope.core.spring.security.DefaultPasswordGenerator();
        org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] passwordPolicyArray64 = new org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] {};
        java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy> passwordPolicyList65 = new java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList65, passwordPolicyArray64);
        java.lang.String str67 = defaultPasswordGenerator63.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList65);
        org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] passwordPolicyArray68 = new org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] {};
        java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy> passwordPolicyList69 = new java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList69, passwordPolicyArray68);
        java.lang.String str71 = defaultPasswordGenerator63.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList69);
        org.apache.syncope.core.spring.security.DefaultPasswordGenerator defaultPasswordGenerator72 = new org.apache.syncope.core.spring.security.DefaultPasswordGenerator();
        org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] passwordPolicyArray73 = new org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] {};
        java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy> passwordPolicyList74 = new java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList74, passwordPolicyArray73);
        java.lang.String str76 = defaultPasswordGenerator72.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList74);
        java.lang.String str77 = defaultPasswordGenerator63.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList74);
        java.lang.String str78 = defaultPasswordGenerator48.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList74);
        org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] passwordPolicyArray79 = new org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] {};
        java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy> passwordPolicyList80 = new java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList80, passwordPolicyArray79);
        java.lang.String str82 = defaultPasswordGenerator48.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList80);
        java.lang.String str83 = defaultPasswordGenerator21.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList80);
        java.lang.String str84 = defaultPasswordGenerator0.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList80);
        org.apache.syncope.core.spring.security.DefaultPasswordGenerator defaultPasswordGenerator85 = new org.apache.syncope.core.spring.security.DefaultPasswordGenerator();
        org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] passwordPolicyArray86 = new org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] {};
        java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy> passwordPolicyList87 = new java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>();
        boolean boolean88 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList87, passwordPolicyArray86);
        java.lang.String str89 = defaultPasswordGenerator85.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList87);
        java.lang.String str90 = defaultPasswordGenerator0.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList87);
        org.junit.Assert.assertNotNull(passwordPolicyArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Vp9d9q09" + "'", str4, "Vp9d9q09");
        org.junit.Assert.assertNotNull(passwordPolicyArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "s6k4qO48" + "'", str8, "s6k4qO48");
        org.junit.Assert.assertNotNull(passwordPolicyArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "GM513fc1" + "'", str14, "GM513fc1");
        org.junit.Assert.assertNotNull(passwordPolicyArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "ftl7H724" + "'", str18, "ftl7H724");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "f7w04rb3" + "'", str19, "f7w04rb3");
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Y8A52S7t" + "'", str20, "Y8A52S7t");
        org.junit.Assert.assertNotNull(passwordPolicyArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "3n234iVs" + "'", str25, "3n234iVs");
        org.junit.Assert.assertNotNull(passwordPolicyArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "TD04b41F" + "'", str29, "TD04b41F");
        org.junit.Assert.assertNotNull(passwordPolicyArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str34 + "' != '" + "77MO2i1k" + "'", str34, "77MO2i1k");
// flaky:         org.junit.Assert.assertEquals("'" + str35 + "' != '" + "42K88PcG" + "'", str35, "42K88PcG");
        org.junit.Assert.assertNotNull(passwordPolicyArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str40 + "' != '" + "U1E1O95z" + "'", str40, "U1E1O95z");
        org.junit.Assert.assertNotNull(passwordPolicyArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str45 + "' != '" + "7e8lo88v" + "'", str45, "7e8lo88v");
// flaky:         org.junit.Assert.assertEquals("'" + str46 + "' != '" + "9Ni85Mw0" + "'", str46, "9Ni85Mw0");
// flaky:         org.junit.Assert.assertEquals("'" + str47 + "' != '" + "563CMiC1" + "'", str47, "563CMiC1");
        org.junit.Assert.assertNotNull(passwordPolicyArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str52 + "' != '" + "8A87U2Fs" + "'", str52, "8A87U2Fs");
        org.junit.Assert.assertNotNull(passwordPolicyArray53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str56 + "' != '" + "63h3WWz7" + "'", str56, "63h3WWz7");
        org.junit.Assert.assertNotNull(passwordPolicyArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str61 + "' != '" + "51EOx38Y" + "'", str61, "51EOx38Y");
// flaky:         org.junit.Assert.assertEquals("'" + str62 + "' != '" + "iT2jI652" + "'", str62, "iT2jI652");
        org.junit.Assert.assertNotNull(passwordPolicyArray64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str67 + "' != '" + "Fo40z3i2" + "'", str67, "Fo40z3i2");
        org.junit.Assert.assertNotNull(passwordPolicyArray68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str71 + "' != '" + "gvK256V1" + "'", str71, "gvK256V1");
        org.junit.Assert.assertNotNull(passwordPolicyArray73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str76 + "' != '" + "76bJD02c" + "'", str76, "76bJD02c");
// flaky:         org.junit.Assert.assertEquals("'" + str77 + "' != '" + "Q3gA8o28" + "'", str77, "Q3gA8o28");
// flaky:         org.junit.Assert.assertEquals("'" + str78 + "' != '" + "E315pf7l" + "'", str78, "E315pf7l");
        org.junit.Assert.assertNotNull(passwordPolicyArray79);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str82 + "' != '" + "NE91N6w5" + "'", str82, "NE91N6w5");
// flaky:         org.junit.Assert.assertEquals("'" + str83 + "' != '" + "BW674J7u" + "'", str83, "BW674J7u");
// flaky:         org.junit.Assert.assertEquals("'" + str84 + "' != '" + "Y0z7i2Z4" + "'", str84, "Y0z7i2Z4");
        org.junit.Assert.assertNotNull(passwordPolicyArray86);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str89 + "' != '" + "s4sL6J67" + "'", str89, "s4sL6J67");
// flaky:         org.junit.Assert.assertEquals("'" + str90 + "' != '" + "Gmek9383" + "'", str90, "Gmek9383");
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        org.apache.syncope.core.spring.security.DefaultPasswordGenerator defaultPasswordGenerator0 = new org.apache.syncope.core.spring.security.DefaultPasswordGenerator();
        org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] passwordPolicyArray1 = new org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] {};
        java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy> passwordPolicyList2 = new java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList2, passwordPolicyArray1);
        java.lang.String str4 = defaultPasswordGenerator0.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList2);
        org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] passwordPolicyArray5 = new org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] {};
        java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy> passwordPolicyList6 = new java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList6, passwordPolicyArray5);
        java.lang.String str8 = defaultPasswordGenerator0.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList6);
        org.apache.syncope.core.spring.security.DefaultPasswordGenerator defaultPasswordGenerator9 = new org.apache.syncope.core.spring.security.DefaultPasswordGenerator();
        org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] passwordPolicyArray10 = new org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] {};
        java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy> passwordPolicyList11 = new java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList11, passwordPolicyArray10);
        java.lang.String str13 = defaultPasswordGenerator9.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList11);
        java.lang.String str14 = defaultPasswordGenerator0.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList11);
        org.apache.syncope.core.spring.security.DefaultPasswordGenerator defaultPasswordGenerator15 = new org.apache.syncope.core.spring.security.DefaultPasswordGenerator();
        org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] passwordPolicyArray16 = new org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] {};
        java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy> passwordPolicyList17 = new java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList17, passwordPolicyArray16);
        java.lang.String str19 = defaultPasswordGenerator15.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList17);
        org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] passwordPolicyArray20 = new org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] {};
        java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy> passwordPolicyList21 = new java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList21, passwordPolicyArray20);
        java.lang.String str23 = defaultPasswordGenerator15.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList21);
        org.apache.syncope.core.spring.security.DefaultPasswordGenerator defaultPasswordGenerator24 = new org.apache.syncope.core.spring.security.DefaultPasswordGenerator();
        org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] passwordPolicyArray25 = new org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] {};
        java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy> passwordPolicyList26 = new java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList26, passwordPolicyArray25);
        java.lang.String str28 = defaultPasswordGenerator24.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList26);
        java.lang.String str29 = defaultPasswordGenerator15.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList26);
        java.lang.String str30 = defaultPasswordGenerator0.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList26);
        org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] passwordPolicyArray31 = new org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] {};
        java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy> passwordPolicyList32 = new java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList32, passwordPolicyArray31);
        java.lang.String str34 = defaultPasswordGenerator0.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList32);
        org.apache.syncope.core.spring.security.DefaultPasswordGenerator defaultPasswordGenerator35 = new org.apache.syncope.core.spring.security.DefaultPasswordGenerator();
        org.apache.syncope.core.spring.security.DefaultPasswordGenerator defaultPasswordGenerator36 = new org.apache.syncope.core.spring.security.DefaultPasswordGenerator();
        org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] passwordPolicyArray37 = new org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] {};
        java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy> passwordPolicyList38 = new java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList38, passwordPolicyArray37);
        java.lang.String str40 = defaultPasswordGenerator36.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList38);
        org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] passwordPolicyArray41 = new org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] {};
        java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy> passwordPolicyList42 = new java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList42, passwordPolicyArray41);
        java.lang.String str44 = defaultPasswordGenerator36.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList42);
        java.lang.String str45 = defaultPasswordGenerator35.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList42);
        java.lang.String str46 = defaultPasswordGenerator0.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList42);
        java.lang.Class<?> wildcardClass47 = passwordPolicyList42.getClass();
        org.junit.Assert.assertNotNull(passwordPolicyArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "tWk4Z849" + "'", str4, "tWk4Z849");
        org.junit.Assert.assertNotNull(passwordPolicyArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "mK21M96P" + "'", str8, "mK21M96P");
        org.junit.Assert.assertNotNull(passwordPolicyArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "cl92os99" + "'", str13, "cl92os99");
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "6xP6z3T4" + "'", str14, "6xP6z3T4");
        org.junit.Assert.assertNotNull(passwordPolicyArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "9s41CS3Q" + "'", str19, "9s41CS3Q");
        org.junit.Assert.assertNotNull(passwordPolicyArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "6v2Qc69A" + "'", str23, "6v2Qc69A");
        org.junit.Assert.assertNotNull(passwordPolicyArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "06ynyV99" + "'", str28, "06ynyV99");
// flaky:         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "77f0i1Kk" + "'", str29, "77f0i1Kk");
// flaky:         org.junit.Assert.assertEquals("'" + str30 + "' != '" + "GQ2Q08H6" + "'", str30, "GQ2Q08H6");
        org.junit.Assert.assertNotNull(passwordPolicyArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str34 + "' != '" + "10Zp0N9L" + "'", str34, "10Zp0N9L");
        org.junit.Assert.assertNotNull(passwordPolicyArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str40 + "' != '" + "581GENk5" + "'", str40, "581GENk5");
        org.junit.Assert.assertNotNull(passwordPolicyArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str44 + "' != '" + "29W8uoE1" + "'", str44, "29W8uoE1");
// flaky:         org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Lkk4685C" + "'", str45, "Lkk4685C");
// flaky:         org.junit.Assert.assertEquals("'" + str46 + "' != '" + "f7QV12e7" + "'", str46, "f7QV12e7");
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        org.apache.syncope.core.spring.security.DefaultPasswordGenerator defaultPasswordGenerator0 = new org.apache.syncope.core.spring.security.DefaultPasswordGenerator();
        org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] passwordPolicyArray1 = new org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] {};
        java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy> passwordPolicyList2 = new java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList2, passwordPolicyArray1);
        java.lang.String str4 = defaultPasswordGenerator0.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList2);
        org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] passwordPolicyArray5 = new org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] {};
        java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy> passwordPolicyList6 = new java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList6, passwordPolicyArray5);
        java.lang.String str8 = defaultPasswordGenerator0.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList6);
        org.apache.syncope.core.spring.security.DefaultPasswordGenerator defaultPasswordGenerator9 = new org.apache.syncope.core.spring.security.DefaultPasswordGenerator();
        org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] passwordPolicyArray10 = new org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] {};
        java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy> passwordPolicyList11 = new java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList11, passwordPolicyArray10);
        java.lang.String str13 = defaultPasswordGenerator9.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList11);
        org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] passwordPolicyArray14 = new org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] {};
        java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy> passwordPolicyList15 = new java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList15, passwordPolicyArray14);
        java.lang.String str17 = defaultPasswordGenerator9.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList15);
        org.apache.syncope.core.spring.security.DefaultPasswordGenerator defaultPasswordGenerator18 = new org.apache.syncope.core.spring.security.DefaultPasswordGenerator();
        org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] passwordPolicyArray19 = new org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] {};
        java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy> passwordPolicyList20 = new java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList20, passwordPolicyArray19);
        java.lang.String str22 = defaultPasswordGenerator18.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList20);
        java.lang.String str23 = defaultPasswordGenerator9.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList20);
        org.apache.syncope.core.spring.security.DefaultPasswordGenerator defaultPasswordGenerator24 = new org.apache.syncope.core.spring.security.DefaultPasswordGenerator();
        org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] passwordPolicyArray25 = new org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] {};
        java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy> passwordPolicyList26 = new java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList26, passwordPolicyArray25);
        java.lang.String str28 = defaultPasswordGenerator24.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList26);
        org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] passwordPolicyArray29 = new org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] {};
        java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy> passwordPolicyList30 = new java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList30, passwordPolicyArray29);
        java.lang.String str32 = defaultPasswordGenerator24.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList30);
        org.apache.syncope.core.spring.security.DefaultPasswordGenerator defaultPasswordGenerator33 = new org.apache.syncope.core.spring.security.DefaultPasswordGenerator();
        org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] passwordPolicyArray34 = new org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] {};
        java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy> passwordPolicyList35 = new java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList35, passwordPolicyArray34);
        java.lang.String str37 = defaultPasswordGenerator33.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList35);
        java.lang.String str38 = defaultPasswordGenerator24.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList35);
        java.lang.String str39 = defaultPasswordGenerator9.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList35);
        java.lang.String str40 = defaultPasswordGenerator0.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList35);
        org.junit.Assert.assertNotNull(passwordPolicyArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "035Hw7Pe" + "'", str4, "035Hw7Pe");
        org.junit.Assert.assertNotNull(passwordPolicyArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Xt4V126r" + "'", str8, "Xt4V126r");
        org.junit.Assert.assertNotNull(passwordPolicyArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "kh33Y7q9" + "'", str13, "kh33Y7q9");
        org.junit.Assert.assertNotNull(passwordPolicyArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "f1Kt515D" + "'", str17, "f1Kt515D");
        org.junit.Assert.assertNotNull(passwordPolicyArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "45kzwK56" + "'", str22, "45kzwK56");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "19HRK98f" + "'", str23, "19HRK98f");
        org.junit.Assert.assertNotNull(passwordPolicyArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "7E61e3LC" + "'", str28, "7E61e3LC");
        org.junit.Assert.assertNotNull(passwordPolicyArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str32 + "' != '" + "jbg2Q241" + "'", str32, "jbg2Q241");
        org.junit.Assert.assertNotNull(passwordPolicyArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str37 + "' != '" + "kbP5g695" + "'", str37, "kbP5g695");
// flaky:         org.junit.Assert.assertEquals("'" + str38 + "' != '" + "yJF893d7" + "'", str38, "yJF893d7");
// flaky:         org.junit.Assert.assertEquals("'" + str39 + "' != '" + "D1F743br" + "'", str39, "D1F743br");
// flaky:         org.junit.Assert.assertEquals("'" + str40 + "' != '" + "6Vya567Q" + "'", str40, "6Vya567Q");
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        org.apache.syncope.core.spring.security.DefaultPasswordGenerator defaultPasswordGenerator0 = new org.apache.syncope.core.spring.security.DefaultPasswordGenerator();
        org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] passwordPolicyArray1 = new org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] {};
        java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy> passwordPolicyList2 = new java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList2, passwordPolicyArray1);
        java.lang.String str4 = defaultPasswordGenerator0.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList2);
        org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] passwordPolicyArray5 = new org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] {};
        java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy> passwordPolicyList6 = new java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList6, passwordPolicyArray5);
        java.lang.String str8 = defaultPasswordGenerator0.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList6);
        org.apache.syncope.core.spring.security.DefaultPasswordGenerator defaultPasswordGenerator9 = new org.apache.syncope.core.spring.security.DefaultPasswordGenerator();
        org.apache.syncope.core.spring.security.DefaultPasswordGenerator defaultPasswordGenerator10 = new org.apache.syncope.core.spring.security.DefaultPasswordGenerator();
        org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] passwordPolicyArray11 = new org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] {};
        java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy> passwordPolicyList12 = new java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList12, passwordPolicyArray11);
        java.lang.String str14 = defaultPasswordGenerator10.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList12);
        org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] passwordPolicyArray15 = new org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] {};
        java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy> passwordPolicyList16 = new java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList16, passwordPolicyArray15);
        java.lang.String str18 = defaultPasswordGenerator10.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList16);
        java.lang.String str19 = defaultPasswordGenerator9.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList16);
        java.lang.String str20 = defaultPasswordGenerator0.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList16);
        org.apache.syncope.core.spring.security.DefaultPasswordGenerator defaultPasswordGenerator21 = new org.apache.syncope.core.spring.security.DefaultPasswordGenerator();
        org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] passwordPolicyArray22 = new org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] {};
        java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy> passwordPolicyList23 = new java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList23, passwordPolicyArray22);
        java.lang.String str25 = defaultPasswordGenerator21.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList23);
        org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] passwordPolicyArray26 = new org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] {};
        java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy> passwordPolicyList27 = new java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList27, passwordPolicyArray26);
        java.lang.String str29 = defaultPasswordGenerator21.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList27);
        org.apache.syncope.core.spring.security.DefaultPasswordGenerator defaultPasswordGenerator30 = new org.apache.syncope.core.spring.security.DefaultPasswordGenerator();
        org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] passwordPolicyArray31 = new org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] {};
        java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy> passwordPolicyList32 = new java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList32, passwordPolicyArray31);
        java.lang.String str34 = defaultPasswordGenerator30.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList32);
        java.lang.String str35 = defaultPasswordGenerator21.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList32);
        org.apache.syncope.core.spring.security.DefaultPasswordGenerator defaultPasswordGenerator36 = new org.apache.syncope.core.spring.security.DefaultPasswordGenerator();
        org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] passwordPolicyArray37 = new org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] {};
        java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy> passwordPolicyList38 = new java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList38, passwordPolicyArray37);
        java.lang.String str40 = defaultPasswordGenerator36.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList38);
        org.apache.syncope.core.spring.security.DefaultPasswordGenerator defaultPasswordGenerator41 = new org.apache.syncope.core.spring.security.DefaultPasswordGenerator();
        org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] passwordPolicyArray42 = new org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] {};
        java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy> passwordPolicyList43 = new java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList43, passwordPolicyArray42);
        java.lang.String str45 = defaultPasswordGenerator41.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList43);
        java.lang.String str46 = defaultPasswordGenerator36.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList43);
        java.lang.String str47 = defaultPasswordGenerator21.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList43);
        org.apache.syncope.core.spring.security.DefaultPasswordGenerator defaultPasswordGenerator48 = new org.apache.syncope.core.spring.security.DefaultPasswordGenerator();
        org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] passwordPolicyArray49 = new org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] {};
        java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy> passwordPolicyList50 = new java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList50, passwordPolicyArray49);
        java.lang.String str52 = defaultPasswordGenerator48.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList50);
        org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] passwordPolicyArray53 = new org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] {};
        java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy> passwordPolicyList54 = new java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList54, passwordPolicyArray53);
        java.lang.String str56 = defaultPasswordGenerator48.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList54);
        org.apache.syncope.core.spring.security.DefaultPasswordGenerator defaultPasswordGenerator57 = new org.apache.syncope.core.spring.security.DefaultPasswordGenerator();
        org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] passwordPolicyArray58 = new org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] {};
        java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy> passwordPolicyList59 = new java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList59, passwordPolicyArray58);
        java.lang.String str61 = defaultPasswordGenerator57.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList59);
        java.lang.String str62 = defaultPasswordGenerator48.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList59);
        org.apache.syncope.core.spring.security.DefaultPasswordGenerator defaultPasswordGenerator63 = new org.apache.syncope.core.spring.security.DefaultPasswordGenerator();
        org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] passwordPolicyArray64 = new org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] {};
        java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy> passwordPolicyList65 = new java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList65, passwordPolicyArray64);
        java.lang.String str67 = defaultPasswordGenerator63.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList65);
        org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] passwordPolicyArray68 = new org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] {};
        java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy> passwordPolicyList69 = new java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList69, passwordPolicyArray68);
        java.lang.String str71 = defaultPasswordGenerator63.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList69);
        org.apache.syncope.core.spring.security.DefaultPasswordGenerator defaultPasswordGenerator72 = new org.apache.syncope.core.spring.security.DefaultPasswordGenerator();
        org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] passwordPolicyArray73 = new org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] {};
        java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy> passwordPolicyList74 = new java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList74, passwordPolicyArray73);
        java.lang.String str76 = defaultPasswordGenerator72.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList74);
        java.lang.String str77 = defaultPasswordGenerator63.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList74);
        java.lang.String str78 = defaultPasswordGenerator48.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList74);
        org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] passwordPolicyArray79 = new org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] {};
        java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy> passwordPolicyList80 = new java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList80, passwordPolicyArray79);
        java.lang.String str82 = defaultPasswordGenerator48.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList80);
        java.lang.String str83 = defaultPasswordGenerator21.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList80);
        java.lang.String str84 = defaultPasswordGenerator0.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList80);
        java.lang.Class<?> wildcardClass85 = passwordPolicyList80.getClass();
        org.junit.Assert.assertNotNull(passwordPolicyArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "G3508jBl" + "'", str4, "G3508jBl");
        org.junit.Assert.assertNotNull(passwordPolicyArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "U444nPM1" + "'", str8, "U444nPM1");
        org.junit.Assert.assertNotNull(passwordPolicyArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "nlC0869r" + "'", str14, "nlC0869r");
        org.junit.Assert.assertNotNull(passwordPolicyArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "M3e187JK" + "'", str18, "M3e187JK");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "q6I042Hb" + "'", str19, "q6I042Hb");
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "h0R62B1S" + "'", str20, "h0R62B1S");
        org.junit.Assert.assertNotNull(passwordPolicyArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "xf41x70b" + "'", str25, "xf41x70b");
        org.junit.Assert.assertNotNull(passwordPolicyArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "NFfB2460" + "'", str29, "NFfB2460");
        org.junit.Assert.assertNotNull(passwordPolicyArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str34 + "' != '" + "N0E080kA" + "'", str34, "N0E080kA");
// flaky:         org.junit.Assert.assertEquals("'" + str35 + "' != '" + "G5G62f5O" + "'", str35, "G5G62f5O");
        org.junit.Assert.assertNotNull(passwordPolicyArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Om901b3h" + "'", str40, "Om901b3h");
        org.junit.Assert.assertNotNull(passwordPolicyArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str45 + "' != '" + "1y0S61rD" + "'", str45, "1y0S61rD");
// flaky:         org.junit.Assert.assertEquals("'" + str46 + "' != '" + "if911hs5" + "'", str46, "if911hs5");
// flaky:         org.junit.Assert.assertEquals("'" + str47 + "' != '" + "0F4mck56" + "'", str47, "0F4mck56");
        org.junit.Assert.assertNotNull(passwordPolicyArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str52 + "' != '" + "2O95E8DV" + "'", str52, "2O95E8DV");
        org.junit.Assert.assertNotNull(passwordPolicyArray53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str56 + "' != '" + "85Rv4T3e" + "'", str56, "85Rv4T3e");
        org.junit.Assert.assertNotNull(passwordPolicyArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str61 + "' != '" + "QEL5863H" + "'", str61, "QEL5863H");
// flaky:         org.junit.Assert.assertEquals("'" + str62 + "' != '" + "FtB93h02" + "'", str62, "FtB93h02");
        org.junit.Assert.assertNotNull(passwordPolicyArray64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str67 + "' != '" + "PbC5K471" + "'", str67, "PbC5K471");
        org.junit.Assert.assertNotNull(passwordPolicyArray68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str71 + "' != '" + "36HwV99I" + "'", str71, "36HwV99I");
        org.junit.Assert.assertNotNull(passwordPolicyArray73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str76 + "' != '" + "X7T46QE1" + "'", str76, "X7T46QE1");
// flaky:         org.junit.Assert.assertEquals("'" + str77 + "' != '" + "68yk8N1m" + "'", str77, "68yk8N1m");
// flaky:         org.junit.Assert.assertEquals("'" + str78 + "' != '" + "58v0qc9k" + "'", str78, "58v0qc9k");
        org.junit.Assert.assertNotNull(passwordPolicyArray79);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str82 + "' != '" + "N6Y04w3B" + "'", str82, "N6Y04w3B");
// flaky:         org.junit.Assert.assertEquals("'" + str83 + "' != '" + "837gLcb4" + "'", str83, "837gLcb4");
// flaky:         org.junit.Assert.assertEquals("'" + str84 + "' != '" + "0RR67Xh0" + "'", str84, "0RR67Xh0");
        org.junit.Assert.assertNotNull(wildcardClass85);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        org.apache.syncope.core.spring.security.DefaultPasswordGenerator defaultPasswordGenerator0 = new org.apache.syncope.core.spring.security.DefaultPasswordGenerator();
        org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] passwordPolicyArray1 = new org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] {};
        java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy> passwordPolicyList2 = new java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList2, passwordPolicyArray1);
        java.lang.String str4 = defaultPasswordGenerator0.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList2);
        org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] passwordPolicyArray5 = new org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] {};
        java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy> passwordPolicyList6 = new java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList6, passwordPolicyArray5);
        java.lang.String str8 = defaultPasswordGenerator0.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList6);
        org.apache.syncope.core.spring.security.DefaultPasswordGenerator defaultPasswordGenerator9 = new org.apache.syncope.core.spring.security.DefaultPasswordGenerator();
        org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] passwordPolicyArray10 = new org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] {};
        java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy> passwordPolicyList11 = new java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList11, passwordPolicyArray10);
        java.lang.String str13 = defaultPasswordGenerator9.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList11);
        java.lang.String str14 = defaultPasswordGenerator0.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList11);
        org.apache.syncope.core.spring.security.DefaultPasswordGenerator defaultPasswordGenerator15 = new org.apache.syncope.core.spring.security.DefaultPasswordGenerator();
        org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] passwordPolicyArray16 = new org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] {};
        java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy> passwordPolicyList17 = new java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList17, passwordPolicyArray16);
        java.lang.String str19 = defaultPasswordGenerator15.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList17);
        org.apache.syncope.core.spring.security.DefaultPasswordGenerator defaultPasswordGenerator20 = new org.apache.syncope.core.spring.security.DefaultPasswordGenerator();
        org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] passwordPolicyArray21 = new org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] {};
        java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy> passwordPolicyList22 = new java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList22, passwordPolicyArray21);
        java.lang.String str24 = defaultPasswordGenerator20.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList22);
        java.lang.String str25 = defaultPasswordGenerator15.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList22);
        java.lang.String str26 = defaultPasswordGenerator0.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList22);
        org.apache.syncope.core.spring.security.DefaultPasswordGenerator defaultPasswordGenerator27 = new org.apache.syncope.core.spring.security.DefaultPasswordGenerator();
        org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] passwordPolicyArray28 = new org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] {};
        java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy> passwordPolicyList29 = new java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList29, passwordPolicyArray28);
        java.lang.String str31 = defaultPasswordGenerator27.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList29);
        org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] passwordPolicyArray32 = new org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] {};
        java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy> passwordPolicyList33 = new java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList33, passwordPolicyArray32);
        java.lang.String str35 = defaultPasswordGenerator27.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList33);
        org.apache.syncope.core.spring.security.DefaultPasswordGenerator defaultPasswordGenerator36 = new org.apache.syncope.core.spring.security.DefaultPasswordGenerator();
        org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] passwordPolicyArray37 = new org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] {};
        java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy> passwordPolicyList38 = new java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList38, passwordPolicyArray37);
        java.lang.String str40 = defaultPasswordGenerator36.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList38);
        java.lang.String str41 = defaultPasswordGenerator27.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList38);
        org.apache.syncope.core.spring.security.DefaultPasswordGenerator defaultPasswordGenerator42 = new org.apache.syncope.core.spring.security.DefaultPasswordGenerator();
        org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] passwordPolicyArray43 = new org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] {};
        java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy> passwordPolicyList44 = new java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList44, passwordPolicyArray43);
        java.lang.String str46 = defaultPasswordGenerator42.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList44);
        org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] passwordPolicyArray47 = new org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] {};
        java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy> passwordPolicyList48 = new java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList48, passwordPolicyArray47);
        java.lang.String str50 = defaultPasswordGenerator42.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList48);
        org.apache.syncope.core.spring.security.DefaultPasswordGenerator defaultPasswordGenerator51 = new org.apache.syncope.core.spring.security.DefaultPasswordGenerator();
        org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] passwordPolicyArray52 = new org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] {};
        java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy> passwordPolicyList53 = new java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList53, passwordPolicyArray52);
        java.lang.String str55 = defaultPasswordGenerator51.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList53);
        java.lang.String str56 = defaultPasswordGenerator42.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList53);
        java.lang.String str57 = defaultPasswordGenerator27.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList53);
        org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] passwordPolicyArray58 = new org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] {};
        java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy> passwordPolicyList59 = new java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList59, passwordPolicyArray58);
        java.lang.String str61 = defaultPasswordGenerator27.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList59);
        java.lang.String str62 = defaultPasswordGenerator0.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList59);
        org.apache.syncope.core.spring.security.DefaultPasswordGenerator defaultPasswordGenerator63 = new org.apache.syncope.core.spring.security.DefaultPasswordGenerator();
        org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] passwordPolicyArray64 = new org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] {};
        java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy> passwordPolicyList65 = new java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList65, passwordPolicyArray64);
        java.lang.String str67 = defaultPasswordGenerator63.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList65);
        org.apache.syncope.core.spring.security.DefaultPasswordGenerator defaultPasswordGenerator68 = new org.apache.syncope.core.spring.security.DefaultPasswordGenerator();
        org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] passwordPolicyArray69 = new org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] {};
        java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy> passwordPolicyList70 = new java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList70, passwordPolicyArray69);
        java.lang.String str72 = defaultPasswordGenerator68.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList70);
        java.lang.String str73 = defaultPasswordGenerator63.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList70);
        org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] passwordPolicyArray74 = new org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy[] {};
        java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy> passwordPolicyList75 = new java.util.ArrayList<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList75, passwordPolicyArray74);
        java.lang.String str77 = defaultPasswordGenerator63.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList75);
        java.lang.String str78 = defaultPasswordGenerator0.generate((java.util.List<org.apache.syncope.core.persistence.api.entity.policy.PasswordPolicy>) passwordPolicyList75);
        java.lang.Class<?> wildcardClass79 = defaultPasswordGenerator0.getClass();
        org.junit.Assert.assertNotNull(passwordPolicyArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4xYM020P" + "'", str4, "4xYM020P");
        org.junit.Assert.assertNotNull(passwordPolicyArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "P4b9F99J" + "'", str8, "P4b9F99J");
        org.junit.Assert.assertNotNull(passwordPolicyArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "02io55ck" + "'", str13, "02io55ck");
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "he8L5i95" + "'", str14, "he8L5i95");
        org.junit.Assert.assertNotNull(passwordPolicyArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "n2354oGj" + "'", str19, "n2354oGj");
        org.junit.Assert.assertNotNull(passwordPolicyArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "oJ1iC812" + "'", str24, "oJ1iC812");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Wr77h94w" + "'", str25, "Wr77h94w");
// flaky:         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "av799zL5" + "'", str26, "av799zL5");
        org.junit.Assert.assertNotNull(passwordPolicyArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str31 + "' != '" + "03q3ijz4" + "'", str31, "03q3ijz4");
        org.junit.Assert.assertNotNull(passwordPolicyArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str35 + "' != '" + "7Jl08uj9" + "'", str35, "7Jl08uj9");
        org.junit.Assert.assertNotNull(passwordPolicyArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str40 + "' != '" + "sq1Wu062" + "'", str40, "sq1Wu062");
// flaky:         org.junit.Assert.assertEquals("'" + str41 + "' != '" + "oF5u188Q" + "'", str41, "oF5u188Q");
        org.junit.Assert.assertNotNull(passwordPolicyArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str46 + "' != '" + "p4k95vs2" + "'", str46, "p4k95vs2");
        org.junit.Assert.assertNotNull(passwordPolicyArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str50 + "' != '" + "380c1iaT" + "'", str50, "380c1iaT");
        org.junit.Assert.assertNotNull(passwordPolicyArray52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str55 + "' != '" + "bse457m4" + "'", str55, "bse457m4");
// flaky:         org.junit.Assert.assertEquals("'" + str56 + "' != '" + "747h3Jyg" + "'", str56, "747h3Jyg");
// flaky:         org.junit.Assert.assertEquals("'" + str57 + "' != '" + "559Ci6mA" + "'", str57, "559Ci6mA");
        org.junit.Assert.assertNotNull(passwordPolicyArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str61 + "' != '" + "f654a2vW" + "'", str61, "f654a2vW");
// flaky:         org.junit.Assert.assertEquals("'" + str62 + "' != '" + "b8Tbc529" + "'", str62, "b8Tbc529");
        org.junit.Assert.assertNotNull(passwordPolicyArray64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str67 + "' != '" + "sK11l0T8" + "'", str67, "sK11l0T8");
        org.junit.Assert.assertNotNull(passwordPolicyArray69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str72 + "' != '" + "O6vD503O" + "'", str72, "O6vD503O");
// flaky:         org.junit.Assert.assertEquals("'" + str73 + "' != '" + "590c3IVX" + "'", str73, "590c3IVX");
        org.junit.Assert.assertNotNull(passwordPolicyArray74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str77 + "' != '" + "615Yy6pJ" + "'", str77, "615Yy6pJ");
// flaky:         org.junit.Assert.assertEquals("'" + str78 + "' != '" + "u8995rcE" + "'", str78, "u8995rcE");
        org.junit.Assert.assertNotNull(wildcardClass79);
    }
}
