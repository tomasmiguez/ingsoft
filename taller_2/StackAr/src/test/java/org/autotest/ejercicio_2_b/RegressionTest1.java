package org.autotest;

import org.junit.FixMethodOrder;
import org.junit.jupiter.api.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0051");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean2 = stackAr1.isFull();
        int int3 = stackAr1.size();
        int int4 = stackAr1.size();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.push((java.lang.Object) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0052");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        boolean boolean1 = stackAr0.isFull();
        boolean boolean3 = stackAr0.equals((java.lang.Object) (byte) -1);
        java.lang.String str4 = stackAr0.toString();
        boolean boolean6 = stackAr0.equals((java.lang.Object) 10L);
        java.lang.String str7 = stackAr0.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = stackAr0.top();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0053");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean2 = stackAr1.isEmpty();
        boolean boolean3 = stackAr1.isFull();
        boolean boolean4 = stackAr1.isEmpty();
        int int5 = stackAr1.size();
        org.autotest.StackAr stackAr7 = new org.autotest.StackAr((int) 'a');
        boolean boolean9 = stackAr7.equals((java.lang.Object) (-1.0f));
        boolean boolean11 = stackAr7.equals((java.lang.Object) "");
        org.autotest.StackAr stackAr12 = new org.autotest.StackAr();
        boolean boolean13 = stackAr12.isFull();
        stackAr7.push((java.lang.Object) stackAr12);
        org.autotest.StackAr stackAr16 = new org.autotest.StackAr((int) '4');
        org.autotest.StackAr stackAr18 = new org.autotest.StackAr((int) '4');
        java.lang.String str19 = stackAr18.toString();
        boolean boolean20 = stackAr16.equals((java.lang.Object) stackAr18);
        org.autotest.StackAr stackAr21 = new org.autotest.StackAr();
        boolean boolean22 = stackAr21.isFull();
        boolean boolean24 = stackAr21.equals((java.lang.Object) (byte) -1);
        java.lang.String str25 = stackAr21.toString();
        boolean boolean27 = stackAr21.equals((java.lang.Object) 10L);
        java.lang.String str28 = stackAr21.toString();
        stackAr18.push((java.lang.Object) stackAr21);
        stackAr7.push((java.lang.Object) stackAr21);
        org.autotest.StackAr stackAr32 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean33 = stackAr32.isEmpty();
        boolean boolean34 = stackAr32.isFull();
        org.autotest.StackAr stackAr36 = new org.autotest.StackAr((int) '4');
        org.autotest.StackAr stackAr38 = new org.autotest.StackAr((int) '4');
        java.lang.String str39 = stackAr38.toString();
        boolean boolean40 = stackAr36.equals((java.lang.Object) stackAr38);
        org.autotest.StackAr stackAr42 = new org.autotest.StackAr((int) '4');
        stackAr42.push((java.lang.Object) (-1L));
        java.lang.Object obj45 = stackAr42.pop();
        stackAr36.push((java.lang.Object) stackAr42);
        boolean boolean47 = stackAr32.equals((java.lang.Object) stackAr36);
        stackAr21.push((java.lang.Object) stackAr36);
        org.autotest.StackAr stackAr50 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean51 = stackAr50.isFull();
        int int52 = stackAr50.size();
        int int53 = stackAr50.size();
        stackAr36.push((java.lang.Object) stackAr50);
        java.lang.String str55 = stackAr36.toString();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.push((java.lang.Object) str55);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[]" + "'", str19, "[]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "[]" + "'", str25, "[]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "[]" + "'", str28, "[]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "[]" + "'", str39, "[]");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertEquals("'" + obj45 + "' != '" + (-1L) + "'", obj45, (-1L));
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "[[],[]]" + "'", str55, "[[],[]]");
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0054");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        boolean boolean1 = stackAr0.isFull();
        boolean boolean3 = stackAr0.equals((java.lang.Object) false);
        boolean boolean4 = stackAr0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = stackAr0.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0055");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) 'a');
        boolean boolean3 = stackAr1.equals((java.lang.Object) (-1.0f));
        boolean boolean5 = stackAr1.equals((java.lang.Object) "");
        org.autotest.StackAr stackAr6 = new org.autotest.StackAr();
        boolean boolean7 = stackAr6.isFull();
        stackAr1.push((java.lang.Object) stackAr6);
        org.autotest.StackAr stackAr10 = new org.autotest.StackAr((int) '4');
        org.autotest.StackAr stackAr12 = new org.autotest.StackAr((int) '4');
        java.lang.String str13 = stackAr12.toString();
        boolean boolean14 = stackAr10.equals((java.lang.Object) stackAr12);
        org.autotest.StackAr stackAr15 = new org.autotest.StackAr();
        boolean boolean16 = stackAr15.isFull();
        boolean boolean18 = stackAr15.equals((java.lang.Object) (byte) -1);
        java.lang.String str19 = stackAr15.toString();
        boolean boolean21 = stackAr15.equals((java.lang.Object) 10L);
        java.lang.String str22 = stackAr15.toString();
        stackAr12.push((java.lang.Object) stackAr15);
        stackAr1.push((java.lang.Object) stackAr15);
        org.autotest.StackAr stackAr26 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean27 = stackAr26.isEmpty();
        boolean boolean28 = stackAr26.isFull();
        org.autotest.StackAr stackAr30 = new org.autotest.StackAr((int) '4');
        org.autotest.StackAr stackAr32 = new org.autotest.StackAr((int) '4');
        java.lang.String str33 = stackAr32.toString();
        boolean boolean34 = stackAr30.equals((java.lang.Object) stackAr32);
        org.autotest.StackAr stackAr36 = new org.autotest.StackAr((int) '4');
        stackAr36.push((java.lang.Object) (-1L));
        java.lang.Object obj39 = stackAr36.pop();
        stackAr30.push((java.lang.Object) stackAr36);
        boolean boolean41 = stackAr26.equals((java.lang.Object) stackAr30);
        stackAr15.push((java.lang.Object) stackAr30);
        org.autotest.StackAr stackAr44 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean45 = stackAr44.isFull();
        int int46 = stackAr44.size();
        int int47 = stackAr44.size();
        stackAr30.push((java.lang.Object) stackAr44);
        java.lang.Class<?> wildcardClass49 = stackAr44.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[]" + "'", str13, "[]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[]" + "'", str19, "[]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "[]" + "'", str22, "[]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "[]" + "'", str33, "[]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + (-1L) + "'", obj39, (-1L));
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0056");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) 'a');
        boolean boolean2 = stackAr1.isFull();
        org.autotest.StackAr stackAr3 = new org.autotest.StackAr();
        boolean boolean4 = stackAr3.isFull();
        boolean boolean6 = stackAr3.equals((java.lang.Object) (byte) -1);
        stackAr1.push((java.lang.Object) boolean6);
        boolean boolean8 = stackAr1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0057");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) 'a');
        boolean boolean2 = stackAr1.isFull();
        org.autotest.StackAr stackAr4 = new org.autotest.StackAr((int) '4');
        java.lang.String str5 = stackAr4.toString();
        java.lang.String str6 = stackAr4.toString();
        org.autotest.StackAr stackAr7 = new org.autotest.StackAr();
        boolean boolean8 = stackAr7.isFull();
        boolean boolean10 = stackAr7.equals((java.lang.Object) (byte) -1);
        org.autotest.StackAr stackAr12 = new org.autotest.StackAr((int) '4');
        boolean boolean13 = stackAr7.equals((java.lang.Object) '4');
        org.autotest.StackAr stackAr15 = new org.autotest.StackAr((int) 'a');
        boolean boolean17 = stackAr15.equals((java.lang.Object) (-1.0f));
        boolean boolean19 = stackAr15.equals((java.lang.Object) "");
        boolean boolean20 = stackAr7.equals((java.lang.Object) "");
        boolean boolean21 = stackAr7.isFull();
        boolean boolean22 = stackAr4.equals((java.lang.Object) stackAr7);
        int int23 = stackAr7.size();
        stackAr1.push((java.lang.Object) int23);
        java.lang.Class<?> wildcardClass25 = stackAr1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0058");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = stackAr1.top();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0059");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        boolean boolean1 = stackAr0.isFull();
        java.lang.String str2 = stackAr0.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = stackAr0.top();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0060");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        boolean boolean1 = stackAr0.isFull();
        boolean boolean3 = stackAr0.equals((java.lang.Object) (byte) -1);
        java.lang.String str4 = stackAr0.toString();
        boolean boolean6 = stackAr0.equals((java.lang.Object) 10L);
        java.lang.String str7 = stackAr0.toString();
        org.autotest.StackAr stackAr9 = new org.autotest.StackAr((int) 'a');
        boolean boolean11 = stackAr9.equals((java.lang.Object) (-1.0f));
        boolean boolean13 = stackAr9.equals((java.lang.Object) "");
        org.autotest.StackAr stackAr14 = new org.autotest.StackAr();
        boolean boolean15 = stackAr14.isFull();
        stackAr9.push((java.lang.Object) stackAr14);
        org.autotest.StackAr stackAr18 = new org.autotest.StackAr((int) '4');
        org.autotest.StackAr stackAr20 = new org.autotest.StackAr((int) '4');
        java.lang.String str21 = stackAr20.toString();
        boolean boolean22 = stackAr18.equals((java.lang.Object) stackAr20);
        org.autotest.StackAr stackAr23 = new org.autotest.StackAr();
        boolean boolean24 = stackAr23.isFull();
        boolean boolean26 = stackAr23.equals((java.lang.Object) (byte) -1);
        java.lang.String str27 = stackAr23.toString();
        boolean boolean29 = stackAr23.equals((java.lang.Object) 10L);
        java.lang.String str30 = stackAr23.toString();
        stackAr20.push((java.lang.Object) stackAr23);
        stackAr9.push((java.lang.Object) stackAr23);
        boolean boolean33 = stackAr0.equals((java.lang.Object) stackAr23);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj34 = stackAr23.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "[]" + "'", str21, "[]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "[]" + "'", str27, "[]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "[]" + "'", str30, "[]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0061");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        boolean boolean1 = stackAr0.isFull();
        boolean boolean3 = stackAr0.equals((java.lang.Object) (byte) -1);
        java.lang.String str4 = stackAr0.toString();
        boolean boolean5 = stackAr0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = stackAr0.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0062");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) 'a');
        boolean boolean2 = stackAr1.isFull();
        boolean boolean3 = stackAr1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0063");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        boolean boolean1 = stackAr0.isFull();
        boolean boolean3 = stackAr0.equals((java.lang.Object) (byte) -1);
        java.lang.String str4 = stackAr0.toString();
        boolean boolean6 = stackAr0.equals((java.lang.Object) 10L);
        java.lang.String str7 = stackAr0.toString();
        boolean boolean9 = stackAr0.equals((java.lang.Object) (byte) 0);
        boolean boolean10 = stackAr0.isFull();
        org.autotest.StackAr stackAr12 = new org.autotest.StackAr((int) '#');
        stackAr0.push((java.lang.Object) stackAr12);
        java.lang.Class<?> wildcardClass14 = stackAr0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0064");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean2 = stackAr1.isEmpty();
        org.autotest.StackAr stackAr4 = new org.autotest.StackAr((int) 'a');
        boolean boolean5 = stackAr4.isFull();
        org.autotest.StackAr stackAr6 = new org.autotest.StackAr();
        boolean boolean7 = stackAr6.isFull();
        boolean boolean9 = stackAr6.equals((java.lang.Object) (byte) -1);
        stackAr4.push((java.lang.Object) boolean9);
        int int11 = stackAr4.size();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.push((java.lang.Object) stackAr4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0065");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        boolean boolean1 = stackAr0.isFull();
        boolean boolean3 = stackAr0.equals((java.lang.Object) (byte) -1);
        org.autotest.StackAr stackAr5 = new org.autotest.StackAr((int) '4');
        boolean boolean6 = stackAr0.equals((java.lang.Object) '4');
        org.autotest.StackAr stackAr8 = new org.autotest.StackAr((int) 'a');
        boolean boolean10 = stackAr8.equals((java.lang.Object) (-1.0f));
        boolean boolean12 = stackAr8.equals((java.lang.Object) "");
        boolean boolean13 = stackAr0.equals((java.lang.Object) "");
        boolean boolean14 = stackAr0.isFull();
        org.autotest.StackAr stackAr16 = new org.autotest.StackAr((int) '4');
        java.lang.String str17 = stackAr16.toString();
        java.lang.String str18 = stackAr16.toString();
        org.autotest.StackAr stackAr19 = new org.autotest.StackAr();
        boolean boolean20 = stackAr19.isFull();
        boolean boolean22 = stackAr19.equals((java.lang.Object) (byte) -1);
        org.autotest.StackAr stackAr24 = new org.autotest.StackAr((int) '4');
        boolean boolean25 = stackAr19.equals((java.lang.Object) '4');
        org.autotest.StackAr stackAr27 = new org.autotest.StackAr((int) 'a');
        boolean boolean29 = stackAr27.equals((java.lang.Object) (-1.0f));
        boolean boolean31 = stackAr27.equals((java.lang.Object) "");
        boolean boolean32 = stackAr19.equals((java.lang.Object) "");
        boolean boolean33 = stackAr19.isFull();
        boolean boolean34 = stackAr16.equals((java.lang.Object) stackAr19);
        java.lang.Object obj35 = null;
        stackAr19.push(obj35);
        java.lang.Object obj37 = stackAr19.top();
        java.lang.String str38 = stackAr19.toString();
        boolean boolean39 = stackAr0.equals((java.lang.Object) stackAr19);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj40 = stackAr0.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[]" + "'", str17, "[]");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[]" + "'", str18, "[]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "[null]" + "'", str38, "[null]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0066");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) 'a');
        boolean boolean3 = stackAr1.equals((java.lang.Object) (-1.0f));
        int int4 = stackAr1.size();
        boolean boolean5 = stackAr1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = stackAr1.top();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0067");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        boolean boolean1 = stackAr0.isFull();
        boolean boolean2 = stackAr0.isFull();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = stackAr0.top();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0068");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        boolean boolean1 = stackAr0.isFull();
        boolean boolean3 = stackAr0.equals((java.lang.Object) (byte) -1);
        java.lang.String str4 = stackAr0.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = stackAr0.top();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0069");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr(0);
        org.autotest.StackAr stackAr3 = new org.autotest.StackAr((int) '4');
        org.autotest.StackAr stackAr5 = new org.autotest.StackAr((int) '4');
        java.lang.String str6 = stackAr5.toString();
        boolean boolean7 = stackAr3.equals((java.lang.Object) stackAr5);
        org.autotest.StackAr stackAr9 = new org.autotest.StackAr((int) '4');
        stackAr9.push((java.lang.Object) (-1L));
        java.lang.Object obj12 = stackAr9.pop();
        stackAr3.push((java.lang.Object) stackAr9);
        boolean boolean14 = stackAr3.isEmpty();
        boolean boolean16 = stackAr3.equals((java.lang.Object) "[[]]");
        org.autotest.StackAr stackAr18 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean19 = stackAr18.isFull();
        java.lang.String str20 = stackAr18.toString();
        int int21 = stackAr18.size();
        stackAr3.push((java.lang.Object) int21);
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.push((java.lang.Object) stackAr3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (-1L) + "'", obj12, (-1L));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "[]" + "'", str20, "[]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0070");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) 'a');
        boolean boolean3 = stackAr1.equals((java.lang.Object) (-1.0f));
        int int4 = stackAr1.size();
        boolean boolean6 = stackAr1.equals((java.lang.Object) (byte) 100);
        boolean boolean7 = stackAr1.isFull();
        int int8 = stackAr1.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = stackAr1.top();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0071");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr(1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = stackAr1.top();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0072");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) (short) 0);
        int int2 = stackAr1.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = stackAr1.top();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0073");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean2 = stackAr1.isFull();
        int int3 = stackAr1.size();
        org.autotest.StackAr stackAr5 = new org.autotest.StackAr((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.push((java.lang.Object) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0074");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        boolean boolean1 = stackAr0.isFull();
        boolean boolean3 = stackAr0.equals((java.lang.Object) (byte) -1);
        org.autotest.StackAr stackAr5 = new org.autotest.StackAr((int) '4');
        boolean boolean6 = stackAr0.equals((java.lang.Object) '4');
        org.autotest.StackAr stackAr8 = new org.autotest.StackAr((int) '4');
        int int9 = stackAr8.size();
        stackAr8.push((java.lang.Object) 0);
        stackAr0.push((java.lang.Object) stackAr8);
        java.lang.Class<?> wildcardClass13 = stackAr8.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0075");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) (byte) 10);
        java.lang.Class<?> wildcardClass2 = stackAr1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0076");
        // The following exception was thrown during execution in test generation
        try {
            org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0077");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) 'a');
        boolean boolean3 = stackAr1.equals((java.lang.Object) (-1.0f));
        boolean boolean5 = stackAr1.equals((java.lang.Object) "");
        org.autotest.StackAr stackAr6 = new org.autotest.StackAr();
        boolean boolean7 = stackAr6.isFull();
        stackAr1.push((java.lang.Object) stackAr6);
        org.autotest.StackAr stackAr10 = new org.autotest.StackAr((int) '4');
        org.autotest.StackAr stackAr12 = new org.autotest.StackAr((int) '4');
        java.lang.String str13 = stackAr12.toString();
        boolean boolean14 = stackAr10.equals((java.lang.Object) stackAr12);
        org.autotest.StackAr stackAr15 = new org.autotest.StackAr();
        boolean boolean16 = stackAr15.isFull();
        boolean boolean18 = stackAr15.equals((java.lang.Object) (byte) -1);
        java.lang.String str19 = stackAr15.toString();
        boolean boolean21 = stackAr15.equals((java.lang.Object) 10L);
        java.lang.String str22 = stackAr15.toString();
        stackAr12.push((java.lang.Object) stackAr15);
        stackAr1.push((java.lang.Object) stackAr15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj25 = stackAr15.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[]" + "'", str13, "[]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[]" + "'", str19, "[]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "[]" + "'", str22, "[]");
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0078");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = stackAr1.top();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0079");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = stackAr1.top();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0080");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean2 = stackAr1.isEmpty();
        int int3 = stackAr1.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = stackAr1.top();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0081");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) 'a');
        boolean boolean3 = stackAr1.equals((java.lang.Object) (-1.0f));
        int int4 = stackAr1.size();
        boolean boolean6 = stackAr1.equals((java.lang.Object) (byte) 100);
        boolean boolean7 = stackAr1.isFull();
        int int8 = stackAr1.size();
        boolean boolean9 = stackAr1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = stackAr1.top();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0082");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        boolean boolean1 = stackAr0.isFull();
        boolean boolean3 = stackAr0.equals((java.lang.Object) 10);
        org.autotest.StackAr stackAr5 = new org.autotest.StackAr((int) '4');
        java.lang.String str6 = stackAr5.toString();
        java.lang.String str7 = stackAr5.toString();
        org.autotest.StackAr stackAr8 = new org.autotest.StackAr();
        boolean boolean9 = stackAr8.isFull();
        boolean boolean11 = stackAr8.equals((java.lang.Object) (byte) -1);
        org.autotest.StackAr stackAr13 = new org.autotest.StackAr((int) '4');
        boolean boolean14 = stackAr8.equals((java.lang.Object) '4');
        org.autotest.StackAr stackAr16 = new org.autotest.StackAr((int) 'a');
        boolean boolean18 = stackAr16.equals((java.lang.Object) (-1.0f));
        boolean boolean20 = stackAr16.equals((java.lang.Object) "");
        boolean boolean21 = stackAr8.equals((java.lang.Object) "");
        boolean boolean22 = stackAr8.isFull();
        boolean boolean23 = stackAr5.equals((java.lang.Object) stackAr8);
        java.lang.Object obj24 = null;
        stackAr8.push(obj24);
        java.lang.Object obj26 = stackAr8.top();
        java.lang.String str27 = stackAr8.toString();
        java.lang.Object obj28 = stackAr8.pop();
        boolean boolean29 = stackAr0.equals(obj28);
        java.lang.String str30 = stackAr0.toString();
        org.autotest.StackAr stackAr31 = new org.autotest.StackAr();
        stackAr31.push((java.lang.Object) 0.0f);
        java.lang.String str34 = stackAr31.toString();
        org.autotest.StackAr stackAr36 = new org.autotest.StackAr((int) 'a');
        boolean boolean38 = stackAr36.equals((java.lang.Object) (-1.0f));
        boolean boolean40 = stackAr36.equals((java.lang.Object) "");
        org.autotest.StackAr stackAr41 = new org.autotest.StackAr();
        boolean boolean42 = stackAr41.isFull();
        stackAr36.push((java.lang.Object) stackAr41);
        boolean boolean44 = stackAr36.isFull();
        java.lang.Object obj45 = stackAr36.pop();
        stackAr31.push((java.lang.Object) stackAr36);
        stackAr0.push((java.lang.Object) stackAr36);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj48 = stackAr36.top();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "[null]" + "'", str27, "[null]");
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "[]" + "'", str30, "[]");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "[0.0]" + "'", str34, "[0.0]");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(obj45);
        org.junit.Assert.assertEquals(obj45.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj45), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj45), "[]");
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0083");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        boolean boolean1 = stackAr0.isFull();
        boolean boolean3 = stackAr0.equals((java.lang.Object) (byte) -1);
        java.lang.String str4 = stackAr0.toString();
        boolean boolean6 = stackAr0.equals((java.lang.Object) 10L);
        java.lang.String str7 = stackAr0.toString();
        org.autotest.StackAr stackAr9 = new org.autotest.StackAr((int) 'a');
        boolean boolean11 = stackAr9.equals((java.lang.Object) (-1.0f));
        boolean boolean13 = stackAr9.equals((java.lang.Object) "");
        org.autotest.StackAr stackAr14 = new org.autotest.StackAr();
        boolean boolean15 = stackAr14.isFull();
        stackAr9.push((java.lang.Object) stackAr14);
        org.autotest.StackAr stackAr18 = new org.autotest.StackAr((int) '4');
        org.autotest.StackAr stackAr20 = new org.autotest.StackAr((int) '4');
        java.lang.String str21 = stackAr20.toString();
        boolean boolean22 = stackAr18.equals((java.lang.Object) stackAr20);
        org.autotest.StackAr stackAr23 = new org.autotest.StackAr();
        boolean boolean24 = stackAr23.isFull();
        boolean boolean26 = stackAr23.equals((java.lang.Object) (byte) -1);
        java.lang.String str27 = stackAr23.toString();
        boolean boolean29 = stackAr23.equals((java.lang.Object) 10L);
        java.lang.String str30 = stackAr23.toString();
        stackAr20.push((java.lang.Object) stackAr23);
        stackAr9.push((java.lang.Object) stackAr23);
        boolean boolean33 = stackAr0.equals((java.lang.Object) stackAr23);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj34 = stackAr0.top();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "[]" + "'", str21, "[]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "[]" + "'", str27, "[]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "[]" + "'", str30, "[]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0084");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean2 = stackAr1.isEmpty();
        int int3 = stackAr1.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0085");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        boolean boolean1 = stackAr0.isFull();
        boolean boolean3 = stackAr0.equals((java.lang.Object) (byte) -1);
        org.autotest.StackAr stackAr5 = new org.autotest.StackAr((int) '4');
        boolean boolean6 = stackAr0.equals((java.lang.Object) '4');
        org.autotest.StackAr stackAr8 = new org.autotest.StackAr((int) 'a');
        boolean boolean10 = stackAr8.equals((java.lang.Object) (-1.0f));
        boolean boolean12 = stackAr8.equals((java.lang.Object) "");
        boolean boolean13 = stackAr0.equals((java.lang.Object) "");
        boolean boolean14 = stackAr0.isFull();
        java.lang.String str15 = stackAr0.toString();
        java.lang.Class<?> wildcardClass16 = stackAr0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[]" + "'", str15, "[]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0086");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '4');
        org.autotest.StackAr stackAr3 = new org.autotest.StackAr((int) '4');
        java.lang.String str4 = stackAr3.toString();
        boolean boolean5 = stackAr1.equals((java.lang.Object) stackAr3);
        int int6 = stackAr1.size();
        boolean boolean7 = stackAr1.isFull();
        org.autotest.StackAr stackAr9 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean10 = stackAr9.isEmpty();
        boolean boolean11 = stackAr9.isEmpty();
        stackAr1.push((java.lang.Object) stackAr9);
        java.lang.String str13 = stackAr9.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[]" + "'", str13, "[]");
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0087");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr(10);
        java.lang.Class<?> wildcardClass2 = stackAr1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0088");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '4');
        java.lang.String str2 = stackAr1.toString();
        org.autotest.StackAr stackAr3 = new org.autotest.StackAr();
        boolean boolean4 = stackAr3.isFull();
        boolean boolean6 = stackAr3.equals((java.lang.Object) false);
        boolean boolean7 = stackAr3.isEmpty();
        boolean boolean8 = stackAr1.equals((java.lang.Object) stackAr3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = stackAr1.top();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0089");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '4');
        java.lang.String str2 = stackAr1.toString();
        java.lang.String str3 = stackAr1.toString();
        org.autotest.StackAr stackAr4 = new org.autotest.StackAr();
        boolean boolean5 = stackAr4.isFull();
        boolean boolean7 = stackAr4.equals((java.lang.Object) (byte) -1);
        org.autotest.StackAr stackAr9 = new org.autotest.StackAr((int) '4');
        boolean boolean10 = stackAr4.equals((java.lang.Object) '4');
        org.autotest.StackAr stackAr12 = new org.autotest.StackAr((int) 'a');
        boolean boolean14 = stackAr12.equals((java.lang.Object) (-1.0f));
        boolean boolean16 = stackAr12.equals((java.lang.Object) "");
        boolean boolean17 = stackAr4.equals((java.lang.Object) "");
        boolean boolean18 = stackAr4.isFull();
        boolean boolean19 = stackAr1.equals((java.lang.Object) stackAr4);
        boolean boolean20 = stackAr1.isFull();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj21 = stackAr1.top();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0090");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        boolean boolean1 = stackAr0.isFull();
        boolean boolean3 = stackAr0.equals((java.lang.Object) (byte) -1);
        java.lang.String str4 = stackAr0.toString();
        boolean boolean6 = stackAr0.equals((java.lang.Object) 10L);
        java.lang.String str7 = stackAr0.toString();
        boolean boolean9 = stackAr0.equals((java.lang.Object) (byte) -1);
        int int10 = stackAr0.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = stackAr0.top();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0091");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean2 = stackAr1.isFull();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = stackAr1.top();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0092");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        boolean boolean1 = stackAr0.isFull();
        boolean boolean3 = stackAr0.equals((java.lang.Object) (byte) -1);
        boolean boolean4 = stackAr0.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0093");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean2 = stackAr1.isEmpty();
        org.autotest.StackAr stackAr4 = new org.autotest.StackAr((int) '4');
        stackAr4.push((java.lang.Object) (-1L));
        java.lang.Object obj7 = stackAr4.pop();
        stackAr4.push((java.lang.Object) (-1));
        boolean boolean10 = stackAr4.isEmpty();
        org.autotest.StackAr stackAr12 = new org.autotest.StackAr((int) 'a');
        boolean boolean14 = stackAr12.equals((java.lang.Object) (-1.0f));
        boolean boolean16 = stackAr12.equals((java.lang.Object) "");
        org.autotest.StackAr stackAr17 = new org.autotest.StackAr();
        boolean boolean18 = stackAr17.isFull();
        stackAr12.push((java.lang.Object) stackAr17);
        boolean boolean20 = stackAr12.isFull();
        java.lang.Object obj21 = stackAr12.pop();
        boolean boolean22 = stackAr4.equals(obj21);
        java.lang.Class<?> wildcardClass23 = obj21.getClass();
        boolean boolean24 = stackAr1.equals(obj21);
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.push((java.lang.Object) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1L) + "'", obj7, (-1L));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertEquals(obj21.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj21), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj21), "[]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0094");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '4');
        org.autotest.StackAr stackAr3 = new org.autotest.StackAr((int) '4');
        java.lang.String str4 = stackAr3.toString();
        boolean boolean5 = stackAr1.equals((java.lang.Object) stackAr3);
        boolean boolean7 = stackAr3.equals((java.lang.Object) "[]");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = stackAr3.top();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0095");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        stackAr0.push((java.lang.Object) 0.0f);
        stackAr0.push((java.lang.Object) true);
        java.lang.Class<?> wildcardClass5 = stackAr0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0096");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) (byte) 1);
        java.lang.Class<?> wildcardClass2 = stackAr1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0097");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '4');
        org.autotest.StackAr stackAr3 = new org.autotest.StackAr((int) '4');
        java.lang.String str4 = stackAr3.toString();
        boolean boolean5 = stackAr1.equals((java.lang.Object) stackAr3);
        boolean boolean6 = stackAr3.isFull();
        boolean boolean8 = stackAr3.equals((java.lang.Object) "hi!");
        org.autotest.StackAr stackAr10 = new org.autotest.StackAr((int) 'a');
        boolean boolean11 = stackAr10.isFull();
        org.autotest.StackAr stackAr12 = new org.autotest.StackAr();
        boolean boolean13 = stackAr12.isFull();
        boolean boolean15 = stackAr12.equals((java.lang.Object) (byte) -1);
        stackAr10.push((java.lang.Object) boolean15);
        org.autotest.StackAr stackAr18 = new org.autotest.StackAr((int) 'a');
        boolean boolean19 = stackAr18.isFull();
        boolean boolean20 = stackAr10.equals((java.lang.Object) boolean19);
        java.lang.String str21 = stackAr10.toString();
        java.lang.Object obj22 = stackAr10.top();
        boolean boolean23 = stackAr3.equals((java.lang.Object) stackAr10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj24 = stackAr3.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "[false]" + "'", str21, "[false]");
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + false + "'", obj22, false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0098");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) 'a');
        boolean boolean3 = stackAr1.equals((java.lang.Object) (-1.0f));
        boolean boolean5 = stackAr1.equals((java.lang.Object) "");
        org.autotest.StackAr stackAr6 = new org.autotest.StackAr();
        boolean boolean7 = stackAr6.isFull();
        stackAr1.push((java.lang.Object) stackAr6);
        org.autotest.StackAr stackAr10 = new org.autotest.StackAr((int) '4');
        org.autotest.StackAr stackAr12 = new org.autotest.StackAr((int) '4');
        java.lang.String str13 = stackAr12.toString();
        boolean boolean14 = stackAr10.equals((java.lang.Object) stackAr12);
        org.autotest.StackAr stackAr15 = new org.autotest.StackAr();
        boolean boolean16 = stackAr15.isFull();
        boolean boolean18 = stackAr15.equals((java.lang.Object) (byte) -1);
        java.lang.String str19 = stackAr15.toString();
        boolean boolean21 = stackAr15.equals((java.lang.Object) 10L);
        java.lang.String str22 = stackAr15.toString();
        stackAr12.push((java.lang.Object) stackAr15);
        stackAr1.push((java.lang.Object) stackAr15);
        org.autotest.StackAr stackAr26 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean27 = stackAr26.isEmpty();
        boolean boolean28 = stackAr26.isFull();
        org.autotest.StackAr stackAr30 = new org.autotest.StackAr((int) '4');
        org.autotest.StackAr stackAr32 = new org.autotest.StackAr((int) '4');
        java.lang.String str33 = stackAr32.toString();
        boolean boolean34 = stackAr30.equals((java.lang.Object) stackAr32);
        org.autotest.StackAr stackAr36 = new org.autotest.StackAr((int) '4');
        stackAr36.push((java.lang.Object) (-1L));
        java.lang.Object obj39 = stackAr36.pop();
        stackAr30.push((java.lang.Object) stackAr36);
        boolean boolean41 = stackAr26.equals((java.lang.Object) stackAr30);
        stackAr15.push((java.lang.Object) stackAr30);
        org.autotest.StackAr stackAr43 = new org.autotest.StackAr();
        boolean boolean44 = stackAr43.isFull();
        boolean boolean46 = stackAr43.equals((java.lang.Object) (byte) -1);
        java.lang.String str47 = stackAr43.toString();
        boolean boolean49 = stackAr43.equals((java.lang.Object) 10L);
        java.lang.String str50 = stackAr43.toString();
        org.autotest.StackAr stackAr52 = new org.autotest.StackAr((int) 'a');
        boolean boolean54 = stackAr52.equals((java.lang.Object) (-1.0f));
        boolean boolean56 = stackAr52.equals((java.lang.Object) "");
        org.autotest.StackAr stackAr57 = new org.autotest.StackAr();
        boolean boolean58 = stackAr57.isFull();
        stackAr52.push((java.lang.Object) stackAr57);
        org.autotest.StackAr stackAr61 = new org.autotest.StackAr((int) '4');
        org.autotest.StackAr stackAr63 = new org.autotest.StackAr((int) '4');
        java.lang.String str64 = stackAr63.toString();
        boolean boolean65 = stackAr61.equals((java.lang.Object) stackAr63);
        org.autotest.StackAr stackAr66 = new org.autotest.StackAr();
        boolean boolean67 = stackAr66.isFull();
        boolean boolean69 = stackAr66.equals((java.lang.Object) (byte) -1);
        java.lang.String str70 = stackAr66.toString();
        boolean boolean72 = stackAr66.equals((java.lang.Object) 10L);
        java.lang.String str73 = stackAr66.toString();
        stackAr63.push((java.lang.Object) stackAr66);
        stackAr52.push((java.lang.Object) stackAr66);
        boolean boolean76 = stackAr43.equals((java.lang.Object) stackAr66);
        stackAr30.push((java.lang.Object) boolean76);
        java.lang.String str78 = stackAr30.toString();
        java.lang.Object obj79 = stackAr30.top();
        java.lang.Class<?> wildcardClass80 = obj79.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[]" + "'", str13, "[]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[]" + "'", str19, "[]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "[]" + "'", str22, "[]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "[]" + "'", str33, "[]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + (-1L) + "'", obj39, (-1L));
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "[]" + "'", str47, "[]");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "[]" + "'", str50, "[]");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "[]" + "'", str64, "[]");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "[]" + "'", str70, "[]");
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "[]" + "'", str73, "[]");
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "[[],true]" + "'", str78, "[[],true]");
        org.junit.Assert.assertEquals("'" + obj79 + "' != '" + true + "'", obj79, true);
        org.junit.Assert.assertNotNull(wildcardClass80);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0099");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        boolean boolean1 = stackAr0.isFull();
        boolean boolean3 = stackAr0.equals((java.lang.Object) (byte) -1);
        org.autotest.StackAr stackAr5 = new org.autotest.StackAr((int) '4');
        boolean boolean6 = stackAr0.equals((java.lang.Object) '4');
        int int7 = stackAr0.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = stackAr0.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0100");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean2 = stackAr1.isFull();
        java.lang.String str3 = stackAr1.toString();
        int int4 = stackAr1.size();
        java.lang.String str5 = stackAr1.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
    }
}

