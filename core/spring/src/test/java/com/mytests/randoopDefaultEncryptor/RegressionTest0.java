package com.mytests.randoopDefaultEncryptor;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test1");
        boolean boolean1 = org.apache.syncope.core.spring.security.DefaultEncryptorRandoopSetup.testBCryptVerification("hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test2");
        boolean boolean1 = org.apache.syncope.core.spring.security.DefaultEncryptorRandoopSetup.testBCryptVerification("");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test3");
        boolean boolean1 = org.apache.syncope.core.spring.security.DefaultEncryptorRandoopSetup.testAESRoundTrip("hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test4");
        boolean boolean2 = org.apache.syncope.core.spring.security.DefaultEncryptorRandoopSetup.testVerifyFailure("", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test5");
        boolean boolean1 = org.apache.syncope.core.spring.security.DefaultEncryptorRandoopSetup.testAESRoundTrip("");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test6() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test6");
        boolean boolean2 = org.apache.syncope.core.spring.security.DefaultEncryptorRandoopSetup.testVerifyFailure("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test7() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test7");
        boolean boolean2 = org.apache.syncope.core.spring.security.DefaultEncryptorRandoopSetup.testVerifyFailure("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test8() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test8");
        boolean boolean2 = org.apache.syncope.core.spring.security.DefaultEncryptorRandoopSetup.testVerifyFailure("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }
}

