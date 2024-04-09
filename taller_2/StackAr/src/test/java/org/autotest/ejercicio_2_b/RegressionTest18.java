package org.autotest;

import org.junit.FixMethodOrder;
import org.junit.jupiter.api.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest18 {

    public static boolean debug = false;

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test0901");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '4');
        int int2 = stackAr1.size();
        java.lang.String str3 = stackAr1.toString();
        boolean boolean4 = stackAr1.isFull();
        org.autotest.StackAr stackAr6 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean7 = stackAr6.isFull();
        java.lang.String str8 = stackAr6.toString();
        int int9 = stackAr6.size();
        boolean boolean10 = stackAr1.equals((java.lang.Object) int9);
        org.autotest.StackAr stackAr12 = new org.autotest.StackAr((int) 'a');
        boolean boolean14 = stackAr12.equals((java.lang.Object) (-1.0f));
        boolean boolean16 = stackAr12.equals((java.lang.Object) "");
        org.autotest.StackAr stackAr17 = new org.autotest.StackAr();
        boolean boolean18 = stackAr17.isFull();
        stackAr12.push((java.lang.Object) stackAr17);
        org.autotest.StackAr stackAr21 = new org.autotest.StackAr((int) '4');
        org.autotest.StackAr stackAr23 = new org.autotest.StackAr((int) '4');
        java.lang.String str24 = stackAr23.toString();
        boolean boolean25 = stackAr21.equals((java.lang.Object) stackAr23);
        org.autotest.StackAr stackAr26 = new org.autotest.StackAr();
        boolean boolean27 = stackAr26.isFull();
        boolean boolean29 = stackAr26.equals((java.lang.Object) (byte) -1);
        java.lang.String str30 = stackAr26.toString();
        boolean boolean32 = stackAr26.equals((java.lang.Object) 10L);
        java.lang.String str33 = stackAr26.toString();
        stackAr23.push((java.lang.Object) stackAr26);
        stackAr12.push((java.lang.Object) stackAr26);
        org.autotest.StackAr stackAr37 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean38 = stackAr37.isEmpty();
        boolean boolean39 = stackAr37.isFull();
        org.autotest.StackAr stackAr41 = new org.autotest.StackAr((int) '4');
        org.autotest.StackAr stackAr43 = new org.autotest.StackAr((int) '4');
        java.lang.String str44 = stackAr43.toString();
        boolean boolean45 = stackAr41.equals((java.lang.Object) stackAr43);
        org.autotest.StackAr stackAr47 = new org.autotest.StackAr((int) '4');
        stackAr47.push((java.lang.Object) (-1L));
        java.lang.Object obj50 = stackAr47.pop();
        stackAr41.push((java.lang.Object) stackAr47);
        boolean boolean52 = stackAr37.equals((java.lang.Object) stackAr41);
        stackAr26.push((java.lang.Object) stackAr41);
        org.autotest.StackAr stackAr55 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean56 = stackAr55.isFull();
        int int57 = stackAr55.size();
        int int58 = stackAr55.size();
        stackAr41.push((java.lang.Object) stackAr55);
        java.lang.Object obj60 = stackAr41.top();
        java.lang.Object obj61 = stackAr41.top();
        stackAr1.push((java.lang.Object) stackAr41);
        int int63 = stackAr1.size();
        boolean boolean64 = stackAr1.isEmpty();
        boolean boolean65 = stackAr1.isEmpty();
        boolean boolean66 = stackAr1.isFull();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "[]" + "'", str24, "[]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "[]" + "'", str30, "[]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "[]" + "'", str33, "[]");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "[]" + "'", str44, "[]");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertEquals("'" + obj50 + "' != '" + (-1L) + "'", obj50, (-1L));
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNotNull(obj60);
        org.junit.Assert.assertEquals(obj60.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj60), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj60), "[]");
        org.junit.Assert.assertNotNull(obj61);
        org.junit.Assert.assertEquals(obj61.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj61), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj61), "[]");
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 1 + "'", int63 == 1);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test0902");
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
        java.lang.Object obj40 = stackAr19.pop();
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
        org.junit.Assert.assertNull(obj40);
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test0903");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        boolean boolean1 = stackAr0.isFull();
        boolean boolean3 = stackAr0.equals((java.lang.Object) (byte) -1);
        java.lang.String str4 = stackAr0.toString();
        boolean boolean5 = stackAr0.isEmpty();
        org.autotest.StackAr stackAr7 = new org.autotest.StackAr((int) 'a');
        boolean boolean9 = stackAr7.equals((java.lang.Object) (-1.0f));
        boolean boolean10 = stackAr7.isEmpty();
        boolean boolean11 = stackAr0.equals((java.lang.Object) stackAr7);
        boolean boolean12 = stackAr7.isFull();
        java.lang.String str13 = stackAr7.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = stackAr7.top();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[]" + "'", str13, "[]");
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test0904");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        boolean boolean1 = stackAr0.isFull();
        boolean boolean2 = stackAr0.isFull();
        boolean boolean3 = stackAr0.isEmpty();
        stackAr0.push((java.lang.Object) "[[],[],[0.0]]");
        int int6 = stackAr0.size();
        java.lang.Class<?> wildcardClass7 = stackAr0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test0905");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '4');
        int int2 = stackAr1.size();
        java.lang.String str3 = stackAr1.toString();
        boolean boolean4 = stackAr1.isFull();
        int int5 = stackAr1.size();
        java.lang.String str6 = stackAr1.toString();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test0906");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '4');
        int int2 = stackAr1.size();
        java.lang.String str3 = stackAr1.toString();
        boolean boolean4 = stackAr1.isFull();
        boolean boolean5 = stackAr1.isFull();
        org.autotest.StackAr stackAr7 = new org.autotest.StackAr((int) (short) 0);
        int int8 = stackAr7.size();
        stackAr1.push((java.lang.Object) stackAr7);
        org.autotest.StackAr stackAr10 = new org.autotest.StackAr();
        boolean boolean11 = stackAr10.isFull();
        boolean boolean13 = stackAr10.equals((java.lang.Object) (byte) -1);
        java.lang.String str14 = stackAr10.toString();
        boolean boolean16 = stackAr10.equals((java.lang.Object) 10L);
        java.lang.String str17 = stackAr10.toString();
        boolean boolean19 = stackAr10.equals((java.lang.Object) (byte) 0);
        org.autotest.StackAr stackAr21 = new org.autotest.StackAr((int) 'a');
        boolean boolean23 = stackAr21.equals((java.lang.Object) (-1.0f));
        boolean boolean25 = stackAr21.equals((java.lang.Object) "");
        org.autotest.StackAr stackAr26 = new org.autotest.StackAr();
        boolean boolean27 = stackAr26.isFull();
        stackAr21.push((java.lang.Object) stackAr26);
        org.autotest.StackAr stackAr30 = new org.autotest.StackAr((int) '4');
        org.autotest.StackAr stackAr32 = new org.autotest.StackAr((int) '4');
        java.lang.String str33 = stackAr32.toString();
        boolean boolean34 = stackAr30.equals((java.lang.Object) stackAr32);
        org.autotest.StackAr stackAr35 = new org.autotest.StackAr();
        boolean boolean36 = stackAr35.isFull();
        boolean boolean38 = stackAr35.equals((java.lang.Object) (byte) -1);
        java.lang.String str39 = stackAr35.toString();
        boolean boolean41 = stackAr35.equals((java.lang.Object) 10L);
        java.lang.String str42 = stackAr35.toString();
        stackAr32.push((java.lang.Object) stackAr35);
        stackAr21.push((java.lang.Object) stackAr35);
        boolean boolean45 = stackAr21.isEmpty();
        boolean boolean46 = stackAr10.equals((java.lang.Object) stackAr21);
        boolean boolean47 = stackAr1.equals((java.lang.Object) stackAr10);
        boolean boolean48 = stackAr1.isFull();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[]" + "'", str14, "[]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[]" + "'", str17, "[]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "[]" + "'", str33, "[]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "[]" + "'", str39, "[]");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "[]" + "'", str42, "[]");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test0907");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) 'a');
        boolean boolean3 = stackAr1.equals((java.lang.Object) (-1.0f));
        boolean boolean5 = stackAr1.equals((java.lang.Object) "");
        org.autotest.StackAr stackAr6 = new org.autotest.StackAr();
        boolean boolean7 = stackAr6.isFull();
        stackAr1.push((java.lang.Object) stackAr6);
        org.autotest.StackAr stackAr10 = new org.autotest.StackAr((int) 'a');
        boolean boolean11 = stackAr10.isFull();
        boolean boolean12 = stackAr10.isEmpty();
        int int13 = stackAr10.size();
        boolean boolean14 = stackAr6.equals((java.lang.Object) int13);
        org.autotest.StackAr stackAr16 = new org.autotest.StackAr((int) 'a');
        boolean boolean18 = stackAr16.equals((java.lang.Object) (-1.0f));
        boolean boolean20 = stackAr16.equals((java.lang.Object) "");
        org.autotest.StackAr stackAr21 = new org.autotest.StackAr();
        boolean boolean22 = stackAr21.isFull();
        stackAr16.push((java.lang.Object) stackAr21);
        java.lang.Class<?> wildcardClass24 = stackAr16.getClass();
        boolean boolean25 = stackAr6.equals((java.lang.Object) stackAr16);
        java.lang.String str26 = stackAr6.toString();
        java.lang.String str27 = stackAr6.toString();
        org.autotest.StackAr stackAr29 = new org.autotest.StackAr((int) 'a');
        boolean boolean30 = stackAr29.isFull();
        org.autotest.StackAr stackAr31 = new org.autotest.StackAr();
        boolean boolean32 = stackAr31.isFull();
        boolean boolean34 = stackAr31.equals((java.lang.Object) (byte) -1);
        stackAr29.push((java.lang.Object) boolean34);
        boolean boolean36 = stackAr29.isEmpty();
        java.lang.Object obj37 = stackAr29.top();
        boolean boolean39 = stackAr29.equals((java.lang.Object) (-1L));
        boolean boolean40 = stackAr29.isEmpty();
        boolean boolean41 = stackAr6.equals((java.lang.Object) stackAr29);
        java.lang.Object obj42 = stackAr29.top();
        boolean boolean43 = stackAr29.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "[]" + "'", str26, "[]");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "[]" + "'", str27, "[]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + false + "'", obj37, false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + false + "'", obj42, false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test0908");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr(0);
        java.lang.String str2 = stackAr1.toString();
        boolean boolean3 = stackAr1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = stackAr1.top();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test0909");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        org.autotest.StackAr stackAr3 = new org.autotest.StackAr((int) 'a');
        boolean boolean5 = stackAr3.equals((java.lang.Object) (-1.0f));
        boolean boolean7 = stackAr3.equals((java.lang.Object) "");
        org.autotest.StackAr stackAr8 = new org.autotest.StackAr();
        boolean boolean9 = stackAr8.isFull();
        stackAr3.push((java.lang.Object) stackAr8);
        java.lang.Class<?> wildcardClass11 = stackAr3.getClass();
        boolean boolean12 = stackAr1.equals((java.lang.Object) wildcardClass11);
        boolean boolean13 = stackAr1.isFull();
        int int14 = stackAr1.size();
        java.lang.Class<?> wildcardClass15 = stackAr1.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test0910");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        stackAr0.push((java.lang.Object) 0.0f);
        int int3 = stackAr0.size();
        java.lang.Object obj4 = stackAr0.top();
        org.autotest.StackAr stackAr6 = new org.autotest.StackAr((int) '4');
        org.autotest.StackAr stackAr8 = new org.autotest.StackAr((int) '4');
        java.lang.String str9 = stackAr8.toString();
        boolean boolean10 = stackAr6.equals((java.lang.Object) stackAr8);
        boolean boolean11 = stackAr6.isEmpty();
        stackAr0.push((java.lang.Object) stackAr6);
        java.lang.String str13 = stackAr0.toString();
        java.lang.Object obj14 = stackAr0.pop();
        int int15 = stackAr0.size();
        java.lang.Object obj16 = stackAr0.pop();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0.0f + "'", obj4, 0.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[0.0,[]]" + "'", str13, "[0.0,[]]");
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "[]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 0.0f + "'", obj16, 0.0f);
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test0911");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '4');
        org.autotest.StackAr stackAr3 = new org.autotest.StackAr((int) '4');
        java.lang.String str4 = stackAr3.toString();
        boolean boolean5 = stackAr1.equals((java.lang.Object) stackAr3);
        org.autotest.StackAr stackAr6 = new org.autotest.StackAr();
        boolean boolean7 = stackAr6.isFull();
        boolean boolean9 = stackAr6.equals((java.lang.Object) (byte) -1);
        java.lang.String str10 = stackAr6.toString();
        boolean boolean12 = stackAr6.equals((java.lang.Object) 10L);
        java.lang.String str13 = stackAr6.toString();
        stackAr3.push((java.lang.Object) stackAr6);
        boolean boolean15 = stackAr3.isFull();
        java.lang.Object obj16 = stackAr3.top();
        java.lang.Object obj17 = null;
        stackAr3.push(obj17);
        java.lang.Object obj19 = stackAr3.top();
        java.lang.String str20 = stackAr3.toString();
        org.autotest.StackAr stackAr22 = new org.autotest.StackAr((int) 'a');
        boolean boolean23 = stackAr22.isFull();
        org.autotest.StackAr stackAr24 = new org.autotest.StackAr();
        boolean boolean25 = stackAr24.isFull();
        boolean boolean27 = stackAr24.equals((java.lang.Object) (byte) -1);
        stackAr22.push((java.lang.Object) boolean27);
        org.autotest.StackAr stackAr30 = new org.autotest.StackAr((int) 'a');
        boolean boolean31 = stackAr30.isFull();
        boolean boolean32 = stackAr22.equals((java.lang.Object) boolean31);
        java.lang.Object obj33 = stackAr22.pop();
        boolean boolean34 = stackAr3.equals(obj33);
        org.autotest.StackAr stackAr36 = new org.autotest.StackAr((int) 'a');
        boolean boolean37 = stackAr36.isFull();
        org.autotest.StackAr stackAr38 = new org.autotest.StackAr();
        boolean boolean39 = stackAr38.isFull();
        boolean boolean41 = stackAr38.equals((java.lang.Object) (byte) -1);
        stackAr36.push((java.lang.Object) boolean41);
        boolean boolean43 = stackAr36.isEmpty();
        java.lang.Object obj44 = stackAr36.top();
        java.lang.Object obj45 = stackAr36.top();
        boolean boolean46 = stackAr3.equals((java.lang.Object) stackAr36);
        boolean boolean47 = stackAr36.isEmpty();
        java.lang.Class<?> wildcardClass48 = stackAr36.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[]" + "'", str13, "[]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertEquals(obj16.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj16), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj16), "[]");
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "[[],null]" + "'", str20, "[[],null]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + false + "'", obj33, false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + obj44 + "' != '" + false + "'", obj44, false);
        org.junit.Assert.assertEquals("'" + obj45 + "' != '" + false + "'", obj45, false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test0912");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '4');
        org.autotest.StackAr stackAr3 = new org.autotest.StackAr((int) '4');
        java.lang.String str4 = stackAr3.toString();
        boolean boolean5 = stackAr1.equals((java.lang.Object) stackAr3);
        org.autotest.StackAr stackAr6 = new org.autotest.StackAr();
        boolean boolean7 = stackAr6.isFull();
        boolean boolean9 = stackAr6.equals((java.lang.Object) (byte) -1);
        java.lang.String str10 = stackAr6.toString();
        boolean boolean12 = stackAr6.equals((java.lang.Object) 10L);
        java.lang.String str13 = stackAr6.toString();
        stackAr3.push((java.lang.Object) stackAr6);
        boolean boolean15 = stackAr3.isFull();
        org.autotest.StackAr stackAr17 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean18 = stackAr17.isFull();
        int int19 = stackAr17.size();
        stackAr3.push((java.lang.Object) stackAr17);
        boolean boolean21 = stackAr3.isFull();
        java.lang.String str22 = stackAr3.toString();
        int int23 = stackAr3.size();
        int int24 = stackAr3.size();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[]" + "'", str13, "[]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "[[],[]]" + "'", str22, "[[],[]]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test0913");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        stackAr0.push((java.lang.Object) 0.0f);
        java.lang.String str3 = stackAr0.toString();
        int int4 = stackAr0.size();
        java.lang.String str5 = stackAr0.toString();
        java.lang.Object obj6 = stackAr0.top();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[0.0]" + "'", str3, "[0.0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[0.0]" + "'", str5, "[0.0]");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0.0f + "'", obj6, 0.0f);
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test0914");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        boolean boolean1 = stackAr0.isFull();
        boolean boolean3 = stackAr0.equals((java.lang.Object) (byte) -1);
        org.autotest.StackAr stackAr5 = new org.autotest.StackAr((int) '4');
        boolean boolean6 = stackAr0.equals((java.lang.Object) '4');
        org.autotest.StackAr stackAr8 = new org.autotest.StackAr((int) '4');
        int int9 = stackAr8.size();
        stackAr8.push((java.lang.Object) 0);
        stackAr0.push((java.lang.Object) stackAr8);
        boolean boolean13 = stackAr0.isFull();
        org.autotest.StackAr stackAr15 = new org.autotest.StackAr((int) '4');
        java.lang.String str16 = stackAr15.toString();
        java.lang.String str17 = stackAr15.toString();
        org.autotest.StackAr stackAr18 = new org.autotest.StackAr();
        boolean boolean19 = stackAr18.isFull();
        boolean boolean21 = stackAr18.equals((java.lang.Object) (byte) -1);
        org.autotest.StackAr stackAr23 = new org.autotest.StackAr((int) '4');
        boolean boolean24 = stackAr18.equals((java.lang.Object) '4');
        org.autotest.StackAr stackAr26 = new org.autotest.StackAr((int) 'a');
        boolean boolean28 = stackAr26.equals((java.lang.Object) (-1.0f));
        boolean boolean30 = stackAr26.equals((java.lang.Object) "");
        boolean boolean31 = stackAr18.equals((java.lang.Object) "");
        boolean boolean32 = stackAr18.isFull();
        boolean boolean33 = stackAr15.equals((java.lang.Object) stackAr18);
        int int34 = stackAr18.size();
        org.autotest.StackAr stackAr36 = new org.autotest.StackAr((int) '4');
        boolean boolean37 = stackAr18.equals((java.lang.Object) stackAr36);
        java.lang.String str38 = stackAr18.toString();
        boolean boolean39 = stackAr18.isFull();
        boolean boolean40 = stackAr0.equals((java.lang.Object) boolean39);
        java.lang.String str41 = stackAr0.toString();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[]" + "'", str16, "[]");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[]" + "'", str17, "[]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "[]" + "'", str38, "[]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "[[0]]" + "'", str41, "[[0]]");
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test0915");
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
        java.lang.Object obj20 = null;
        stackAr4.push(obj20);
        java.lang.Object obj22 = stackAr4.top();
        java.lang.String str23 = stackAr4.toString();
        int int24 = stackAr4.size();
        java.lang.String str25 = stackAr4.toString();
        java.lang.Object obj26 = stackAr4.pop();
        boolean boolean27 = stackAr4.isFull();
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
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "[null]" + "'", str23, "[null]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "[null]" + "'", str25, "[null]");
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test0916");
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
        java.lang.Object obj20 = null;
        stackAr4.push(obj20);
        java.lang.Object obj22 = stackAr4.top();
        boolean boolean23 = stackAr4.isEmpty();
        stackAr4.push((java.lang.Object) 1.0f);
        int int26 = stackAr4.size();
        java.lang.String str27 = stackAr4.toString();
        java.lang.Object obj28 = stackAr4.top();
        org.autotest.StackAr stackAr29 = new org.autotest.StackAr();
        boolean boolean30 = stackAr29.isFull();
        boolean boolean32 = stackAr29.equals((java.lang.Object) (byte) -1);
        org.autotest.StackAr stackAr34 = new org.autotest.StackAr((int) '4');
        boolean boolean35 = stackAr29.equals((java.lang.Object) '4');
        boolean boolean36 = stackAr29.isEmpty();
        java.lang.String str37 = stackAr29.toString();
        stackAr4.push((java.lang.Object) str37);
        java.lang.Object obj39 = stackAr4.pop();
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
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2 + "'", int26 == 2);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "[null,1.0]" + "'", str27, "[null,1.0]");
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + 1.0f + "'", obj28, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "[]" + "'", str37, "[]");
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + "[]" + "'", obj39, "[]");
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test0917");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '4');
        org.autotest.StackAr stackAr3 = new org.autotest.StackAr((int) '4');
        java.lang.String str4 = stackAr3.toString();
        boolean boolean5 = stackAr1.equals((java.lang.Object) stackAr3);
        boolean boolean7 = stackAr3.equals((java.lang.Object) "[]");
        java.lang.String str8 = stackAr3.toString();
        int int9 = stackAr3.size();
        org.autotest.StackAr stackAr11 = new org.autotest.StackAr(3);
        stackAr3.push((java.lang.Object) stackAr11);
        int int13 = stackAr11.size();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test0918");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        java.lang.Object obj1 = null;
        boolean boolean2 = stackAr0.equals(obj1);
        org.autotest.StackAr stackAr3 = new org.autotest.StackAr();
        stackAr3.push((java.lang.Object) 0.0f);
        org.autotest.StackAr stackAr7 = new org.autotest.StackAr((int) (byte) 100);
        boolean boolean8 = stackAr7.isFull();
        boolean boolean9 = stackAr7.isEmpty();
        boolean boolean10 = stackAr3.equals((java.lang.Object) stackAr7);
        org.autotest.StackAr stackAr11 = new org.autotest.StackAr();
        boolean boolean12 = stackAr11.isFull();
        boolean boolean14 = stackAr11.equals((java.lang.Object) 10);
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
        java.lang.Object obj39 = stackAr19.pop();
        boolean boolean40 = stackAr11.equals(obj39);
        java.lang.String str41 = stackAr11.toString();
        org.autotest.StackAr stackAr42 = new org.autotest.StackAr();
        stackAr42.push((java.lang.Object) 0.0f);
        java.lang.String str45 = stackAr42.toString();
        org.autotest.StackAr stackAr47 = new org.autotest.StackAr((int) 'a');
        boolean boolean49 = stackAr47.equals((java.lang.Object) (-1.0f));
        boolean boolean51 = stackAr47.equals((java.lang.Object) "");
        org.autotest.StackAr stackAr52 = new org.autotest.StackAr();
        boolean boolean53 = stackAr52.isFull();
        stackAr47.push((java.lang.Object) stackAr52);
        boolean boolean55 = stackAr47.isFull();
        java.lang.Object obj56 = stackAr47.pop();
        stackAr42.push((java.lang.Object) stackAr47);
        stackAr11.push((java.lang.Object) stackAr47);
        boolean boolean59 = stackAr7.equals((java.lang.Object) stackAr11);
        java.lang.String str60 = stackAr7.toString();
        boolean boolean61 = stackAr0.equals((java.lang.Object) stackAr7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj62 = stackAr7.top();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
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
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "[]" + "'", str41, "[]");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "[0.0]" + "'", str45, "[0.0]");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(obj56);
        org.junit.Assert.assertEquals(obj56.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj56), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj56), "[]");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "[]" + "'", str60, "[]");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test0919");
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
        java.lang.Object obj20 = null;
        stackAr4.push(obj20);
        org.autotest.StackAr stackAr23 = new org.autotest.StackAr(0);
        boolean boolean24 = stackAr4.equals((java.lang.Object) 0);
        boolean boolean25 = stackAr4.isEmpty();
        boolean boolean26 = stackAr4.isEmpty();
        boolean boolean27 = stackAr4.isEmpty();
        java.lang.Class<?> wildcardClass28 = stackAr4.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test0920");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '4');
        int int2 = stackAr1.size();
        java.lang.String str3 = stackAr1.toString();
        boolean boolean4 = stackAr1.isEmpty();
        boolean boolean5 = stackAr1.isEmpty();
        java.lang.String str6 = stackAr1.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = stackAr1.top();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test0921");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        boolean boolean1 = stackAr0.isFull();
        boolean boolean3 = stackAr0.equals((java.lang.Object) (byte) -1);
        java.lang.String str4 = stackAr0.toString();
        boolean boolean6 = stackAr0.equals((java.lang.Object) 10L);
        boolean boolean7 = stackAr0.isFull();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = stackAr0.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test0922");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean2 = stackAr1.isEmpty();
        boolean boolean3 = stackAr1.isFull();
        org.autotest.StackAr stackAr5 = new org.autotest.StackAr((int) '4');
        org.autotest.StackAr stackAr7 = new org.autotest.StackAr((int) '4');
        java.lang.String str8 = stackAr7.toString();
        boolean boolean9 = stackAr5.equals((java.lang.Object) stackAr7);
        org.autotest.StackAr stackAr11 = new org.autotest.StackAr((int) '4');
        stackAr11.push((java.lang.Object) (-1L));
        java.lang.Object obj14 = stackAr11.pop();
        stackAr5.push((java.lang.Object) stackAr11);
        boolean boolean16 = stackAr1.equals((java.lang.Object) stackAr5);
        boolean boolean17 = stackAr1.isEmpty();
        org.autotest.StackAr stackAr19 = new org.autotest.StackAr((int) 'a');
        boolean boolean20 = stackAr19.isEmpty();
        org.autotest.StackAr stackAr22 = new org.autotest.StackAr((int) '4');
        int int23 = stackAr22.size();
        java.lang.String str24 = stackAr22.toString();
        boolean boolean25 = stackAr22.isFull();
        org.autotest.StackAr stackAr26 = new org.autotest.StackAr();
        stackAr26.push((java.lang.Object) 0.0f);
        int int29 = stackAr26.size();
        java.lang.Object obj30 = stackAr26.top();
        org.autotest.StackAr stackAr32 = new org.autotest.StackAr((int) '4');
        org.autotest.StackAr stackAr34 = new org.autotest.StackAr((int) '4');
        java.lang.String str35 = stackAr34.toString();
        boolean boolean36 = stackAr32.equals((java.lang.Object) stackAr34);
        boolean boolean37 = stackAr32.isEmpty();
        stackAr26.push((java.lang.Object) stackAr32);
        boolean boolean39 = stackAr22.equals((java.lang.Object) stackAr26);
        java.lang.Class<?> wildcardClass40 = stackAr26.getClass();
        boolean boolean41 = stackAr19.equals((java.lang.Object) wildcardClass40);
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.push((java.lang.Object) boolean41);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (-1L) + "'", obj14, (-1L));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "[]" + "'", str24, "[]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + 0.0f + "'", obj30, 0.0f);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "[]" + "'", str35, "[]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test0923");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        stackAr0.push((java.lang.Object) 0.0f);
        java.lang.String str3 = stackAr0.toString();
        org.autotest.StackAr stackAr5 = new org.autotest.StackAr((int) 'a');
        boolean boolean7 = stackAr5.equals((java.lang.Object) (-1.0f));
        boolean boolean9 = stackAr5.equals((java.lang.Object) "");
        org.autotest.StackAr stackAr10 = new org.autotest.StackAr();
        boolean boolean11 = stackAr10.isFull();
        stackAr5.push((java.lang.Object) stackAr10);
        boolean boolean13 = stackAr5.isFull();
        java.lang.Object obj14 = stackAr5.pop();
        stackAr0.push((java.lang.Object) stackAr5);
        org.autotest.StackAr stackAr17 = new org.autotest.StackAr((int) 'a');
        boolean boolean19 = stackAr17.equals((java.lang.Object) (-1.0f));
        boolean boolean21 = stackAr17.equals((java.lang.Object) "");
        org.autotest.StackAr stackAr22 = new org.autotest.StackAr();
        boolean boolean23 = stackAr22.isFull();
        stackAr17.push((java.lang.Object) stackAr22);
        org.autotest.StackAr stackAr26 = new org.autotest.StackAr((int) '4');
        org.autotest.StackAr stackAr28 = new org.autotest.StackAr((int) '4');
        java.lang.String str29 = stackAr28.toString();
        boolean boolean30 = stackAr26.equals((java.lang.Object) stackAr28);
        org.autotest.StackAr stackAr31 = new org.autotest.StackAr();
        boolean boolean32 = stackAr31.isFull();
        boolean boolean34 = stackAr31.equals((java.lang.Object) (byte) -1);
        java.lang.String str35 = stackAr31.toString();
        boolean boolean37 = stackAr31.equals((java.lang.Object) 10L);
        java.lang.String str38 = stackAr31.toString();
        stackAr28.push((java.lang.Object) stackAr31);
        stackAr17.push((java.lang.Object) stackAr31);
        boolean boolean41 = stackAr31.isEmpty();
        boolean boolean42 = stackAr31.isFull();
        boolean boolean43 = stackAr31.isFull();
        stackAr5.push((java.lang.Object) stackAr31);
        int int45 = stackAr31.size();
        int int46 = stackAr31.size();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[0.0]" + "'", str3, "[0.0]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "[]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "[]" + "'", str29, "[]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "[]" + "'", str35, "[]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "[]" + "'", str38, "[]");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test0924");
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
        java.lang.Object obj20 = null;
        stackAr4.push(obj20);
        java.lang.Object obj22 = stackAr4.top();
        java.lang.String str23 = stackAr4.toString();
        java.lang.Object obj24 = stackAr4.pop();
        int int25 = stackAr4.size();
        java.lang.String str26 = stackAr4.toString();
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
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "[null]" + "'", str23, "[null]");
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "[]" + "'", str26, "[]");
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test0925");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        boolean boolean1 = stackAr0.isFull();
        boolean boolean3 = stackAr0.equals((java.lang.Object) (byte) -1);
        java.lang.String str4 = stackAr0.toString();
        boolean boolean5 = stackAr0.isFull();
        org.autotest.StackAr stackAr7 = new org.autotest.StackAr((int) '4');
        org.autotest.StackAr stackAr9 = new org.autotest.StackAr((int) '4');
        java.lang.String str10 = stackAr9.toString();
        boolean boolean11 = stackAr7.equals((java.lang.Object) stackAr9);
        org.autotest.StackAr stackAr13 = new org.autotest.StackAr((int) '4');
        stackAr13.push((java.lang.Object) (-1L));
        java.lang.Object obj16 = stackAr13.pop();
        stackAr7.push((java.lang.Object) stackAr13);
        stackAr0.push((java.lang.Object) stackAr7);
        boolean boolean19 = stackAr7.isEmpty();
        java.lang.Object obj20 = stackAr7.pop();
        java.lang.Class<?> wildcardClass21 = obj20.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (-1L) + "'", obj16, (-1L));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals(obj20.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj20), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj20), "[]");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test0926");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        boolean boolean1 = stackAr0.isFull();
        boolean boolean3 = stackAr0.equals((java.lang.Object) (byte) -1);
        java.lang.String str4 = stackAr0.toString();
        boolean boolean5 = stackAr0.isEmpty();
        org.autotest.StackAr stackAr7 = new org.autotest.StackAr((int) 'a');
        boolean boolean9 = stackAr7.equals((java.lang.Object) (-1.0f));
        boolean boolean10 = stackAr7.isEmpty();
        boolean boolean11 = stackAr0.equals((java.lang.Object) stackAr7);
        boolean boolean12 = stackAr7.isFull();
        boolean boolean13 = stackAr7.isFull();
        org.autotest.StackAr stackAr14 = new org.autotest.StackAr();
        boolean boolean15 = stackAr14.isFull();
        boolean boolean17 = stackAr14.equals((java.lang.Object) (byte) -1);
        java.lang.String str18 = stackAr14.toString();
        boolean boolean19 = stackAr14.isFull();
        org.autotest.StackAr stackAr21 = new org.autotest.StackAr((int) '4');
        org.autotest.StackAr stackAr23 = new org.autotest.StackAr((int) '4');
        java.lang.String str24 = stackAr23.toString();
        boolean boolean25 = stackAr21.equals((java.lang.Object) stackAr23);
        org.autotest.StackAr stackAr27 = new org.autotest.StackAr((int) '4');
        stackAr27.push((java.lang.Object) (-1L));
        java.lang.Object obj30 = stackAr27.pop();
        stackAr21.push((java.lang.Object) stackAr27);
        stackAr14.push((java.lang.Object) stackAr21);
        int int33 = stackAr14.size();
        int int34 = stackAr14.size();
        stackAr7.push((java.lang.Object) int34);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[]" + "'", str18, "[]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "[]" + "'", str24, "[]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + (-1L) + "'", obj30, (-1L));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test0927");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '4');
        int int2 = stackAr1.size();
        stackAr1.push((java.lang.Object) 0);
        boolean boolean5 = stackAr1.isFull();
        org.autotest.StackAr stackAr6 = new org.autotest.StackAr();
        boolean boolean7 = stackAr6.isFull();
        boolean boolean9 = stackAr6.equals((java.lang.Object) false);
        java.lang.Class<?> wildcardClass10 = stackAr6.getClass();
        boolean boolean11 = stackAr1.equals((java.lang.Object) stackAr6);
        boolean boolean12 = stackAr1.isFull();
        org.autotest.StackAr stackAr14 = new org.autotest.StackAr((int) '4');
        int int15 = stackAr14.size();
        stackAr14.push((java.lang.Object) 0);
        org.autotest.StackAr stackAr19 = new org.autotest.StackAr((int) '4');
        int int20 = stackAr19.size();
        int int21 = stackAr19.size();
        boolean boolean22 = stackAr19.isEmpty();
        stackAr19.push((java.lang.Object) "[[],true]");
        boolean boolean25 = stackAr14.equals((java.lang.Object) "[[],true]");
        boolean boolean26 = stackAr14.isFull();
        java.lang.Object obj27 = stackAr14.pop();
        boolean boolean28 = stackAr1.equals((java.lang.Object) stackAr14);
        boolean boolean29 = stackAr1.isEmpty();
        int int30 = stackAr1.size();
        stackAr1.push((java.lang.Object) (-1.0d));
        org.autotest.StackAr stackAr34 = new org.autotest.StackAr((int) '4');
        java.lang.String str35 = stackAr34.toString();
        java.lang.String str36 = stackAr34.toString();
        org.autotest.StackAr stackAr37 = new org.autotest.StackAr();
        boolean boolean38 = stackAr37.isFull();
        boolean boolean40 = stackAr37.equals((java.lang.Object) (byte) -1);
        org.autotest.StackAr stackAr42 = new org.autotest.StackAr((int) '4');
        boolean boolean43 = stackAr37.equals((java.lang.Object) '4');
        org.autotest.StackAr stackAr45 = new org.autotest.StackAr((int) 'a');
        boolean boolean47 = stackAr45.equals((java.lang.Object) (-1.0f));
        boolean boolean49 = stackAr45.equals((java.lang.Object) "");
        boolean boolean50 = stackAr37.equals((java.lang.Object) "");
        boolean boolean51 = stackAr37.isFull();
        boolean boolean52 = stackAr34.equals((java.lang.Object) stackAr37);
        int int53 = stackAr37.size();
        boolean boolean54 = stackAr37.isEmpty();
        boolean boolean55 = stackAr37.isEmpty();
        org.autotest.StackAr stackAr57 = new org.autotest.StackAr((int) '4');
        int int58 = stackAr57.size();
        stackAr57.push((java.lang.Object) 0);
        boolean boolean61 = stackAr57.isFull();
        stackAr37.push((java.lang.Object) stackAr57);
        org.autotest.StackAr stackAr64 = new org.autotest.StackAr((int) '4');
        stackAr64.push((java.lang.Object) (-1L));
        java.lang.Object obj67 = stackAr64.pop();
        stackAr64.push((java.lang.Object) (-1));
        boolean boolean70 = stackAr64.isEmpty();
        org.autotest.StackAr stackAr72 = new org.autotest.StackAr((int) 'a');
        boolean boolean74 = stackAr72.equals((java.lang.Object) (-1.0f));
        boolean boolean76 = stackAr72.equals((java.lang.Object) "");
        org.autotest.StackAr stackAr77 = new org.autotest.StackAr();
        boolean boolean78 = stackAr77.isFull();
        stackAr72.push((java.lang.Object) stackAr77);
        boolean boolean80 = stackAr72.isFull();
        java.lang.Object obj81 = stackAr72.pop();
        boolean boolean82 = stackAr64.equals(obj81);
        stackAr37.push(obj81);
        stackAr1.push(obj81);
        boolean boolean85 = stackAr1.isFull();
        java.lang.Object obj86 = stackAr1.top();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + 0 + "'", obj27, 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "[]" + "'", str35, "[]");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "[]" + "'", str36, "[]");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertEquals("'" + obj67 + "' != '" + (-1L) + "'", obj67, (-1L));
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(obj81);
        org.junit.Assert.assertEquals(obj81.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj81), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj81), "[]");
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(obj86);
        org.junit.Assert.assertEquals(obj86.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj86), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj86), "[]");
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test0928");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '4');
        java.lang.String str2 = stackAr1.toString();
        org.autotest.StackAr stackAr3 = new org.autotest.StackAr();
        boolean boolean4 = stackAr3.isFull();
        boolean boolean6 = stackAr3.equals((java.lang.Object) false);
        boolean boolean7 = stackAr3.isEmpty();
        boolean boolean8 = stackAr1.equals((java.lang.Object) stackAr3);
        boolean boolean9 = stackAr3.isEmpty();
        org.autotest.StackAr stackAr10 = new org.autotest.StackAr();
        boolean boolean12 = stackAr10.equals((java.lang.Object) 1.0f);
        boolean boolean13 = stackAr10.isEmpty();
        boolean boolean14 = stackAr3.equals((java.lang.Object) boolean13);
        boolean boolean15 = stackAr3.isFull();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test0929");
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
        java.lang.Object obj20 = null;
        stackAr4.push(obj20);
        java.lang.Object obj22 = stackAr4.top();
        boolean boolean23 = stackAr4.isEmpty();
        stackAr4.push((java.lang.Object) 1.0f);
        boolean boolean26 = stackAr4.isFull();
        java.lang.Object obj27 = stackAr4.top();
        boolean boolean28 = stackAr4.isFull();
        org.autotest.StackAr stackAr30 = new org.autotest.StackAr((int) '4');
        java.lang.String str31 = stackAr30.toString();
        java.lang.String str32 = stackAr30.toString();
        org.autotest.StackAr stackAr33 = new org.autotest.StackAr();
        boolean boolean34 = stackAr33.isFull();
        boolean boolean36 = stackAr33.equals((java.lang.Object) (byte) -1);
        org.autotest.StackAr stackAr38 = new org.autotest.StackAr((int) '4');
        boolean boolean39 = stackAr33.equals((java.lang.Object) '4');
        org.autotest.StackAr stackAr41 = new org.autotest.StackAr((int) 'a');
        boolean boolean43 = stackAr41.equals((java.lang.Object) (-1.0f));
        boolean boolean45 = stackAr41.equals((java.lang.Object) "");
        boolean boolean46 = stackAr33.equals((java.lang.Object) "");
        boolean boolean47 = stackAr33.isFull();
        boolean boolean48 = stackAr30.equals((java.lang.Object) stackAr33);
        java.lang.Object obj49 = null;
        stackAr33.push(obj49);
        java.lang.Object obj51 = stackAr33.top();
        boolean boolean52 = stackAr33.isEmpty();
        stackAr33.push((java.lang.Object) 1.0f);
        boolean boolean55 = stackAr33.isFull();
        java.lang.Object obj56 = stackAr33.pop();
        boolean boolean57 = stackAr33.isFull();
        java.lang.Object obj58 = stackAr33.pop();
        stackAr4.push(obj58);
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
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + 1.0f + "'", obj27, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "[]" + "'", str31, "[]");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "[]" + "'", str32, "[]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertEquals("'" + obj56 + "' != '" + 1.0f + "'", obj56, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNull(obj58);
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test0930");
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
        boolean boolean46 = stackAr44.isFull();
        org.autotest.StackAr stackAr48 = new org.autotest.StackAr((int) '4');
        org.autotest.StackAr stackAr50 = new org.autotest.StackAr((int) '4');
        java.lang.String str51 = stackAr50.toString();
        boolean boolean52 = stackAr48.equals((java.lang.Object) stackAr50);
        int int53 = stackAr48.size();
        boolean boolean54 = stackAr48.isFull();
        org.autotest.StackAr stackAr56 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean57 = stackAr56.isEmpty();
        boolean boolean58 = stackAr56.isEmpty();
        stackAr48.push((java.lang.Object) stackAr56);
        boolean boolean60 = stackAr44.equals((java.lang.Object) stackAr56);
        int int61 = stackAr56.size();
        int int62 = stackAr56.size();
        java.lang.Class<?> wildcardClass63 = stackAr56.getClass();
        stackAr30.push((java.lang.Object) stackAr56);
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
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "[]" + "'", str51, "[]");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNotNull(wildcardClass63);
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test0931");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        boolean boolean1 = stackAr0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = stackAr0.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test0932");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '4');
        org.autotest.StackAr stackAr3 = new org.autotest.StackAr((int) '4');
        java.lang.String str4 = stackAr3.toString();
        boolean boolean5 = stackAr1.equals((java.lang.Object) stackAr3);
        org.autotest.StackAr stackAr6 = new org.autotest.StackAr();
        boolean boolean7 = stackAr6.isFull();
        boolean boolean9 = stackAr6.equals((java.lang.Object) (byte) -1);
        java.lang.String str10 = stackAr6.toString();
        boolean boolean12 = stackAr6.equals((java.lang.Object) 10L);
        java.lang.String str13 = stackAr6.toString();
        stackAr3.push((java.lang.Object) stackAr6);
        org.autotest.StackAr stackAr16 = new org.autotest.StackAr((int) '4');
        int int17 = stackAr16.size();
        java.lang.String str18 = stackAr16.toString();
        int int19 = stackAr16.size();
        boolean boolean20 = stackAr16.isEmpty();
        java.lang.String str21 = stackAr16.toString();
        boolean boolean22 = stackAr16.isEmpty();
        stackAr3.push((java.lang.Object) boolean22);
        java.lang.Object obj24 = stackAr3.pop();
        boolean boolean25 = stackAr3.isEmpty();
        org.autotest.StackAr stackAr26 = new org.autotest.StackAr();
        boolean boolean27 = stackAr26.isFull();
        boolean boolean29 = stackAr26.equals((java.lang.Object) (byte) -1);
        org.autotest.StackAr stackAr31 = new org.autotest.StackAr((int) '4');
        boolean boolean32 = stackAr26.equals((java.lang.Object) '4');
        org.autotest.StackAr stackAr34 = new org.autotest.StackAr((int) 'a');
        boolean boolean36 = stackAr34.equals((java.lang.Object) (-1.0f));
        boolean boolean38 = stackAr34.equals((java.lang.Object) "");
        boolean boolean39 = stackAr26.equals((java.lang.Object) "");
        boolean boolean40 = stackAr26.isFull();
        org.autotest.StackAr stackAr42 = new org.autotest.StackAr((int) '4');
        java.lang.String str43 = stackAr42.toString();
        java.lang.String str44 = stackAr42.toString();
        org.autotest.StackAr stackAr45 = new org.autotest.StackAr();
        boolean boolean46 = stackAr45.isFull();
        boolean boolean48 = stackAr45.equals((java.lang.Object) (byte) -1);
        org.autotest.StackAr stackAr50 = new org.autotest.StackAr((int) '4');
        boolean boolean51 = stackAr45.equals((java.lang.Object) '4');
        org.autotest.StackAr stackAr53 = new org.autotest.StackAr((int) 'a');
        boolean boolean55 = stackAr53.equals((java.lang.Object) (-1.0f));
        boolean boolean57 = stackAr53.equals((java.lang.Object) "");
        boolean boolean58 = stackAr45.equals((java.lang.Object) "");
        boolean boolean59 = stackAr45.isFull();
        boolean boolean60 = stackAr42.equals((java.lang.Object) stackAr45);
        java.lang.Object obj61 = null;
        stackAr45.push(obj61);
        java.lang.Object obj63 = stackAr45.top();
        java.lang.String str64 = stackAr45.toString();
        boolean boolean65 = stackAr26.equals((java.lang.Object) stackAr45);
        org.autotest.StackAr stackAr67 = new org.autotest.StackAr((int) 'a');
        boolean boolean69 = stackAr67.equals((java.lang.Object) (-1.0f));
        boolean boolean71 = stackAr67.equals((java.lang.Object) "");
        org.autotest.StackAr stackAr72 = new org.autotest.StackAr();
        boolean boolean73 = stackAr72.isFull();
        stackAr67.push((java.lang.Object) stackAr72);
        int int75 = stackAr67.size();
        org.autotest.StackAr stackAr77 = new org.autotest.StackAr((int) '4');
        int int78 = stackAr77.size();
        stackAr77.push((java.lang.Object) 0);
        java.lang.String str81 = stackAr77.toString();
        boolean boolean82 = stackAr67.equals((java.lang.Object) stackAr77);
        stackAr26.push((java.lang.Object) stackAr67);
        stackAr3.push((java.lang.Object) stackAr26);
        java.lang.Class<?> wildcardClass85 = stackAr26.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[]" + "'", str13, "[]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[]" + "'", str18, "[]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "[]" + "'", str21, "[]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + true + "'", obj24, true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "[]" + "'", str43, "[]");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "[]" + "'", str44, "[]");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "[null]" + "'", str64, "[null]");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 1 + "'", int75 == 1);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "[0]" + "'", str81, "[0]");
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(wildcardClass85);
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test0933");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr(100);
        boolean boolean2 = stackAr1.isEmpty();
        org.autotest.StackAr stackAr4 = new org.autotest.StackAr((int) '4');
        int int5 = stackAr4.size();
        boolean boolean6 = stackAr4.isEmpty();
        boolean boolean7 = stackAr1.equals((java.lang.Object) stackAr4);
        boolean boolean8 = stackAr4.isFull();
        org.autotest.StackAr stackAr9 = new org.autotest.StackAr();
        stackAr9.push((java.lang.Object) 0.0f);
        java.lang.String str12 = stackAr9.toString();
        org.autotest.StackAr stackAr14 = new org.autotest.StackAr((int) 'a');
        boolean boolean16 = stackAr14.equals((java.lang.Object) (-1.0f));
        boolean boolean18 = stackAr14.equals((java.lang.Object) "");
        org.autotest.StackAr stackAr19 = new org.autotest.StackAr();
        boolean boolean20 = stackAr19.isFull();
        stackAr14.push((java.lang.Object) stackAr19);
        boolean boolean22 = stackAr14.isFull();
        java.lang.Object obj23 = stackAr14.pop();
        stackAr9.push((java.lang.Object) stackAr14);
        org.autotest.StackAr stackAr26 = new org.autotest.StackAr((int) '4');
        java.lang.String str27 = stackAr26.toString();
        org.autotest.StackAr stackAr28 = new org.autotest.StackAr();
        boolean boolean29 = stackAr28.isFull();
        boolean boolean31 = stackAr28.equals((java.lang.Object) false);
        boolean boolean32 = stackAr28.isEmpty();
        boolean boolean33 = stackAr26.equals((java.lang.Object) stackAr28);
        boolean boolean34 = stackAr26.isFull();
        stackAr14.push((java.lang.Object) stackAr26);
        boolean boolean36 = stackAr4.equals((java.lang.Object) stackAr26);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj37 = stackAr4.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[0.0]" + "'", str12, "[0.0]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertEquals(obj23.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj23), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj23), "[]");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "[]" + "'", str27, "[]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test0934");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) (short) 100);
        org.autotest.StackAr stackAr2 = new org.autotest.StackAr();
        boolean boolean3 = stackAr2.isFull();
        boolean boolean5 = stackAr2.equals((java.lang.Object) (byte) -1);
        java.lang.String str6 = stackAr2.toString();
        boolean boolean8 = stackAr2.equals((java.lang.Object) 10L);
        java.lang.String str9 = stackAr2.toString();
        boolean boolean11 = stackAr2.equals((java.lang.Object) (byte) 0);
        boolean boolean12 = stackAr2.isFull();
        org.autotest.StackAr stackAr14 = new org.autotest.StackAr((int) '#');
        stackAr2.push((java.lang.Object) stackAr14);
        boolean boolean16 = stackAr2.isFull();
        java.lang.String str17 = stackAr2.toString();
        stackAr1.push((java.lang.Object) stackAr2);
        org.autotest.StackAr stackAr20 = new org.autotest.StackAr((int) 'a');
        boolean boolean22 = stackAr20.equals((java.lang.Object) (-1.0f));
        boolean boolean24 = stackAr20.equals((java.lang.Object) "");
        org.autotest.StackAr stackAr25 = new org.autotest.StackAr();
        boolean boolean26 = stackAr25.isFull();
        stackAr20.push((java.lang.Object) stackAr25);
        org.autotest.StackAr stackAr29 = new org.autotest.StackAr((int) '4');
        org.autotest.StackAr stackAr31 = new org.autotest.StackAr((int) '4');
        java.lang.String str32 = stackAr31.toString();
        boolean boolean33 = stackAr29.equals((java.lang.Object) stackAr31);
        org.autotest.StackAr stackAr34 = new org.autotest.StackAr();
        boolean boolean35 = stackAr34.isFull();
        boolean boolean37 = stackAr34.equals((java.lang.Object) (byte) -1);
        java.lang.String str38 = stackAr34.toString();
        boolean boolean40 = stackAr34.equals((java.lang.Object) 10L);
        java.lang.String str41 = stackAr34.toString();
        stackAr31.push((java.lang.Object) stackAr34);
        stackAr20.push((java.lang.Object) stackAr34);
        org.autotest.StackAr stackAr45 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean46 = stackAr45.isEmpty();
        boolean boolean47 = stackAr45.isFull();
        org.autotest.StackAr stackAr49 = new org.autotest.StackAr((int) '4');
        org.autotest.StackAr stackAr51 = new org.autotest.StackAr((int) '4');
        java.lang.String str52 = stackAr51.toString();
        boolean boolean53 = stackAr49.equals((java.lang.Object) stackAr51);
        org.autotest.StackAr stackAr55 = new org.autotest.StackAr((int) '4');
        stackAr55.push((java.lang.Object) (-1L));
        java.lang.Object obj58 = stackAr55.pop();
        stackAr49.push((java.lang.Object) stackAr55);
        boolean boolean60 = stackAr45.equals((java.lang.Object) stackAr49);
        stackAr34.push((java.lang.Object) stackAr49);
        org.autotest.StackAr stackAr63 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean64 = stackAr63.isFull();
        int int65 = stackAr63.size();
        int int66 = stackAr63.size();
        stackAr49.push((java.lang.Object) stackAr63);
        org.autotest.StackAr stackAr69 = new org.autotest.StackAr((int) '4');
        java.lang.String str70 = stackAr69.toString();
        stackAr69.push((java.lang.Object) 0);
        stackAr49.push((java.lang.Object) 0);
        java.lang.Object obj74 = stackAr49.top();
        boolean boolean75 = stackAr49.isFull();
        org.autotest.StackAr stackAr77 = new org.autotest.StackAr((int) '4');
        org.autotest.StackAr stackAr79 = new org.autotest.StackAr((int) '4');
        java.lang.String str80 = stackAr79.toString();
        boolean boolean81 = stackAr77.equals((java.lang.Object) stackAr79);
        org.autotest.StackAr stackAr83 = new org.autotest.StackAr((int) '4');
        stackAr83.push((java.lang.Object) (-1L));
        java.lang.Object obj86 = stackAr83.pop();
        stackAr77.push((java.lang.Object) stackAr83);
        boolean boolean88 = stackAr77.isEmpty();
        boolean boolean90 = stackAr77.equals((java.lang.Object) "[[]]");
        java.lang.Object obj91 = stackAr77.pop();
        boolean boolean92 = stackAr49.equals((java.lang.Object) stackAr77);
        java.lang.Object obj93 = stackAr49.top();
        stackAr1.push((java.lang.Object) stackAr49);
        boolean boolean95 = stackAr49.isFull();
        int int96 = stackAr49.size();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[[]]" + "'", str17, "[[]]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "[]" + "'", str32, "[]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "[]" + "'", str38, "[]");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "[]" + "'", str41, "[]");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "[]" + "'", str52, "[]");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertEquals("'" + obj58 + "' != '" + (-1L) + "'", obj58, (-1L));
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "[]" + "'", str70, "[]");
        org.junit.Assert.assertEquals("'" + obj74 + "' != '" + 0 + "'", obj74, 0);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "[]" + "'", str80, "[]");
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertEquals("'" + obj86 + "' != '" + (-1L) + "'", obj86, (-1L));
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertNotNull(obj91);
        org.junit.Assert.assertEquals(obj91.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj91), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj91), "[]");
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertEquals("'" + obj93 + "' != '" + 0 + "'", obj93, 0);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + 3 + "'", int96 == 3);
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test0935");
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
        java.lang.Object obj20 = null;
        stackAr4.push(obj20);
        java.lang.Object obj22 = stackAr4.top();
        java.lang.Object obj23 = stackAr4.pop();
        java.lang.String str24 = stackAr4.toString();
        java.lang.String str25 = stackAr4.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj26 = stackAr4.top();
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
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "[]" + "'", str24, "[]");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "[]" + "'", str25, "[]");
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test0936");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        boolean boolean1 = stackAr0.isFull();
        boolean boolean3 = stackAr0.equals((java.lang.Object) (byte) -1);
        org.autotest.StackAr stackAr5 = new org.autotest.StackAr((int) '4');
        boolean boolean6 = stackAr0.equals((java.lang.Object) '4');
        boolean boolean7 = stackAr0.isEmpty();
        java.lang.String str8 = stackAr0.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = stackAr0.top();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test0937");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean2 = stackAr1.isEmpty();
        int int3 = stackAr1.size();
        boolean boolean4 = stackAr1.isFull();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test0938");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        stackAr0.push((java.lang.Object) 0.0f);
        stackAr0.push((java.lang.Object) true);
        java.lang.Object obj5 = stackAr0.pop();
        boolean boolean6 = stackAr0.isEmpty();
        boolean boolean7 = stackAr0.isFull();
        java.lang.Object obj8 = stackAr0.pop();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + true + "'", obj5, true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 0.0f + "'", obj8, 0.0f);
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test0939");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean2 = stackAr1.isFull();
        int int3 = stackAr1.size();
        int int4 = stackAr1.size();
        boolean boolean5 = stackAr1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = stackAr1.top();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test0940");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        boolean boolean1 = stackAr0.isFull();
        boolean boolean3 = stackAr0.equals((java.lang.Object) false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = stackAr0.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test0941");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '4');
        stackAr1.push((java.lang.Object) (-1L));
        java.lang.Object obj4 = stackAr1.pop();
        stackAr1.push((java.lang.Object) (-1));
        boolean boolean7 = stackAr1.isEmpty();
        org.autotest.StackAr stackAr9 = new org.autotest.StackAr((int) 'a');
        boolean boolean11 = stackAr9.equals((java.lang.Object) (-1.0f));
        boolean boolean13 = stackAr9.equals((java.lang.Object) "");
        org.autotest.StackAr stackAr14 = new org.autotest.StackAr();
        boolean boolean15 = stackAr14.isFull();
        stackAr9.push((java.lang.Object) stackAr14);
        boolean boolean17 = stackAr9.isFull();
        java.lang.Object obj18 = stackAr9.pop();
        boolean boolean19 = stackAr1.equals(obj18);
        java.lang.String str20 = stackAr1.toString();
        java.lang.Class<?> wildcardClass21 = stackAr1.getClass();
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (-1L) + "'", obj4, (-1L));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertEquals(obj18.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj18), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj18), "[]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "[-1]" + "'", str20, "[-1]");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test0942");
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
        org.autotest.StackAr stackAr44 = new org.autotest.StackAr((int) 'a');
        boolean boolean46 = stackAr44.equals((java.lang.Object) (-1.0f));
        boolean boolean48 = stackAr44.equals((java.lang.Object) "");
        org.autotest.StackAr stackAr49 = new org.autotest.StackAr();
        boolean boolean50 = stackAr49.isFull();
        stackAr44.push((java.lang.Object) stackAr49);
        java.lang.Class<?> wildcardClass52 = stackAr44.getClass();
        stackAr15.push((java.lang.Object) wildcardClass52);
        java.lang.Object obj54 = stackAr15.pop();
        java.lang.Object obj55 = stackAr15.pop();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj56 = stackAr15.pop();
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
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "[]" + "'", str33, "[]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + (-1L) + "'", obj39, (-1L));
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(wildcardClass52);
        org.junit.Assert.assertNotNull(obj54);
        org.junit.Assert.assertEquals(obj54.toString(), "class org.autotest.StackAr");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj54), "class org.autotest.StackAr");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj54), "class org.autotest.StackAr");
        org.junit.Assert.assertNotNull(obj55);
        org.junit.Assert.assertEquals(obj55.toString(), "[[]]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj55), "[[]]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj55), "[[]]");
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test0943");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '4');
        int int2 = stackAr1.size();
        java.lang.String str3 = stackAr1.toString();
        boolean boolean4 = stackAr1.isFull();
        org.autotest.StackAr stackAr5 = new org.autotest.StackAr();
        stackAr5.push((java.lang.Object) 0.0f);
        int int8 = stackAr5.size();
        java.lang.Object obj9 = stackAr5.top();
        org.autotest.StackAr stackAr11 = new org.autotest.StackAr((int) '4');
        org.autotest.StackAr stackAr13 = new org.autotest.StackAr((int) '4');
        java.lang.String str14 = stackAr13.toString();
        boolean boolean15 = stackAr11.equals((java.lang.Object) stackAr13);
        boolean boolean16 = stackAr11.isEmpty();
        stackAr5.push((java.lang.Object) stackAr11);
        boolean boolean18 = stackAr1.equals((java.lang.Object) stackAr5);
        int int19 = stackAr5.size();
        java.lang.Object obj20 = stackAr5.top();
        java.lang.Class<?> wildcardClass21 = stackAr5.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 0.0f + "'", obj9, 0.0f);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[]" + "'", str14, "[]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals(obj20.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj20), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj20), "[]");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test0944");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean2 = stackAr1.isEmpty();
        boolean boolean3 = stackAr1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = stackAr1.top();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test0945");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean2 = stackAr1.isFull();
        boolean boolean3 = stackAr1.isFull();
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
        int int24 = stackAr8.size();
        boolean boolean25 = stackAr8.isEmpty();
        boolean boolean26 = stackAr8.isEmpty();
        org.autotest.StackAr stackAr28 = new org.autotest.StackAr((int) '4');
        int int29 = stackAr28.size();
        stackAr28.push((java.lang.Object) 0);
        boolean boolean32 = stackAr28.isFull();
        stackAr8.push((java.lang.Object) stackAr28);
        java.lang.Object obj34 = stackAr8.pop();
        boolean boolean35 = stackAr1.equals(obj34);
        org.autotest.StackAr stackAr37 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean38 = stackAr37.isFull();
        boolean boolean39 = stackAr37.isEmpty();
        int int40 = stackAr37.size();
        boolean boolean41 = stackAr1.equals((java.lang.Object) stackAr37);
        org.autotest.StackAr stackAr43 = new org.autotest.StackAr((int) 'a');
        boolean boolean45 = stackAr43.equals((java.lang.Object) (-1.0f));
        boolean boolean47 = stackAr43.equals((java.lang.Object) "");
        org.autotest.StackAr stackAr48 = new org.autotest.StackAr();
        boolean boolean49 = stackAr48.isFull();
        stackAr43.push((java.lang.Object) stackAr48);
        org.autotest.StackAr stackAr52 = new org.autotest.StackAr((int) '4');
        org.autotest.StackAr stackAr54 = new org.autotest.StackAr((int) '4');
        java.lang.String str55 = stackAr54.toString();
        boolean boolean56 = stackAr52.equals((java.lang.Object) stackAr54);
        org.autotest.StackAr stackAr57 = new org.autotest.StackAr();
        boolean boolean58 = stackAr57.isFull();
        boolean boolean60 = stackAr57.equals((java.lang.Object) (byte) -1);
        java.lang.String str61 = stackAr57.toString();
        boolean boolean63 = stackAr57.equals((java.lang.Object) 10L);
        java.lang.String str64 = stackAr57.toString();
        stackAr54.push((java.lang.Object) stackAr57);
        stackAr43.push((java.lang.Object) stackAr57);
        boolean boolean67 = stackAr57.isFull();
        boolean boolean69 = stackAr57.equals((java.lang.Object) (short) 10);
        java.lang.Object obj70 = null;
        stackAr57.push(obj70);
        boolean boolean72 = stackAr57.isEmpty();
        boolean boolean73 = stackAr1.equals((java.lang.Object) stackAr57);
        java.lang.Class<?> wildcardClass74 = stackAr57.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertEquals(obj34.toString(), "[0]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj34), "[0]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj34), "[0]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "[]" + "'", str55, "[]");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "[]" + "'", str61, "[]");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "[]" + "'", str64, "[]");
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(wildcardClass74);
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test0946");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        boolean boolean1 = stackAr0.isFull();
        boolean boolean3 = stackAr0.equals((java.lang.Object) (byte) -1);
        java.lang.String str4 = stackAr0.toString();
        boolean boolean6 = stackAr0.equals((java.lang.Object) 10L);
        org.autotest.StackAr stackAr7 = new org.autotest.StackAr();
        boolean boolean8 = stackAr7.isFull();
        int int9 = stackAr7.size();
        boolean boolean10 = stackAr7.isEmpty();
        stackAr0.push((java.lang.Object) stackAr7);
        int int12 = stackAr7.size();
        org.autotest.StackAr stackAr14 = new org.autotest.StackAr((int) '4');
        java.lang.String str15 = stackAr14.toString();
        java.lang.String str16 = stackAr14.toString();
        org.autotest.StackAr stackAr17 = new org.autotest.StackAr();
        boolean boolean18 = stackAr17.isFull();
        boolean boolean20 = stackAr17.equals((java.lang.Object) (byte) -1);
        org.autotest.StackAr stackAr22 = new org.autotest.StackAr((int) '4');
        boolean boolean23 = stackAr17.equals((java.lang.Object) '4');
        org.autotest.StackAr stackAr25 = new org.autotest.StackAr((int) 'a');
        boolean boolean27 = stackAr25.equals((java.lang.Object) (-1.0f));
        boolean boolean29 = stackAr25.equals((java.lang.Object) "");
        boolean boolean30 = stackAr17.equals((java.lang.Object) "");
        boolean boolean31 = stackAr17.isFull();
        boolean boolean32 = stackAr14.equals((java.lang.Object) stackAr17);
        int int33 = stackAr17.size();
        org.autotest.StackAr stackAr35 = new org.autotest.StackAr((int) '4');
        boolean boolean36 = stackAr17.equals((java.lang.Object) stackAr35);
        stackAr7.push((java.lang.Object) stackAr35);
        org.autotest.StackAr stackAr39 = new org.autotest.StackAr((int) 'a');
        boolean boolean41 = stackAr39.equals((java.lang.Object) (-1.0f));
        boolean boolean43 = stackAr39.equals((java.lang.Object) "");
        java.lang.String str44 = stackAr39.toString();
        org.autotest.StackAr stackAr45 = new org.autotest.StackAr();
        boolean boolean46 = stackAr45.isFull();
        boolean boolean48 = stackAr45.equals((java.lang.Object) (byte) -1);
        java.lang.String str49 = stackAr45.toString();
        boolean boolean51 = stackAr45.equals((java.lang.Object) 10L);
        java.lang.String str52 = stackAr45.toString();
        org.autotest.StackAr stackAr54 = new org.autotest.StackAr((int) 'a');
        boolean boolean56 = stackAr54.equals((java.lang.Object) (-1.0f));
        boolean boolean58 = stackAr54.equals((java.lang.Object) "");
        org.autotest.StackAr stackAr59 = new org.autotest.StackAr();
        boolean boolean60 = stackAr59.isFull();
        stackAr54.push((java.lang.Object) stackAr59);
        org.autotest.StackAr stackAr63 = new org.autotest.StackAr((int) '4');
        org.autotest.StackAr stackAr65 = new org.autotest.StackAr((int) '4');
        java.lang.String str66 = stackAr65.toString();
        boolean boolean67 = stackAr63.equals((java.lang.Object) stackAr65);
        org.autotest.StackAr stackAr68 = new org.autotest.StackAr();
        boolean boolean69 = stackAr68.isFull();
        boolean boolean71 = stackAr68.equals((java.lang.Object) (byte) -1);
        java.lang.String str72 = stackAr68.toString();
        boolean boolean74 = stackAr68.equals((java.lang.Object) 10L);
        java.lang.String str75 = stackAr68.toString();
        stackAr65.push((java.lang.Object) stackAr68);
        stackAr54.push((java.lang.Object) stackAr68);
        boolean boolean78 = stackAr45.equals((java.lang.Object) stackAr68);
        boolean boolean79 = stackAr39.equals((java.lang.Object) stackAr45);
        boolean boolean80 = stackAr35.equals((java.lang.Object) boolean79);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[]" + "'", str15, "[]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[]" + "'", str16, "[]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "[]" + "'", str44, "[]");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "[]" + "'", str49, "[]");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "[]" + "'", str52, "[]");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "[]" + "'", str66, "[]");
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "[]" + "'", str72, "[]");
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "[]" + "'", str75, "[]");
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test0947");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '4');
        int int2 = stackAr1.size();
        stackAr1.push((java.lang.Object) 0);
        boolean boolean5 = stackAr1.isFull();
        org.autotest.StackAr stackAr6 = new org.autotest.StackAr();
        boolean boolean7 = stackAr6.isFull();
        boolean boolean9 = stackAr6.equals((java.lang.Object) false);
        java.lang.Class<?> wildcardClass10 = stackAr6.getClass();
        boolean boolean11 = stackAr1.equals((java.lang.Object) stackAr6);
        boolean boolean12 = stackAr1.isFull();
        org.autotest.StackAr stackAr14 = new org.autotest.StackAr((int) '4');
        int int15 = stackAr14.size();
        stackAr14.push((java.lang.Object) 0);
        org.autotest.StackAr stackAr19 = new org.autotest.StackAr((int) '4');
        int int20 = stackAr19.size();
        int int21 = stackAr19.size();
        boolean boolean22 = stackAr19.isEmpty();
        stackAr19.push((java.lang.Object) "[[],true]");
        boolean boolean25 = stackAr14.equals((java.lang.Object) "[[],true]");
        boolean boolean26 = stackAr14.isFull();
        java.lang.Object obj27 = stackAr14.pop();
        boolean boolean28 = stackAr1.equals((java.lang.Object) stackAr14);
        boolean boolean29 = stackAr1.isEmpty();
        java.lang.Object obj30 = stackAr1.pop();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + 0 + "'", obj27, 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + 0 + "'", obj30, 0);
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test0948");
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
        boolean boolean25 = stackAr1.isEmpty();
        java.lang.Object obj26 = stackAr1.pop();
        java.lang.Object obj27 = stackAr1.top();
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
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertEquals(obj26.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj26), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj26), "[]");
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertEquals(obj27.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj27), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj27), "[]");
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test0949");
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
        boolean boolean25 = stackAr15.isFull();
        boolean boolean27 = stackAr15.equals((java.lang.Object) (short) 10);
        org.autotest.StackAr stackAr29 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean30 = stackAr29.isFull();
        java.lang.String str31 = stackAr29.toString();
        java.lang.String str32 = stackAr29.toString();
        boolean boolean33 = stackAr15.equals((java.lang.Object) stackAr29);
        org.autotest.StackAr stackAr35 = new org.autotest.StackAr((int) '4');
        java.lang.String str36 = stackAr35.toString();
        stackAr35.push((java.lang.Object) 0);
        java.lang.Object obj39 = stackAr35.top();
        boolean boolean40 = stackAr15.equals((java.lang.Object) stackAr35);
        boolean boolean41 = stackAr15.isFull();
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
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "[]" + "'", str31, "[]");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "[]" + "'", str32, "[]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "[]" + "'", str36, "[]");
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + 0 + "'", obj39, 0);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test0950");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '4');
        org.autotest.StackAr stackAr3 = new org.autotest.StackAr((int) '4');
        java.lang.String str4 = stackAr3.toString();
        boolean boolean5 = stackAr1.equals((java.lang.Object) stackAr3);
        org.autotest.StackAr stackAr7 = new org.autotest.StackAr((int) '4');
        stackAr7.push((java.lang.Object) (-1L));
        java.lang.Object obj10 = stackAr7.pop();
        stackAr1.push((java.lang.Object) stackAr7);
        boolean boolean12 = stackAr1.isEmpty();
        java.lang.Object obj13 = stackAr1.pop();
        boolean boolean14 = stackAr1.isFull();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (-1L) + "'", obj10, (-1L));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "[]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }
}

