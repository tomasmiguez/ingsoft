package org.autotest;

import org.junit.FixMethodOrder;
import org.junit.jupiter.api.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest4 {

    public static boolean debug = false;

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test201");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        boolean boolean1 = stackAr0.isFull();
        boolean boolean3 = stackAr0.equals((java.lang.Object) (byte) -1);
        java.lang.String str4 = stackAr0.toString();
        boolean boolean6 = stackAr0.equals((java.lang.Object) 10L);
        java.lang.String str7 = stackAr0.toString();
        org.autotest.StackAr stackAr9 = new org.autotest.StackAr((int) '4');
        stackAr9.push((java.lang.Object) (-1L));
        boolean boolean12 = stackAr9.isEmpty();
        boolean boolean13 = stackAr0.equals((java.lang.Object) stackAr9);
        org.autotest.StackAr stackAr15 = new org.autotest.StackAr((int) '4');
        int int16 = stackAr15.size();
        boolean boolean17 = stackAr15.isEmpty();
        stackAr15.push((java.lang.Object) (byte) 0);
        java.lang.Object obj20 = new java.lang.Object();
        boolean boolean21 = stackAr15.equals(obj20);
        boolean boolean22 = stackAr15.isEmpty();
        boolean boolean23 = stackAr15.isEmpty();
        org.autotest.StackAr stackAr25 = new org.autotest.StackAr((int) '4');
        int int26 = stackAr25.size();
        boolean boolean27 = stackAr25.isEmpty();
        stackAr25.push((java.lang.Object) (byte) 0);
        java.lang.Object obj30 = new java.lang.Object();
        boolean boolean31 = stackAr25.equals(obj30);
        boolean boolean32 = stackAr25.isEmpty();
        boolean boolean33 = stackAr25.isEmpty();
        java.lang.String str34 = stackAr25.toString();
        stackAr15.push((java.lang.Object) str34);
        java.lang.String str36 = stackAr15.toString();
        org.autotest.StackAr stackAr38 = new org.autotest.StackAr((int) '4');
        int int39 = stackAr38.size();
        java.lang.String str40 = stackAr38.toString();
        int int41 = stackAr38.size();
        org.autotest.StackAr stackAr42 = new org.autotest.StackAr();
        boolean boolean43 = stackAr42.isFull();
        boolean boolean45 = stackAr42.equals((java.lang.Object) (byte) -1);
        boolean boolean46 = stackAr38.equals((java.lang.Object) (byte) -1);
        java.lang.Object obj47 = null;
        stackAr38.push(obj47);
        int int49 = stackAr38.size();
        stackAr15.push((java.lang.Object) int49);
        boolean boolean51 = stackAr9.equals((java.lang.Object) int49);
        int int52 = stackAr9.size();
        org.autotest.StackAr stackAr54 = new org.autotest.StackAr((int) '4');
        int int55 = stackAr54.size();
        int int56 = stackAr54.size();
        boolean boolean57 = stackAr54.isFull();
        int int58 = stackAr54.size();
        org.autotest.StackAr stackAr60 = new org.autotest.StackAr((int) '4');
        int int61 = stackAr60.size();
        int int62 = stackAr60.size();
        boolean boolean63 = stackAr60.isFull();
        org.autotest.StackAr stackAr64 = new org.autotest.StackAr();
        boolean boolean65 = stackAr64.isFull();
        boolean boolean67 = stackAr64.equals((java.lang.Object) (byte) -1);
        org.autotest.StackAr stackAr69 = new org.autotest.StackAr((int) '4');
        boolean boolean70 = stackAr64.equals((java.lang.Object) '4');
        org.autotest.StackAr stackAr72 = new org.autotest.StackAr((int) 'a');
        boolean boolean74 = stackAr72.equals((java.lang.Object) (-1.0f));
        boolean boolean76 = stackAr72.equals((java.lang.Object) "");
        boolean boolean77 = stackAr64.equals((java.lang.Object) "");
        boolean boolean78 = stackAr64.isFull();
        stackAr60.push((java.lang.Object) stackAr64);
        org.autotest.StackAr stackAr81 = new org.autotest.StackAr(0);
        boolean boolean82 = stackAr60.equals((java.lang.Object) stackAr81);
        stackAr54.push((java.lang.Object) stackAr81);
        stackAr9.push((java.lang.Object) stackAr81);
        java.lang.Object obj85 = null;
        boolean boolean86 = stackAr9.equals(obj85);
        java.lang.Object obj87 = stackAr9.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr9", stackAr9.repOK());
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test202");
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
        int int19 = stackAr18.size();
        int int20 = stackAr18.size();
        boolean boolean21 = stackAr18.isFull();
        stackAr0.push((java.lang.Object) stackAr18);
        java.lang.Object obj23 = stackAr0.top();
        org.autotest.StackAr stackAr25 = new org.autotest.StackAr((int) '4');
        int int26 = stackAr25.size();
        boolean boolean27 = stackAr25.isEmpty();
        stackAr25.push((java.lang.Object) (byte) 0);
        java.lang.Object obj30 = new java.lang.Object();
        boolean boolean31 = stackAr25.equals(obj30);
        java.lang.String str32 = stackAr25.toString();
        java.lang.Object obj33 = stackAr25.top();
        stackAr0.push(obj33);
        java.lang.Object obj35 = stackAr0.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr0", stackAr0.repOK());
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test203");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '4');
        java.lang.String str2 = stackAr1.toString();
        java.lang.String str3 = stackAr1.toString();
        int int4 = stackAr1.size();
        boolean boolean5 = stackAr1.isFull();
        boolean boolean7 = stackAr1.equals((java.lang.Object) ' ');
        java.lang.Object obj8 = new java.lang.Object();
        java.lang.Class<?> wildcardClass9 = obj8.getClass();
        stackAr1.push((java.lang.Object) wildcardClass9);
        java.lang.Object obj11 = stackAr1.top();
        int int12 = stackAr1.size();
        java.lang.Object obj13 = stackAr1.top();
        int int14 = stackAr1.size();
        java.lang.Object obj15 = stackAr1.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr1", stackAr1.repOK());
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test204");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '4');
        java.lang.String str2 = stackAr1.toString();
        java.lang.String str3 = stackAr1.toString();
        int int4 = stackAr1.size();
        int int5 = stackAr1.size();
        java.lang.String str6 = stackAr1.toString();
        org.autotest.StackAr stackAr8 = new org.autotest.StackAr((int) (short) 100);
        java.lang.String str9 = stackAr8.toString();
        boolean boolean10 = stackAr8.isEmpty();
        java.lang.String str11 = stackAr8.toString();
        int int12 = stackAr8.size();
        stackAr1.push((java.lang.Object) stackAr8);
        boolean boolean14 = stackAr1.isFull();
        boolean boolean15 = stackAr1.isFull();
        java.lang.Object obj16 = stackAr1.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr1", stackAr1.repOK());
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test205");
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
        boolean boolean39 = stackAr1.isFull();
        org.autotest.StackAr stackAr41 = new org.autotest.StackAr((int) 'a');
        boolean boolean43 = stackAr41.equals((java.lang.Object) (-1.0f));
        boolean boolean45 = stackAr41.equals((java.lang.Object) "");
        stackAr41.push((java.lang.Object) (-1.0d));
        java.lang.Object obj48 = stackAr41.top();
        org.autotest.StackAr stackAr50 = new org.autotest.StackAr((int) 'a');
        boolean boolean52 = stackAr50.equals((java.lang.Object) (-1.0f));
        int int53 = stackAr50.size();
        org.autotest.StackAr stackAr54 = new org.autotest.StackAr();
        boolean boolean55 = stackAr54.isFull();
        int int56 = stackAr54.size();
        boolean boolean57 = stackAr54.isEmpty();
        org.autotest.StackAr stackAr59 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean60 = stackAr59.isFull();
        java.lang.Class<?> wildcardClass61 = stackAr59.getClass();
        stackAr54.push((java.lang.Object) wildcardClass61);
        boolean boolean63 = stackAr50.equals((java.lang.Object) stackAr54);
        stackAr41.push((java.lang.Object) stackAr54);
        boolean boolean65 = stackAr1.equals((java.lang.Object) stackAr41);
        org.autotest.StackAr stackAr67 = new org.autotest.StackAr((int) 'a');
        boolean boolean69 = stackAr67.equals((java.lang.Object) (-1.0f));
        int int70 = stackAr67.size();
        org.autotest.StackAr stackAr71 = new org.autotest.StackAr();
        boolean boolean72 = stackAr71.isFull();
        int int73 = stackAr71.size();
        boolean boolean74 = stackAr71.isEmpty();
        org.autotest.StackAr stackAr76 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean77 = stackAr76.isFull();
        java.lang.Class<?> wildcardClass78 = stackAr76.getClass();
        stackAr71.push((java.lang.Object) wildcardClass78);
        boolean boolean80 = stackAr67.equals((java.lang.Object) stackAr71);
        boolean boolean81 = stackAr67.isFull();
        java.lang.String str82 = stackAr67.toString();
        stackAr41.push((java.lang.Object) str82);
        boolean boolean84 = stackAr41.isEmpty();
        java.lang.Object obj85 = stackAr41.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr41", stackAr41.repOK());
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test206");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        boolean boolean1 = stackAr0.isFull();
        boolean boolean3 = stackAr0.equals((java.lang.Object) (byte) -1);
        java.lang.String str4 = stackAr0.toString();
        boolean boolean6 = stackAr0.equals((java.lang.Object) 10L);
        java.lang.String str7 = stackAr0.toString();
        org.autotest.StackAr stackAr9 = new org.autotest.StackAr((int) '4');
        stackAr9.push((java.lang.Object) (-1L));
        boolean boolean12 = stackAr9.isEmpty();
        boolean boolean13 = stackAr0.equals((java.lang.Object) stackAr9);
        org.autotest.StackAr stackAr15 = new org.autotest.StackAr((int) (short) 1);
        boolean boolean16 = stackAr15.isFull();
        org.autotest.StackAr stackAr18 = new org.autotest.StackAr((int) (short) 1);
        boolean boolean19 = stackAr18.isFull();
        boolean boolean20 = stackAr15.equals((java.lang.Object) stackAr18);
        boolean boolean21 = stackAr15.isFull();
        org.autotest.StackAr stackAr23 = new org.autotest.StackAr((int) '4');
        stackAr23.push((java.lang.Object) (-1L));
        boolean boolean26 = stackAr23.isEmpty();
        java.lang.String str27 = stackAr23.toString();
        boolean boolean28 = stackAr15.equals((java.lang.Object) stackAr23);
        java.lang.Class<?> wildcardClass29 = stackAr15.getClass();
        stackAr0.push((java.lang.Object) wildcardClass29);
        java.lang.Object obj31 = stackAr0.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr0", stackAr0.repOK());
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test207");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) 'a');
        stackAr1.push((java.lang.Object) 'a');
        java.lang.Object obj4 = stackAr1.top();
        boolean boolean5 = stackAr1.isEmpty();
        java.lang.Object obj6 = stackAr1.top();
        org.autotest.StackAr stackAr8 = new org.autotest.StackAr((int) 'a');
        java.lang.String str9 = stackAr8.toString();
        stackAr8.push((java.lang.Object) 0.0f);
        org.autotest.StackAr stackAr13 = new org.autotest.StackAr((int) '4');
        java.lang.String str14 = stackAr13.toString();
        boolean boolean15 = stackAr8.equals((java.lang.Object) stackAr13);
        boolean boolean16 = stackAr1.equals((java.lang.Object) stackAr8);
        boolean boolean17 = stackAr1.isFull();
        java.lang.Object obj18 = stackAr1.top();
        java.lang.Object obj19 = stackAr1.top();
        java.lang.Object obj20 = stackAr1.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr1", stackAr1.repOK());
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test208");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) (short) 100);
        java.lang.String str2 = stackAr1.toString();
        boolean boolean3 = stackAr1.isEmpty();
        java.lang.String str4 = stackAr1.toString();
        org.autotest.StackAr stackAr5 = new org.autotest.StackAr();
        boolean boolean6 = stackAr5.isFull();
        boolean boolean8 = stackAr5.equals((java.lang.Object) (byte) -1);
        org.autotest.StackAr stackAr10 = new org.autotest.StackAr((int) '4');
        boolean boolean11 = stackAr5.equals((java.lang.Object) '4');
        org.autotest.StackAr stackAr13 = new org.autotest.StackAr((int) 'a');
        boolean boolean15 = stackAr13.equals((java.lang.Object) (-1.0f));
        boolean boolean17 = stackAr13.equals((java.lang.Object) "");
        boolean boolean18 = stackAr5.equals((java.lang.Object) "");
        org.autotest.StackAr stackAr20 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean21 = stackAr20.isEmpty();
        boolean boolean22 = stackAr20.isEmpty();
        stackAr5.push((java.lang.Object) stackAr20);
        boolean boolean24 = stackAr5.isFull();
        org.autotest.StackAr stackAr26 = new org.autotest.StackAr((int) 'a');
        java.lang.String str27 = stackAr26.toString();
        stackAr26.push((java.lang.Object) 0.0f);
        org.autotest.StackAr stackAr31 = new org.autotest.StackAr((int) '4');
        java.lang.String str32 = stackAr31.toString();
        boolean boolean33 = stackAr26.equals((java.lang.Object) stackAr31);
        org.autotest.StackAr stackAr35 = new org.autotest.StackAr((int) '4');
        int int36 = stackAr35.size();
        java.lang.Class<?> wildcardClass37 = stackAr35.getClass();
        stackAr31.push((java.lang.Object) stackAr35);
        int int39 = stackAr31.size();
        boolean boolean40 = stackAr31.isEmpty();
        stackAr5.push((java.lang.Object) stackAr31);
        boolean boolean42 = stackAr5.isFull();
        stackAr1.push((java.lang.Object) stackAr5);
        java.lang.Object obj44 = stackAr5.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr5", stackAr5.repOK());
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test209");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '4');
        java.lang.String str2 = stackAr1.toString();
        java.lang.String str3 = stackAr1.toString();
        int int4 = stackAr1.size();
        org.autotest.StackAr stackAr5 = new org.autotest.StackAr();
        java.lang.String str6 = stackAr5.toString();
        boolean boolean7 = stackAr5.isEmpty();
        boolean boolean8 = stackAr1.equals((java.lang.Object) stackAr5);
        org.autotest.StackAr stackAr9 = new org.autotest.StackAr();
        boolean boolean10 = stackAr9.isFull();
        int int11 = stackAr9.size();
        boolean boolean12 = stackAr9.isEmpty();
        org.autotest.StackAr stackAr14 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean15 = stackAr14.isFull();
        java.lang.Class<?> wildcardClass16 = stackAr14.getClass();
        stackAr9.push((java.lang.Object) wildcardClass16);
        org.autotest.StackAr stackAr18 = new org.autotest.StackAr();
        int int19 = stackAr18.size();
        java.lang.String str20 = stackAr18.toString();
        stackAr9.push((java.lang.Object) stackAr18);
        java.lang.Object obj22 = stackAr9.top();
        java.lang.Object obj23 = stackAr9.top();
        stackAr1.push(obj23);
        org.autotest.StackAr stackAr26 = new org.autotest.StackAr((int) 'a');
        stackAr26.push((java.lang.Object) 'a');
        java.lang.Object obj29 = stackAr26.top();
        boolean boolean30 = stackAr26.isEmpty();
        int int31 = stackAr26.size();
        java.lang.Object obj32 = stackAr26.top();
        boolean boolean33 = stackAr1.equals((java.lang.Object) stackAr26);
        org.autotest.StackAr stackAr34 = new org.autotest.StackAr();
        boolean boolean35 = stackAr34.isFull();
        boolean boolean37 = stackAr34.equals((java.lang.Object) (byte) -1);
        org.autotest.StackAr stackAr39 = new org.autotest.StackAr((int) '4');
        boolean boolean40 = stackAr34.equals((java.lang.Object) '4');
        org.autotest.StackAr stackAr42 = new org.autotest.StackAr((int) 'a');
        boolean boolean44 = stackAr42.equals((java.lang.Object) (-1.0f));
        boolean boolean46 = stackAr42.equals((java.lang.Object) "");
        boolean boolean47 = stackAr34.equals((java.lang.Object) "");
        java.lang.String str48 = stackAr34.toString();
        boolean boolean49 = stackAr34.isEmpty();
        int int50 = stackAr34.size();
        java.lang.Class<?> wildcardClass51 = stackAr34.getClass();
        boolean boolean52 = stackAr1.equals((java.lang.Object) stackAr34);
        org.autotest.StackAr stackAr54 = new org.autotest.StackAr((int) '4');
        int int55 = stackAr54.size();
        boolean boolean56 = stackAr54.isEmpty();
        int int57 = stackAr54.size();
        java.lang.String str58 = stackAr54.toString();
        org.autotest.StackAr stackAr60 = new org.autotest.StackAr((int) 'a');
        boolean boolean62 = stackAr60.equals((java.lang.Object) (-1.0f));
        int int63 = stackAr60.size();
        org.autotest.StackAr stackAr65 = new org.autotest.StackAr((int) '4');
        int int66 = stackAr65.size();
        int int67 = stackAr65.size();
        boolean boolean68 = stackAr65.isFull();
        boolean boolean69 = stackAr65.isEmpty();
        stackAr60.push((java.lang.Object) boolean69);
        stackAr54.push((java.lang.Object) stackAr60);
        org.autotest.StackAr stackAr73 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean74 = stackAr73.isEmpty();
        boolean boolean75 = stackAr73.isFull();
        boolean boolean76 = stackAr73.isEmpty();
        boolean boolean77 = stackAr60.equals((java.lang.Object) stackAr73);
        stackAr1.push((java.lang.Object) boolean77);
        java.lang.Object obj79 = stackAr1.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr1", stackAr1.repOK());
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test210");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) 'a');
        java.lang.String str2 = stackAr1.toString();
        stackAr1.push((java.lang.Object) 0.0f);
        org.autotest.StackAr stackAr6 = new org.autotest.StackAr((int) '4');
        java.lang.String str7 = stackAr6.toString();
        boolean boolean8 = stackAr1.equals((java.lang.Object) stackAr6);
        java.lang.String str9 = stackAr6.toString();
        boolean boolean10 = stackAr6.isEmpty();
        boolean boolean11 = stackAr6.isFull();
        boolean boolean12 = stackAr6.isEmpty();
        org.autotest.StackAr stackAr14 = new org.autotest.StackAr(10);
        boolean boolean15 = stackAr6.equals((java.lang.Object) stackAr14);
        org.autotest.StackAr stackAr17 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean18 = stackAr17.isEmpty();
        int int19 = stackAr17.size();
        boolean boolean20 = stackAr17.isFull();
        boolean boolean21 = stackAr17.isFull();
        int int22 = stackAr17.size();
        int int23 = stackAr17.size();
        stackAr6.push((java.lang.Object) stackAr17);
        org.autotest.StackAr stackAr25 = new org.autotest.StackAr();
        boolean boolean26 = stackAr25.isFull();
        boolean boolean28 = stackAr25.equals((java.lang.Object) (byte) -1);
        org.autotest.StackAr stackAr30 = new org.autotest.StackAr((int) '4');
        boolean boolean31 = stackAr25.equals((java.lang.Object) '4');
        org.autotest.StackAr stackAr33 = new org.autotest.StackAr((int) 'a');
        boolean boolean35 = stackAr33.equals((java.lang.Object) (-1.0f));
        boolean boolean37 = stackAr33.equals((java.lang.Object) "");
        boolean boolean38 = stackAr25.equals((java.lang.Object) "");
        org.autotest.StackAr stackAr40 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean41 = stackAr40.isEmpty();
        boolean boolean42 = stackAr40.isEmpty();
        stackAr25.push((java.lang.Object) stackAr40);
        boolean boolean44 = stackAr25.isFull();
        org.autotest.StackAr stackAr46 = new org.autotest.StackAr((int) 'a');
        boolean boolean48 = stackAr46.equals((java.lang.Object) (-1.0f));
        java.lang.String str49 = stackAr46.toString();
        int int50 = stackAr46.size();
        stackAr25.push((java.lang.Object) int50);
        org.autotest.StackAr stackAr53 = new org.autotest.StackAr((int) ' ');
        boolean boolean54 = stackAr25.equals((java.lang.Object) ' ');
        org.autotest.StackAr stackAr55 = new org.autotest.StackAr();
        boolean boolean56 = stackAr55.isFull();
        int int57 = stackAr55.size();
        boolean boolean58 = stackAr55.isEmpty();
        boolean boolean59 = stackAr55.isFull();
        boolean boolean60 = stackAr55.isFull();
        boolean boolean62 = stackAr55.equals((java.lang.Object) "[0.0,true]");
        stackAr25.push((java.lang.Object) stackAr55);
        stackAr6.push((java.lang.Object) stackAr55);
        java.lang.Object obj65 = stackAr6.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr6", stackAr6.repOK());
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test211");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        boolean boolean1 = stackAr0.isFull();
        int int2 = stackAr0.size();
        boolean boolean3 = stackAr0.isEmpty();
        org.autotest.StackAr stackAr5 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean6 = stackAr5.isFull();
        java.lang.Class<?> wildcardClass7 = stackAr5.getClass();
        stackAr0.push((java.lang.Object) wildcardClass7);
        java.lang.Object obj9 = stackAr0.top();
        java.lang.Object obj10 = stackAr0.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr0", stackAr0.repOK());
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test212");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '4');
        int int2 = stackAr1.size();
        boolean boolean3 = stackAr1.isEmpty();
        stackAr1.push((java.lang.Object) (byte) 0);
        java.lang.String str6 = stackAr1.toString();
        int int7 = stackAr1.size();
        boolean boolean8 = stackAr1.isEmpty();
        org.autotest.StackAr stackAr9 = new org.autotest.StackAr();
        boolean boolean10 = stackAr9.isFull();
        boolean boolean12 = stackAr9.equals((java.lang.Object) (byte) -1);
        java.lang.String str13 = stackAr9.toString();
        int int14 = stackAr9.size();
        org.autotest.StackAr stackAr15 = new org.autotest.StackAr();
        boolean boolean16 = stackAr15.isFull();
        boolean boolean18 = stackAr15.equals((java.lang.Object) (byte) -1);
        int int19 = stackAr15.size();
        boolean boolean20 = stackAr9.equals((java.lang.Object) int19);
        org.autotest.StackAr stackAr22 = new org.autotest.StackAr((int) 'a');
        stackAr22.push((java.lang.Object) 'a');
        java.lang.Object obj25 = stackAr22.top();
        boolean boolean26 = stackAr22.isEmpty();
        java.lang.String str27 = stackAr22.toString();
        boolean boolean28 = stackAr22.isFull();
        java.lang.Class<?> wildcardClass29 = stackAr22.getClass();
        stackAr9.push((java.lang.Object) wildcardClass29);
        boolean boolean31 = stackAr1.equals((java.lang.Object) stackAr9);
        java.lang.Object obj32 = stackAr9.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr9", stackAr9.repOK());
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test213");
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
        java.lang.Object obj15 = stackAr0.top();
        java.lang.String str16 = stackAr0.toString();
        java.lang.Object obj17 = stackAr0.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr0", stackAr0.repOK());
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test214");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '4');
        int int2 = stackAr1.size();
        int int3 = stackAr1.size();
        boolean boolean4 = stackAr1.isFull();
        org.autotest.StackAr stackAr6 = new org.autotest.StackAr((int) ' ');
        stackAr1.push((java.lang.Object) ' ');
        java.lang.Object obj8 = stackAr1.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr1", stackAr1.repOK());
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test215");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '4');
        java.lang.String str2 = stackAr1.toString();
        java.lang.String str3 = stackAr1.toString();
        int int4 = stackAr1.size();
        int int5 = stackAr1.size();
        org.autotest.StackAr stackAr7 = new org.autotest.StackAr((int) (short) 1);
        org.autotest.StackAr stackAr9 = new org.autotest.StackAr((int) 'a');
        boolean boolean11 = stackAr9.equals((java.lang.Object) (-1.0f));
        boolean boolean12 = stackAr9.isFull();
        org.autotest.StackAr stackAr13 = new org.autotest.StackAr();
        boolean boolean14 = stackAr13.isFull();
        int int15 = stackAr13.size();
        boolean boolean16 = stackAr13.isEmpty();
        org.autotest.StackAr stackAr18 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean19 = stackAr18.isFull();
        java.lang.Class<?> wildcardClass20 = stackAr18.getClass();
        stackAr13.push((java.lang.Object) wildcardClass20);
        org.autotest.StackAr stackAr23 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean24 = stackAr23.isEmpty();
        boolean boolean25 = stackAr23.isEmpty();
        org.autotest.StackAr stackAr26 = new org.autotest.StackAr();
        java.lang.Class<?> wildcardClass27 = stackAr26.getClass();
        boolean boolean28 = stackAr23.equals((java.lang.Object) stackAr26);
        java.lang.Class<?> wildcardClass29 = stackAr26.getClass();
        stackAr13.push((java.lang.Object) wildcardClass29);
        stackAr9.push((java.lang.Object) stackAr13);
        stackAr7.push((java.lang.Object) stackAr13);
        org.autotest.StackAr stackAr34 = new org.autotest.StackAr((int) 'a');
        boolean boolean35 = stackAr34.isFull();
        java.lang.Class<?> wildcardClass36 = stackAr34.getClass();
        boolean boolean37 = stackAr7.equals((java.lang.Object) wildcardClass36);
        int int38 = stackAr7.size();
        boolean boolean39 = stackAr1.equals((java.lang.Object) stackAr7);
        int int40 = stackAr7.size();
        boolean boolean41 = stackAr7.isFull();
        java.lang.String str42 = stackAr7.toString();
        org.autotest.StackAr stackAr43 = new org.autotest.StackAr();
        boolean boolean44 = stackAr43.isFull();
        int int45 = stackAr43.size();
        boolean boolean46 = stackAr43.isEmpty();
        org.autotest.StackAr stackAr48 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean49 = stackAr48.isFull();
        java.lang.Class<?> wildcardClass50 = stackAr48.getClass();
        stackAr43.push((java.lang.Object) wildcardClass50);
        org.autotest.StackAr stackAr53 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean54 = stackAr53.isEmpty();
        boolean boolean55 = stackAr53.isEmpty();
        org.autotest.StackAr stackAr56 = new org.autotest.StackAr();
        java.lang.Class<?> wildcardClass57 = stackAr56.getClass();
        boolean boolean58 = stackAr53.equals((java.lang.Object) stackAr56);
        java.lang.Class<?> wildcardClass59 = stackAr56.getClass();
        stackAr43.push((java.lang.Object) wildcardClass59);
        boolean boolean61 = stackAr7.equals((java.lang.Object) stackAr43);
        java.lang.Object obj62 = stackAr7.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr7", stackAr7.repOK());
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test216");
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
        org.autotest.StackAr stackAr22 = new org.autotest.StackAr((int) '4');
        int int23 = stackAr22.size();
        boolean boolean24 = stackAr22.isEmpty();
        stackAr22.push((java.lang.Object) (byte) 0);
        java.lang.String str27 = stackAr22.toString();
        org.autotest.StackAr stackAr29 = new org.autotest.StackAr((int) '4');
        int int30 = stackAr29.size();
        int int31 = stackAr29.size();
        boolean boolean32 = stackAr29.isFull();
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
        stackAr29.push((java.lang.Object) stackAr33);
        org.autotest.StackAr stackAr49 = new org.autotest.StackAr();
        int int50 = stackAr49.size();
        int int51 = stackAr49.size();
        stackAr33.push((java.lang.Object) int51);
        boolean boolean53 = stackAr33.isFull();
        stackAr22.push((java.lang.Object) stackAr33);
        org.autotest.StackAr stackAr56 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean57 = stackAr56.isFull();
        boolean boolean58 = stackAr56.isEmpty();
        java.lang.String str59 = stackAr56.toString();
        int int60 = stackAr56.size();
        boolean boolean61 = stackAr22.equals((java.lang.Object) int60);
        stackAr1.push((java.lang.Object) stackAr22);
        int int63 = stackAr22.size();
        java.lang.Object obj64 = stackAr22.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr22", stackAr22.repOK());
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test217");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '4');
        int int2 = stackAr1.size();
        boolean boolean3 = stackAr1.isEmpty();
        stackAr1.push((java.lang.Object) (byte) 0);
        java.lang.String str6 = stackAr1.toString();
        org.autotest.StackAr stackAr8 = new org.autotest.StackAr((int) '4');
        int int9 = stackAr8.size();
        int int10 = stackAr8.size();
        boolean boolean11 = stackAr8.isFull();
        org.autotest.StackAr stackAr12 = new org.autotest.StackAr();
        boolean boolean13 = stackAr12.isFull();
        boolean boolean15 = stackAr12.equals((java.lang.Object) (byte) -1);
        org.autotest.StackAr stackAr17 = new org.autotest.StackAr((int) '4');
        boolean boolean18 = stackAr12.equals((java.lang.Object) '4');
        org.autotest.StackAr stackAr20 = new org.autotest.StackAr((int) 'a');
        boolean boolean22 = stackAr20.equals((java.lang.Object) (-1.0f));
        boolean boolean24 = stackAr20.equals((java.lang.Object) "");
        boolean boolean25 = stackAr12.equals((java.lang.Object) "");
        boolean boolean26 = stackAr12.isFull();
        stackAr8.push((java.lang.Object) stackAr12);
        org.autotest.StackAr stackAr28 = new org.autotest.StackAr();
        int int29 = stackAr28.size();
        int int30 = stackAr28.size();
        stackAr12.push((java.lang.Object) int30);
        boolean boolean32 = stackAr12.isFull();
        stackAr1.push((java.lang.Object) stackAr12);
        java.lang.String str34 = stackAr1.toString();
        java.lang.Object obj35 = stackAr1.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr1", stackAr1.repOK());
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test218");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) 'a');
        boolean boolean3 = stackAr1.equals((java.lang.Object) (-1.0f));
        boolean boolean5 = stackAr1.equals((java.lang.Object) "");
        stackAr1.push((java.lang.Object) (-1.0d));
        java.lang.Object obj8 = stackAr1.top();
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
        stackAr1.push((java.lang.Object) stackAr14);
        boolean boolean25 = stackAr1.isEmpty();
        java.lang.Object obj26 = stackAr1.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr1", stackAr1.repOK());
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test219");
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
        boolean boolean21 = stackAr10.isFull();
        java.lang.String str22 = stackAr10.toString();
        boolean boolean23 = stackAr10.isEmpty();
        java.lang.Object obj24 = stackAr10.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr10", stackAr10.repOK());
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test220");
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
        org.autotest.StackAr stackAr18 = new org.autotest.StackAr();
        boolean boolean19 = stackAr18.isFull();
        int int20 = stackAr18.size();
        boolean boolean21 = stackAr18.isEmpty();
        org.autotest.StackAr stackAr23 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean24 = stackAr23.isFull();
        java.lang.Class<?> wildcardClass25 = stackAr23.getClass();
        stackAr18.push((java.lang.Object) wildcardClass25);
        org.autotest.StackAr stackAr28 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean29 = stackAr28.isEmpty();
        java.lang.Class<?> wildcardClass30 = stackAr28.getClass();
        boolean boolean31 = stackAr18.equals((java.lang.Object) wildcardClass30);
        boolean boolean32 = stackAr18.isFull();
        boolean boolean33 = stackAr18.isEmpty();
        java.lang.Object obj34 = stackAr18.top();
        stackAr0.push((java.lang.Object) stackAr18);
        java.lang.Object obj36 = stackAr18.top();
        java.lang.Object obj37 = stackAr18.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr18", stackAr18.repOK());
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test221");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) 'a');
        boolean boolean3 = stackAr1.equals((java.lang.Object) (-1.0f));
        boolean boolean5 = stackAr1.equals((java.lang.Object) "");
        stackAr1.push((java.lang.Object) (-1.0d));
        java.lang.Object obj8 = stackAr1.top();
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
        stackAr1.push((java.lang.Object) stackAr14);
        org.autotest.StackAr stackAr26 = new org.autotest.StackAr((int) 'a');
        boolean boolean28 = stackAr26.equals((java.lang.Object) (-1.0f));
        boolean boolean30 = stackAr26.equals((java.lang.Object) "");
        stackAr26.push((java.lang.Object) (-1.0d));
        org.autotest.StackAr stackAr33 = new org.autotest.StackAr();
        boolean boolean34 = stackAr33.isFull();
        boolean boolean36 = stackAr33.equals((java.lang.Object) (byte) -1);
        java.lang.String str37 = stackAr33.toString();
        boolean boolean39 = stackAr33.equals((java.lang.Object) 10L);
        java.lang.String str40 = stackAr33.toString();
        org.autotest.StackAr stackAr42 = new org.autotest.StackAr((int) '4');
        stackAr42.push((java.lang.Object) (-1L));
        boolean boolean45 = stackAr42.isEmpty();
        boolean boolean46 = stackAr33.equals((java.lang.Object) stackAr42);
        boolean boolean47 = stackAr26.equals((java.lang.Object) stackAr33);
        org.autotest.StackAr stackAr49 = new org.autotest.StackAr((int) (byte) 10);
        boolean boolean50 = stackAr49.isEmpty();
        stackAr33.push((java.lang.Object) stackAr49);
        boolean boolean52 = stackAr1.equals((java.lang.Object) stackAr33);
        org.autotest.StackAr stackAr54 = new org.autotest.StackAr((int) '4');
        int int55 = stackAr54.size();
        boolean boolean56 = stackAr54.isEmpty();
        stackAr54.push((java.lang.Object) (byte) 0);
        java.lang.Object obj59 = new java.lang.Object();
        boolean boolean60 = stackAr54.equals(obj59);
        boolean boolean61 = stackAr54.isEmpty();
        boolean boolean62 = stackAr54.isEmpty();
        org.autotest.StackAr stackAr64 = new org.autotest.StackAr((int) '4');
        int int65 = stackAr64.size();
        boolean boolean66 = stackAr64.isEmpty();
        stackAr64.push((java.lang.Object) (byte) 0);
        java.lang.Object obj69 = new java.lang.Object();
        boolean boolean70 = stackAr64.equals(obj69);
        boolean boolean71 = stackAr64.isEmpty();
        boolean boolean72 = stackAr64.isEmpty();
        java.lang.String str73 = stackAr64.toString();
        stackAr54.push((java.lang.Object) str73);
        java.lang.String str75 = stackAr54.toString();
        org.autotest.StackAr stackAr77 = new org.autotest.StackAr((int) '4');
        int int78 = stackAr77.size();
        java.lang.String str79 = stackAr77.toString();
        int int80 = stackAr77.size();
        org.autotest.StackAr stackAr81 = new org.autotest.StackAr();
        boolean boolean82 = stackAr81.isFull();
        boolean boolean84 = stackAr81.equals((java.lang.Object) (byte) -1);
        boolean boolean85 = stackAr77.equals((java.lang.Object) (byte) -1);
        java.lang.Object obj86 = null;
        stackAr77.push(obj86);
        int int88 = stackAr77.size();
        stackAr54.push((java.lang.Object) int88);
        java.lang.Object obj90 = stackAr54.top();
        boolean boolean91 = stackAr33.equals((java.lang.Object) stackAr54);
        java.lang.Object obj92 = stackAr54.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr54", stackAr54.repOK());
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test222");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) 'a');
        stackAr1.push((java.lang.Object) 'a');
        java.lang.Object obj4 = stackAr1.top();
        boolean boolean5 = stackAr1.isEmpty();
        java.lang.Object obj6 = stackAr1.top();
        org.autotest.StackAr stackAr8 = new org.autotest.StackAr((int) 'a');
        java.lang.String str9 = stackAr8.toString();
        stackAr8.push((java.lang.Object) 0.0f);
        org.autotest.StackAr stackAr13 = new org.autotest.StackAr((int) '4');
        java.lang.String str14 = stackAr13.toString();
        boolean boolean15 = stackAr8.equals((java.lang.Object) stackAr13);
        boolean boolean16 = stackAr1.equals((java.lang.Object) stackAr8);
        java.lang.String str17 = stackAr8.toString();
        org.autotest.StackAr stackAr19 = new org.autotest.StackAr((int) 'a');
        java.lang.String str20 = stackAr19.toString();
        stackAr19.push((java.lang.Object) 0.0f);
        org.autotest.StackAr stackAr24 = new org.autotest.StackAr((int) '4');
        java.lang.String str25 = stackAr24.toString();
        boolean boolean26 = stackAr19.equals((java.lang.Object) stackAr24);
        boolean boolean27 = stackAr19.isEmpty();
        boolean boolean28 = stackAr19.isEmpty();
        boolean boolean29 = stackAr8.equals((java.lang.Object) boolean28);
        java.lang.Object obj30 = stackAr8.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr8", stackAr8.repOK());
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test223");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) 'a');
        java.lang.String str2 = stackAr1.toString();
        stackAr1.push((java.lang.Object) 0.0f);
        org.autotest.StackAr stackAr6 = new org.autotest.StackAr((int) '4');
        java.lang.String str7 = stackAr6.toString();
        boolean boolean8 = stackAr1.equals((java.lang.Object) stackAr6);
        org.autotest.StackAr stackAr9 = new org.autotest.StackAr();
        boolean boolean10 = stackAr9.isFull();
        boolean boolean12 = stackAr9.equals((java.lang.Object) (byte) -1);
        org.autotest.StackAr stackAr14 = new org.autotest.StackAr((int) '4');
        boolean boolean15 = stackAr9.equals((java.lang.Object) '4');
        org.autotest.StackAr stackAr17 = new org.autotest.StackAr((int) 'a');
        boolean boolean19 = stackAr17.equals((java.lang.Object) (-1.0f));
        boolean boolean21 = stackAr17.equals((java.lang.Object) "");
        boolean boolean22 = stackAr9.equals((java.lang.Object) "");
        org.autotest.StackAr stackAr24 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean25 = stackAr24.isEmpty();
        boolean boolean26 = stackAr24.isEmpty();
        stackAr9.push((java.lang.Object) stackAr24);
        boolean boolean28 = stackAr24.isEmpty();
        stackAr6.push((java.lang.Object) boolean28);
        java.lang.Object obj30 = stackAr6.top();
        java.lang.Object obj31 = stackAr6.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr6", stackAr6.repOK());
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test224");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean2 = stackAr1.isFull();
        int int3 = stackAr1.size();
        org.autotest.StackAr stackAr5 = new org.autotest.StackAr((int) 'a');
        java.lang.String str6 = stackAr5.toString();
        stackAr5.push((java.lang.Object) 0.0f);
        org.autotest.StackAr stackAr10 = new org.autotest.StackAr((int) '4');
        java.lang.String str11 = stackAr10.toString();
        boolean boolean12 = stackAr5.equals((java.lang.Object) stackAr10);
        stackAr10.push((java.lang.Object) 1.0f);
        boolean boolean15 = stackAr1.equals((java.lang.Object) stackAr10);
        boolean boolean16 = stackAr10.isEmpty();
        java.lang.Object obj17 = stackAr10.top();
        boolean boolean18 = stackAr10.isFull();
        boolean boolean19 = stackAr10.isFull();
        java.lang.Object obj20 = stackAr10.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr10", stackAr10.repOK());
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test225");
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
        java.lang.Object obj24 = stackAr10.top();
        java.lang.Object obj25 = stackAr10.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr10", stackAr10.repOK());
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test226");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean2 = stackAr1.isFull();
        int int3 = stackAr1.size();
        org.autotest.StackAr stackAr5 = new org.autotest.StackAr((int) 'a');
        java.lang.String str6 = stackAr5.toString();
        stackAr5.push((java.lang.Object) 0.0f);
        org.autotest.StackAr stackAr10 = new org.autotest.StackAr((int) '4');
        java.lang.String str11 = stackAr10.toString();
        boolean boolean12 = stackAr5.equals((java.lang.Object) stackAr10);
        stackAr10.push((java.lang.Object) 1.0f);
        boolean boolean15 = stackAr1.equals((java.lang.Object) stackAr10);
        boolean boolean16 = stackAr10.isEmpty();
        int int17 = stackAr10.size();
        boolean boolean18 = stackAr10.isFull();
        java.lang.Object obj19 = stackAr10.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr10", stackAr10.repOK());
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test227");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) 'a');
        java.lang.String str2 = stackAr1.toString();
        stackAr1.push((java.lang.Object) (short) 10);
        java.lang.Object obj5 = stackAr1.top();
        boolean boolean6 = stackAr1.isEmpty();
        int int7 = stackAr1.size();
        int int8 = stackAr1.size();
        java.lang.Object obj9 = stackAr1.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr1", stackAr1.repOK());
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test228");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        boolean boolean1 = stackAr0.isFull();
        boolean boolean3 = stackAr0.equals((java.lang.Object) (byte) -1);
        java.lang.String str4 = stackAr0.toString();
        boolean boolean5 = stackAr0.isFull();
        org.autotest.StackAr stackAr6 = new org.autotest.StackAr();
        int int7 = stackAr6.size();
        java.lang.String str8 = stackAr6.toString();
        java.lang.String str9 = stackAr6.toString();
        org.autotest.StackAr stackAr11 = new org.autotest.StackAr((int) 'a');
        java.lang.String str12 = stackAr11.toString();
        stackAr11.push((java.lang.Object) 0.0f);
        boolean boolean15 = stackAr11.isFull();
        int int16 = stackAr11.size();
        stackAr6.push((java.lang.Object) stackAr11);
        java.lang.Class<?> wildcardClass18 = stackAr11.getClass();
        stackAr0.push((java.lang.Object) wildcardClass18);
        java.lang.String str20 = stackAr0.toString();
        java.lang.Object obj21 = stackAr0.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr0", stackAr0.repOK());
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test229");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        boolean boolean1 = stackAr0.isFull();
        int int2 = stackAr0.size();
        boolean boolean3 = stackAr0.isEmpty();
        org.autotest.StackAr stackAr5 = new org.autotest.StackAr((int) '4');
        int int6 = stackAr5.size();
        int int7 = stackAr5.size();
        boolean boolean8 = stackAr5.isFull();
        org.autotest.StackAr stackAr9 = new org.autotest.StackAr();
        boolean boolean10 = stackAr9.isFull();
        boolean boolean12 = stackAr9.equals((java.lang.Object) (byte) -1);
        org.autotest.StackAr stackAr14 = new org.autotest.StackAr((int) '4');
        boolean boolean15 = stackAr9.equals((java.lang.Object) '4');
        org.autotest.StackAr stackAr17 = new org.autotest.StackAr((int) 'a');
        boolean boolean19 = stackAr17.equals((java.lang.Object) (-1.0f));
        boolean boolean21 = stackAr17.equals((java.lang.Object) "");
        boolean boolean22 = stackAr9.equals((java.lang.Object) "");
        boolean boolean23 = stackAr9.isFull();
        stackAr5.push((java.lang.Object) stackAr9);
        org.autotest.StackAr stackAr25 = new org.autotest.StackAr();
        int int26 = stackAr25.size();
        int int27 = stackAr25.size();
        stackAr9.push((java.lang.Object) int27);
        boolean boolean29 = stackAr0.equals((java.lang.Object) int27);
        org.autotest.StackAr stackAr31 = new org.autotest.StackAr((int) '4');
        java.lang.String str32 = stackAr31.toString();
        java.lang.String str33 = stackAr31.toString();
        int int34 = stackAr31.size();
        boolean boolean35 = stackAr31.isFull();
        boolean boolean37 = stackAr31.equals((java.lang.Object) ' ');
        java.lang.Object obj38 = new java.lang.Object();
        java.lang.Class<?> wildcardClass39 = obj38.getClass();
        stackAr31.push((java.lang.Object) wildcardClass39);
        stackAr0.push((java.lang.Object) wildcardClass39);
        org.autotest.StackAr stackAr42 = new org.autotest.StackAr();
        boolean boolean43 = stackAr42.isFull();
        int int44 = stackAr42.size();
        boolean boolean45 = stackAr42.isEmpty();
        org.autotest.StackAr stackAr47 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean48 = stackAr47.isFull();
        java.lang.Class<?> wildcardClass49 = stackAr47.getClass();
        stackAr42.push((java.lang.Object) wildcardClass49);
        org.autotest.StackAr stackAr52 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean53 = stackAr52.isEmpty();
        java.lang.Class<?> wildcardClass54 = stackAr52.getClass();
        boolean boolean55 = stackAr42.equals((java.lang.Object) wildcardClass54);
        boolean boolean56 = stackAr42.isFull();
        boolean boolean57 = stackAr42.isEmpty();
        java.lang.Object obj58 = stackAr42.top();
        boolean boolean59 = stackAr0.equals((java.lang.Object) stackAr42);
        java.lang.Object obj60 = stackAr42.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr42", stackAr42.repOK());
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test230");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '4');
        java.lang.String str2 = stackAr1.toString();
        org.autotest.StackAr stackAr3 = new org.autotest.StackAr();
        boolean boolean4 = stackAr3.isFull();
        boolean boolean6 = stackAr3.equals((java.lang.Object) (byte) -1);
        org.autotest.StackAr stackAr8 = new org.autotest.StackAr((int) '4');
        boolean boolean9 = stackAr3.equals((java.lang.Object) '4');
        org.autotest.StackAr stackAr11 = new org.autotest.StackAr((int) 'a');
        boolean boolean13 = stackAr11.equals((java.lang.Object) (-1.0f));
        boolean boolean15 = stackAr11.equals((java.lang.Object) "");
        boolean boolean16 = stackAr3.equals((java.lang.Object) "");
        org.autotest.StackAr stackAr18 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean19 = stackAr18.isEmpty();
        boolean boolean20 = stackAr18.isEmpty();
        stackAr3.push((java.lang.Object) stackAr18);
        boolean boolean22 = stackAr18.isFull();
        stackAr1.push((java.lang.Object) stackAr18);
        org.autotest.StackAr stackAr25 = new org.autotest.StackAr((int) '4');
        int int26 = stackAr25.size();
        boolean boolean27 = stackAr25.isEmpty();
        int int28 = stackAr25.size();
        java.lang.String str29 = stackAr25.toString();
        org.autotest.StackAr stackAr31 = new org.autotest.StackAr((int) 'a');
        boolean boolean33 = stackAr31.equals((java.lang.Object) (-1.0f));
        int int34 = stackAr31.size();
        org.autotest.StackAr stackAr36 = new org.autotest.StackAr((int) '4');
        int int37 = stackAr36.size();
        int int38 = stackAr36.size();
        boolean boolean39 = stackAr36.isFull();
        boolean boolean40 = stackAr36.isEmpty();
        stackAr31.push((java.lang.Object) boolean40);
        stackAr25.push((java.lang.Object) stackAr31);
        java.lang.Object obj43 = stackAr25.top();
        boolean boolean44 = stackAr25.isEmpty();
        int int45 = stackAr25.size();
        stackAr1.push((java.lang.Object) stackAr25);
        java.lang.Object obj47 = stackAr1.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr1", stackAr1.repOK());
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test231");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '4');
        int int2 = stackAr1.size();
        boolean boolean3 = stackAr1.isEmpty();
        stackAr1.push((java.lang.Object) (byte) 0);
        java.lang.Object obj6 = new java.lang.Object();
        boolean boolean7 = stackAr1.equals(obj6);
        boolean boolean8 = stackAr1.isEmpty();
        boolean boolean9 = stackAr1.isEmpty();
        java.lang.String str10 = stackAr1.toString();
        java.lang.Object obj11 = stackAr1.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr1", stackAr1.repOK());
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test232");
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
        boolean boolean26 = stackAr0.isEmpty();
        int int27 = stackAr0.size();
        org.autotest.StackAr stackAr28 = new org.autotest.StackAr();
        boolean boolean29 = stackAr28.isFull();
        boolean boolean31 = stackAr28.equals((java.lang.Object) (byte) -1);
        org.autotest.StackAr stackAr33 = new org.autotest.StackAr((int) '4');
        boolean boolean34 = stackAr28.equals((java.lang.Object) '4');
        org.autotest.StackAr stackAr36 = new org.autotest.StackAr((int) 'a');
        boolean boolean38 = stackAr36.equals((java.lang.Object) (-1.0f));
        boolean boolean40 = stackAr36.equals((java.lang.Object) "");
        boolean boolean41 = stackAr28.equals((java.lang.Object) "");
        org.autotest.StackAr stackAr43 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean44 = stackAr43.isEmpty();
        boolean boolean45 = stackAr43.isEmpty();
        stackAr28.push((java.lang.Object) stackAr43);
        boolean boolean47 = stackAr43.isFull();
        org.autotest.StackAr stackAr48 = new org.autotest.StackAr();
        boolean boolean49 = stackAr48.isFull();
        boolean boolean51 = stackAr48.equals((java.lang.Object) (byte) -1);
        java.lang.String str52 = stackAr48.toString();
        int int53 = stackAr48.size();
        boolean boolean54 = stackAr43.equals((java.lang.Object) stackAr48);
        org.autotest.StackAr stackAr56 = new org.autotest.StackAr((int) 'a');
        boolean boolean58 = stackAr56.equals((java.lang.Object) (-1.0f));
        int int59 = stackAr56.size();
        org.autotest.StackAr stackAr60 = new org.autotest.StackAr();
        boolean boolean61 = stackAr60.isFull();
        int int62 = stackAr60.size();
        boolean boolean63 = stackAr60.isEmpty();
        org.autotest.StackAr stackAr65 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean66 = stackAr65.isFull();
        java.lang.Class<?> wildcardClass67 = stackAr65.getClass();
        stackAr60.push((java.lang.Object) wildcardClass67);
        boolean boolean69 = stackAr56.equals((java.lang.Object) stackAr60);
        boolean boolean70 = stackAr48.equals((java.lang.Object) stackAr60);
        java.lang.String str71 = stackAr60.toString();
        org.autotest.StackAr stackAr73 = new org.autotest.StackAr((int) '4');
        int int74 = stackAr73.size();
        boolean boolean75 = stackAr73.isEmpty();
        int int76 = stackAr73.size();
        java.lang.String str77 = stackAr73.toString();
        org.autotest.StackAr stackAr79 = new org.autotest.StackAr((int) 'a');
        boolean boolean81 = stackAr79.equals((java.lang.Object) (-1.0f));
        int int82 = stackAr79.size();
        org.autotest.StackAr stackAr84 = new org.autotest.StackAr((int) '4');
        int int85 = stackAr84.size();
        int int86 = stackAr84.size();
        boolean boolean87 = stackAr84.isFull();
        boolean boolean88 = stackAr84.isEmpty();
        stackAr79.push((java.lang.Object) boolean88);
        stackAr73.push((java.lang.Object) stackAr79);
        java.lang.Object obj91 = stackAr73.top();
        stackAr60.push(obj91);
        boolean boolean93 = stackAr0.equals((java.lang.Object) stackAr60);
        java.lang.Object obj94 = stackAr60.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr60", stackAr60.repOK());
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test233");
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
        org.autotest.StackAr stackAr18 = new org.autotest.StackAr();
        boolean boolean19 = stackAr18.isFull();
        int int20 = stackAr18.size();
        boolean boolean21 = stackAr18.isEmpty();
        org.autotest.StackAr stackAr23 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean24 = stackAr23.isFull();
        java.lang.Class<?> wildcardClass25 = stackAr23.getClass();
        stackAr18.push((java.lang.Object) wildcardClass25);
        org.autotest.StackAr stackAr28 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean29 = stackAr28.isEmpty();
        java.lang.Class<?> wildcardClass30 = stackAr28.getClass();
        boolean boolean31 = stackAr18.equals((java.lang.Object) wildcardClass30);
        boolean boolean32 = stackAr18.isFull();
        boolean boolean33 = stackAr18.isEmpty();
        java.lang.Object obj34 = stackAr18.top();
        stackAr0.push((java.lang.Object) stackAr18);
        boolean boolean36 = stackAr0.isFull();
        boolean boolean37 = stackAr0.isFull();
        boolean boolean38 = stackAr0.isFull();
        java.lang.Object obj39 = stackAr0.top();
        java.lang.Object obj40 = stackAr0.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr0", stackAr0.repOK());
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test234");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '4');
        int int2 = stackAr1.size();
        boolean boolean3 = stackAr1.isEmpty();
        stackAr1.push((java.lang.Object) (byte) 0);
        java.lang.Object obj6 = new java.lang.Object();
        boolean boolean7 = stackAr1.equals(obj6);
        boolean boolean8 = stackAr1.isEmpty();
        java.lang.String str9 = stackAr1.toString();
        org.autotest.StackAr stackAr11 = new org.autotest.StackAr((int) (short) 1);
        boolean boolean12 = stackAr11.isFull();
        org.autotest.StackAr stackAr14 = new org.autotest.StackAr((int) (short) 1);
        boolean boolean15 = stackAr14.isFull();
        boolean boolean16 = stackAr11.equals((java.lang.Object) stackAr14);
        boolean boolean17 = stackAr14.isEmpty();
        stackAr1.push((java.lang.Object) stackAr14);
        java.lang.Object obj19 = stackAr1.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr1", stackAr1.repOK());
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test235");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '4');
        int int2 = stackAr1.size();
        boolean boolean3 = stackAr1.isEmpty();
        stackAr1.push((java.lang.Object) (byte) 0);
        java.lang.Object obj6 = new java.lang.Object();
        boolean boolean7 = stackAr1.equals(obj6);
        boolean boolean8 = stackAr1.isFull();
        java.lang.Object obj9 = stackAr1.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr1", stackAr1.repOK());
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test236");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) (short) 1);
        boolean boolean2 = stackAr1.isFull();
        org.autotest.StackAr stackAr4 = new org.autotest.StackAr((int) (short) 1);
        boolean boolean5 = stackAr4.isFull();
        boolean boolean6 = stackAr1.equals((java.lang.Object) stackAr4);
        org.autotest.StackAr stackAr8 = new org.autotest.StackAr((int) '4');
        int int9 = stackAr8.size();
        int int10 = stackAr8.size();
        boolean boolean11 = stackAr8.isFull();
        org.autotest.StackAr stackAr12 = new org.autotest.StackAr();
        boolean boolean13 = stackAr12.isFull();
        boolean boolean15 = stackAr12.equals((java.lang.Object) (byte) -1);
        org.autotest.StackAr stackAr17 = new org.autotest.StackAr((int) '4');
        boolean boolean18 = stackAr12.equals((java.lang.Object) '4');
        org.autotest.StackAr stackAr20 = new org.autotest.StackAr((int) 'a');
        boolean boolean22 = stackAr20.equals((java.lang.Object) (-1.0f));
        boolean boolean24 = stackAr20.equals((java.lang.Object) "");
        boolean boolean25 = stackAr12.equals((java.lang.Object) "");
        boolean boolean26 = stackAr12.isFull();
        stackAr8.push((java.lang.Object) stackAr12);
        int int28 = stackAr8.size();
        org.autotest.StackAr stackAr30 = new org.autotest.StackAr((int) 'a');
        stackAr30.push((java.lang.Object) 'a');
        java.lang.Object obj33 = stackAr30.top();
        boolean boolean34 = stackAr30.isEmpty();
        int int35 = stackAr30.size();
        boolean boolean36 = stackAr30.isFull();
        org.autotest.StackAr stackAr38 = new org.autotest.StackAr((int) '4');
        java.lang.String str39 = stackAr38.toString();
        java.lang.String str40 = stackAr38.toString();
        int int41 = stackAr38.size();
        boolean boolean42 = stackAr38.isFull();
        boolean boolean44 = stackAr38.equals((java.lang.Object) ' ');
        org.autotest.StackAr stackAr45 = new org.autotest.StackAr();
        org.autotest.StackAr stackAr46 = new org.autotest.StackAr();
        boolean boolean47 = stackAr46.isFull();
        int int48 = stackAr46.size();
        boolean boolean49 = stackAr46.isEmpty();
        org.autotest.StackAr stackAr51 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean52 = stackAr51.isFull();
        java.lang.Class<?> wildcardClass53 = stackAr51.getClass();
        stackAr46.push((java.lang.Object) wildcardClass53);
        boolean boolean55 = stackAr45.equals((java.lang.Object) stackAr46);
        int int56 = stackAr45.size();
        stackAr38.push((java.lang.Object) stackAr45);
        stackAr30.push((java.lang.Object) stackAr45);
        boolean boolean59 = stackAr8.equals((java.lang.Object) stackAr30);
        stackAr4.push((java.lang.Object) stackAr30);
        boolean boolean61 = stackAr4.isEmpty();
        java.lang.Object obj62 = stackAr4.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr4", stackAr4.repOK());
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test237");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '4');
        int int2 = stackAr1.size();
        boolean boolean3 = stackAr1.isEmpty();
        stackAr1.push((java.lang.Object) (byte) 0);
        java.lang.Object obj6 = new java.lang.Object();
        boolean boolean7 = stackAr1.equals(obj6);
        boolean boolean8 = stackAr1.isEmpty();
        boolean boolean9 = stackAr1.isEmpty();
        boolean boolean10 = stackAr1.isFull();
        java.lang.Object obj11 = stackAr1.top();
        org.autotest.StackAr stackAr12 = new org.autotest.StackAr();
        boolean boolean13 = stackAr12.isFull();
        int int14 = stackAr12.size();
        boolean boolean15 = stackAr12.isEmpty();
        org.autotest.StackAr stackAr17 = new org.autotest.StackAr((int) '4');
        int int18 = stackAr17.size();
        int int19 = stackAr17.size();
        boolean boolean20 = stackAr17.isFull();
        org.autotest.StackAr stackAr21 = new org.autotest.StackAr();
        boolean boolean22 = stackAr21.isFull();
        boolean boolean24 = stackAr21.equals((java.lang.Object) (byte) -1);
        org.autotest.StackAr stackAr26 = new org.autotest.StackAr((int) '4');
        boolean boolean27 = stackAr21.equals((java.lang.Object) '4');
        org.autotest.StackAr stackAr29 = new org.autotest.StackAr((int) 'a');
        boolean boolean31 = stackAr29.equals((java.lang.Object) (-1.0f));
        boolean boolean33 = stackAr29.equals((java.lang.Object) "");
        boolean boolean34 = stackAr21.equals((java.lang.Object) "");
        boolean boolean35 = stackAr21.isFull();
        stackAr17.push((java.lang.Object) stackAr21);
        org.autotest.StackAr stackAr37 = new org.autotest.StackAr();
        int int38 = stackAr37.size();
        int int39 = stackAr37.size();
        stackAr21.push((java.lang.Object) int39);
        boolean boolean41 = stackAr12.equals((java.lang.Object) int39);
        org.autotest.StackAr stackAr43 = new org.autotest.StackAr((int) '4');
        java.lang.String str44 = stackAr43.toString();
        java.lang.String str45 = stackAr43.toString();
        int int46 = stackAr43.size();
        boolean boolean47 = stackAr43.isFull();
        boolean boolean49 = stackAr43.equals((java.lang.Object) ' ');
        java.lang.Object obj50 = new java.lang.Object();
        java.lang.Class<?> wildcardClass51 = obj50.getClass();
        stackAr43.push((java.lang.Object) wildcardClass51);
        stackAr12.push((java.lang.Object) wildcardClass51);
        boolean boolean55 = stackAr12.equals((java.lang.Object) 1.0d);
        java.lang.Object obj56 = stackAr12.top();
        stackAr1.push((java.lang.Object) stackAr12);
        java.lang.Object obj58 = stackAr12.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr12", stackAr12.repOK());
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test238");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '4');
        java.lang.String str2 = stackAr1.toString();
        java.lang.String str3 = stackAr1.toString();
        int int4 = stackAr1.size();
        org.autotest.StackAr stackAr5 = new org.autotest.StackAr();
        java.lang.String str6 = stackAr5.toString();
        boolean boolean7 = stackAr5.isEmpty();
        boolean boolean8 = stackAr1.equals((java.lang.Object) stackAr5);
        org.autotest.StackAr stackAr9 = new org.autotest.StackAr();
        boolean boolean10 = stackAr9.isFull();
        int int11 = stackAr9.size();
        boolean boolean12 = stackAr9.isEmpty();
        org.autotest.StackAr stackAr14 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean15 = stackAr14.isFull();
        java.lang.Class<?> wildcardClass16 = stackAr14.getClass();
        stackAr9.push((java.lang.Object) wildcardClass16);
        org.autotest.StackAr stackAr18 = new org.autotest.StackAr();
        int int19 = stackAr18.size();
        java.lang.String str20 = stackAr18.toString();
        stackAr9.push((java.lang.Object) stackAr18);
        java.lang.Object obj22 = stackAr9.top();
        java.lang.Object obj23 = stackAr9.top();
        stackAr1.push(obj23);
        org.autotest.StackAr stackAr26 = new org.autotest.StackAr((int) '4');
        int int27 = stackAr26.size();
        int int28 = stackAr26.size();
        boolean boolean29 = stackAr26.isFull();
        org.autotest.StackAr stackAr30 = new org.autotest.StackAr();
        boolean boolean31 = stackAr30.isFull();
        boolean boolean33 = stackAr30.equals((java.lang.Object) (byte) -1);
        org.autotest.StackAr stackAr35 = new org.autotest.StackAr((int) '4');
        boolean boolean36 = stackAr30.equals((java.lang.Object) '4');
        org.autotest.StackAr stackAr38 = new org.autotest.StackAr((int) 'a');
        boolean boolean40 = stackAr38.equals((java.lang.Object) (-1.0f));
        boolean boolean42 = stackAr38.equals((java.lang.Object) "");
        boolean boolean43 = stackAr30.equals((java.lang.Object) "");
        boolean boolean44 = stackAr30.isFull();
        stackAr26.push((java.lang.Object) stackAr30);
        java.lang.String str46 = stackAr30.toString();
        org.autotest.StackAr stackAr47 = new org.autotest.StackAr();
        boolean boolean48 = stackAr47.isFull();
        boolean boolean50 = stackAr47.equals((java.lang.Object) (byte) -1);
        org.autotest.StackAr stackAr52 = new org.autotest.StackAr((int) '4');
        boolean boolean53 = stackAr47.equals((java.lang.Object) '4');
        org.autotest.StackAr stackAr55 = new org.autotest.StackAr((int) 'a');
        boolean boolean57 = stackAr55.equals((java.lang.Object) (-1.0f));
        boolean boolean59 = stackAr55.equals((java.lang.Object) "");
        boolean boolean60 = stackAr47.equals((java.lang.Object) "");
        org.autotest.StackAr stackAr62 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean63 = stackAr62.isEmpty();
        boolean boolean64 = stackAr62.isEmpty();
        stackAr47.push((java.lang.Object) stackAr62);
        boolean boolean66 = stackAr47.isFull();
        java.lang.Object obj67 = stackAr47.top();
        boolean boolean68 = stackAr30.equals((java.lang.Object) stackAr47);
        boolean boolean69 = stackAr30.isEmpty();
        java.lang.String str70 = stackAr30.toString();
        boolean boolean71 = stackAr1.equals((java.lang.Object) stackAr30);
        java.lang.Object obj72 = stackAr1.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr1", stackAr1.repOK());
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test239");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) 'a');
        boolean boolean3 = stackAr1.equals((java.lang.Object) (-1.0f));
        boolean boolean5 = stackAr1.equals((java.lang.Object) "");
        stackAr1.push((java.lang.Object) (-1.0d));
        java.lang.Object obj8 = stackAr1.top();
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
        stackAr1.push((java.lang.Object) stackAr14);
        org.autotest.StackAr stackAr26 = new org.autotest.StackAr((int) 'a');
        boolean boolean28 = stackAr26.equals((java.lang.Object) (-1.0f));
        boolean boolean30 = stackAr26.equals((java.lang.Object) "");
        stackAr26.push((java.lang.Object) (-1.0d));
        org.autotest.StackAr stackAr33 = new org.autotest.StackAr();
        boolean boolean34 = stackAr33.isFull();
        boolean boolean36 = stackAr33.equals((java.lang.Object) (byte) -1);
        java.lang.String str37 = stackAr33.toString();
        boolean boolean39 = stackAr33.equals((java.lang.Object) 10L);
        java.lang.String str40 = stackAr33.toString();
        org.autotest.StackAr stackAr42 = new org.autotest.StackAr((int) '4');
        stackAr42.push((java.lang.Object) (-1L));
        boolean boolean45 = stackAr42.isEmpty();
        boolean boolean46 = stackAr33.equals((java.lang.Object) stackAr42);
        boolean boolean47 = stackAr26.equals((java.lang.Object) stackAr33);
        org.autotest.StackAr stackAr49 = new org.autotest.StackAr((int) (byte) 10);
        boolean boolean50 = stackAr49.isEmpty();
        stackAr33.push((java.lang.Object) stackAr49);
        boolean boolean52 = stackAr1.equals((java.lang.Object) stackAr33);
        java.lang.Object obj53 = stackAr33.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr33", stackAr33.repOK());
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test240");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '4');
        int int2 = stackAr1.size();
        boolean boolean3 = stackAr1.isEmpty();
        stackAr1.push((java.lang.Object) (byte) 0);
        java.lang.Object obj6 = new java.lang.Object();
        boolean boolean7 = stackAr1.equals(obj6);
        java.lang.String str8 = stackAr1.toString();
        org.autotest.StackAr stackAr9 = new org.autotest.StackAr();
        boolean boolean10 = stackAr9.isFull();
        org.autotest.StackAr stackAr12 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean13 = stackAr12.isEmpty();
        boolean boolean14 = stackAr12.isFull();
        boolean boolean15 = stackAr9.equals((java.lang.Object) boolean14);
        boolean boolean16 = stackAr9.isFull();
        org.autotest.StackAr stackAr17 = new org.autotest.StackAr();
        boolean boolean18 = stackAr17.isFull();
        boolean boolean20 = stackAr17.equals((java.lang.Object) (byte) -1);
        org.autotest.StackAr stackAr22 = new org.autotest.StackAr((int) '4');
        boolean boolean23 = stackAr17.equals((java.lang.Object) '4');
        org.autotest.StackAr stackAr25 = new org.autotest.StackAr((int) 'a');
        boolean boolean27 = stackAr25.equals((java.lang.Object) (-1.0f));
        boolean boolean29 = stackAr25.equals((java.lang.Object) "");
        boolean boolean30 = stackAr17.equals((java.lang.Object) "");
        org.autotest.StackAr stackAr32 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean33 = stackAr32.isEmpty();
        boolean boolean34 = stackAr32.isEmpty();
        stackAr17.push((java.lang.Object) stackAr32);
        stackAr17.push((java.lang.Object) 1.0f);
        boolean boolean38 = stackAr9.equals((java.lang.Object) stackAr17);
        stackAr1.push((java.lang.Object) stackAr17);
        java.lang.Object obj40 = stackAr17.top();
        java.lang.Object obj41 = stackAr17.top();
        java.lang.Object obj42 = stackAr17.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr17", stackAr17.repOK());
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test241");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) 'a');
        boolean boolean3 = stackAr1.equals((java.lang.Object) (-1.0f));
        boolean boolean5 = stackAr1.equals((java.lang.Object) "");
        stackAr1.push((java.lang.Object) (-1.0d));
        java.lang.Object obj8 = stackAr1.top();
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
        stackAr1.push((java.lang.Object) stackAr14);
        java.lang.Object obj25 = stackAr1.top();
        java.lang.Object obj26 = stackAr1.top();
        java.lang.Object obj27 = stackAr1.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr1", stackAr1.repOK());
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test242");
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
        org.autotest.StackAr stackAr18 = new org.autotest.StackAr();
        boolean boolean19 = stackAr18.isFull();
        int int20 = stackAr18.size();
        boolean boolean21 = stackAr18.isEmpty();
        org.autotest.StackAr stackAr23 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean24 = stackAr23.isFull();
        java.lang.Class<?> wildcardClass25 = stackAr23.getClass();
        stackAr18.push((java.lang.Object) wildcardClass25);
        org.autotest.StackAr stackAr28 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean29 = stackAr28.isEmpty();
        java.lang.Class<?> wildcardClass30 = stackAr28.getClass();
        boolean boolean31 = stackAr18.equals((java.lang.Object) wildcardClass30);
        boolean boolean32 = stackAr18.isFull();
        boolean boolean33 = stackAr18.isEmpty();
        java.lang.Object obj34 = stackAr18.top();
        stackAr0.push((java.lang.Object) stackAr18);
        boolean boolean36 = stackAr0.isFull();
        boolean boolean37 = stackAr0.isFull();
        java.lang.Object obj38 = stackAr0.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr0", stackAr0.repOK());
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test243");
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
        int int21 = stackAr0.size();
        java.lang.Object obj22 = stackAr0.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr0", stackAr0.repOK());
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test244");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '4');
        stackAr1.push((java.lang.Object) (-1L));
        boolean boolean4 = stackAr1.isEmpty();
        org.autotest.StackAr stackAr5 = new org.autotest.StackAr();
        boolean boolean6 = stackAr5.isFull();
        org.autotest.StackAr stackAr8 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean9 = stackAr8.isEmpty();
        boolean boolean10 = stackAr8.isFull();
        boolean boolean11 = stackAr5.equals((java.lang.Object) boolean10);
        boolean boolean12 = stackAr5.isFull();
        org.autotest.StackAr stackAr13 = new org.autotest.StackAr();
        boolean boolean14 = stackAr13.isFull();
        boolean boolean16 = stackAr13.equals((java.lang.Object) (byte) -1);
        org.autotest.StackAr stackAr18 = new org.autotest.StackAr((int) '4');
        boolean boolean19 = stackAr13.equals((java.lang.Object) '4');
        org.autotest.StackAr stackAr21 = new org.autotest.StackAr((int) 'a');
        boolean boolean23 = stackAr21.equals((java.lang.Object) (-1.0f));
        boolean boolean25 = stackAr21.equals((java.lang.Object) "");
        boolean boolean26 = stackAr13.equals((java.lang.Object) "");
        org.autotest.StackAr stackAr28 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean29 = stackAr28.isEmpty();
        boolean boolean30 = stackAr28.isEmpty();
        stackAr13.push((java.lang.Object) stackAr28);
        stackAr13.push((java.lang.Object) 1.0f);
        boolean boolean34 = stackAr5.equals((java.lang.Object) stackAr13);
        boolean boolean35 = stackAr5.isEmpty();
        stackAr1.push((java.lang.Object) stackAr5);
        int int37 = stackAr1.size();
        org.autotest.StackAr stackAr39 = new org.autotest.StackAr((int) '4');
        stackAr39.push((java.lang.Object) (-1L));
        boolean boolean42 = stackAr39.isEmpty();
        org.autotest.StackAr stackAr43 = new org.autotest.StackAr();
        boolean boolean44 = stackAr43.isFull();
        org.autotest.StackAr stackAr46 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean47 = stackAr46.isEmpty();
        boolean boolean48 = stackAr46.isFull();
        boolean boolean49 = stackAr43.equals((java.lang.Object) boolean48);
        boolean boolean50 = stackAr43.isFull();
        org.autotest.StackAr stackAr51 = new org.autotest.StackAr();
        boolean boolean52 = stackAr51.isFull();
        boolean boolean54 = stackAr51.equals((java.lang.Object) (byte) -1);
        org.autotest.StackAr stackAr56 = new org.autotest.StackAr((int) '4');
        boolean boolean57 = stackAr51.equals((java.lang.Object) '4');
        org.autotest.StackAr stackAr59 = new org.autotest.StackAr((int) 'a');
        boolean boolean61 = stackAr59.equals((java.lang.Object) (-1.0f));
        boolean boolean63 = stackAr59.equals((java.lang.Object) "");
        boolean boolean64 = stackAr51.equals((java.lang.Object) "");
        org.autotest.StackAr stackAr66 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean67 = stackAr66.isEmpty();
        boolean boolean68 = stackAr66.isEmpty();
        stackAr51.push((java.lang.Object) stackAr66);
        stackAr51.push((java.lang.Object) 1.0f);
        boolean boolean72 = stackAr43.equals((java.lang.Object) stackAr51);
        boolean boolean73 = stackAr43.isEmpty();
        stackAr39.push((java.lang.Object) stackAr43);
        boolean boolean75 = stackAr1.equals((java.lang.Object) stackAr39);
        java.lang.Object obj76 = stackAr1.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr1", stackAr1.repOK());
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test245");
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
        java.lang.Object obj24 = stackAr5.top();
        java.lang.String str25 = stackAr5.toString();
        java.lang.String str26 = stackAr5.toString();
        org.autotest.StackAr stackAr28 = new org.autotest.StackAr((int) 'a');
        boolean boolean30 = stackAr28.equals((java.lang.Object) (-1.0f));
        boolean boolean32 = stackAr28.equals((java.lang.Object) "");
        org.autotest.StackAr stackAr33 = new org.autotest.StackAr();
        boolean boolean34 = stackAr33.isFull();
        stackAr28.push((java.lang.Object) stackAr33);
        org.autotest.StackAr stackAr37 = new org.autotest.StackAr((int) 'a');
        java.lang.String str38 = stackAr37.toString();
        stackAr37.push((java.lang.Object) 0.0f);
        org.autotest.StackAr stackAr42 = new org.autotest.StackAr((int) '4');
        java.lang.String str43 = stackAr42.toString();
        boolean boolean44 = stackAr37.equals((java.lang.Object) stackAr42);
        org.autotest.StackAr stackAr46 = new org.autotest.StackAr((int) 'a');
        boolean boolean48 = stackAr46.equals((java.lang.Object) (-1.0f));
        boolean boolean50 = stackAr46.equals((java.lang.Object) "");
        org.autotest.StackAr stackAr51 = new org.autotest.StackAr();
        boolean boolean52 = stackAr51.isFull();
        stackAr46.push((java.lang.Object) stackAr51);
        boolean boolean54 = stackAr42.equals((java.lang.Object) stackAr46);
        boolean boolean55 = stackAr33.equals((java.lang.Object) stackAr42);
        boolean boolean56 = stackAr33.isEmpty();
        int int57 = stackAr33.size();
        stackAr5.push((java.lang.Object) stackAr33);
        java.lang.String str59 = stackAr5.toString();
        java.lang.Object obj60 = stackAr5.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr5", stackAr5.repOK());
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test246");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '4');
        int int2 = stackAr1.size();
        boolean boolean3 = stackAr1.isEmpty();
        stackAr1.push((java.lang.Object) (byte) 0);
        java.lang.String str6 = stackAr1.toString();
        int int7 = stackAr1.size();
        boolean boolean8 = stackAr1.isFull();
        org.autotest.StackAr stackAr9 = new org.autotest.StackAr();
        boolean boolean10 = stackAr9.isFull();
        int int11 = stackAr9.size();
        boolean boolean12 = stackAr9.isFull();
        stackAr9.push((java.lang.Object) 10L);
        stackAr9.push((java.lang.Object) ' ');
        org.autotest.StackAr stackAr17 = new org.autotest.StackAr();
        java.lang.String str18 = stackAr17.toString();
        stackAr9.push((java.lang.Object) str18);
        java.lang.Object obj20 = stackAr9.top();
        boolean boolean21 = stackAr9.isFull();
        java.lang.String str22 = stackAr9.toString();
        boolean boolean23 = stackAr9.isEmpty();
        boolean boolean24 = stackAr1.equals((java.lang.Object) stackAr9);
        java.lang.Object obj25 = stackAr1.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr1", stackAr1.repOK());
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test247");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean2 = stackAr1.isEmpty();
        int int3 = stackAr1.size();
        java.lang.String str4 = stackAr1.toString();
        boolean boolean5 = stackAr1.isEmpty();
        int int6 = stackAr1.size();
        boolean boolean7 = stackAr1.isEmpty();
        boolean boolean8 = stackAr1.isFull();
        org.autotest.StackAr stackAr9 = new org.autotest.StackAr();
        int int10 = stackAr9.size();
        java.lang.String str11 = stackAr9.toString();
        java.lang.String str12 = stackAr9.toString();
        org.autotest.StackAr stackAr14 = new org.autotest.StackAr((int) 'a');
        java.lang.String str15 = stackAr14.toString();
        stackAr14.push((java.lang.Object) 0.0f);
        boolean boolean18 = stackAr14.isFull();
        int int19 = stackAr14.size();
        stackAr9.push((java.lang.Object) stackAr14);
        boolean boolean21 = stackAr1.equals((java.lang.Object) stackAr14);
        java.lang.Object obj22 = stackAr14.top();
        org.autotest.StackAr stackAr24 = new org.autotest.StackAr((int) '4');
        int int25 = stackAr24.size();
        boolean boolean26 = stackAr24.isEmpty();
        stackAr24.push((java.lang.Object) (byte) 0);
        java.lang.String str29 = stackAr24.toString();
        boolean boolean30 = stackAr24.isEmpty();
        java.lang.Object obj31 = null;
        stackAr24.push(obj31);
        stackAr14.push((java.lang.Object) stackAr24);
        java.lang.Object obj34 = stackAr14.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr14", stackAr14.repOK());
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test248");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) 'a');
        boolean boolean3 = stackAr1.equals((java.lang.Object) (-1.0f));
        boolean boolean5 = stackAr1.equals((java.lang.Object) "");
        org.autotest.StackAr stackAr7 = new org.autotest.StackAr((int) '4');
        org.autotest.StackAr stackAr9 = new org.autotest.StackAr((int) (short) 1);
        stackAr7.push((java.lang.Object) (short) 1);
        int int11 = stackAr7.size();
        int int12 = stackAr7.size();
        stackAr1.push((java.lang.Object) stackAr7);
        java.lang.Object obj14 = stackAr7.top();
        java.lang.Object obj15 = stackAr7.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr7", stackAr7.repOK());
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test249");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) 'a');
        stackAr1.push((java.lang.Object) 'a');
        java.lang.Object obj4 = stackAr1.top();
        boolean boolean5 = stackAr1.isEmpty();
        java.lang.String str6 = stackAr1.toString();
        boolean boolean7 = stackAr1.isFull();
        org.autotest.StackAr stackAr8 = new org.autotest.StackAr();
        boolean boolean9 = stackAr8.isFull();
        int int10 = stackAr8.size();
        boolean boolean11 = stackAr8.isEmpty();
        boolean boolean12 = stackAr8.isFull();
        boolean boolean13 = stackAr8.isFull();
        boolean boolean14 = stackAr8.isFull();
        java.lang.String str15 = stackAr8.toString();
        boolean boolean16 = stackAr8.isFull();
        boolean boolean17 = stackAr1.equals((java.lang.Object) boolean16);
        java.lang.Object obj18 = stackAr1.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr1", stackAr1.repOK());
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test250");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '4');
        int int2 = stackAr1.size();
        boolean boolean3 = stackAr1.isEmpty();
        stackAr1.push((java.lang.Object) (byte) 0);
        java.lang.Object obj6 = new java.lang.Object();
        boolean boolean7 = stackAr1.equals(obj6);
        java.lang.String str8 = stackAr1.toString();
        org.autotest.StackAr stackAr9 = new org.autotest.StackAr();
        boolean boolean10 = stackAr9.isFull();
        org.autotest.StackAr stackAr12 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean13 = stackAr12.isEmpty();
        boolean boolean14 = stackAr12.isFull();
        boolean boolean15 = stackAr9.equals((java.lang.Object) boolean14);
        boolean boolean16 = stackAr9.isFull();
        org.autotest.StackAr stackAr17 = new org.autotest.StackAr();
        boolean boolean18 = stackAr17.isFull();
        boolean boolean20 = stackAr17.equals((java.lang.Object) (byte) -1);
        org.autotest.StackAr stackAr22 = new org.autotest.StackAr((int) '4');
        boolean boolean23 = stackAr17.equals((java.lang.Object) '4');
        org.autotest.StackAr stackAr25 = new org.autotest.StackAr((int) 'a');
        boolean boolean27 = stackAr25.equals((java.lang.Object) (-1.0f));
        boolean boolean29 = stackAr25.equals((java.lang.Object) "");
        boolean boolean30 = stackAr17.equals((java.lang.Object) "");
        org.autotest.StackAr stackAr32 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean33 = stackAr32.isEmpty();
        boolean boolean34 = stackAr32.isEmpty();
        stackAr17.push((java.lang.Object) stackAr32);
        stackAr17.push((java.lang.Object) 1.0f);
        boolean boolean38 = stackAr9.equals((java.lang.Object) stackAr17);
        stackAr1.push((java.lang.Object) stackAr17);
        java.lang.Object obj40 = stackAr17.top();
        java.lang.Object obj41 = stackAr17.top();
        java.lang.Object obj42 = stackAr17.top();
        java.lang.Object obj43 = stackAr17.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr17", stackAr17.repOK());
    }
}

