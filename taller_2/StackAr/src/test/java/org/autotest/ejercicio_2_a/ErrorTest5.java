package org.autotest;

import org.junit.FixMethodOrder;
import org.junit.jupiter.api.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest5 {

    public static boolean debug = false;

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test251");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        boolean boolean1 = stackAr0.isFull();
        boolean boolean3 = stackAr0.equals((java.lang.Object) (byte) -1);
        org.autotest.StackAr stackAr5 = new org.autotest.StackAr((int) '4');
        boolean boolean6 = stackAr0.equals((java.lang.Object) '4');
        org.autotest.StackAr stackAr8 = new org.autotest.StackAr((int) 'a');
        boolean boolean10 = stackAr8.equals((java.lang.Object) (-1.0f));
        boolean boolean12 = stackAr8.equals((java.lang.Object) "");
        boolean boolean13 = stackAr0.equals((java.lang.Object) "");
        stackAr0.push((java.lang.Object) (byte) 0);
        int int16 = stackAr0.size();
        org.autotest.StackAr stackAr18 = new org.autotest.StackAr((int) '4');
        java.lang.String str19 = stackAr18.toString();
        java.lang.String str20 = stackAr18.toString();
        int int21 = stackAr18.size();
        boolean boolean22 = stackAr18.isFull();
        boolean boolean24 = stackAr18.equals((java.lang.Object) ' ');
        org.autotest.StackAr stackAr25 = new org.autotest.StackAr();
        org.autotest.StackAr stackAr26 = new org.autotest.StackAr();
        boolean boolean27 = stackAr26.isFull();
        int int28 = stackAr26.size();
        boolean boolean29 = stackAr26.isEmpty();
        org.autotest.StackAr stackAr31 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean32 = stackAr31.isFull();
        java.lang.Class<?> wildcardClass33 = stackAr31.getClass();
        stackAr26.push((java.lang.Object) wildcardClass33);
        boolean boolean35 = stackAr25.equals((java.lang.Object) stackAr26);
        int int36 = stackAr25.size();
        stackAr18.push((java.lang.Object) stackAr25);
        boolean boolean38 = stackAr25.isEmpty();
        java.lang.Class<?> wildcardClass39 = stackAr25.getClass();
        boolean boolean40 = stackAr0.equals((java.lang.Object) wildcardClass39);
        org.autotest.StackAr stackAr42 = new org.autotest.StackAr((int) '4');
        int int43 = stackAr42.size();
        boolean boolean44 = stackAr42.isEmpty();
        stackAr42.push((java.lang.Object) (byte) 0);
        java.lang.String str47 = stackAr42.toString();
        org.autotest.StackAr stackAr49 = new org.autotest.StackAr((int) '4');
        int int50 = stackAr49.size();
        int int51 = stackAr49.size();
        boolean boolean52 = stackAr49.isFull();
        org.autotest.StackAr stackAr53 = new org.autotest.StackAr();
        boolean boolean54 = stackAr53.isFull();
        boolean boolean56 = stackAr53.equals((java.lang.Object) (byte) -1);
        org.autotest.StackAr stackAr58 = new org.autotest.StackAr((int) '4');
        boolean boolean59 = stackAr53.equals((java.lang.Object) '4');
        org.autotest.StackAr stackAr61 = new org.autotest.StackAr((int) 'a');
        boolean boolean63 = stackAr61.equals((java.lang.Object) (-1.0f));
        boolean boolean65 = stackAr61.equals((java.lang.Object) "");
        boolean boolean66 = stackAr53.equals((java.lang.Object) "");
        boolean boolean67 = stackAr53.isFull();
        stackAr49.push((java.lang.Object) stackAr53);
        org.autotest.StackAr stackAr69 = new org.autotest.StackAr();
        int int70 = stackAr69.size();
        int int71 = stackAr69.size();
        stackAr53.push((java.lang.Object) int71);
        boolean boolean73 = stackAr53.isFull();
        stackAr42.push((java.lang.Object) stackAr53);
        java.lang.Object obj75 = stackAr53.top();
        boolean boolean76 = stackAr53.isEmpty();
        org.autotest.StackAr stackAr77 = new org.autotest.StackAr();
        boolean boolean78 = stackAr77.isFull();
        int int79 = stackAr77.size();
        boolean boolean80 = stackAr77.isEmpty();
        org.autotest.StackAr stackAr82 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean83 = stackAr82.isFull();
        java.lang.Class<?> wildcardClass84 = stackAr82.getClass();
        stackAr77.push((java.lang.Object) wildcardClass84);
        org.autotest.StackAr stackAr87 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean88 = stackAr87.isEmpty();
        java.lang.Class<?> wildcardClass89 = stackAr87.getClass();
        boolean boolean90 = stackAr77.equals((java.lang.Object) wildcardClass89);
        boolean boolean91 = stackAr77.isFull();
        boolean boolean92 = stackAr77.isEmpty();
        java.lang.Object obj93 = stackAr77.top();
        int int94 = stackAr77.size();
        stackAr53.push((java.lang.Object) stackAr77);
        java.lang.String str96 = stackAr53.toString();
        boolean boolean97 = stackAr0.equals((java.lang.Object) str96);
        java.lang.Object obj98 = stackAr0.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr0", stackAr0.repOK());
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test252");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '4');
        int int2 = stackAr1.size();
        int int3 = stackAr1.size();
        boolean boolean4 = stackAr1.isFull();
        org.autotest.StackAr stackAr5 = new org.autotest.StackAr();
        boolean boolean6 = stackAr5.isFull();
        boolean boolean8 = stackAr5.equals((java.lang.Object) (byte) -1);
        org.autotest.StackAr stackAr10 = new org.autotest.StackAr((int) '4');
        boolean boolean11 = stackAr5.equals((java.lang.Object) '4');
        org.autotest.StackAr stackAr13 = new org.autotest.StackAr((int) 'a');
        boolean boolean15 = stackAr13.equals((java.lang.Object) (-1.0f));
        boolean boolean17 = stackAr13.equals((java.lang.Object) "");
        boolean boolean18 = stackAr5.equals((java.lang.Object) "");
        boolean boolean19 = stackAr5.isFull();
        stackAr1.push((java.lang.Object) stackAr5);
        org.autotest.StackAr stackAr22 = new org.autotest.StackAr(0);
        boolean boolean23 = stackAr1.equals((java.lang.Object) stackAr22);
        boolean boolean24 = stackAr1.isFull();
        boolean boolean25 = stackAr1.isEmpty();
        java.lang.Object obj26 = stackAr1.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr1", stackAr1.repOK());
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test253");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '4');
        int int2 = stackAr1.size();
        boolean boolean3 = stackAr1.isEmpty();
        stackAr1.push((java.lang.Object) (byte) 0);
        java.lang.Object obj6 = stackAr1.top();
        boolean boolean7 = stackAr1.isFull();
        java.lang.Object obj8 = stackAr1.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr1", stackAr1.repOK());
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test254");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '4');
        int int2 = stackAr1.size();
        boolean boolean3 = stackAr1.isEmpty();
        stackAr1.push((java.lang.Object) (byte) 0);
        java.lang.Object obj6 = new java.lang.Object();
        boolean boolean7 = stackAr1.equals(obj6);
        boolean boolean8 = stackAr1.isEmpty();
        java.lang.String str9 = stackAr1.toString();
        boolean boolean10 = stackAr1.isEmpty();
        boolean boolean11 = stackAr1.isEmpty();
        java.lang.Object obj12 = stackAr1.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr1", stackAr1.repOK());
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test255");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        boolean boolean1 = stackAr0.isFull();
        int int2 = stackAr0.size();
        boolean boolean3 = stackAr0.isFull();
        stackAr0.push((java.lang.Object) 10L);
        stackAr0.push((java.lang.Object) ' ');
        java.lang.String str8 = stackAr0.toString();
        org.autotest.StackAr stackAr10 = new org.autotest.StackAr((int) 'a');
        stackAr10.push((java.lang.Object) 'a');
        java.lang.Object obj13 = stackAr10.top();
        boolean boolean14 = stackAr10.isEmpty();
        java.lang.Object obj15 = stackAr10.top();
        org.autotest.StackAr stackAr17 = new org.autotest.StackAr((int) 'a');
        java.lang.String str18 = stackAr17.toString();
        stackAr17.push((java.lang.Object) 0.0f);
        org.autotest.StackAr stackAr22 = new org.autotest.StackAr((int) '4');
        java.lang.String str23 = stackAr22.toString();
        boolean boolean24 = stackAr17.equals((java.lang.Object) stackAr22);
        boolean boolean25 = stackAr10.equals((java.lang.Object) stackAr17);
        boolean boolean26 = stackAr10.isFull();
        java.lang.Object obj27 = stackAr10.top();
        stackAr0.push((java.lang.Object) stackAr10);
        java.lang.Object obj29 = stackAr0.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr0", stackAr0.repOK());
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test256");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        boolean boolean1 = stackAr0.isFull();
        boolean boolean3 = stackAr0.equals((java.lang.Object) (byte) -1);
        org.autotest.StackAr stackAr5 = new org.autotest.StackAr((int) '4');
        boolean boolean6 = stackAr0.equals((java.lang.Object) '4');
        org.autotest.StackAr stackAr8 = new org.autotest.StackAr((int) 'a');
        boolean boolean10 = stackAr8.equals((java.lang.Object) (-1.0f));
        boolean boolean12 = stackAr8.equals((java.lang.Object) "");
        boolean boolean13 = stackAr0.equals((java.lang.Object) "");
        org.autotest.StackAr stackAr15 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean16 = stackAr15.isEmpty();
        boolean boolean17 = stackAr15.isEmpty();
        stackAr0.push((java.lang.Object) stackAr15);
        boolean boolean19 = stackAr15.isFull();
        org.autotest.StackAr stackAr20 = new org.autotest.StackAr();
        boolean boolean21 = stackAr20.isFull();
        boolean boolean23 = stackAr20.equals((java.lang.Object) (byte) -1);
        java.lang.String str24 = stackAr20.toString();
        int int25 = stackAr20.size();
        boolean boolean26 = stackAr15.equals((java.lang.Object) stackAr20);
        org.autotest.StackAr stackAr27 = new org.autotest.StackAr();
        boolean boolean28 = stackAr27.isFull();
        boolean boolean30 = stackAr27.equals((java.lang.Object) (byte) -1);
        org.autotest.StackAr stackAr32 = new org.autotest.StackAr((int) '4');
        boolean boolean33 = stackAr27.equals((java.lang.Object) '4');
        org.autotest.StackAr stackAr35 = new org.autotest.StackAr((int) 'a');
        boolean boolean37 = stackAr35.equals((java.lang.Object) (-1.0f));
        boolean boolean39 = stackAr35.equals((java.lang.Object) "");
        boolean boolean40 = stackAr27.equals((java.lang.Object) "");
        org.autotest.StackAr stackAr42 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean43 = stackAr42.isEmpty();
        boolean boolean44 = stackAr42.isEmpty();
        stackAr27.push((java.lang.Object) stackAr42);
        boolean boolean46 = stackAr42.isFull();
        org.autotest.StackAr stackAr47 = new org.autotest.StackAr();
        boolean boolean48 = stackAr47.isFull();
        boolean boolean50 = stackAr47.equals((java.lang.Object) (byte) -1);
        java.lang.String str51 = stackAr47.toString();
        int int52 = stackAr47.size();
        boolean boolean53 = stackAr42.equals((java.lang.Object) stackAr47);
        stackAr20.push((java.lang.Object) stackAr47);
        org.autotest.StackAr stackAr56 = new org.autotest.StackAr((int) 'a');
        org.autotest.StackAr stackAr57 = new org.autotest.StackAr();
        boolean boolean58 = stackAr57.isFull();
        int int59 = stackAr57.size();
        boolean boolean60 = stackAr57.isEmpty();
        stackAr56.push((java.lang.Object) stackAr57);
        org.autotest.StackAr stackAr63 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean64 = stackAr63.isEmpty();
        boolean boolean65 = stackAr63.isFull();
        org.autotest.StackAr stackAr66 = new org.autotest.StackAr();
        boolean boolean67 = stackAr66.isFull();
        org.autotest.StackAr stackAr69 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean70 = stackAr69.isEmpty();
        boolean boolean71 = stackAr69.isFull();
        boolean boolean72 = stackAr66.equals((java.lang.Object) boolean71);
        boolean boolean73 = stackAr63.equals((java.lang.Object) stackAr66);
        int int74 = stackAr66.size();
        stackAr56.push((java.lang.Object) int74);
        org.autotest.StackAr stackAr77 = new org.autotest.StackAr((int) '4');
        int int78 = stackAr77.size();
        java.lang.String str79 = stackAr77.toString();
        int int80 = stackAr77.size();
        org.autotest.StackAr stackAr81 = new org.autotest.StackAr();
        boolean boolean82 = stackAr81.isFull();
        boolean boolean84 = stackAr81.equals((java.lang.Object) (byte) -1);
        boolean boolean85 = stackAr77.equals((java.lang.Object) (byte) -1);
        java.lang.String str86 = stackAr77.toString();
        boolean boolean87 = stackAr56.equals((java.lang.Object) stackAr77);
        boolean boolean88 = stackAr77.isFull();
        java.lang.String str89 = stackAr77.toString();
        stackAr47.push((java.lang.Object) str89);
        java.lang.Object obj91 = stackAr47.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr47", stackAr47.repOK());
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test257");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '4');
        int int2 = stackAr1.size();
        boolean boolean3 = stackAr1.isEmpty();
        stackAr1.push((java.lang.Object) (byte) 0);
        java.lang.String str6 = stackAr1.toString();
        int int7 = stackAr1.size();
        java.lang.Object obj8 = stackAr1.top();
        java.lang.Object obj9 = stackAr1.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr1", stackAr1.repOK());
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test258");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '4');
        int int2 = stackAr1.size();
        int int3 = stackAr1.size();
        boolean boolean4 = stackAr1.isFull();
        org.autotest.StackAr stackAr6 = new org.autotest.StackAr((int) ' ');
        stackAr1.push((java.lang.Object) ' ');
        java.lang.String str8 = stackAr1.toString();
        java.lang.String str9 = stackAr1.toString();
        int int10 = stackAr1.size();
        org.autotest.StackAr stackAr12 = new org.autotest.StackAr((int) 'a');
        boolean boolean14 = stackAr12.equals((java.lang.Object) (-1.0f));
        boolean boolean15 = stackAr12.isFull();
        boolean boolean16 = stackAr12.isFull();
        stackAr12.push((java.lang.Object) "[0,[0]]");
        int int19 = stackAr12.size();
        stackAr1.push((java.lang.Object) stackAr12);
        java.lang.Object obj21 = stackAr1.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr1", stackAr1.repOK());
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test259");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) 'a');
        java.lang.String str2 = stackAr1.toString();
        stackAr1.push((java.lang.Object) (short) 10);
        java.lang.Object obj5 = stackAr1.top();
        org.autotest.StackAr stackAr6 = new org.autotest.StackAr();
        boolean boolean7 = stackAr6.isFull();
        int int8 = stackAr6.size();
        org.autotest.StackAr stackAr10 = new org.autotest.StackAr((int) (short) 0);
        stackAr6.push((java.lang.Object) (short) 0);
        boolean boolean12 = stackAr6.isEmpty();
        org.autotest.StackAr stackAr14 = new org.autotest.StackAr((int) '4');
        int int15 = stackAr14.size();
        java.lang.String str16 = stackAr14.toString();
        int int17 = stackAr14.size();
        org.autotest.StackAr stackAr18 = new org.autotest.StackAr();
        boolean boolean19 = stackAr18.isFull();
        boolean boolean21 = stackAr18.equals((java.lang.Object) (byte) -1);
        boolean boolean22 = stackAr14.equals((java.lang.Object) (byte) -1);
        stackAr6.push((java.lang.Object) boolean22);
        org.autotest.StackAr stackAr25 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean26 = stackAr25.isFull();
        int int27 = stackAr25.size();
        org.autotest.StackAr stackAr29 = new org.autotest.StackAr((int) 'a');
        java.lang.String str30 = stackAr29.toString();
        stackAr29.push((java.lang.Object) 0.0f);
        org.autotest.StackAr stackAr34 = new org.autotest.StackAr((int) '4');
        java.lang.String str35 = stackAr34.toString();
        boolean boolean36 = stackAr29.equals((java.lang.Object) stackAr34);
        stackAr34.push((java.lang.Object) 1.0f);
        boolean boolean39 = stackAr25.equals((java.lang.Object) stackAr34);
        boolean boolean40 = stackAr34.isEmpty();
        int int41 = stackAr34.size();
        java.lang.Object obj42 = null;
        stackAr34.push(obj42);
        java.lang.Class<?> wildcardClass44 = stackAr34.getClass();
        stackAr6.push((java.lang.Object) wildcardClass44);
        boolean boolean46 = stackAr1.equals((java.lang.Object) stackAr6);
        java.lang.Object obj47 = stackAr6.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr6", stackAr6.repOK());
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test260");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '4');
        int int2 = stackAr1.size();
        int int3 = stackAr1.size();
        boolean boolean4 = stackAr1.isFull();
        org.autotest.StackAr stackAr6 = new org.autotest.StackAr((int) ' ');
        stackAr1.push((java.lang.Object) ' ');
        java.lang.String str8 = stackAr1.toString();
        java.lang.String str9 = stackAr1.toString();
        int int10 = stackAr1.size();
        org.autotest.StackAr stackAr12 = new org.autotest.StackAr((int) 'a');
        boolean boolean14 = stackAr12.equals((java.lang.Object) (-1.0f));
        boolean boolean15 = stackAr12.isFull();
        boolean boolean16 = stackAr12.isFull();
        stackAr12.push((java.lang.Object) "[0,[0]]");
        int int19 = stackAr12.size();
        stackAr1.push((java.lang.Object) stackAr12);
        java.lang.Object obj21 = stackAr12.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr12", stackAr12.repOK());
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test261");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '4');
        int int2 = stackAr1.size();
        boolean boolean3 = stackAr1.isEmpty();
        stackAr1.push((java.lang.Object) (byte) 0);
        java.lang.Object obj6 = new java.lang.Object();
        boolean boolean7 = stackAr1.equals(obj6);
        java.lang.String str8 = stackAr1.toString();
        java.lang.Object obj9 = stackAr1.top();
        java.lang.Object obj10 = stackAr1.top();
        java.lang.String str11 = stackAr1.toString();
        java.lang.Object obj12 = stackAr1.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr1", stackAr1.repOK());
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test262");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        boolean boolean1 = stackAr0.isFull();
        int int2 = stackAr0.size();
        boolean boolean3 = stackAr0.isEmpty();
        org.autotest.StackAr stackAr5 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean6 = stackAr5.isFull();
        java.lang.Class<?> wildcardClass7 = stackAr5.getClass();
        stackAr0.push((java.lang.Object) wildcardClass7);
        org.autotest.StackAr stackAr9 = new org.autotest.StackAr();
        int int10 = stackAr9.size();
        java.lang.String str11 = stackAr9.toString();
        stackAr0.push((java.lang.Object) stackAr9);
        java.lang.Object obj13 = stackAr0.top();
        java.lang.String str14 = stackAr0.toString();
        int int15 = stackAr0.size();
        java.lang.Object obj16 = stackAr0.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr0", stackAr0.repOK());
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test263");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) 'a');
        boolean boolean3 = stackAr1.equals((java.lang.Object) (-1.0f));
        int int4 = stackAr1.size();
        org.autotest.StackAr stackAr5 = new org.autotest.StackAr();
        boolean boolean6 = stackAr5.isFull();
        int int7 = stackAr5.size();
        boolean boolean8 = stackAr5.isEmpty();
        org.autotest.StackAr stackAr10 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean11 = stackAr10.isFull();
        java.lang.Class<?> wildcardClass12 = stackAr10.getClass();
        stackAr5.push((java.lang.Object) wildcardClass12);
        boolean boolean14 = stackAr1.equals((java.lang.Object) stackAr5);
        org.autotest.StackAr stackAr16 = new org.autotest.StackAr((int) '4');
        java.lang.String str17 = stackAr16.toString();
        boolean boolean18 = stackAr16.isEmpty();
        boolean boolean19 = stackAr16.isFull();
        boolean boolean20 = stackAr5.equals((java.lang.Object) boolean19);
        int int21 = stackAr5.size();
        boolean boolean22 = stackAr5.isFull();
        java.lang.Object obj23 = stackAr5.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr5", stackAr5.repOK());
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test264");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) 'a');
        stackAr1.push((java.lang.Object) 'a');
        java.lang.Object obj4 = stackAr1.top();
        boolean boolean5 = stackAr1.isEmpty();
        java.lang.String str6 = stackAr1.toString();
        java.lang.String str7 = stackAr1.toString();
        java.lang.String str8 = stackAr1.toString();
        java.lang.Object obj9 = stackAr1.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr1", stackAr1.repOK());
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test265");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '4');
        java.lang.String str2 = stackAr1.toString();
        java.lang.String str3 = stackAr1.toString();
        int int4 = stackAr1.size();
        boolean boolean5 = stackAr1.isFull();
        boolean boolean7 = stackAr1.equals((java.lang.Object) ' ');
        org.autotest.StackAr stackAr8 = new org.autotest.StackAr();
        org.autotest.StackAr stackAr9 = new org.autotest.StackAr();
        boolean boolean10 = stackAr9.isFull();
        int int11 = stackAr9.size();
        boolean boolean12 = stackAr9.isEmpty();
        org.autotest.StackAr stackAr14 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean15 = stackAr14.isFull();
        java.lang.Class<?> wildcardClass16 = stackAr14.getClass();
        stackAr9.push((java.lang.Object) wildcardClass16);
        boolean boolean18 = stackAr8.equals((java.lang.Object) stackAr9);
        int int19 = stackAr8.size();
        stackAr1.push((java.lang.Object) stackAr8);
        org.autotest.StackAr stackAr22 = new org.autotest.StackAr((int) 'a');
        java.lang.String str23 = stackAr22.toString();
        stackAr22.push((java.lang.Object) 0.0f);
        org.autotest.StackAr stackAr27 = new org.autotest.StackAr((int) '4');
        java.lang.String str28 = stackAr27.toString();
        boolean boolean29 = stackAr22.equals((java.lang.Object) stackAr27);
        org.autotest.StackAr stackAr31 = new org.autotest.StackAr((int) '4');
        int int32 = stackAr31.size();
        java.lang.Class<?> wildcardClass33 = stackAr31.getClass();
        stackAr27.push((java.lang.Object) stackAr31);
        int int35 = stackAr27.size();
        boolean boolean36 = stackAr27.isEmpty();
        int int37 = stackAr27.size();
        stackAr1.push((java.lang.Object) int37);
        boolean boolean39 = stackAr1.isEmpty();
        java.lang.Object obj40 = stackAr1.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr1", stackAr1.repOK());
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test266");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) (short) 100);
        java.lang.String str2 = stackAr1.toString();
        boolean boolean3 = stackAr1.isFull();
        org.autotest.StackAr stackAr5 = new org.autotest.StackAr((int) 'a');
        java.lang.String str6 = stackAr5.toString();
        stackAr5.push((java.lang.Object) (short) 10);
        stackAr1.push((java.lang.Object) stackAr5);
        java.lang.Object obj10 = stackAr1.top();
        boolean boolean11 = stackAr1.isFull();
        int int12 = stackAr1.size();
        java.lang.Object obj13 = stackAr1.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr1", stackAr1.repOK());
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test267");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        boolean boolean1 = stackAr0.isFull();
        boolean boolean3 = stackAr0.equals((java.lang.Object) (byte) -1);
        org.autotest.StackAr stackAr5 = new org.autotest.StackAr((int) '4');
        boolean boolean6 = stackAr0.equals((java.lang.Object) '4');
        org.autotest.StackAr stackAr8 = new org.autotest.StackAr((int) 'a');
        boolean boolean10 = stackAr8.equals((java.lang.Object) (-1.0f));
        boolean boolean12 = stackAr8.equals((java.lang.Object) "");
        boolean boolean13 = stackAr0.equals((java.lang.Object) "");
        org.autotest.StackAr stackAr15 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean16 = stackAr15.isEmpty();
        boolean boolean17 = stackAr15.isEmpty();
        stackAr0.push((java.lang.Object) stackAr15);
        stackAr0.push((java.lang.Object) 1.0f);
        boolean boolean21 = stackAr0.isEmpty();
        java.lang.Object obj22 = stackAr0.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr0", stackAr0.repOK());
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test268");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) 'a');
        boolean boolean3 = stackAr1.equals((java.lang.Object) (-1.0f));
        boolean boolean5 = stackAr1.equals((java.lang.Object) "");
        stackAr1.push((java.lang.Object) (-1.0d));
        java.lang.String str8 = stackAr1.toString();
        org.autotest.StackAr stackAr10 = new org.autotest.StackAr((int) 'a');
        boolean boolean12 = stackAr10.equals((java.lang.Object) (-1.0f));
        int int13 = stackAr10.size();
        org.autotest.StackAr stackAr14 = new org.autotest.StackAr();
        boolean boolean15 = stackAr14.isFull();
        int int16 = stackAr14.size();
        boolean boolean17 = stackAr14.isEmpty();
        org.autotest.StackAr stackAr19 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean20 = stackAr19.isFull();
        java.lang.Class<?> wildcardClass21 = stackAr19.getClass();
        stackAr14.push((java.lang.Object) wildcardClass21);
        boolean boolean23 = stackAr10.equals((java.lang.Object) stackAr14);
        boolean boolean24 = stackAr10.isFull();
        boolean boolean25 = stackAr1.equals((java.lang.Object) stackAr10);
        java.lang.Object obj26 = stackAr1.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr1", stackAr1.repOK());
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test269");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        boolean boolean1 = stackAr0.isFull();
        int int2 = stackAr0.size();
        boolean boolean3 = stackAr0.isEmpty();
        org.autotest.StackAr stackAr5 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean6 = stackAr5.isFull();
        java.lang.Class<?> wildcardClass7 = stackAr5.getClass();
        stackAr0.push((java.lang.Object) wildcardClass7);
        org.autotest.StackAr stackAr10 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean11 = stackAr10.isEmpty();
        java.lang.Class<?> wildcardClass12 = stackAr10.getClass();
        boolean boolean13 = stackAr0.equals((java.lang.Object) wildcardClass12);
        boolean boolean14 = stackAr0.isFull();
        boolean boolean15 = stackAr0.isEmpty();
        java.lang.Object obj16 = stackAr0.top();
        boolean boolean17 = stackAr0.isFull();
        boolean boolean18 = stackAr0.isFull();
        java.lang.String str19 = stackAr0.toString();
        java.lang.Object obj20 = stackAr0.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr0", stackAr0.repOK());
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test270");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) 'a');
        stackAr1.push((java.lang.Object) 'a');
        java.lang.Object obj4 = stackAr1.top();
        boolean boolean5 = stackAr1.isEmpty();
        java.lang.String str6 = stackAr1.toString();
        java.lang.String str7 = stackAr1.toString();
        boolean boolean8 = stackAr1.isEmpty();
        boolean boolean9 = stackAr1.isFull();
        java.lang.Object obj10 = stackAr1.top();
        java.lang.Object obj11 = stackAr1.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr1", stackAr1.repOK());
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test271");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) 'a');
        java.lang.String str2 = stackAr1.toString();
        stackAr1.push((java.lang.Object) 0.0f);
        org.autotest.StackAr stackAr6 = new org.autotest.StackAr((int) '4');
        java.lang.String str7 = stackAr6.toString();
        boolean boolean8 = stackAr1.equals((java.lang.Object) stackAr6);
        java.lang.Object obj9 = stackAr1.top();
        java.lang.Object obj10 = stackAr1.top();
        boolean boolean11 = stackAr1.isEmpty();
        java.lang.Object obj12 = stackAr1.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr1", stackAr1.repOK());
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test272");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) (byte) 1);
        org.autotest.StackAr stackAr3 = new org.autotest.StackAr((int) '4');
        java.lang.String str4 = stackAr3.toString();
        stackAr1.push((java.lang.Object) str4);
        boolean boolean6 = stackAr1.isFull();
        java.lang.String str7 = stackAr1.toString();
        boolean boolean8 = stackAr1.isFull();
        java.lang.Object obj9 = stackAr1.top();
        java.lang.Object obj10 = stackAr1.top();
        java.lang.Object obj11 = stackAr1.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr1", stackAr1.repOK());
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test273");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        boolean boolean1 = stackAr0.isFull();
        int int2 = stackAr0.size();
        boolean boolean3 = stackAr0.isEmpty();
        org.autotest.StackAr stackAr5 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean6 = stackAr5.isFull();
        java.lang.Class<?> wildcardClass7 = stackAr5.getClass();
        stackAr0.push((java.lang.Object) wildcardClass7);
        org.autotest.StackAr stackAr10 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean11 = stackAr10.isEmpty();
        java.lang.Class<?> wildcardClass12 = stackAr10.getClass();
        boolean boolean13 = stackAr0.equals((java.lang.Object) wildcardClass12);
        boolean boolean14 = stackAr0.isFull();
        boolean boolean15 = stackAr0.isEmpty();
        org.autotest.StackAr stackAr17 = new org.autotest.StackAr(0);
        java.lang.Class<?> wildcardClass18 = stackAr17.getClass();
        boolean boolean19 = stackAr0.equals((java.lang.Object) wildcardClass18);
        java.lang.Object obj20 = stackAr0.top();
        org.autotest.StackAr stackAr22 = new org.autotest.StackAr((int) '4');
        int int23 = stackAr22.size();
        java.lang.String str24 = stackAr22.toString();
        java.lang.String str25 = stackAr22.toString();
        boolean boolean26 = stackAr22.isFull();
        stackAr0.push((java.lang.Object) boolean26);
        int int28 = stackAr0.size();
        boolean boolean29 = stackAr0.isFull();
        org.autotest.StackAr stackAr31 = new org.autotest.StackAr((int) 'a');
        boolean boolean33 = stackAr31.equals((java.lang.Object) (-1.0f));
        boolean boolean35 = stackAr31.equals((java.lang.Object) "");
        org.autotest.StackAr stackAr37 = new org.autotest.StackAr((int) '4');
        org.autotest.StackAr stackAr39 = new org.autotest.StackAr((int) (short) 1);
        stackAr37.push((java.lang.Object) (short) 1);
        int int41 = stackAr37.size();
        int int42 = stackAr37.size();
        stackAr31.push((java.lang.Object) stackAr37);
        boolean boolean44 = stackAr37.isEmpty();
        boolean boolean45 = stackAr0.equals((java.lang.Object) stackAr37);
        java.lang.Object obj46 = stackAr37.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr37", stackAr37.repOK());
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test274");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        boolean boolean1 = stackAr0.isFull();
        int int2 = stackAr0.size();
        boolean boolean3 = stackAr0.isEmpty();
        org.autotest.StackAr stackAr5 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean6 = stackAr5.isFull();
        java.lang.Class<?> wildcardClass7 = stackAr5.getClass();
        stackAr0.push((java.lang.Object) wildcardClass7);
        org.autotest.StackAr stackAr10 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean11 = stackAr10.isEmpty();
        java.lang.Class<?> wildcardClass12 = stackAr10.getClass();
        boolean boolean13 = stackAr0.equals((java.lang.Object) wildcardClass12);
        boolean boolean14 = stackAr0.isFull();
        boolean boolean15 = stackAr0.isEmpty();
        org.autotest.StackAr stackAr16 = new org.autotest.StackAr();
        boolean boolean17 = stackAr16.isFull();
        boolean boolean19 = stackAr16.equals((java.lang.Object) (byte) -1);
        java.lang.String str20 = stackAr16.toString();
        boolean boolean22 = stackAr16.equals((java.lang.Object) 10L);
        java.lang.String str23 = stackAr16.toString();
        java.lang.Class<?> wildcardClass24 = stackAr16.getClass();
        boolean boolean25 = stackAr0.equals((java.lang.Object) stackAr16);
        java.lang.Object obj26 = stackAr0.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr0", stackAr0.repOK());
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test275");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        int int1 = stackAr0.size();
        java.lang.String str2 = stackAr0.toString();
        java.lang.String str3 = stackAr0.toString();
        org.autotest.StackAr stackAr5 = new org.autotest.StackAr((int) 'a');
        java.lang.String str6 = stackAr5.toString();
        stackAr5.push((java.lang.Object) 0.0f);
        boolean boolean9 = stackAr5.isFull();
        int int10 = stackAr5.size();
        stackAr0.push((java.lang.Object) stackAr5);
        java.lang.Object obj12 = stackAr0.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr0", stackAr0.repOK());
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test276");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        boolean boolean1 = stackAr0.isFull();
        org.autotest.StackAr stackAr3 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean4 = stackAr3.isEmpty();
        boolean boolean5 = stackAr3.isFull();
        boolean boolean6 = stackAr0.equals((java.lang.Object) boolean5);
        boolean boolean7 = stackAr0.isFull();
        org.autotest.StackAr stackAr8 = new org.autotest.StackAr();
        boolean boolean9 = stackAr8.isFull();
        boolean boolean11 = stackAr8.equals((java.lang.Object) (byte) -1);
        org.autotest.StackAr stackAr13 = new org.autotest.StackAr((int) '4');
        boolean boolean14 = stackAr8.equals((java.lang.Object) '4');
        org.autotest.StackAr stackAr16 = new org.autotest.StackAr((int) 'a');
        boolean boolean18 = stackAr16.equals((java.lang.Object) (-1.0f));
        boolean boolean20 = stackAr16.equals((java.lang.Object) "");
        boolean boolean21 = stackAr8.equals((java.lang.Object) "");
        org.autotest.StackAr stackAr23 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean24 = stackAr23.isEmpty();
        boolean boolean25 = stackAr23.isEmpty();
        stackAr8.push((java.lang.Object) stackAr23);
        stackAr8.push((java.lang.Object) 1.0f);
        boolean boolean29 = stackAr0.equals((java.lang.Object) stackAr8);
        boolean boolean30 = stackAr0.isEmpty();
        boolean boolean31 = stackAr0.isEmpty();
        java.lang.String str32 = stackAr0.toString();
        org.autotest.StackAr stackAr33 = new org.autotest.StackAr();
        boolean boolean34 = stackAr33.isFull();
        int int35 = stackAr33.size();
        boolean boolean36 = stackAr33.isEmpty();
        org.autotest.StackAr stackAr38 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean39 = stackAr38.isFull();
        java.lang.Class<?> wildcardClass40 = stackAr38.getClass();
        stackAr33.push((java.lang.Object) wildcardClass40);
        org.autotest.StackAr stackAr43 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean44 = stackAr43.isEmpty();
        java.lang.Class<?> wildcardClass45 = stackAr43.getClass();
        boolean boolean46 = stackAr33.equals((java.lang.Object) wildcardClass45);
        boolean boolean47 = stackAr33.isFull();
        boolean boolean48 = stackAr33.isEmpty();
        org.autotest.StackAr stackAr50 = new org.autotest.StackAr(0);
        java.lang.Class<?> wildcardClass51 = stackAr50.getClass();
        boolean boolean52 = stackAr33.equals((java.lang.Object) wildcardClass51);
        boolean boolean53 = stackAr0.equals((java.lang.Object) stackAr33);
        org.autotest.StackAr stackAr55 = new org.autotest.StackAr((int) 'a');
        java.lang.String str56 = stackAr55.toString();
        stackAr55.push((java.lang.Object) 0.0f);
        boolean boolean60 = stackAr55.equals((java.lang.Object) (byte) -1);
        boolean boolean61 = stackAr55.isEmpty();
        boolean boolean62 = stackAr33.equals((java.lang.Object) stackAr55);
        java.lang.Object obj63 = stackAr55.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr55", stackAr55.repOK());
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test277");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '4');
        org.autotest.StackAr stackAr3 = new org.autotest.StackAr((int) (short) 1);
        stackAr1.push((java.lang.Object) (short) 1);
        int int5 = stackAr1.size();
        int int6 = stackAr1.size();
        org.autotest.StackAr stackAr8 = new org.autotest.StackAr((int) 'a');
        java.lang.String str9 = stackAr8.toString();
        stackAr8.push((java.lang.Object) 0.0f);
        org.autotest.StackAr stackAr13 = new org.autotest.StackAr((int) '4');
        java.lang.String str14 = stackAr13.toString();
        boolean boolean15 = stackAr8.equals((java.lang.Object) stackAr13);
        org.autotest.StackAr stackAr17 = new org.autotest.StackAr((int) 'a');
        boolean boolean19 = stackAr17.equals((java.lang.Object) (-1.0f));
        boolean boolean21 = stackAr17.equals((java.lang.Object) "");
        org.autotest.StackAr stackAr22 = new org.autotest.StackAr();
        boolean boolean23 = stackAr22.isFull();
        stackAr17.push((java.lang.Object) stackAr22);
        boolean boolean25 = stackAr13.equals((java.lang.Object) stackAr17);
        java.lang.Object obj26 = stackAr17.top();
        boolean boolean27 = stackAr17.isEmpty();
        java.lang.Object obj28 = stackAr17.top();
        org.autotest.StackAr stackAr30 = new org.autotest.StackAr((int) '4');
        int int31 = stackAr30.size();
        java.lang.String str32 = stackAr30.toString();
        int int33 = stackAr30.size();
        org.autotest.StackAr stackAr34 = new org.autotest.StackAr();
        boolean boolean35 = stackAr34.isFull();
        boolean boolean37 = stackAr34.equals((java.lang.Object) (byte) -1);
        boolean boolean38 = stackAr30.equals((java.lang.Object) (byte) -1);
        java.lang.String str39 = stackAr30.toString();
        int int40 = stackAr30.size();
        stackAr17.push((java.lang.Object) stackAr30);
        stackAr1.push((java.lang.Object) stackAr30);
        org.autotest.StackAr stackAr44 = new org.autotest.StackAr((int) '4');
        java.lang.String str45 = stackAr44.toString();
        boolean boolean46 = stackAr44.isEmpty();
        boolean boolean47 = stackAr44.isFull();
        org.autotest.StackAr stackAr48 = new org.autotest.StackAr();
        boolean boolean49 = stackAr48.isFull();
        int int50 = stackAr48.size();
        org.autotest.StackAr stackAr52 = new org.autotest.StackAr((int) (short) 0);
        stackAr48.push((java.lang.Object) (short) 0);
        stackAr44.push((java.lang.Object) (short) 0);
        java.lang.Object obj55 = stackAr44.top();
        boolean boolean56 = stackAr44.isFull();
        stackAr30.push((java.lang.Object) boolean56);
        org.autotest.StackAr stackAr58 = new org.autotest.StackAr();
        boolean boolean59 = stackAr58.isFull();
        org.autotest.StackAr stackAr61 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean62 = stackAr61.isEmpty();
        boolean boolean63 = stackAr61.isFull();
        boolean boolean64 = stackAr58.equals((java.lang.Object) boolean63);
        boolean boolean65 = stackAr30.equals((java.lang.Object) stackAr58);
        java.lang.Object obj66 = stackAr30.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr30", stackAr30.repOK());
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test278");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) 'a');
        java.lang.String str2 = stackAr1.toString();
        stackAr1.push((java.lang.Object) 0.0f);
        org.autotest.StackAr stackAr6 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean7 = stackAr6.isFull();
        boolean boolean8 = stackAr6.isEmpty();
        stackAr1.push((java.lang.Object) boolean8);
        org.autotest.StackAr stackAr11 = new org.autotest.StackAr((int) '4');
        int int12 = stackAr11.size();
        java.lang.String str13 = stackAr11.toString();
        int int14 = stackAr11.size();
        boolean boolean15 = stackAr11.isEmpty();
        java.lang.String str16 = stackAr11.toString();
        boolean boolean17 = stackAr11.isFull();
        boolean boolean18 = stackAr1.equals((java.lang.Object) boolean17);
        java.lang.Object obj19 = stackAr1.top();
        java.lang.Object obj20 = stackAr1.top();
        int int21 = stackAr1.size();
        boolean boolean22 = stackAr1.isEmpty();
        org.autotest.StackAr stackAr24 = new org.autotest.StackAr((int) 'a');
        org.autotest.StackAr stackAr25 = new org.autotest.StackAr();
        boolean boolean26 = stackAr25.isFull();
        int int27 = stackAr25.size();
        boolean boolean28 = stackAr25.isEmpty();
        stackAr24.push((java.lang.Object) stackAr25);
        stackAr1.push((java.lang.Object) stackAr24);
        java.lang.Object obj31 = stackAr1.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr1", stackAr1.repOK());
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test279");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) 'a');
        org.autotest.StackAr stackAr2 = new org.autotest.StackAr();
        boolean boolean3 = stackAr2.isFull();
        int int4 = stackAr2.size();
        boolean boolean5 = stackAr2.isEmpty();
        stackAr1.push((java.lang.Object) stackAr2);
        org.autotest.StackAr stackAr8 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean9 = stackAr8.isEmpty();
        boolean boolean10 = stackAr8.isFull();
        org.autotest.StackAr stackAr11 = new org.autotest.StackAr();
        boolean boolean12 = stackAr11.isFull();
        org.autotest.StackAr stackAr14 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean15 = stackAr14.isEmpty();
        boolean boolean16 = stackAr14.isFull();
        boolean boolean17 = stackAr11.equals((java.lang.Object) boolean16);
        boolean boolean18 = stackAr8.equals((java.lang.Object) stackAr11);
        int int19 = stackAr11.size();
        stackAr1.push((java.lang.Object) int19);
        int int21 = stackAr1.size();
        boolean boolean22 = stackAr1.isFull();
        int int23 = stackAr1.size();
        org.autotest.StackAr stackAr24 = new org.autotest.StackAr();
        boolean boolean25 = stackAr24.isFull();
        boolean boolean27 = stackAr24.equals((java.lang.Object) (byte) -1);
        org.autotest.StackAr stackAr29 = new org.autotest.StackAr((int) '4');
        boolean boolean30 = stackAr24.equals((java.lang.Object) '4');
        org.autotest.StackAr stackAr32 = new org.autotest.StackAr((int) 'a');
        boolean boolean34 = stackAr32.equals((java.lang.Object) (-1.0f));
        boolean boolean36 = stackAr32.equals((java.lang.Object) "");
        boolean boolean37 = stackAr24.equals((java.lang.Object) "");
        boolean boolean38 = stackAr24.isEmpty();
        java.lang.String str39 = stackAr24.toString();
        boolean boolean40 = stackAr24.isFull();
        boolean boolean41 = stackAr1.equals((java.lang.Object) boolean40);
        java.lang.Object obj42 = stackAr1.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr1", stackAr1.repOK());
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test280");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        boolean boolean1 = stackAr0.isFull();
        org.autotest.StackAr stackAr3 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean4 = stackAr3.isFull();
        boolean boolean5 = stackAr3.isEmpty();
        java.lang.String str6 = stackAr3.toString();
        int int7 = stackAr3.size();
        org.autotest.StackAr stackAr8 = new org.autotest.StackAr();
        boolean boolean9 = stackAr8.isFull();
        int int10 = stackAr8.size();
        boolean boolean11 = stackAr8.isFull();
        stackAr8.push((java.lang.Object) 10L);
        stackAr8.push((java.lang.Object) ' ');
        org.autotest.StackAr stackAr16 = new org.autotest.StackAr();
        java.lang.String str17 = stackAr16.toString();
        stackAr8.push((java.lang.Object) str17);
        java.lang.Class<?> wildcardClass19 = stackAr8.getClass();
        boolean boolean20 = stackAr3.equals((java.lang.Object) wildcardClass19);
        boolean boolean21 = stackAr0.equals((java.lang.Object) wildcardClass19);
        org.autotest.StackAr stackAr22 = new org.autotest.StackAr();
        int int23 = stackAr22.size();
        java.lang.String str24 = stackAr22.toString();
        java.lang.String str25 = stackAr22.toString();
        org.autotest.StackAr stackAr27 = new org.autotest.StackAr((int) 'a');
        java.lang.String str28 = stackAr27.toString();
        stackAr27.push((java.lang.Object) 0.0f);
        boolean boolean31 = stackAr27.isFull();
        int int32 = stackAr27.size();
        stackAr22.push((java.lang.Object) stackAr27);
        boolean boolean34 = stackAr0.equals((java.lang.Object) stackAr22);
        java.lang.Object obj35 = stackAr22.top();
        java.lang.Object obj36 = stackAr22.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr22", stackAr22.repOK());
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test281");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) 'a');
        boolean boolean3 = stackAr1.equals((java.lang.Object) (-1.0f));
        int int4 = stackAr1.size();
        org.autotest.StackAr stackAr5 = new org.autotest.StackAr();
        boolean boolean6 = stackAr5.isFull();
        int int7 = stackAr5.size();
        boolean boolean8 = stackAr5.isEmpty();
        org.autotest.StackAr stackAr10 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean11 = stackAr10.isFull();
        java.lang.Class<?> wildcardClass12 = stackAr10.getClass();
        stackAr5.push((java.lang.Object) wildcardClass12);
        boolean boolean14 = stackAr1.equals((java.lang.Object) stackAr5);
        boolean boolean15 = stackAr1.isFull();
        org.autotest.StackAr stackAr16 = new org.autotest.StackAr();
        java.lang.String str17 = stackAr16.toString();
        java.lang.String str18 = stackAr16.toString();
        boolean boolean19 = stackAr16.isEmpty();
        stackAr1.push((java.lang.Object) stackAr16);
        org.autotest.StackAr stackAr22 = new org.autotest.StackAr((int) '4');
        int int23 = stackAr22.size();
        int int24 = stackAr22.size();
        boolean boolean25 = stackAr22.isFull();
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
        stackAr22.push((java.lang.Object) stackAr26);
        org.autotest.StackAr stackAr43 = new org.autotest.StackAr(0);
        boolean boolean44 = stackAr22.equals((java.lang.Object) stackAr43);
        boolean boolean45 = stackAr22.isEmpty();
        java.lang.Object obj46 = stackAr22.top();
        stackAr1.push((java.lang.Object) stackAr22);
        org.autotest.StackAr stackAr49 = new org.autotest.StackAr((int) 'a');
        boolean boolean51 = stackAr49.equals((java.lang.Object) (-1.0f));
        java.lang.String str52 = stackAr49.toString();
        org.autotest.StackAr stackAr53 = new org.autotest.StackAr();
        java.lang.String str54 = stackAr53.toString();
        boolean boolean55 = stackAr53.isEmpty();
        int int56 = stackAr53.size();
        org.autotest.StackAr stackAr58 = new org.autotest.StackAr((int) 'a');
        boolean boolean60 = stackAr58.equals((java.lang.Object) (-1.0f));
        boolean boolean61 = stackAr58.isFull();
        org.autotest.StackAr stackAr62 = new org.autotest.StackAr();
        boolean boolean63 = stackAr62.isFull();
        int int64 = stackAr62.size();
        boolean boolean65 = stackAr62.isEmpty();
        org.autotest.StackAr stackAr67 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean68 = stackAr67.isFull();
        java.lang.Class<?> wildcardClass69 = stackAr67.getClass();
        stackAr62.push((java.lang.Object) wildcardClass69);
        org.autotest.StackAr stackAr72 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean73 = stackAr72.isEmpty();
        boolean boolean74 = stackAr72.isEmpty();
        org.autotest.StackAr stackAr75 = new org.autotest.StackAr();
        java.lang.Class<?> wildcardClass76 = stackAr75.getClass();
        boolean boolean77 = stackAr72.equals((java.lang.Object) stackAr75);
        java.lang.Class<?> wildcardClass78 = stackAr75.getClass();
        stackAr62.push((java.lang.Object) wildcardClass78);
        stackAr58.push((java.lang.Object) stackAr62);
        boolean boolean81 = stackAr58.isEmpty();
        boolean boolean82 = stackAr58.isFull();
        boolean boolean83 = stackAr53.equals((java.lang.Object) stackAr58);
        stackAr49.push((java.lang.Object) boolean83);
        boolean boolean85 = stackAr49.isEmpty();
        boolean boolean86 = stackAr22.equals((java.lang.Object) stackAr49);
        java.lang.Object obj87 = stackAr49.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr49", stackAr49.repOK());
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test282");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr();
        boolean boolean2 = stackAr1.isFull();
        int int3 = stackAr1.size();
        boolean boolean4 = stackAr1.isEmpty();
        org.autotest.StackAr stackAr6 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean7 = stackAr6.isFull();
        java.lang.Class<?> wildcardClass8 = stackAr6.getClass();
        stackAr1.push((java.lang.Object) wildcardClass8);
        boolean boolean10 = stackAr0.equals((java.lang.Object) stackAr1);
        org.autotest.StackAr stackAr12 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean13 = stackAr12.isEmpty();
        boolean boolean14 = stackAr12.isEmpty();
        org.autotest.StackAr stackAr15 = new org.autotest.StackAr();
        java.lang.Class<?> wildcardClass16 = stackAr15.getClass();
        boolean boolean17 = stackAr12.equals((java.lang.Object) stackAr15);
        java.lang.Class<?> wildcardClass18 = stackAr15.getClass();
        stackAr0.push((java.lang.Object) wildcardClass18);
        boolean boolean20 = stackAr0.isEmpty();
        boolean boolean21 = stackAr0.isEmpty();
        java.lang.Object obj22 = stackAr0.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr0", stackAr0.repOK());
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test283");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) 'a');
        stackAr1.push((java.lang.Object) 'a');
        java.lang.Object obj4 = stackAr1.top();
        boolean boolean5 = stackAr1.isEmpty();
        org.autotest.StackAr stackAr6 = new org.autotest.StackAr();
        boolean boolean7 = stackAr6.isFull();
        int int8 = stackAr6.size();
        boolean boolean9 = stackAr6.isEmpty();
        boolean boolean10 = stackAr6.isFull();
        boolean boolean11 = stackAr6.isFull();
        boolean boolean12 = stackAr6.isFull();
        boolean boolean13 = stackAr6.isFull();
        boolean boolean14 = stackAr6.isEmpty();
        int int15 = stackAr6.size();
        java.lang.String str16 = stackAr6.toString();
        org.autotest.StackAr stackAr18 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean19 = stackAr18.isEmpty();
        int int20 = stackAr18.size();
        boolean boolean21 = stackAr18.isFull();
        org.autotest.StackAr stackAr23 = new org.autotest.StackAr((int) (short) 100);
        boolean boolean24 = stackAr18.equals((java.lang.Object) stackAr23);
        boolean boolean25 = stackAr18.isFull();
        boolean boolean26 = stackAr6.equals((java.lang.Object) boolean25);
        org.autotest.StackAr stackAr28 = new org.autotest.StackAr((int) '4');
        int int29 = stackAr28.size();
        java.lang.String str30 = stackAr28.toString();
        int int31 = stackAr28.size();
        boolean boolean32 = stackAr28.isEmpty();
        java.lang.String str33 = stackAr28.toString();
        boolean boolean34 = stackAr6.equals((java.lang.Object) stackAr28);
        org.autotest.StackAr stackAr36 = new org.autotest.StackAr((int) 'a');
        java.lang.String str37 = stackAr36.toString();
        stackAr36.push((java.lang.Object) 0.0f);
        org.autotest.StackAr stackAr41 = new org.autotest.StackAr((int) 'a');
        org.autotest.StackAr stackAr43 = new org.autotest.StackAr((int) 'a');
        boolean boolean45 = stackAr43.equals((java.lang.Object) (-1.0f));
        boolean boolean47 = stackAr43.equals((java.lang.Object) "");
        stackAr43.push((java.lang.Object) (-1.0d));
        stackAr41.push((java.lang.Object) (-1.0d));
        boolean boolean51 = stackAr36.equals((java.lang.Object) (-1.0d));
        boolean boolean52 = stackAr36.isEmpty();
        boolean boolean53 = stackAr36.isFull();
        stackAr28.push((java.lang.Object) stackAr36);
        boolean boolean55 = stackAr36.isEmpty();
        boolean boolean56 = stackAr1.equals((java.lang.Object) stackAr36);
        java.lang.Object obj57 = stackAr36.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr36", stackAr36.repOK());
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test284");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '4');
        int int2 = stackAr1.size();
        java.lang.String str3 = stackAr1.toString();
        int int4 = stackAr1.size();
        boolean boolean5 = stackAr1.isEmpty();
        org.autotest.StackAr stackAr7 = new org.autotest.StackAr((int) (short) 1);
        boolean boolean8 = stackAr7.isFull();
        org.autotest.StackAr stackAr10 = new org.autotest.StackAr((int) (short) 1);
        boolean boolean11 = stackAr10.isFull();
        boolean boolean12 = stackAr7.equals((java.lang.Object) stackAr10);
        java.lang.Class<?> wildcardClass13 = stackAr10.getClass();
        boolean boolean14 = stackAr1.equals((java.lang.Object) wildcardClass13);
        org.autotest.StackAr stackAr16 = new org.autotest.StackAr((int) '4');
        int int17 = stackAr16.size();
        int int18 = stackAr16.size();
        boolean boolean19 = stackAr16.isFull();
        org.autotest.StackAr stackAr20 = new org.autotest.StackAr();
        boolean boolean21 = stackAr20.isFull();
        boolean boolean23 = stackAr20.equals((java.lang.Object) (byte) -1);
        org.autotest.StackAr stackAr25 = new org.autotest.StackAr((int) '4');
        boolean boolean26 = stackAr20.equals((java.lang.Object) '4');
        org.autotest.StackAr stackAr28 = new org.autotest.StackAr((int) 'a');
        boolean boolean30 = stackAr28.equals((java.lang.Object) (-1.0f));
        boolean boolean32 = stackAr28.equals((java.lang.Object) "");
        boolean boolean33 = stackAr20.equals((java.lang.Object) "");
        boolean boolean34 = stackAr20.isFull();
        stackAr16.push((java.lang.Object) stackAr20);
        org.autotest.StackAr stackAr37 = new org.autotest.StackAr(0);
        boolean boolean38 = stackAr16.equals((java.lang.Object) stackAr37);
        boolean boolean39 = stackAr1.equals((java.lang.Object) stackAr37);
        boolean boolean40 = stackAr1.isEmpty();
        org.autotest.StackAr stackAr42 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean43 = stackAr42.isFull();
        int int44 = stackAr42.size();
        org.autotest.StackAr stackAr46 = new org.autotest.StackAr((int) 'a');
        java.lang.String str47 = stackAr46.toString();
        stackAr46.push((java.lang.Object) 0.0f);
        org.autotest.StackAr stackAr51 = new org.autotest.StackAr((int) '4');
        java.lang.String str52 = stackAr51.toString();
        boolean boolean53 = stackAr46.equals((java.lang.Object) stackAr51);
        stackAr51.push((java.lang.Object) 1.0f);
        boolean boolean56 = stackAr42.equals((java.lang.Object) stackAr51);
        int int57 = stackAr42.size();
        boolean boolean58 = stackAr1.equals((java.lang.Object) int57);
        boolean boolean59 = stackAr1.isEmpty();
        java.lang.String str60 = stackAr1.toString();
        org.autotest.StackAr stackAr62 = new org.autotest.StackAr((int) 'a');
        boolean boolean64 = stackAr62.equals((java.lang.Object) (-1.0f));
        int int65 = stackAr62.size();
        org.autotest.StackAr stackAr66 = new org.autotest.StackAr();
        boolean boolean67 = stackAr66.isFull();
        int int68 = stackAr66.size();
        boolean boolean69 = stackAr66.isEmpty();
        org.autotest.StackAr stackAr71 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean72 = stackAr71.isFull();
        java.lang.Class<?> wildcardClass73 = stackAr71.getClass();
        stackAr66.push((java.lang.Object) wildcardClass73);
        boolean boolean75 = stackAr62.equals((java.lang.Object) stackAr66);
        boolean boolean76 = stackAr62.isFull();
        org.autotest.StackAr stackAr78 = new org.autotest.StackAr((int) '4');
        int int79 = stackAr78.size();
        int int80 = stackAr78.size();
        boolean boolean81 = stackAr78.isFull();
        org.autotest.StackAr stackAr83 = new org.autotest.StackAr((int) ' ');
        stackAr78.push((java.lang.Object) ' ');
        org.autotest.StackAr stackAr85 = new org.autotest.StackAr();
        boolean boolean86 = stackAr85.isFull();
        int int87 = stackAr85.size();
        boolean boolean88 = stackAr85.isEmpty();
        boolean boolean89 = stackAr85.isFull();
        boolean boolean90 = stackAr85.isFull();
        boolean boolean91 = stackAr85.isFull();
        boolean boolean92 = stackAr78.equals((java.lang.Object) boolean91);
        boolean boolean93 = stackAr62.equals((java.lang.Object) stackAr78);
        stackAr1.push((java.lang.Object) stackAr78);
        int int95 = stackAr78.size();
        java.lang.String str96 = stackAr78.toString();
        java.lang.Object obj97 = stackAr78.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr78", stackAr78.repOK());
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test285");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        boolean boolean1 = stackAr0.isFull();
        org.autotest.StackAr stackAr3 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean4 = stackAr3.isEmpty();
        boolean boolean5 = stackAr3.isFull();
        boolean boolean6 = stackAr0.equals((java.lang.Object) boolean5);
        boolean boolean7 = stackAr0.isFull();
        org.autotest.StackAr stackAr8 = new org.autotest.StackAr();
        boolean boolean9 = stackAr8.isFull();
        boolean boolean11 = stackAr8.equals((java.lang.Object) (byte) -1);
        org.autotest.StackAr stackAr13 = new org.autotest.StackAr((int) '4');
        boolean boolean14 = stackAr8.equals((java.lang.Object) '4');
        org.autotest.StackAr stackAr16 = new org.autotest.StackAr((int) 'a');
        boolean boolean18 = stackAr16.equals((java.lang.Object) (-1.0f));
        boolean boolean20 = stackAr16.equals((java.lang.Object) "");
        boolean boolean21 = stackAr8.equals((java.lang.Object) "");
        org.autotest.StackAr stackAr23 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean24 = stackAr23.isEmpty();
        boolean boolean25 = stackAr23.isEmpty();
        stackAr8.push((java.lang.Object) stackAr23);
        stackAr8.push((java.lang.Object) 1.0f);
        boolean boolean29 = stackAr0.equals((java.lang.Object) stackAr8);
        boolean boolean30 = stackAr8.isEmpty();
        org.autotest.StackAr stackAr32 = new org.autotest.StackAr((int) '4');
        java.lang.String str33 = stackAr32.toString();
        java.lang.String str34 = stackAr32.toString();
        int int35 = stackAr32.size();
        boolean boolean36 = stackAr32.isFull();
        boolean boolean38 = stackAr32.equals((java.lang.Object) ' ');
        org.autotest.StackAr stackAr39 = new org.autotest.StackAr();
        org.autotest.StackAr stackAr40 = new org.autotest.StackAr();
        boolean boolean41 = stackAr40.isFull();
        int int42 = stackAr40.size();
        boolean boolean43 = stackAr40.isEmpty();
        org.autotest.StackAr stackAr45 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean46 = stackAr45.isFull();
        java.lang.Class<?> wildcardClass47 = stackAr45.getClass();
        stackAr40.push((java.lang.Object) wildcardClass47);
        boolean boolean49 = stackAr39.equals((java.lang.Object) stackAr40);
        int int50 = stackAr39.size();
        stackAr32.push((java.lang.Object) stackAr39);
        boolean boolean52 = stackAr8.equals((java.lang.Object) stackAr32);
        java.lang.Object obj53 = stackAr32.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr32", stackAr32.repOK());
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test286");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '4');
        org.autotest.StackAr stackAr3 = new org.autotest.StackAr((int) (short) 1);
        stackAr1.push((java.lang.Object) (short) 1);
        int int5 = stackAr1.size();
        int int6 = stackAr1.size();
        java.lang.Object obj7 = stackAr1.top();
        boolean boolean8 = stackAr1.isFull();
        java.lang.Object obj9 = stackAr1.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr1", stackAr1.repOK());
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test287");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) (byte) 1);
        org.autotest.StackAr stackAr3 = new org.autotest.StackAr((int) '4');
        java.lang.String str4 = stackAr3.toString();
        stackAr1.push((java.lang.Object) str4);
        boolean boolean6 = stackAr1.isFull();
        java.lang.String str7 = stackAr1.toString();
        boolean boolean8 = stackAr1.isFull();
        java.lang.Object obj9 = stackAr1.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr1", stackAr1.repOK());
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test288");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '4');
        int int2 = stackAr1.size();
        boolean boolean3 = stackAr1.isEmpty();
        stackAr1.push((java.lang.Object) (byte) 0);
        java.lang.Object obj6 = new java.lang.Object();
        boolean boolean7 = stackAr1.equals(obj6);
        boolean boolean8 = stackAr1.isEmpty();
        boolean boolean9 = stackAr1.isEmpty();
        org.autotest.StackAr stackAr11 = new org.autotest.StackAr((int) '4');
        int int12 = stackAr11.size();
        boolean boolean13 = stackAr11.isEmpty();
        stackAr11.push((java.lang.Object) (byte) 0);
        java.lang.Object obj16 = new java.lang.Object();
        boolean boolean17 = stackAr11.equals(obj16);
        boolean boolean18 = stackAr11.isEmpty();
        boolean boolean19 = stackAr11.isEmpty();
        java.lang.String str20 = stackAr11.toString();
        stackAr1.push((java.lang.Object) str20);
        java.lang.String str22 = stackAr1.toString();
        boolean boolean23 = stackAr1.isFull();
        java.lang.Object obj24 = stackAr1.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr1", stackAr1.repOK());
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test289");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '4');
        int int2 = stackAr1.size();
        boolean boolean3 = stackAr1.isEmpty();
        stackAr1.push((java.lang.Object) (byte) 0);
        java.lang.Object obj6 = new java.lang.Object();
        boolean boolean7 = stackAr1.equals(obj6);
        boolean boolean8 = stackAr1.isEmpty();
        boolean boolean9 = stackAr1.isEmpty();
        org.autotest.StackAr stackAr11 = new org.autotest.StackAr((int) '4');
        int int12 = stackAr11.size();
        boolean boolean13 = stackAr11.isEmpty();
        stackAr11.push((java.lang.Object) (byte) 0);
        java.lang.Object obj16 = new java.lang.Object();
        boolean boolean17 = stackAr11.equals(obj16);
        boolean boolean18 = stackAr11.isEmpty();
        boolean boolean19 = stackAr11.isEmpty();
        java.lang.String str20 = stackAr11.toString();
        stackAr1.push((java.lang.Object) str20);
        java.lang.String str22 = stackAr1.toString();
        org.autotest.StackAr stackAr24 = new org.autotest.StackAr((int) '4');
        int int25 = stackAr24.size();
        java.lang.String str26 = stackAr24.toString();
        int int27 = stackAr24.size();
        org.autotest.StackAr stackAr28 = new org.autotest.StackAr();
        boolean boolean29 = stackAr28.isFull();
        boolean boolean31 = stackAr28.equals((java.lang.Object) (byte) -1);
        boolean boolean32 = stackAr24.equals((java.lang.Object) (byte) -1);
        java.lang.Object obj33 = null;
        stackAr24.push(obj33);
        int int35 = stackAr24.size();
        stackAr1.push((java.lang.Object) int35);
        java.lang.Object obj37 = stackAr1.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr1", stackAr1.repOK());
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test290");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) 'a');
        java.lang.String str2 = stackAr1.toString();
        stackAr1.push((java.lang.Object) 0.0f);
        org.autotest.StackAr stackAr6 = new org.autotest.StackAr((int) '4');
        java.lang.String str7 = stackAr6.toString();
        boolean boolean8 = stackAr1.equals((java.lang.Object) stackAr6);
        org.autotest.StackAr stackAr10 = new org.autotest.StackAr((int) 'a');
        boolean boolean12 = stackAr10.equals((java.lang.Object) (-1.0f));
        boolean boolean14 = stackAr10.equals((java.lang.Object) "");
        org.autotest.StackAr stackAr15 = new org.autotest.StackAr();
        boolean boolean16 = stackAr15.isFull();
        stackAr10.push((java.lang.Object) stackAr15);
        boolean boolean18 = stackAr6.equals((java.lang.Object) stackAr10);
        java.lang.Object obj19 = stackAr10.top();
        boolean boolean20 = stackAr10.isEmpty();
        java.lang.Object obj21 = stackAr10.top();
        java.lang.String str22 = stackAr10.toString();
        java.lang.Object obj23 = stackAr10.top();
        java.lang.Object obj24 = stackAr10.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr10", stackAr10.repOK());
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test291");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        boolean boolean1 = stackAr0.isFull();
        boolean boolean3 = stackAr0.equals((java.lang.Object) (byte) -1);
        org.autotest.StackAr stackAr5 = new org.autotest.StackAr((int) '4');
        boolean boolean6 = stackAr0.equals((java.lang.Object) '4');
        org.autotest.StackAr stackAr8 = new org.autotest.StackAr((int) 'a');
        boolean boolean10 = stackAr8.equals((java.lang.Object) (-1.0f));
        boolean boolean12 = stackAr8.equals((java.lang.Object) "");
        boolean boolean13 = stackAr0.equals((java.lang.Object) "");
        org.autotest.StackAr stackAr15 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean16 = stackAr15.isEmpty();
        boolean boolean17 = stackAr15.isEmpty();
        stackAr0.push((java.lang.Object) stackAr15);
        boolean boolean19 = stackAr0.isFull();
        int int20 = stackAr0.size();
        int int21 = stackAr0.size();
        java.lang.Object obj22 = stackAr0.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr0", stackAr0.repOK());
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test292");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr();
        boolean boolean2 = stackAr1.isFull();
        int int3 = stackAr1.size();
        boolean boolean4 = stackAr1.isEmpty();
        org.autotest.StackAr stackAr6 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean7 = stackAr6.isFull();
        java.lang.Class<?> wildcardClass8 = stackAr6.getClass();
        stackAr1.push((java.lang.Object) wildcardClass8);
        boolean boolean10 = stackAr0.equals((java.lang.Object) stackAr1);
        org.autotest.StackAr stackAr12 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean13 = stackAr12.isEmpty();
        boolean boolean14 = stackAr12.isEmpty();
        org.autotest.StackAr stackAr15 = new org.autotest.StackAr();
        java.lang.Class<?> wildcardClass16 = stackAr15.getClass();
        boolean boolean17 = stackAr12.equals((java.lang.Object) stackAr15);
        java.lang.Class<?> wildcardClass18 = stackAr15.getClass();
        stackAr0.push((java.lang.Object) wildcardClass18);
        java.lang.Object obj20 = stackAr0.top();
        boolean boolean21 = stackAr0.isEmpty();
        java.lang.Object obj22 = stackAr0.top();
        java.lang.Object obj23 = stackAr0.top();
        java.lang.Object obj24 = stackAr0.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr0", stackAr0.repOK());
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test293");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) 'a');
        boolean boolean3 = stackAr1.equals((java.lang.Object) (-1.0f));
        boolean boolean5 = stackAr1.equals((java.lang.Object) "");
        stackAr1.push((java.lang.Object) (-1.0d));
        java.lang.Object obj8 = stackAr1.top();
        java.lang.Object obj9 = stackAr1.top();
        boolean boolean10 = stackAr1.isFull();
        boolean boolean11 = stackAr1.isFull();
        org.autotest.StackAr stackAr13 = new org.autotest.StackAr((int) 'a');
        boolean boolean15 = stackAr13.equals((java.lang.Object) (-1.0f));
        boolean boolean16 = stackAr13.isFull();
        org.autotest.StackAr stackAr17 = new org.autotest.StackAr();
        boolean boolean18 = stackAr17.isFull();
        int int19 = stackAr17.size();
        boolean boolean20 = stackAr17.isEmpty();
        org.autotest.StackAr stackAr22 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean23 = stackAr22.isFull();
        java.lang.Class<?> wildcardClass24 = stackAr22.getClass();
        stackAr17.push((java.lang.Object) wildcardClass24);
        org.autotest.StackAr stackAr27 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean28 = stackAr27.isEmpty();
        boolean boolean29 = stackAr27.isEmpty();
        org.autotest.StackAr stackAr30 = new org.autotest.StackAr();
        java.lang.Class<?> wildcardClass31 = stackAr30.getClass();
        boolean boolean32 = stackAr27.equals((java.lang.Object) stackAr30);
        java.lang.Class<?> wildcardClass33 = stackAr30.getClass();
        stackAr17.push((java.lang.Object) wildcardClass33);
        stackAr13.push((java.lang.Object) stackAr17);
        java.lang.Class<?> wildcardClass36 = stackAr13.getClass();
        stackAr1.push((java.lang.Object) stackAr13);
        java.lang.Object obj38 = stackAr1.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr1", stackAr1.repOK());
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test294");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) 'a');
        boolean boolean3 = stackAr1.equals((java.lang.Object) (-1.0f));
        boolean boolean4 = stackAr1.isFull();
        org.autotest.StackAr stackAr5 = new org.autotest.StackAr();
        boolean boolean6 = stackAr5.isFull();
        int int7 = stackAr5.size();
        boolean boolean8 = stackAr5.isEmpty();
        org.autotest.StackAr stackAr10 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean11 = stackAr10.isFull();
        java.lang.Class<?> wildcardClass12 = stackAr10.getClass();
        stackAr5.push((java.lang.Object) wildcardClass12);
        org.autotest.StackAr stackAr15 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean16 = stackAr15.isEmpty();
        boolean boolean17 = stackAr15.isEmpty();
        org.autotest.StackAr stackAr18 = new org.autotest.StackAr();
        java.lang.Class<?> wildcardClass19 = stackAr18.getClass();
        boolean boolean20 = stackAr15.equals((java.lang.Object) stackAr18);
        java.lang.Class<?> wildcardClass21 = stackAr18.getClass();
        stackAr5.push((java.lang.Object) wildcardClass21);
        stackAr1.push((java.lang.Object) stackAr5);
        org.autotest.StackAr stackAr25 = new org.autotest.StackAr((int) (short) 1);
        boolean boolean26 = stackAr25.isFull();
        org.autotest.StackAr stackAr28 = new org.autotest.StackAr((int) (short) 1);
        boolean boolean29 = stackAr28.isFull();
        boolean boolean30 = stackAr25.equals((java.lang.Object) stackAr28);
        int int31 = stackAr28.size();
        org.autotest.StackAr stackAr33 = new org.autotest.StackAr((int) 'a');
        java.lang.String str34 = stackAr33.toString();
        stackAr33.push((java.lang.Object) 0.0f);
        org.autotest.StackAr stackAr38 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean39 = stackAr38.isFull();
        boolean boolean40 = stackAr38.isEmpty();
        stackAr33.push((java.lang.Object) boolean40);
        org.autotest.StackAr stackAr43 = new org.autotest.StackAr((int) '4');
        int int44 = stackAr43.size();
        java.lang.String str45 = stackAr43.toString();
        int int46 = stackAr43.size();
        boolean boolean47 = stackAr43.isEmpty();
        java.lang.String str48 = stackAr43.toString();
        boolean boolean49 = stackAr43.isFull();
        boolean boolean50 = stackAr33.equals((java.lang.Object) boolean49);
        stackAr28.push((java.lang.Object) boolean49);
        boolean boolean52 = stackAr1.equals((java.lang.Object) boolean49);
        java.lang.Object obj53 = stackAr1.top();
        java.lang.String str54 = stackAr1.toString();
        org.autotest.StackAr stackAr56 = new org.autotest.StackAr((int) '4');
        int int57 = stackAr56.size();
        boolean boolean58 = stackAr56.isEmpty();
        stackAr56.push((java.lang.Object) (byte) 0);
        java.lang.Object obj61 = new java.lang.Object();
        boolean boolean62 = stackAr56.equals(obj61);
        int int63 = stackAr56.size();
        boolean boolean64 = stackAr56.isEmpty();
        boolean boolean65 = stackAr56.isFull();
        boolean boolean66 = stackAr1.equals((java.lang.Object) stackAr56);
        java.lang.Object obj67 = stackAr1.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr1", stackAr1.repOK());
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test295");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '4');
        int int2 = stackAr1.size();
        int int3 = stackAr1.size();
        boolean boolean4 = stackAr1.isFull();
        org.autotest.StackAr stackAr6 = new org.autotest.StackAr((int) ' ');
        stackAr1.push((java.lang.Object) ' ');
        org.autotest.StackAr stackAr8 = new org.autotest.StackAr();
        boolean boolean9 = stackAr8.isFull();
        int int10 = stackAr8.size();
        boolean boolean11 = stackAr8.isEmpty();
        boolean boolean12 = stackAr8.isFull();
        boolean boolean13 = stackAr8.isFull();
        boolean boolean14 = stackAr8.isFull();
        boolean boolean15 = stackAr1.equals((java.lang.Object) boolean14);
        java.lang.String str16 = stackAr1.toString();
        java.lang.Object obj17 = null;
        boolean boolean18 = stackAr1.equals(obj17);
        java.lang.Object obj19 = stackAr1.top();
        java.lang.Object obj20 = stackAr1.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr1", stackAr1.repOK());
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test296");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '4');
        int int2 = stackAr1.size();
        boolean boolean3 = stackAr1.isEmpty();
        stackAr1.push((java.lang.Object) (byte) 0);
        java.lang.Object obj6 = new java.lang.Object();
        boolean boolean7 = stackAr1.equals(obj6);
        int int8 = stackAr1.size();
        boolean boolean9 = stackAr1.isEmpty();
        boolean boolean10 = stackAr1.isEmpty();
        org.autotest.StackAr stackAr12 = new org.autotest.StackAr((int) 'a');
        boolean boolean14 = stackAr12.equals((java.lang.Object) (-1.0f));
        boolean boolean15 = stackAr12.isFull();
        org.autotest.StackAr stackAr16 = new org.autotest.StackAr();
        boolean boolean17 = stackAr16.isFull();
        int int18 = stackAr16.size();
        boolean boolean19 = stackAr16.isEmpty();
        org.autotest.StackAr stackAr21 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean22 = stackAr21.isFull();
        java.lang.Class<?> wildcardClass23 = stackAr21.getClass();
        stackAr16.push((java.lang.Object) wildcardClass23);
        org.autotest.StackAr stackAr26 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean27 = stackAr26.isEmpty();
        boolean boolean28 = stackAr26.isEmpty();
        org.autotest.StackAr stackAr29 = new org.autotest.StackAr();
        java.lang.Class<?> wildcardClass30 = stackAr29.getClass();
        boolean boolean31 = stackAr26.equals((java.lang.Object) stackAr29);
        java.lang.Class<?> wildcardClass32 = stackAr29.getClass();
        stackAr16.push((java.lang.Object) wildcardClass32);
        stackAr12.push((java.lang.Object) stackAr16);
        boolean boolean35 = stackAr1.equals((java.lang.Object) stackAr12);
        java.lang.Object obj36 = stackAr1.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr1", stackAr1.repOK());
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test297");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '4');
        int int2 = stackAr1.size();
        boolean boolean3 = stackAr1.isEmpty();
        stackAr1.push((java.lang.Object) (byte) 0);
        java.lang.Object obj6 = new java.lang.Object();
        boolean boolean7 = stackAr1.equals(obj6);
        int int8 = stackAr1.size();
        boolean boolean9 = stackAr1.isEmpty();
        boolean boolean10 = stackAr1.isFull();
        java.lang.Object obj11 = stackAr1.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr1", stackAr1.repOK());
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test298");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        boolean boolean1 = stackAr0.isFull();
        int int2 = stackAr0.size();
        boolean boolean3 = stackAr0.isEmpty();
        org.autotest.StackAr stackAr5 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean6 = stackAr5.isFull();
        java.lang.Class<?> wildcardClass7 = stackAr5.getClass();
        stackAr0.push((java.lang.Object) wildcardClass7);
        org.autotest.StackAr stackAr10 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean11 = stackAr10.isEmpty();
        java.lang.Class<?> wildcardClass12 = stackAr10.getClass();
        boolean boolean13 = stackAr0.equals((java.lang.Object) wildcardClass12);
        boolean boolean14 = stackAr0.isFull();
        boolean boolean15 = stackAr0.isEmpty();
        org.autotest.StackAr stackAr17 = new org.autotest.StackAr(0);
        java.lang.Class<?> wildcardClass18 = stackAr17.getClass();
        boolean boolean19 = stackAr0.equals((java.lang.Object) wildcardClass18);
        java.lang.Object obj20 = stackAr0.top();
        org.autotest.StackAr stackAr22 = new org.autotest.StackAr((int) '4');
        int int23 = stackAr22.size();
        java.lang.String str24 = stackAr22.toString();
        java.lang.String str25 = stackAr22.toString();
        boolean boolean26 = stackAr22.isFull();
        stackAr0.push((java.lang.Object) boolean26);
        boolean boolean28 = stackAr0.isFull();
        java.lang.String str29 = stackAr0.toString();
        int int30 = stackAr0.size();
        java.lang.Object obj31 = stackAr0.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr0", stackAr0.repOK());
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test299");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        boolean boolean1 = stackAr0.isFull();
        int int2 = stackAr0.size();
        boolean boolean3 = stackAr0.isEmpty();
        org.autotest.StackAr stackAr5 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean6 = stackAr5.isFull();
        java.lang.Class<?> wildcardClass7 = stackAr5.getClass();
        stackAr0.push((java.lang.Object) wildcardClass7);
        org.autotest.StackAr stackAr10 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean11 = stackAr10.isEmpty();
        boolean boolean12 = stackAr10.isEmpty();
        org.autotest.StackAr stackAr13 = new org.autotest.StackAr();
        java.lang.Class<?> wildcardClass14 = stackAr13.getClass();
        boolean boolean15 = stackAr10.equals((java.lang.Object) stackAr13);
        java.lang.Class<?> wildcardClass16 = stackAr13.getClass();
        stackAr0.push((java.lang.Object) wildcardClass16);
        java.lang.Object obj18 = stackAr0.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr0", stackAr0.repOK());
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test300");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) 'a');
        boolean boolean3 = stackAr1.equals((java.lang.Object) (-1.0f));
        boolean boolean5 = stackAr1.equals((java.lang.Object) "");
        stackAr1.push((java.lang.Object) (-1.0d));
        java.lang.Object obj8 = stackAr1.top();
        java.lang.Object obj9 = stackAr1.top();
        boolean boolean10 = stackAr1.isFull();
        java.lang.Object obj11 = stackAr1.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr1", stackAr1.repOK());
    }
}

