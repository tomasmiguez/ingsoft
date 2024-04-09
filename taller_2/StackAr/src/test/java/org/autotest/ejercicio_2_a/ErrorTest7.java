package org.autotest;

import org.junit.FixMethodOrder;
import org.junit.jupiter.api.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest7 {

    public static boolean debug = false;

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test351");
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
        int int26 = stackAr1.size();
        java.lang.Object obj27 = stackAr1.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr1", stackAr1.repOK());
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test352");
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
        boolean boolean24 = stackAr22.isEmpty();
        boolean boolean25 = stackAr22.isFull();
        org.autotest.StackAr stackAr27 = new org.autotest.StackAr((int) 'a');
        java.lang.String str28 = stackAr27.toString();
        stackAr27.push((java.lang.Object) 0.0f);
        org.autotest.StackAr stackAr32 = new org.autotest.StackAr((int) '4');
        java.lang.String str33 = stackAr32.toString();
        boolean boolean34 = stackAr27.equals((java.lang.Object) stackAr32);
        java.lang.String str35 = stackAr32.toString();
        boolean boolean36 = stackAr32.isEmpty();
        org.autotest.StackAr stackAr37 = new org.autotest.StackAr();
        boolean boolean38 = stackAr37.isFull();
        boolean boolean40 = stackAr37.equals((java.lang.Object) (byte) -1);
        org.autotest.StackAr stackAr42 = new org.autotest.StackAr((int) '4');
        boolean boolean43 = stackAr37.equals((java.lang.Object) '4');
        org.autotest.StackAr stackAr45 = new org.autotest.StackAr((int) 'a');
        boolean boolean47 = stackAr45.equals((java.lang.Object) (-1.0f));
        boolean boolean49 = stackAr45.equals((java.lang.Object) "");
        boolean boolean50 = stackAr37.equals((java.lang.Object) "");
        org.autotest.StackAr stackAr52 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean53 = stackAr52.isEmpty();
        boolean boolean54 = stackAr52.isEmpty();
        stackAr37.push((java.lang.Object) stackAr52);
        java.lang.Object obj56 = stackAr37.top();
        java.lang.Object obj57 = stackAr37.top();
        stackAr32.push(obj57);
        boolean boolean59 = stackAr22.equals((java.lang.Object) stackAr32);
        java.lang.Object obj60 = stackAr32.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr32", stackAr32.repOK());
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test353");
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
        org.autotest.StackAr stackAr21 = new org.autotest.StackAr();
        int int22 = stackAr21.size();
        int int23 = stackAr21.size();
        stackAr5.push((java.lang.Object) int23);
        java.lang.String str25 = stackAr5.toString();
        boolean boolean26 = stackAr5.isEmpty();
        org.autotest.StackAr stackAr28 = new org.autotest.StackAr((int) '4');
        java.lang.String str29 = stackAr28.toString();
        java.lang.String str30 = stackAr28.toString();
        int int31 = stackAr28.size();
        boolean boolean32 = stackAr28.isFull();
        boolean boolean34 = stackAr28.equals((java.lang.Object) ' ');
        org.autotest.StackAr stackAr35 = new org.autotest.StackAr();
        org.autotest.StackAr stackAr36 = new org.autotest.StackAr();
        boolean boolean37 = stackAr36.isFull();
        int int38 = stackAr36.size();
        boolean boolean39 = stackAr36.isEmpty();
        org.autotest.StackAr stackAr41 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean42 = stackAr41.isFull();
        java.lang.Class<?> wildcardClass43 = stackAr41.getClass();
        stackAr36.push((java.lang.Object) wildcardClass43);
        boolean boolean45 = stackAr35.equals((java.lang.Object) stackAr36);
        int int46 = stackAr35.size();
        stackAr28.push((java.lang.Object) stackAr35);
        org.autotest.StackAr stackAr49 = new org.autotest.StackAr((int) (byte) 10);
        boolean boolean51 = stackAr49.equals((java.lang.Object) 0.0d);
        boolean boolean52 = stackAr49.isEmpty();
        stackAr28.push((java.lang.Object) boolean52);
        boolean boolean54 = stackAr28.isFull();
        stackAr5.push((java.lang.Object) stackAr28);
        org.autotest.StackAr stackAr57 = new org.autotest.StackAr((int) (short) 100);
        java.lang.String str58 = stackAr57.toString();
        boolean boolean59 = stackAr57.isEmpty();
        boolean boolean60 = stackAr57.isEmpty();
        boolean boolean61 = stackAr57.isFull();
        stackAr5.push((java.lang.Object) boolean61);
        org.autotest.StackAr stackAr64 = new org.autotest.StackAr((int) (short) 1);
        boolean boolean65 = stackAr64.isFull();
        org.autotest.StackAr stackAr67 = new org.autotest.StackAr((int) (short) 1);
        boolean boolean68 = stackAr67.isFull();
        boolean boolean69 = stackAr64.equals((java.lang.Object) stackAr67);
        org.autotest.StackAr stackAr71 = new org.autotest.StackAr((int) 'a');
        java.lang.String str72 = stackAr71.toString();
        stackAr71.push((java.lang.Object) 0.0f);
        org.autotest.StackAr stackAr76 = new org.autotest.StackAr((int) '4');
        java.lang.String str77 = stackAr76.toString();
        boolean boolean78 = stackAr71.equals((java.lang.Object) stackAr76);
        stackAr76.push((java.lang.Object) 1.0f);
        java.lang.Object obj81 = stackAr76.top();
        java.lang.Object obj82 = stackAr76.top();
        boolean boolean83 = stackAr76.isFull();
        java.lang.String str84 = stackAr76.toString();
        java.lang.Class<?> wildcardClass85 = stackAr76.getClass();
        boolean boolean86 = stackAr64.equals((java.lang.Object) wildcardClass85);
        int int87 = stackAr64.size();
        boolean boolean88 = stackAr5.equals((java.lang.Object) stackAr64);
        java.lang.Object obj89 = stackAr5.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr5", stackAr5.repOK());
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test354");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) 'a');
        boolean boolean3 = stackAr1.equals((java.lang.Object) (-1.0f));
        boolean boolean5 = stackAr1.equals((java.lang.Object) 'a');
        org.autotest.StackAr stackAr7 = new org.autotest.StackAr((int) '4');
        int int8 = stackAr7.size();
        int int9 = stackAr7.size();
        boolean boolean10 = stackAr7.isFull();
        org.autotest.StackAr stackAr12 = new org.autotest.StackAr((int) ' ');
        stackAr7.push((java.lang.Object) ' ');
        java.lang.Object obj14 = stackAr7.top();
        org.autotest.StackAr stackAr15 = new org.autotest.StackAr();
        boolean boolean16 = stackAr15.isFull();
        int int17 = stackAr15.size();
        boolean boolean18 = stackAr15.isEmpty();
        org.autotest.StackAr stackAr20 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean21 = stackAr20.isFull();
        java.lang.Class<?> wildcardClass22 = stackAr20.getClass();
        stackAr15.push((java.lang.Object) wildcardClass22);
        org.autotest.StackAr stackAr25 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean26 = stackAr25.isEmpty();
        java.lang.Class<?> wildcardClass27 = stackAr25.getClass();
        boolean boolean28 = stackAr15.equals((java.lang.Object) wildcardClass27);
        boolean boolean29 = stackAr15.isFull();
        boolean boolean30 = stackAr15.isEmpty();
        org.autotest.StackAr stackAr32 = new org.autotest.StackAr(0);
        java.lang.Class<?> wildcardClass33 = stackAr32.getClass();
        boolean boolean34 = stackAr15.equals((java.lang.Object) wildcardClass33);
        java.lang.Class<?> wildcardClass35 = stackAr15.getClass();
        boolean boolean36 = stackAr7.equals((java.lang.Object) stackAr15);
        stackAr1.push((java.lang.Object) stackAr7);
        int int38 = stackAr1.size();
        int int39 = stackAr1.size();
        boolean boolean40 = stackAr1.isEmpty();
        java.lang.Object obj41 = stackAr1.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr1", stackAr1.repOK());
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test355");
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
        org.autotest.StackAr stackAr43 = new org.autotest.StackAr((int) 'a');
        java.lang.String str44 = stackAr43.toString();
        stackAr43.push((java.lang.Object) 0.0f);
        org.autotest.StackAr stackAr48 = new org.autotest.StackAr((int) '4');
        java.lang.String str49 = stackAr48.toString();
        boolean boolean50 = stackAr43.equals((java.lang.Object) stackAr48);
        java.lang.String str51 = stackAr48.toString();
        boolean boolean52 = stackAr48.isEmpty();
        boolean boolean53 = stackAr48.isFull();
        boolean boolean54 = stackAr48.isEmpty();
        boolean boolean55 = stackAr0.equals((java.lang.Object) stackAr48);
        int int56 = stackAr0.size();
        boolean boolean57 = stackAr0.isFull();
        org.autotest.StackAr stackAr58 = new org.autotest.StackAr();
        boolean boolean59 = stackAr58.isFull();
        int int60 = stackAr58.size();
        org.autotest.StackAr stackAr61 = new org.autotest.StackAr();
        boolean boolean62 = stackAr61.isFull();
        boolean boolean64 = stackAr61.equals((java.lang.Object) (byte) -1);
        java.lang.String str65 = stackAr61.toString();
        boolean boolean67 = stackAr61.equals((java.lang.Object) 10L);
        java.lang.String str68 = stackAr61.toString();
        java.lang.Class<?> wildcardClass69 = stackAr61.getClass();
        boolean boolean70 = stackAr58.equals((java.lang.Object) wildcardClass69);
        boolean boolean71 = stackAr58.isEmpty();
        java.lang.String str72 = stackAr58.toString();
        stackAr0.push((java.lang.Object) stackAr58);
        java.lang.Object obj74 = stackAr0.top();
        org.autotest.StackAr stackAr76 = new org.autotest.StackAr((int) 'a');
        java.lang.String str77 = stackAr76.toString();
        stackAr76.push((java.lang.Object) 0.0f);
        boolean boolean80 = stackAr76.isFull();
        java.lang.Object obj81 = stackAr76.top();
        int int82 = stackAr76.size();
        int int83 = stackAr76.size();
        int int84 = stackAr76.size();
        boolean boolean85 = stackAr76.isFull();
        boolean boolean86 = stackAr0.equals((java.lang.Object) stackAr76);
        java.lang.Object obj87 = stackAr76.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr76", stackAr76.repOK());
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test356");
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
        org.autotest.StackAr stackAr29 = new org.autotest.StackAr((int) '4');
        int int30 = stackAr29.size();
        java.lang.String str31 = stackAr29.toString();
        int int32 = stackAr29.size();
        org.autotest.StackAr stackAr34 = new org.autotest.StackAr((int) 'a');
        java.lang.String str35 = stackAr34.toString();
        stackAr34.push((java.lang.Object) 0.0f);
        org.autotest.StackAr stackAr39 = new org.autotest.StackAr((int) '4');
        java.lang.String str40 = stackAr39.toString();
        boolean boolean41 = stackAr34.equals((java.lang.Object) stackAr39);
        stackAr29.push((java.lang.Object) boolean41);
        stackAr0.push((java.lang.Object) boolean41);
        boolean boolean44 = stackAr0.isFull();
        org.autotest.StackAr stackAr46 = new org.autotest.StackAr((int) 'a');
        java.lang.String str47 = stackAr46.toString();
        org.autotest.StackAr stackAr49 = new org.autotest.StackAr((int) 'a');
        org.autotest.StackAr stackAr50 = new org.autotest.StackAr();
        boolean boolean51 = stackAr50.isFull();
        int int52 = stackAr50.size();
        boolean boolean53 = stackAr50.isEmpty();
        stackAr49.push((java.lang.Object) stackAr50);
        boolean boolean55 = stackAr46.equals((java.lang.Object) stackAr50);
        stackAr0.push((java.lang.Object) stackAr46);
        java.lang.Object obj57 = stackAr0.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr0", stackAr0.repOK());
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test357");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) 'a');
        java.lang.String str2 = stackAr1.toString();
        stackAr1.push((java.lang.Object) 0.0f);
        org.autotest.StackAr stackAr6 = new org.autotest.StackAr((int) '4');
        java.lang.String str7 = stackAr6.toString();
        boolean boolean8 = stackAr1.equals((java.lang.Object) stackAr6);
        java.lang.String str9 = stackAr6.toString();
        boolean boolean10 = stackAr6.isEmpty();
        java.lang.String str11 = stackAr6.toString();
        boolean boolean12 = stackAr6.isFull();
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
        java.lang.Class<?> wildcardClass25 = stackAr23.getClass();
        boolean boolean26 = stackAr13.equals((java.lang.Object) wildcardClass25);
        boolean boolean27 = stackAr13.isFull();
        boolean boolean28 = stackAr13.isEmpty();
        java.lang.Object obj29 = stackAr13.top();
        boolean boolean30 = stackAr13.isFull();
        org.autotest.StackAr stackAr31 = new org.autotest.StackAr();
        boolean boolean32 = stackAr31.isFull();
        int int33 = stackAr31.size();
        boolean boolean34 = stackAr31.isEmpty();
        org.autotest.StackAr stackAr36 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean37 = stackAr36.isFull();
        java.lang.Class<?> wildcardClass38 = stackAr36.getClass();
        stackAr31.push((java.lang.Object) wildcardClass38);
        org.autotest.StackAr stackAr41 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean42 = stackAr41.isEmpty();
        java.lang.Class<?> wildcardClass43 = stackAr41.getClass();
        boolean boolean44 = stackAr31.equals((java.lang.Object) wildcardClass43);
        boolean boolean45 = stackAr31.isFull();
        boolean boolean46 = stackAr31.isEmpty();
        java.lang.Object obj47 = stackAr31.top();
        stackAr13.push((java.lang.Object) stackAr31);
        boolean boolean49 = stackAr13.isFull();
        boolean boolean50 = stackAr13.isFull();
        boolean boolean51 = stackAr13.isFull();
        java.lang.Object obj52 = stackAr13.top();
        stackAr6.push((java.lang.Object) stackAr13);
        java.lang.Object obj54 = stackAr6.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr6", stackAr6.repOK());
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test358");
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
        org.autotest.StackAr stackAr20 = new org.autotest.StackAr((int) ' ');
        int int21 = stackAr20.size();
        stackAr6.push((java.lang.Object) stackAr20);
        java.lang.Object obj23 = stackAr6.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr6", stackAr6.repOK());
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test359");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        boolean boolean1 = stackAr0.isFull();
        boolean boolean3 = stackAr0.equals((java.lang.Object) (byte) -1);
        java.lang.String str4 = stackAr0.toString();
        boolean boolean6 = stackAr0.equals((java.lang.Object) 10L);
        java.lang.String str7 = stackAr0.toString();
        java.lang.String str8 = stackAr0.toString();
        org.autotest.StackAr stackAr9 = new org.autotest.StackAr();
        boolean boolean10 = stackAr9.isFull();
        boolean boolean12 = stackAr9.equals((java.lang.Object) (byte) -1);
        org.autotest.StackAr stackAr14 = new org.autotest.StackAr((int) '4');
        boolean boolean15 = stackAr9.equals((java.lang.Object) '4');
        org.autotest.StackAr stackAr17 = new org.autotest.StackAr((int) (short) 100);
        java.lang.String str18 = stackAr17.toString();
        boolean boolean19 = stackAr17.isEmpty();
        java.lang.String str20 = stackAr17.toString();
        stackAr9.push((java.lang.Object) str20);
        java.lang.String str22 = stackAr9.toString();
        stackAr0.push((java.lang.Object) str22);
        java.lang.Object obj24 = stackAr0.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr0", stackAr0.repOK());
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test360");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '4');
        int int2 = stackAr1.size();
        boolean boolean3 = stackAr1.isEmpty();
        stackAr1.push((java.lang.Object) (byte) 0);
        org.autotest.StackAr stackAr6 = new org.autotest.StackAr();
        boolean boolean7 = stackAr6.isFull();
        boolean boolean9 = stackAr6.equals((java.lang.Object) (byte) -1);
        java.lang.String str10 = stackAr6.toString();
        org.autotest.StackAr stackAr11 = new org.autotest.StackAr();
        boolean boolean12 = stackAr11.isFull();
        boolean boolean14 = stackAr11.equals((java.lang.Object) (byte) -1);
        org.autotest.StackAr stackAr16 = new org.autotest.StackAr((int) '4');
        boolean boolean17 = stackAr11.equals((java.lang.Object) '4');
        org.autotest.StackAr stackAr19 = new org.autotest.StackAr((int) 'a');
        boolean boolean21 = stackAr19.equals((java.lang.Object) (-1.0f));
        boolean boolean23 = stackAr19.equals((java.lang.Object) "");
        boolean boolean24 = stackAr11.equals((java.lang.Object) "");
        boolean boolean25 = stackAr11.isFull();
        boolean boolean27 = stackAr11.equals((java.lang.Object) 10L);
        boolean boolean28 = stackAr6.equals((java.lang.Object) boolean27);
        boolean boolean29 = stackAr6.isEmpty();
        boolean boolean30 = stackAr6.isEmpty();
        boolean boolean31 = stackAr1.equals((java.lang.Object) stackAr6);
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
        java.lang.String str51 = stackAr33.toString();
        boolean boolean52 = stackAr6.equals((java.lang.Object) stackAr33);
        java.lang.Object obj53 = stackAr33.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr33", stackAr33.repOK());
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test361");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '4');
        java.lang.String str2 = stackAr1.toString();
        int int3 = stackAr1.size();
        boolean boolean4 = stackAr1.isEmpty();
        org.autotest.StackAr stackAr6 = new org.autotest.StackAr((int) (short) 100);
        java.lang.String str7 = stackAr6.toString();
        boolean boolean8 = stackAr6.isFull();
        org.autotest.StackAr stackAr10 = new org.autotest.StackAr((int) 'a');
        java.lang.String str11 = stackAr10.toString();
        stackAr10.push((java.lang.Object) (short) 10);
        stackAr6.push((java.lang.Object) stackAr10);
        java.lang.Object obj15 = stackAr6.top();
        int int16 = stackAr6.size();
        boolean boolean17 = stackAr6.isEmpty();
        stackAr1.push((java.lang.Object) boolean17);
        java.lang.Object obj19 = stackAr1.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr1", stackAr1.repOK());
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test362");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '4');
        int int2 = stackAr1.size();
        boolean boolean3 = stackAr1.isEmpty();
        stackAr1.push((java.lang.Object) (byte) 0);
        int int6 = stackAr1.size();
        org.autotest.StackAr stackAr8 = new org.autotest.StackAr((int) ' ');
        boolean boolean9 = stackAr8.isEmpty();
        boolean boolean10 = stackAr8.isEmpty();
        stackAr1.push((java.lang.Object) stackAr8);
        org.autotest.StackAr stackAr13 = new org.autotest.StackAr((int) '4');
        int int14 = stackAr13.size();
        int int15 = stackAr13.size();
        boolean boolean16 = stackAr13.isFull();
        org.autotest.StackAr stackAr18 = new org.autotest.StackAr((int) ' ');
        stackAr13.push((java.lang.Object) ' ');
        java.lang.String str20 = stackAr13.toString();
        stackAr13.push((java.lang.Object) "");
        java.lang.Class<?> wildcardClass23 = stackAr13.getClass();
        stackAr1.push((java.lang.Object) wildcardClass23);
        boolean boolean25 = stackAr1.isEmpty();
        org.autotest.StackAr stackAr26 = new org.autotest.StackAr();
        boolean boolean27 = stackAr26.isFull();
        int int28 = stackAr26.size();
        org.autotest.StackAr stackAr29 = new org.autotest.StackAr();
        boolean boolean30 = stackAr29.isFull();
        int int31 = stackAr29.size();
        org.autotest.StackAr stackAr33 = new org.autotest.StackAr((int) (short) 0);
        stackAr29.push((java.lang.Object) (short) 0);
        org.autotest.StackAr stackAr36 = new org.autotest.StackAr((int) 'a');
        java.lang.String str37 = stackAr36.toString();
        stackAr36.push((java.lang.Object) 0.0f);
        org.autotest.StackAr stackAr41 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean42 = stackAr41.isFull();
        boolean boolean43 = stackAr41.isEmpty();
        stackAr36.push((java.lang.Object) boolean43);
        org.autotest.StackAr stackAr46 = new org.autotest.StackAr((int) '4');
        int int47 = stackAr46.size();
        java.lang.String str48 = stackAr46.toString();
        int int49 = stackAr46.size();
        boolean boolean50 = stackAr46.isEmpty();
        java.lang.String str51 = stackAr46.toString();
        boolean boolean52 = stackAr46.isFull();
        boolean boolean53 = stackAr36.equals((java.lang.Object) boolean52);
        java.lang.String str54 = stackAr36.toString();
        boolean boolean55 = stackAr29.equals((java.lang.Object) str54);
        java.lang.Object obj56 = stackAr29.top();
        boolean boolean57 = stackAr26.equals(obj56);
        stackAr1.push(obj56);
        java.lang.Object obj59 = stackAr1.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr1", stackAr1.repOK());
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test363");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean2 = stackAr1.isEmpty();
        boolean boolean3 = stackAr1.isFull();
        org.autotest.StackAr stackAr4 = new org.autotest.StackAr();
        boolean boolean5 = stackAr4.isFull();
        org.autotest.StackAr stackAr7 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean8 = stackAr7.isEmpty();
        boolean boolean9 = stackAr7.isFull();
        boolean boolean10 = stackAr4.equals((java.lang.Object) boolean9);
        boolean boolean11 = stackAr1.equals((java.lang.Object) stackAr4);
        int int12 = stackAr1.size();
        int int13 = stackAr1.size();
        org.autotest.StackAr stackAr14 = new org.autotest.StackAr();
        boolean boolean15 = stackAr14.isFull();
        int int16 = stackAr14.size();
        boolean boolean18 = stackAr14.equals((java.lang.Object) (-1.0f));
        java.lang.String str19 = stackAr14.toString();
        org.autotest.StackAr stackAr21 = new org.autotest.StackAr((int) '4');
        int int22 = stackAr21.size();
        boolean boolean23 = stackAr21.isEmpty();
        stackAr21.push((java.lang.Object) (byte) 0);
        int int26 = stackAr21.size();
        org.autotest.StackAr stackAr28 = new org.autotest.StackAr((int) ' ');
        boolean boolean29 = stackAr28.isEmpty();
        boolean boolean30 = stackAr28.isEmpty();
        stackAr21.push((java.lang.Object) stackAr28);
        stackAr14.push((java.lang.Object) stackAr21);
        boolean boolean33 = stackAr1.equals((java.lang.Object) stackAr14);
        java.lang.Object obj34 = stackAr14.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr14", stackAr14.repOK());
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test364");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) (short) 100);
        java.lang.String str2 = stackAr1.toString();
        boolean boolean3 = stackAr1.isFull();
        org.autotest.StackAr stackAr5 = new org.autotest.StackAr((int) 'a');
        java.lang.String str6 = stackAr5.toString();
        stackAr5.push((java.lang.Object) (short) 10);
        stackAr1.push((java.lang.Object) stackAr5);
        java.lang.Object obj10 = stackAr1.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr1", stackAr1.repOK());
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test365");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '4');
        int int2 = stackAr1.size();
        boolean boolean3 = stackAr1.isEmpty();
        stackAr1.push((java.lang.Object) (byte) 0);
        java.lang.Object obj6 = new java.lang.Object();
        boolean boolean7 = stackAr1.equals(obj6);
        boolean boolean8 = stackAr1.isEmpty();
        boolean boolean9 = stackAr1.isEmpty();
        java.lang.String str10 = stackAr1.toString();
        org.autotest.StackAr stackAr12 = new org.autotest.StackAr((int) ' ');
        org.autotest.StackAr stackAr13 = new org.autotest.StackAr();
        org.autotest.StackAr stackAr14 = new org.autotest.StackAr();
        boolean boolean15 = stackAr14.isFull();
        int int16 = stackAr14.size();
        boolean boolean17 = stackAr14.isEmpty();
        org.autotest.StackAr stackAr19 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean20 = stackAr19.isFull();
        java.lang.Class<?> wildcardClass21 = stackAr19.getClass();
        stackAr14.push((java.lang.Object) wildcardClass21);
        boolean boolean23 = stackAr13.equals((java.lang.Object) stackAr14);
        java.lang.Class<?> wildcardClass24 = stackAr13.getClass();
        stackAr12.push((java.lang.Object) stackAr13);
        boolean boolean26 = stackAr12.isEmpty();
        java.lang.Class<?> wildcardClass27 = stackAr12.getClass();
        boolean boolean28 = stackAr1.equals((java.lang.Object) stackAr12);
        java.lang.Object obj29 = stackAr1.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr1", stackAr1.repOK());
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test366");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) 'a');
        java.lang.String str2 = stackAr1.toString();
        stackAr1.push((java.lang.Object) 0.0f);
        boolean boolean5 = stackAr1.isFull();
        java.lang.Object obj6 = stackAr1.top();
        boolean boolean7 = stackAr1.isFull();
        java.lang.String str8 = stackAr1.toString();
        org.autotest.StackAr stackAr10 = new org.autotest.StackAr((int) (byte) 10);
        boolean boolean11 = stackAr1.equals((java.lang.Object) (byte) 10);
        java.lang.Object obj12 = stackAr1.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr1", stackAr1.repOK());
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test367");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        boolean boolean1 = stackAr0.isFull();
        boolean boolean3 = stackAr0.equals((java.lang.Object) (byte) -1);
        int int4 = stackAr0.size();
        boolean boolean5 = stackAr0.isEmpty();
        org.autotest.StackAr stackAr7 = new org.autotest.StackAr((int) 'a');
        java.lang.String str8 = stackAr7.toString();
        org.autotest.StackAr stackAr10 = new org.autotest.StackAr((int) 'a');
        org.autotest.StackAr stackAr11 = new org.autotest.StackAr();
        boolean boolean12 = stackAr11.isFull();
        int int13 = stackAr11.size();
        boolean boolean14 = stackAr11.isEmpty();
        stackAr10.push((java.lang.Object) stackAr11);
        boolean boolean16 = stackAr7.equals((java.lang.Object) stackAr11);
        org.autotest.StackAr stackAr18 = new org.autotest.StackAr((int) '4');
        int int19 = stackAr18.size();
        int int20 = stackAr18.size();
        boolean boolean21 = stackAr18.isFull();
        org.autotest.StackAr stackAr23 = new org.autotest.StackAr((int) ' ');
        stackAr18.push((java.lang.Object) ' ');
        boolean boolean25 = stackAr11.equals((java.lang.Object) stackAr18);
        org.autotest.StackAr stackAr27 = new org.autotest.StackAr((int) '4');
        int int28 = stackAr27.size();
        boolean boolean29 = stackAr27.isEmpty();
        stackAr27.push((java.lang.Object) (byte) 0);
        java.lang.String str32 = stackAr27.toString();
        stackAr11.push((java.lang.Object) stackAr27);
        int int34 = stackAr27.size();
        int int35 = stackAr27.size();
        stackAr0.push((java.lang.Object) stackAr27);
        org.autotest.StackAr stackAr37 = new org.autotest.StackAr();
        boolean boolean38 = stackAr37.isFull();
        boolean boolean40 = stackAr37.equals((java.lang.Object) (byte) -1);
        java.lang.String str41 = stackAr37.toString();
        boolean boolean43 = stackAr37.equals((java.lang.Object) 10L);
        boolean boolean44 = stackAr37.isEmpty();
        boolean boolean45 = stackAr37.isEmpty();
        java.lang.String str46 = stackAr37.toString();
        stackAr0.push((java.lang.Object) str46);
        java.lang.Object obj48 = stackAr0.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr0", stackAr0.repOK());
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test368");
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
        java.lang.String str19 = stackAr10.toString();
        java.lang.Object obj20 = stackAr10.top();
        boolean boolean21 = stackAr10.isEmpty();
        java.lang.Object obj22 = stackAr10.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr10", stackAr10.repOK());
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test369");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) 'a');
        java.lang.String str2 = stackAr1.toString();
        stackAr1.push((java.lang.Object) 0.0f);
        boolean boolean6 = stackAr1.equals((java.lang.Object) (byte) -1);
        int int7 = stackAr1.size();
        boolean boolean8 = stackAr1.isEmpty();
        java.lang.String str9 = stackAr1.toString();
        boolean boolean10 = stackAr1.isEmpty();
        java.lang.Object obj11 = stackAr1.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr1", stackAr1.repOK());
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test370");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '4');
        int int2 = stackAr1.size();
        boolean boolean3 = stackAr1.isEmpty();
        stackAr1.push((java.lang.Object) (byte) 0);
        java.lang.String str6 = stackAr1.toString();
        boolean boolean7 = stackAr1.isEmpty();
        int int8 = stackAr1.size();
        java.lang.Object obj9 = stackAr1.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr1", stackAr1.repOK());
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test371");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        boolean boolean1 = stackAr0.isFull();
        int int2 = stackAr0.size();
        boolean boolean3 = stackAr0.isFull();
        org.autotest.StackAr stackAr4 = new org.autotest.StackAr();
        boolean boolean5 = stackAr4.isFull();
        boolean boolean7 = stackAr4.equals((java.lang.Object) (byte) -1);
        java.lang.String str8 = stackAr4.toString();
        boolean boolean10 = stackAr4.equals((java.lang.Object) 10L);
        boolean boolean11 = stackAr4.isEmpty();
        boolean boolean12 = stackAr4.isEmpty();
        boolean boolean13 = stackAr4.isEmpty();
        stackAr0.push((java.lang.Object) boolean13);
        java.lang.Object obj15 = stackAr0.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr0", stackAr0.repOK());
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test372");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) 'a');
        boolean boolean3 = stackAr1.equals((java.lang.Object) (-1.0f));
        boolean boolean4 = stackAr1.isFull();
        boolean boolean5 = stackAr1.isFull();
        stackAr1.push((java.lang.Object) "[0,[0]]");
        org.autotest.StackAr stackAr9 = new org.autotest.StackAr((int) '4');
        int int10 = stackAr9.size();
        int int11 = stackAr9.size();
        boolean boolean12 = stackAr9.isFull();
        java.lang.String str13 = stackAr9.toString();
        org.autotest.StackAr stackAr15 = new org.autotest.StackAr((int) ' ');
        int int16 = stackAr15.size();
        boolean boolean17 = stackAr9.equals((java.lang.Object) stackAr15);
        boolean boolean18 = stackAr1.equals((java.lang.Object) stackAr9);
        java.lang.Object obj19 = stackAr1.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr1", stackAr1.repOK());
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test373");
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
        org.autotest.StackAr stackAr17 = new org.autotest.StackAr((int) 'a');
        java.lang.String str18 = stackAr17.toString();
        stackAr17.push((java.lang.Object) 0.0f);
        org.autotest.StackAr stackAr22 = new org.autotest.StackAr((int) '4');
        java.lang.String str23 = stackAr22.toString();
        boolean boolean24 = stackAr17.equals((java.lang.Object) stackAr22);
        org.autotest.StackAr stackAr26 = new org.autotest.StackAr((int) 'a');
        boolean boolean28 = stackAr26.equals((java.lang.Object) (-1.0f));
        boolean boolean30 = stackAr26.equals((java.lang.Object) "");
        org.autotest.StackAr stackAr31 = new org.autotest.StackAr();
        boolean boolean32 = stackAr31.isFull();
        stackAr26.push((java.lang.Object) stackAr31);
        boolean boolean34 = stackAr22.equals((java.lang.Object) stackAr26);
        boolean boolean35 = stackAr10.equals((java.lang.Object) stackAr22);
        org.autotest.StackAr stackAr36 = new org.autotest.StackAr();
        boolean boolean37 = stackAr36.isFull();
        int int38 = stackAr36.size();
        boolean boolean39 = stackAr36.isEmpty();
        org.autotest.StackAr stackAr41 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean42 = stackAr41.isFull();
        java.lang.Class<?> wildcardClass43 = stackAr41.getClass();
        stackAr36.push((java.lang.Object) wildcardClass43);
        org.autotest.StackAr stackAr46 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean47 = stackAr46.isEmpty();
        java.lang.Class<?> wildcardClass48 = stackAr46.getClass();
        boolean boolean49 = stackAr36.equals((java.lang.Object) wildcardClass48);
        boolean boolean50 = stackAr36.isFull();
        boolean boolean51 = stackAr36.isEmpty();
        org.autotest.StackAr stackAr52 = new org.autotest.StackAr();
        boolean boolean53 = stackAr52.isFull();
        boolean boolean55 = stackAr52.equals((java.lang.Object) (byte) -1);
        java.lang.String str56 = stackAr52.toString();
        boolean boolean58 = stackAr52.equals((java.lang.Object) 10L);
        boolean boolean59 = stackAr52.isEmpty();
        boolean boolean60 = stackAr52.isEmpty();
        java.lang.String str61 = stackAr52.toString();
        boolean boolean62 = stackAr36.equals((java.lang.Object) str61);
        stackAr22.push((java.lang.Object) boolean62);
        java.lang.String str64 = stackAr22.toString();
        java.lang.String str65 = stackAr22.toString();
        int int66 = stackAr22.size();
        boolean boolean67 = stackAr22.isEmpty();
        java.lang.Object obj68 = stackAr22.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr22", stackAr22.repOK());
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test374");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '4');
        int int2 = stackAr1.size();
        int int3 = stackAr1.size();
        boolean boolean4 = stackAr1.isFull();
        int int5 = stackAr1.size();
        org.autotest.StackAr stackAr7 = new org.autotest.StackAr((int) '4');
        int int8 = stackAr7.size();
        int int9 = stackAr7.size();
        boolean boolean10 = stackAr7.isFull();
        org.autotest.StackAr stackAr11 = new org.autotest.StackAr();
        boolean boolean12 = stackAr11.isFull();
        boolean boolean14 = stackAr11.equals((java.lang.Object) (byte) -1);
        org.autotest.StackAr stackAr16 = new org.autotest.StackAr((int) '4');
        boolean boolean17 = stackAr11.equals((java.lang.Object) '4');
        org.autotest.StackAr stackAr19 = new org.autotest.StackAr((int) 'a');
        boolean boolean21 = stackAr19.equals((java.lang.Object) (-1.0f));
        boolean boolean23 = stackAr19.equals((java.lang.Object) "");
        boolean boolean24 = stackAr11.equals((java.lang.Object) "");
        boolean boolean25 = stackAr11.isFull();
        stackAr7.push((java.lang.Object) stackAr11);
        org.autotest.StackAr stackAr28 = new org.autotest.StackAr(0);
        boolean boolean29 = stackAr7.equals((java.lang.Object) stackAr28);
        stackAr1.push((java.lang.Object) stackAr28);
        java.lang.String str31 = stackAr1.toString();
        java.lang.Object obj32 = stackAr1.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr1", stackAr1.repOK());
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test375");
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
        org.autotest.StackAr stackAr17 = new org.autotest.StackAr((int) 'a');
        java.lang.String str18 = stackAr17.toString();
        stackAr17.push((java.lang.Object) 0.0f);
        org.autotest.StackAr stackAr22 = new org.autotest.StackAr((int) '4');
        java.lang.String str23 = stackAr22.toString();
        boolean boolean24 = stackAr17.equals((java.lang.Object) stackAr22);
        org.autotest.StackAr stackAr26 = new org.autotest.StackAr((int) 'a');
        boolean boolean28 = stackAr26.equals((java.lang.Object) (-1.0f));
        boolean boolean30 = stackAr26.equals((java.lang.Object) "");
        org.autotest.StackAr stackAr31 = new org.autotest.StackAr();
        boolean boolean32 = stackAr31.isFull();
        stackAr26.push((java.lang.Object) stackAr31);
        boolean boolean34 = stackAr22.equals((java.lang.Object) stackAr26);
        boolean boolean35 = stackAr10.equals((java.lang.Object) stackAr22);
        boolean boolean36 = stackAr10.isEmpty();
        org.autotest.StackAr stackAr38 = new org.autotest.StackAr((int) 'a');
        boolean boolean40 = stackAr38.equals((java.lang.Object) (-1.0f));
        boolean boolean42 = stackAr38.equals((java.lang.Object) "");
        stackAr38.push((java.lang.Object) (-1.0d));
        org.autotest.StackAr stackAr45 = new org.autotest.StackAr();
        boolean boolean46 = stackAr45.isFull();
        org.autotest.StackAr stackAr48 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean49 = stackAr48.isEmpty();
        boolean boolean50 = stackAr48.isFull();
        boolean boolean51 = stackAr45.equals((java.lang.Object) boolean50);
        stackAr38.push((java.lang.Object) boolean50);
        stackAr10.push((java.lang.Object) stackAr38);
        java.lang.Object obj54 = stackAr38.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr38", stackAr38.repOK());
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test376");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) 'a');
        java.lang.String str2 = stackAr1.toString();
        stackAr1.push((java.lang.Object) 0.0f);
        org.autotest.StackAr stackAr6 = new org.autotest.StackAr((int) '4');
        java.lang.String str7 = stackAr6.toString();
        boolean boolean8 = stackAr1.equals((java.lang.Object) stackAr6);
        org.autotest.StackAr stackAr10 = new org.autotest.StackAr((int) '4');
        int int11 = stackAr10.size();
        java.lang.Class<?> wildcardClass12 = stackAr10.getClass();
        stackAr6.push((java.lang.Object) stackAr10);
        boolean boolean14 = stackAr6.isEmpty();
        org.autotest.StackAr stackAr16 = new org.autotest.StackAr((int) (short) 1);
        boolean boolean17 = stackAr16.isFull();
        org.autotest.StackAr stackAr19 = new org.autotest.StackAr((int) (short) 1);
        boolean boolean20 = stackAr19.isFull();
        boolean boolean21 = stackAr16.equals((java.lang.Object) stackAr19);
        boolean boolean22 = stackAr16.isFull();
        org.autotest.StackAr stackAr24 = new org.autotest.StackAr((int) '4');
        stackAr24.push((java.lang.Object) (-1L));
        boolean boolean27 = stackAr24.isEmpty();
        java.lang.String str28 = stackAr24.toString();
        boolean boolean29 = stackAr16.equals((java.lang.Object) stackAr24);
        boolean boolean30 = stackAr24.isEmpty();
        boolean boolean31 = stackAr24.isFull();
        java.lang.Object obj32 = stackAr24.top();
        boolean boolean33 = stackAr6.equals(obj32);
        java.lang.Object obj34 = stackAr6.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr6", stackAr6.repOK());
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test377");
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
        int int22 = stackAr1.size();
        boolean boolean23 = stackAr1.isFull();
        org.autotest.StackAr stackAr25 = new org.autotest.StackAr((int) 'a');
        boolean boolean27 = stackAr25.equals((java.lang.Object) (-1.0f));
        boolean boolean28 = stackAr25.isFull();
        org.autotest.StackAr stackAr29 = new org.autotest.StackAr();
        boolean boolean30 = stackAr29.isFull();
        int int31 = stackAr29.size();
        boolean boolean32 = stackAr29.isEmpty();
        org.autotest.StackAr stackAr34 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean35 = stackAr34.isFull();
        java.lang.Class<?> wildcardClass36 = stackAr34.getClass();
        stackAr29.push((java.lang.Object) wildcardClass36);
        org.autotest.StackAr stackAr39 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean40 = stackAr39.isEmpty();
        boolean boolean41 = stackAr39.isEmpty();
        org.autotest.StackAr stackAr42 = new org.autotest.StackAr();
        java.lang.Class<?> wildcardClass43 = stackAr42.getClass();
        boolean boolean44 = stackAr39.equals((java.lang.Object) stackAr42);
        java.lang.Class<?> wildcardClass45 = stackAr42.getClass();
        stackAr29.push((java.lang.Object) wildcardClass45);
        stackAr25.push((java.lang.Object) stackAr29);
        java.lang.String str48 = stackAr29.toString();
        java.lang.Object obj49 = stackAr29.top();
        stackAr1.push((java.lang.Object) stackAr29);
        java.lang.Object obj51 = stackAr29.top();
        java.lang.Object obj52 = stackAr29.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr29", stackAr29.repOK());
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test378");
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
        java.lang.Object obj19 = stackAr0.top();
        java.lang.Object obj20 = stackAr0.top();
        org.autotest.StackAr stackAr22 = new org.autotest.StackAr((int) (short) 1);
        org.autotest.StackAr stackAr24 = new org.autotest.StackAr((int) 'a');
        boolean boolean26 = stackAr24.equals((java.lang.Object) (-1.0f));
        boolean boolean27 = stackAr24.isFull();
        org.autotest.StackAr stackAr28 = new org.autotest.StackAr();
        boolean boolean29 = stackAr28.isFull();
        int int30 = stackAr28.size();
        boolean boolean31 = stackAr28.isEmpty();
        org.autotest.StackAr stackAr33 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean34 = stackAr33.isFull();
        java.lang.Class<?> wildcardClass35 = stackAr33.getClass();
        stackAr28.push((java.lang.Object) wildcardClass35);
        org.autotest.StackAr stackAr38 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean39 = stackAr38.isEmpty();
        boolean boolean40 = stackAr38.isEmpty();
        org.autotest.StackAr stackAr41 = new org.autotest.StackAr();
        java.lang.Class<?> wildcardClass42 = stackAr41.getClass();
        boolean boolean43 = stackAr38.equals((java.lang.Object) stackAr41);
        java.lang.Class<?> wildcardClass44 = stackAr41.getClass();
        stackAr28.push((java.lang.Object) wildcardClass44);
        stackAr24.push((java.lang.Object) stackAr28);
        stackAr22.push((java.lang.Object) stackAr28);
        org.autotest.StackAr stackAr49 = new org.autotest.StackAr((int) 'a');
        boolean boolean50 = stackAr49.isFull();
        java.lang.Class<?> wildcardClass51 = stackAr49.getClass();
        boolean boolean52 = stackAr22.equals((java.lang.Object) wildcardClass51);
        java.lang.Object obj53 = stackAr22.top();
        java.lang.Object obj54 = stackAr22.top();
        boolean boolean55 = stackAr22.isEmpty();
        org.autotest.StackAr stackAr57 = new org.autotest.StackAr(10);
        boolean boolean58 = stackAr57.isEmpty();
        org.autotest.StackAr stackAr59 = new org.autotest.StackAr();
        boolean boolean60 = stackAr59.isFull();
        boolean boolean62 = stackAr59.equals((java.lang.Object) (byte) -1);
        java.lang.String str63 = stackAr59.toString();
        boolean boolean65 = stackAr59.equals((java.lang.Object) 10L);
        stackAr57.push((java.lang.Object) 10L);
        boolean boolean67 = stackAr22.equals((java.lang.Object) stackAr57);
        stackAr0.push((java.lang.Object) boolean67);
        java.lang.Object obj69 = stackAr0.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr0", stackAr0.repOK());
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test379");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '4');
        org.autotest.StackAr stackAr3 = new org.autotest.StackAr((int) (short) 1);
        stackAr1.push((java.lang.Object) (short) 1);
        int int5 = stackAr1.size();
        int int6 = stackAr1.size();
        java.lang.Object obj7 = stackAr1.top();
        java.lang.String str8 = stackAr1.toString();
        org.autotest.StackAr stackAr10 = new org.autotest.StackAr((int) '4');
        int int11 = stackAr10.size();
        java.lang.String str12 = stackAr10.toString();
        int int13 = stackAr10.size();
        boolean boolean14 = stackAr10.isEmpty();
        org.autotest.StackAr stackAr16 = new org.autotest.StackAr((int) (short) 1);
        boolean boolean17 = stackAr16.isFull();
        org.autotest.StackAr stackAr19 = new org.autotest.StackAr((int) (short) 1);
        boolean boolean20 = stackAr19.isFull();
        boolean boolean21 = stackAr16.equals((java.lang.Object) stackAr19);
        java.lang.Class<?> wildcardClass22 = stackAr19.getClass();
        boolean boolean23 = stackAr10.equals((java.lang.Object) wildcardClass22);
        org.autotest.StackAr stackAr25 = new org.autotest.StackAr((int) '4');
        int int26 = stackAr25.size();
        int int27 = stackAr25.size();
        boolean boolean28 = stackAr25.isFull();
        org.autotest.StackAr stackAr29 = new org.autotest.StackAr();
        boolean boolean30 = stackAr29.isFull();
        boolean boolean32 = stackAr29.equals((java.lang.Object) (byte) -1);
        org.autotest.StackAr stackAr34 = new org.autotest.StackAr((int) '4');
        boolean boolean35 = stackAr29.equals((java.lang.Object) '4');
        org.autotest.StackAr stackAr37 = new org.autotest.StackAr((int) 'a');
        boolean boolean39 = stackAr37.equals((java.lang.Object) (-1.0f));
        boolean boolean41 = stackAr37.equals((java.lang.Object) "");
        boolean boolean42 = stackAr29.equals((java.lang.Object) "");
        boolean boolean43 = stackAr29.isFull();
        stackAr25.push((java.lang.Object) stackAr29);
        org.autotest.StackAr stackAr46 = new org.autotest.StackAr(0);
        boolean boolean47 = stackAr25.equals((java.lang.Object) stackAr46);
        boolean boolean48 = stackAr10.equals((java.lang.Object) stackAr46);
        stackAr1.push((java.lang.Object) stackAr10);
        java.lang.Object obj50 = stackAr1.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr1", stackAr1.repOK());
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test380");
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
        boolean boolean40 = stackAr17.isFull();
        java.lang.Object obj41 = stackAr17.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr17", stackAr17.repOK());
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test381");
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
        org.autotest.StackAr stackAr21 = new org.autotest.StackAr((int) 'a');
        boolean boolean23 = stackAr21.equals((java.lang.Object) (-1.0f));
        java.lang.String str24 = stackAr21.toString();
        int int25 = stackAr21.size();
        stackAr0.push((java.lang.Object) int25);
        org.autotest.StackAr stackAr28 = new org.autotest.StackAr((int) ' ');
        boolean boolean29 = stackAr0.equals((java.lang.Object) ' ');
        java.lang.Object obj30 = stackAr0.top();
        boolean boolean31 = stackAr0.isEmpty();
        int int32 = stackAr0.size();
        boolean boolean33 = stackAr0.isEmpty();
        java.lang.Object obj34 = stackAr0.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr0", stackAr0.repOK());
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test382");
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
        boolean boolean25 = stackAr1.isEmpty();
        boolean boolean26 = stackAr1.isEmpty();
        java.lang.Object obj27 = stackAr1.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr1", stackAr1.repOK());
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test383");
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
        org.autotest.StackAr stackAr28 = new org.autotest.StackAr((int) 'a');
        boolean boolean30 = stackAr28.equals((java.lang.Object) (-1.0f));
        int int31 = stackAr28.size();
        org.autotest.StackAr stackAr32 = new org.autotest.StackAr();
        boolean boolean33 = stackAr32.isFull();
        int int34 = stackAr32.size();
        boolean boolean35 = stackAr32.isEmpty();
        org.autotest.StackAr stackAr37 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean38 = stackAr37.isFull();
        java.lang.Class<?> wildcardClass39 = stackAr37.getClass();
        stackAr32.push((java.lang.Object) wildcardClass39);
        boolean boolean41 = stackAr28.equals((java.lang.Object) stackAr32);
        boolean boolean42 = stackAr20.equals((java.lang.Object) stackAr32);
        java.lang.Object obj43 = stackAr32.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr32", stackAr32.repOK());
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test384");
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
        int int42 = stackAr0.size();
        org.autotest.StackAr stackAr43 = new org.autotest.StackAr();
        boolean boolean44 = stackAr43.isFull();
        int int45 = stackAr43.size();
        org.autotest.StackAr stackAr47 = new org.autotest.StackAr((int) (short) 0);
        stackAr43.push((java.lang.Object) (short) 0);
        java.lang.String str49 = stackAr43.toString();
        java.lang.Object obj50 = stackAr43.top();
        boolean boolean51 = stackAr0.equals((java.lang.Object) stackAr43);
        java.lang.String str52 = stackAr43.toString();
        java.lang.Object obj53 = stackAr43.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr43", stackAr43.repOK());
    }
}

