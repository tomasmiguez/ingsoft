package org.autotest;

import org.junit.FixMethodOrder;
import org.junit.jupiter.api.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest6 {

    public static boolean debug = false;

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test301");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) 'a');
        java.lang.String str2 = stackAr1.toString();
        stackAr1.push((java.lang.Object) 0.0f);
        boolean boolean5 = stackAr1.isFull();
        java.lang.Object obj6 = stackAr1.top();
        boolean boolean7 = stackAr1.isFull();
        java.lang.String str8 = stackAr1.toString();
        boolean boolean9 = stackAr1.isEmpty();
        boolean boolean10 = stackAr1.isEmpty();
        java.lang.Object obj11 = stackAr1.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr1", stackAr1.repOK());
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test302");
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
        java.lang.Object obj15 = stackAr7.top();
        java.lang.String str16 = stackAr7.toString();
        java.lang.Object obj17 = stackAr7.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr7", stackAr7.repOK());
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test303");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) 'a');
        java.lang.String str2 = stackAr1.toString();
        stackAr1.push((java.lang.Object) 0.0f);
        org.autotest.StackAr stackAr6 = new org.autotest.StackAr((int) '4');
        java.lang.String str7 = stackAr6.toString();
        boolean boolean8 = stackAr1.equals((java.lang.Object) stackAr6);
        stackAr6.push((java.lang.Object) 1.0f);
        java.lang.Object obj11 = stackAr6.top();
        java.lang.Object obj12 = stackAr6.top();
        boolean boolean13 = stackAr6.isFull();
        boolean boolean14 = stackAr6.isFull();
        java.lang.Object obj15 = stackAr6.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr6", stackAr6.repOK());
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test304");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '4');
        int int2 = stackAr1.size();
        boolean boolean3 = stackAr1.isEmpty();
        stackAr1.push((java.lang.Object) (byte) 0);
        java.lang.Object obj6 = new java.lang.Object();
        boolean boolean7 = stackAr1.equals(obj6);
        int int8 = stackAr1.size();
        boolean boolean9 = stackAr1.isEmpty();
        java.lang.Object obj10 = stackAr1.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr1", stackAr1.repOK());
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test305");
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
        org.autotest.StackAr stackAr12 = new org.autotest.StackAr();
        java.lang.Class<?> wildcardClass13 = stackAr12.getClass();
        stackAr4.push((java.lang.Object) stackAr12);
        boolean boolean15 = stackAr4.isEmpty();
        java.lang.Object obj16 = stackAr4.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr4", stackAr4.repOK());
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test306");
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
        boolean boolean21 = stackAr1.isEmpty();
        org.autotest.StackAr stackAr23 = new org.autotest.StackAr((int) '4');
        int int24 = stackAr23.size();
        int int25 = stackAr23.size();
        boolean boolean26 = stackAr23.isFull();
        org.autotest.StackAr stackAr28 = new org.autotest.StackAr((int) ' ');
        stackAr23.push((java.lang.Object) ' ');
        java.lang.String str30 = stackAr23.toString();
        java.lang.String str31 = stackAr23.toString();
        stackAr1.push((java.lang.Object) stackAr23);
        java.lang.Object obj33 = stackAr1.top();
        boolean boolean34 = stackAr1.isEmpty();
        java.lang.Object obj35 = stackAr1.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr1", stackAr1.repOK());
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test307");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '4');
        int int2 = stackAr1.size();
        boolean boolean3 = stackAr1.isEmpty();
        int int4 = stackAr1.size();
        java.lang.String str5 = stackAr1.toString();
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
        boolean boolean33 = stackAr13.isFull();
        stackAr1.push((java.lang.Object) stackAr13);
        java.lang.Object obj35 = stackAr13.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr13", stackAr13.repOK());
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test308");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) 'a');
        org.autotest.StackAr stackAr2 = new org.autotest.StackAr();
        boolean boolean3 = stackAr2.isFull();
        int int4 = stackAr2.size();
        boolean boolean5 = stackAr2.isEmpty();
        stackAr1.push((java.lang.Object) stackAr2);
        int int7 = stackAr1.size();
        org.autotest.StackAr stackAr9 = new org.autotest.StackAr((int) (short) 1);
        org.autotest.StackAr stackAr11 = new org.autotest.StackAr((int) 'a');
        boolean boolean13 = stackAr11.equals((java.lang.Object) (-1.0f));
        boolean boolean14 = stackAr11.isFull();
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
        boolean boolean27 = stackAr25.isEmpty();
        org.autotest.StackAr stackAr28 = new org.autotest.StackAr();
        java.lang.Class<?> wildcardClass29 = stackAr28.getClass();
        boolean boolean30 = stackAr25.equals((java.lang.Object) stackAr28);
        java.lang.Class<?> wildcardClass31 = stackAr28.getClass();
        stackAr15.push((java.lang.Object) wildcardClass31);
        stackAr11.push((java.lang.Object) stackAr15);
        stackAr9.push((java.lang.Object) stackAr15);
        java.lang.Object obj35 = stackAr9.top();
        java.lang.String str36 = stackAr9.toString();
        stackAr1.push((java.lang.Object) stackAr9);
        org.autotest.StackAr stackAr38 = new org.autotest.StackAr();
        boolean boolean39 = stackAr38.isFull();
        boolean boolean41 = stackAr38.equals((java.lang.Object) (byte) -1);
        org.autotest.StackAr stackAr43 = new org.autotest.StackAr((int) '4');
        boolean boolean44 = stackAr38.equals((java.lang.Object) '4');
        org.autotest.StackAr stackAr46 = new org.autotest.StackAr((int) 'a');
        boolean boolean48 = stackAr46.equals((java.lang.Object) (-1.0f));
        boolean boolean50 = stackAr46.equals((java.lang.Object) "");
        boolean boolean51 = stackAr38.equals((java.lang.Object) "");
        org.autotest.StackAr stackAr53 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean54 = stackAr53.isEmpty();
        boolean boolean55 = stackAr53.isEmpty();
        stackAr38.push((java.lang.Object) stackAr53);
        boolean boolean57 = stackAr38.isFull();
        org.autotest.StackAr stackAr59 = new org.autotest.StackAr((int) 'a');
        boolean boolean61 = stackAr59.equals((java.lang.Object) (-1.0f));
        java.lang.String str62 = stackAr59.toString();
        int int63 = stackAr59.size();
        stackAr38.push((java.lang.Object) int63);
        org.autotest.StackAr stackAr66 = new org.autotest.StackAr((int) ' ');
        boolean boolean67 = stackAr38.equals((java.lang.Object) ' ');
        org.autotest.StackAr stackAr68 = new org.autotest.StackAr();
        boolean boolean69 = stackAr68.isFull();
        int int70 = stackAr68.size();
        boolean boolean71 = stackAr68.isEmpty();
        boolean boolean72 = stackAr68.isFull();
        boolean boolean73 = stackAr68.isFull();
        boolean boolean75 = stackAr68.equals((java.lang.Object) "[0.0,true]");
        stackAr38.push((java.lang.Object) stackAr68);
        boolean boolean77 = stackAr1.equals((java.lang.Object) stackAr38);
        java.lang.Object obj78 = stackAr1.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr1", stackAr1.repOK());
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test309");
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
        java.lang.String str12 = stackAr4.toString();
        java.lang.String str13 = stackAr4.toString();
        org.autotest.StackAr stackAr14 = new org.autotest.StackAr();
        boolean boolean15 = stackAr14.isFull();
        int int16 = stackAr14.size();
        boolean boolean17 = stackAr14.isEmpty();
        org.autotest.StackAr stackAr19 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean20 = stackAr19.isFull();
        java.lang.Class<?> wildcardClass21 = stackAr19.getClass();
        stackAr14.push((java.lang.Object) wildcardClass21);
        org.autotest.StackAr stackAr24 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean25 = stackAr24.isEmpty();
        java.lang.Class<?> wildcardClass26 = stackAr24.getClass();
        boolean boolean27 = stackAr14.equals((java.lang.Object) wildcardClass26);
        boolean boolean28 = stackAr14.isFull();
        boolean boolean29 = stackAr14.isEmpty();
        org.autotest.StackAr stackAr31 = new org.autotest.StackAr(0);
        java.lang.Class<?> wildcardClass32 = stackAr31.getClass();
        boolean boolean33 = stackAr14.equals((java.lang.Object) wildcardClass32);
        java.lang.Object obj34 = stackAr14.top();
        boolean boolean35 = stackAr14.isEmpty();
        stackAr4.push((java.lang.Object) stackAr14);
        java.lang.Object obj37 = stackAr4.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr4", stackAr4.repOK());
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test310");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) (short) 100);
        java.lang.String str2 = stackAr1.toString();
        boolean boolean3 = stackAr1.isFull();
        org.autotest.StackAr stackAr5 = new org.autotest.StackAr((int) 'a');
        java.lang.String str6 = stackAr5.toString();
        stackAr5.push((java.lang.Object) (short) 10);
        stackAr1.push((java.lang.Object) stackAr5);
        boolean boolean10 = stackAr5.isEmpty();
        java.lang.Object obj11 = stackAr5.top();
        boolean boolean12 = stackAr5.isEmpty();
        java.lang.String str13 = stackAr5.toString();
        java.lang.Object obj14 = stackAr5.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr5", stackAr5.repOK());
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test311");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        boolean boolean1 = stackAr0.isFull();
        boolean boolean3 = stackAr0.equals((java.lang.Object) (byte) -1);
        java.lang.String str4 = stackAr0.toString();
        boolean boolean6 = stackAr0.equals((java.lang.Object) 10L);
        boolean boolean7 = stackAr0.isEmpty();
        boolean boolean8 = stackAr0.isEmpty();
        java.lang.String str9 = stackAr0.toString();
        java.lang.String str10 = stackAr0.toString();
        boolean boolean11 = stackAr0.isEmpty();
        org.autotest.StackAr stackAr12 = new org.autotest.StackAr();
        int int13 = stackAr12.size();
        boolean boolean14 = stackAr12.isFull();
        boolean boolean15 = stackAr0.equals((java.lang.Object) stackAr12);
        org.autotest.StackAr stackAr17 = new org.autotest.StackAr((int) '4');
        org.autotest.StackAr stackAr19 = new org.autotest.StackAr((int) (short) 1);
        stackAr17.push((java.lang.Object) (short) 1);
        int int21 = stackAr17.size();
        int int22 = stackAr17.size();
        org.autotest.StackAr stackAr24 = new org.autotest.StackAr((int) 'a');
        java.lang.String str25 = stackAr24.toString();
        stackAr24.push((java.lang.Object) 0.0f);
        org.autotest.StackAr stackAr29 = new org.autotest.StackAr((int) '4');
        java.lang.String str30 = stackAr29.toString();
        boolean boolean31 = stackAr24.equals((java.lang.Object) stackAr29);
        org.autotest.StackAr stackAr33 = new org.autotest.StackAr((int) 'a');
        boolean boolean35 = stackAr33.equals((java.lang.Object) (-1.0f));
        boolean boolean37 = stackAr33.equals((java.lang.Object) "");
        org.autotest.StackAr stackAr38 = new org.autotest.StackAr();
        boolean boolean39 = stackAr38.isFull();
        stackAr33.push((java.lang.Object) stackAr38);
        boolean boolean41 = stackAr29.equals((java.lang.Object) stackAr33);
        java.lang.Object obj42 = stackAr33.top();
        boolean boolean43 = stackAr33.isEmpty();
        java.lang.Object obj44 = stackAr33.top();
        org.autotest.StackAr stackAr46 = new org.autotest.StackAr((int) '4');
        int int47 = stackAr46.size();
        java.lang.String str48 = stackAr46.toString();
        int int49 = stackAr46.size();
        org.autotest.StackAr stackAr50 = new org.autotest.StackAr();
        boolean boolean51 = stackAr50.isFull();
        boolean boolean53 = stackAr50.equals((java.lang.Object) (byte) -1);
        boolean boolean54 = stackAr46.equals((java.lang.Object) (byte) -1);
        java.lang.String str55 = stackAr46.toString();
        int int56 = stackAr46.size();
        stackAr33.push((java.lang.Object) stackAr46);
        stackAr17.push((java.lang.Object) stackAr46);
        boolean boolean59 = stackAr46.isEmpty();
        stackAr0.push((java.lang.Object) stackAr46);
        org.autotest.StackAr stackAr62 = new org.autotest.StackAr((int) 'a');
        boolean boolean64 = stackAr62.equals((java.lang.Object) (-1.0f));
        boolean boolean66 = stackAr62.equals((java.lang.Object) "");
        org.autotest.StackAr stackAr67 = new org.autotest.StackAr();
        boolean boolean68 = stackAr67.isFull();
        stackAr62.push((java.lang.Object) stackAr67);
        java.lang.Class<?> wildcardClass70 = stackAr67.getClass();
        boolean boolean71 = stackAr0.equals((java.lang.Object) wildcardClass70);
        boolean boolean72 = stackAr0.isFull();
        org.autotest.StackAr stackAr73 = new org.autotest.StackAr();
        boolean boolean74 = stackAr73.isFull();
        int int75 = stackAr73.size();
        boolean boolean76 = stackAr73.isEmpty();
        boolean boolean77 = stackAr73.isFull();
        boolean boolean78 = stackAr73.isFull();
        boolean boolean79 = stackAr73.isFull();
        boolean boolean80 = stackAr73.isFull();
        boolean boolean81 = stackAr73.isEmpty();
        java.lang.String str82 = stackAr73.toString();
        java.lang.String str83 = stackAr73.toString();
        stackAr0.push((java.lang.Object) stackAr73);
        java.lang.Object obj85 = stackAr0.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr0", stackAr0.repOK());
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test312");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '4');
        java.lang.String str2 = stackAr1.toString();
        java.lang.String str3 = stackAr1.toString();
        int int4 = stackAr1.size();
        boolean boolean5 = stackAr1.isFull();
        boolean boolean7 = stackAr1.equals((java.lang.Object) ' ');
        java.lang.Object obj8 = new java.lang.Object();
        java.lang.Class<?> wildcardClass9 = obj8.getClass();
        stackAr1.push((java.lang.Object) wildcardClass9);
        int int11 = stackAr1.size();
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
        org.autotest.StackAr stackAr55 = new org.autotest.StackAr((int) 'a');
        java.lang.String str56 = stackAr55.toString();
        stackAr55.push((java.lang.Object) 0.0f);
        org.autotest.StackAr stackAr60 = new org.autotest.StackAr((int) '4');
        java.lang.String str61 = stackAr60.toString();
        boolean boolean62 = stackAr55.equals((java.lang.Object) stackAr60);
        java.lang.String str63 = stackAr60.toString();
        boolean boolean64 = stackAr60.isEmpty();
        boolean boolean65 = stackAr60.isFull();
        boolean boolean66 = stackAr60.isEmpty();
        boolean boolean67 = stackAr12.equals((java.lang.Object) stackAr60);
        int int68 = stackAr12.size();
        boolean boolean69 = stackAr1.equals((java.lang.Object) stackAr12);
        java.lang.Object obj70 = stackAr1.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr1", stackAr1.repOK());
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test313");
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
        boolean boolean22 = stackAr1.isFull();
        int int23 = stackAr1.size();
        boolean boolean24 = stackAr1.isEmpty();
        java.lang.Object obj25 = stackAr1.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr1", stackAr1.repOK());
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test314");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '4');
        int int2 = stackAr1.size();
        boolean boolean3 = stackAr1.isEmpty();
        stackAr1.push((java.lang.Object) (byte) 0);
        java.lang.Object obj6 = new java.lang.Object();
        boolean boolean7 = stackAr1.equals(obj6);
        boolean boolean8 = stackAr1.isEmpty();
        java.lang.String str9 = stackAr1.toString();
        boolean boolean10 = stackAr1.isEmpty();
        java.lang.Object obj11 = stackAr1.top();
        java.lang.Object obj12 = stackAr1.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr1", stackAr1.repOK());
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test315");
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
        boolean boolean25 = stackAr5.isFull();
        java.lang.String str26 = stackAr5.toString();
        boolean boolean27 = stackAr5.isFull();
        java.lang.Object obj28 = stackAr5.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr5", stackAr5.repOK());
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test316");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) 'a');
        java.lang.String str2 = stackAr1.toString();
        stackAr1.push((java.lang.Object) (short) 10);
        boolean boolean5 = stackAr1.isEmpty();
        java.lang.Object obj6 = stackAr1.top();
        java.lang.String str7 = stackAr1.toString();
        java.lang.Object obj8 = stackAr1.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr1", stackAr1.repOK());
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test317");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) 'a');
        stackAr1.push((java.lang.Object) 'a');
        java.lang.Object obj4 = stackAr1.top();
        boolean boolean5 = stackAr1.isEmpty();
        int int6 = stackAr1.size();
        java.lang.Object obj7 = stackAr1.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr1", stackAr1.repOK());
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test318");
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
        java.lang.Object obj17 = stackAr0.top();
        boolean boolean18 = stackAr0.isFull();
        boolean boolean19 = stackAr0.isEmpty();
        org.autotest.StackAr stackAr20 = new org.autotest.StackAr();
        boolean boolean21 = stackAr20.isFull();
        boolean boolean23 = stackAr20.equals((java.lang.Object) (byte) -1);
        java.lang.String str24 = stackAr20.toString();
        org.autotest.StackAr stackAr25 = new org.autotest.StackAr();
        boolean boolean26 = stackAr25.isFull();
        boolean boolean28 = stackAr25.equals((java.lang.Object) (byte) -1);
        org.autotest.StackAr stackAr30 = new org.autotest.StackAr((int) '4');
        boolean boolean31 = stackAr25.equals((java.lang.Object) '4');
        org.autotest.StackAr stackAr33 = new org.autotest.StackAr((int) 'a');
        boolean boolean35 = stackAr33.equals((java.lang.Object) (-1.0f));
        boolean boolean37 = stackAr33.equals((java.lang.Object) "");
        boolean boolean38 = stackAr25.equals((java.lang.Object) "");
        boolean boolean39 = stackAr25.isFull();
        boolean boolean41 = stackAr25.equals((java.lang.Object) 10L);
        boolean boolean42 = stackAr20.equals((java.lang.Object) boolean41);
        boolean boolean43 = stackAr0.equals((java.lang.Object) stackAr20);
        java.lang.Object obj44 = stackAr0.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr0", stackAr0.repOK());
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test319");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) 'a');
        java.lang.String str2 = stackAr1.toString();
        stackAr1.push((java.lang.Object) 0.0f);
        org.autotest.StackAr stackAr6 = new org.autotest.StackAr((int) '4');
        java.lang.String str7 = stackAr6.toString();
        boolean boolean8 = stackAr1.equals((java.lang.Object) stackAr6);
        java.lang.String str9 = stackAr6.toString();
        boolean boolean10 = stackAr6.isEmpty();
        org.autotest.StackAr stackAr12 = new org.autotest.StackAr((int) '4');
        java.lang.String str13 = stackAr12.toString();
        boolean boolean14 = stackAr12.isEmpty();
        boolean boolean15 = stackAr12.isFull();
        boolean boolean16 = stackAr12.isFull();
        boolean boolean17 = stackAr12.isFull();
        boolean boolean18 = stackAr12.isFull();
        stackAr6.push((java.lang.Object) stackAr12);
        boolean boolean20 = stackAr6.isFull();
        org.autotest.StackAr stackAr22 = new org.autotest.StackAr((int) '4');
        java.lang.String str23 = stackAr22.toString();
        boolean boolean24 = stackAr22.isEmpty();
        org.autotest.StackAr stackAr26 = new org.autotest.StackAr((int) 'a');
        java.lang.String str27 = stackAr26.toString();
        stackAr26.push((java.lang.Object) 0.0f);
        org.autotest.StackAr stackAr31 = new org.autotest.StackAr((int) '4');
        java.lang.String str32 = stackAr31.toString();
        boolean boolean33 = stackAr26.equals((java.lang.Object) stackAr31);
        org.autotest.StackAr stackAr35 = new org.autotest.StackAr((int) 'a');
        boolean boolean37 = stackAr35.equals((java.lang.Object) (-1.0f));
        boolean boolean39 = stackAr35.equals((java.lang.Object) "");
        org.autotest.StackAr stackAr40 = new org.autotest.StackAr();
        boolean boolean41 = stackAr40.isFull();
        stackAr35.push((java.lang.Object) stackAr40);
        boolean boolean43 = stackAr31.equals((java.lang.Object) stackAr35);
        org.autotest.StackAr stackAr44 = new org.autotest.StackAr();
        boolean boolean45 = stackAr44.isFull();
        boolean boolean47 = stackAr44.equals((java.lang.Object) (byte) -1);
        java.lang.String str48 = stackAr44.toString();
        boolean boolean50 = stackAr44.equals((java.lang.Object) 10L);
        java.lang.String str51 = stackAr44.toString();
        java.lang.Class<?> wildcardClass52 = stackAr44.getClass();
        boolean boolean53 = stackAr31.equals((java.lang.Object) wildcardClass52);
        org.autotest.StackAr stackAr54 = new org.autotest.StackAr();
        boolean boolean55 = stackAr54.isFull();
        boolean boolean57 = stackAr54.equals((java.lang.Object) (byte) -1);
        org.autotest.StackAr stackAr59 = new org.autotest.StackAr((int) '4');
        boolean boolean60 = stackAr54.equals((java.lang.Object) '4');
        org.autotest.StackAr stackAr62 = new org.autotest.StackAr((int) 'a');
        boolean boolean64 = stackAr62.equals((java.lang.Object) (-1.0f));
        boolean boolean66 = stackAr62.equals((java.lang.Object) "");
        boolean boolean67 = stackAr54.equals((java.lang.Object) "");
        stackAr54.push((java.lang.Object) (byte) 0);
        boolean boolean70 = stackAr31.equals((java.lang.Object) (byte) 0);
        boolean boolean71 = stackAr22.equals((java.lang.Object) stackAr31);
        int int72 = stackAr22.size();
        stackAr6.push((java.lang.Object) stackAr22);
        java.lang.Object obj74 = stackAr6.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr6", stackAr6.repOK());
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test320");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '4');
        java.lang.String str2 = stackAr1.toString();
        boolean boolean3 = stackAr1.isEmpty();
        boolean boolean4 = stackAr1.isFull();
        org.autotest.StackAr stackAr5 = new org.autotest.StackAr();
        boolean boolean6 = stackAr5.isFull();
        int int7 = stackAr5.size();
        org.autotest.StackAr stackAr9 = new org.autotest.StackAr((int) (short) 0);
        stackAr5.push((java.lang.Object) (short) 0);
        stackAr1.push((java.lang.Object) (short) 0);
        java.lang.String str12 = stackAr1.toString();
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
        boolean boolean32 = stackAr13.isFull();
        org.autotest.StackAr stackAr34 = new org.autotest.StackAr((int) 'a');
        boolean boolean36 = stackAr34.equals((java.lang.Object) (-1.0f));
        java.lang.String str37 = stackAr34.toString();
        int int38 = stackAr34.size();
        stackAr13.push((java.lang.Object) int38);
        boolean boolean40 = stackAr13.isFull();
        boolean boolean41 = stackAr13.isFull();
        stackAr1.push((java.lang.Object) stackAr13);
        java.lang.Object obj43 = stackAr13.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr13", stackAr13.repOK());
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test321");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) (byte) 1);
        org.autotest.StackAr stackAr3 = new org.autotest.StackAr((int) '4');
        java.lang.String str4 = stackAr3.toString();
        stackAr1.push((java.lang.Object) str4);
        boolean boolean6 = stackAr1.isFull();
        java.lang.Object obj7 = stackAr1.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr1", stackAr1.repOK());
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test322");
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
        boolean boolean26 = stackAr5.isFull();
        java.lang.String str27 = stackAr5.toString();
        java.lang.Object obj28 = stackAr5.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr5", stackAr5.repOK());
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test323");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) 'a');
        org.autotest.StackAr stackAr2 = new org.autotest.StackAr();
        boolean boolean3 = stackAr2.isFull();
        int int4 = stackAr2.size();
        boolean boolean5 = stackAr2.isEmpty();
        stackAr1.push((java.lang.Object) stackAr2);
        boolean boolean7 = stackAr1.isEmpty();
        java.lang.Object obj8 = stackAr1.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr1", stackAr1.repOK());
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test324");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) 'a');
        java.lang.String str2 = stackAr1.toString();
        stackAr1.push((java.lang.Object) 0.0f);
        boolean boolean6 = stackAr1.equals((java.lang.Object) (byte) -1);
        boolean boolean7 = stackAr1.isEmpty();
        org.autotest.StackAr stackAr9 = new org.autotest.StackAr((int) '4');
        int int10 = stackAr9.size();
        org.autotest.StackAr stackAr12 = new org.autotest.StackAr((int) 'a');
        stackAr12.push((java.lang.Object) 'a');
        java.lang.Object obj15 = stackAr12.top();
        boolean boolean16 = stackAr12.isEmpty();
        java.lang.Object obj17 = stackAr12.top();
        stackAr9.push(obj17);
        java.lang.String str19 = stackAr9.toString();
        int int20 = stackAr9.size();
        java.lang.Class<?> wildcardClass21 = stackAr9.getClass();
        boolean boolean22 = stackAr1.equals((java.lang.Object) stackAr9);
        java.lang.Object obj23 = stackAr1.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr1", stackAr1.repOK());
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test325");
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
        org.autotest.StackAr stackAr21 = new org.autotest.StackAr((int) (short) 1);
        boolean boolean22 = stackAr21.isFull();
        org.autotest.StackAr stackAr24 = new org.autotest.StackAr((int) (short) 1);
        boolean boolean25 = stackAr24.isFull();
        boolean boolean26 = stackAr21.equals((java.lang.Object) stackAr24);
        org.autotest.StackAr stackAr28 = new org.autotest.StackAr((int) '4');
        int int29 = stackAr28.size();
        int int30 = stackAr28.size();
        boolean boolean31 = stackAr28.isFull();
        org.autotest.StackAr stackAr32 = new org.autotest.StackAr();
        boolean boolean33 = stackAr32.isFull();
        boolean boolean35 = stackAr32.equals((java.lang.Object) (byte) -1);
        org.autotest.StackAr stackAr37 = new org.autotest.StackAr((int) '4');
        boolean boolean38 = stackAr32.equals((java.lang.Object) '4');
        org.autotest.StackAr stackAr40 = new org.autotest.StackAr((int) 'a');
        boolean boolean42 = stackAr40.equals((java.lang.Object) (-1.0f));
        boolean boolean44 = stackAr40.equals((java.lang.Object) "");
        boolean boolean45 = stackAr32.equals((java.lang.Object) "");
        boolean boolean46 = stackAr32.isFull();
        stackAr28.push((java.lang.Object) stackAr32);
        org.autotest.StackAr stackAr49 = new org.autotest.StackAr(0);
        boolean boolean50 = stackAr28.equals((java.lang.Object) stackAr49);
        stackAr21.push((java.lang.Object) boolean50);
        boolean boolean52 = stackAr21.isFull();
        boolean boolean53 = stackAr21.isFull();
        boolean boolean55 = stackAr21.equals((java.lang.Object) 100L);
        java.lang.String str56 = stackAr21.toString();
        stackAr0.push((java.lang.Object) stackAr21);
        java.lang.Object obj58 = stackAr0.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr0", stackAr0.repOK());
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test326");
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
        java.lang.String str16 = stackAr1.toString();
        org.autotest.StackAr stackAr18 = new org.autotest.StackAr((int) '4');
        int int19 = stackAr18.size();
        int int20 = stackAr18.size();
        org.autotest.StackAr stackAr22 = new org.autotest.StackAr((int) 'a');
        java.lang.String str23 = stackAr22.toString();
        stackAr22.push((java.lang.Object) 0.0f);
        org.autotest.StackAr stackAr27 = new org.autotest.StackAr((int) '4');
        java.lang.String str28 = stackAr27.toString();
        boolean boolean29 = stackAr22.equals((java.lang.Object) stackAr27);
        org.autotest.StackAr stackAr31 = new org.autotest.StackAr((int) 'a');
        boolean boolean33 = stackAr31.equals((java.lang.Object) (-1.0f));
        boolean boolean35 = stackAr31.equals((java.lang.Object) "");
        org.autotest.StackAr stackAr36 = new org.autotest.StackAr();
        boolean boolean37 = stackAr36.isFull();
        stackAr31.push((java.lang.Object) stackAr36);
        boolean boolean39 = stackAr27.equals((java.lang.Object) stackAr31);
        java.lang.Object obj40 = stackAr31.top();
        boolean boolean41 = stackAr31.isEmpty();
        java.lang.Object obj42 = stackAr31.top();
        stackAr18.push(obj42);
        boolean boolean44 = stackAr1.equals((java.lang.Object) stackAr18);
        org.autotest.StackAr stackAr46 = new org.autotest.StackAr((int) '4');
        java.lang.String str47 = stackAr46.toString();
        boolean boolean48 = stackAr46.isEmpty();
        boolean boolean49 = stackAr46.isFull();
        org.autotest.StackAr stackAr50 = new org.autotest.StackAr();
        boolean boolean51 = stackAr50.isFull();
        int int52 = stackAr50.size();
        org.autotest.StackAr stackAr54 = new org.autotest.StackAr((int) (short) 0);
        stackAr50.push((java.lang.Object) (short) 0);
        stackAr46.push((java.lang.Object) (short) 0);
        java.lang.Object obj57 = stackAr46.top();
        stackAr18.push((java.lang.Object) stackAr46);
        boolean boolean59 = stackAr18.isEmpty();
        java.lang.Object obj60 = stackAr18.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr18", stackAr18.repOK());
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test327");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        boolean boolean1 = stackAr0.isFull();
        int int2 = stackAr0.size();
        boolean boolean3 = stackAr0.isEmpty();
        boolean boolean4 = stackAr0.isFull();
        boolean boolean5 = stackAr0.isFull();
        org.autotest.StackAr stackAr6 = new org.autotest.StackAr();
        boolean boolean7 = stackAr6.isFull();
        boolean boolean9 = stackAr6.equals((java.lang.Object) (byte) -1);
        java.lang.String str10 = stackAr6.toString();
        java.lang.Class<?> wildcardClass11 = stackAr6.getClass();
        stackAr0.push((java.lang.Object) stackAr6);
        java.lang.Object obj13 = stackAr0.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr0", stackAr0.repOK());
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test328");
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
        boolean boolean21 = stackAr1.isEmpty();
        org.autotest.StackAr stackAr23 = new org.autotest.StackAr((int) '4');
        int int24 = stackAr23.size();
        int int25 = stackAr23.size();
        boolean boolean26 = stackAr23.isFull();
        org.autotest.StackAr stackAr28 = new org.autotest.StackAr((int) ' ');
        stackAr23.push((java.lang.Object) ' ');
        java.lang.String str30 = stackAr23.toString();
        java.lang.String str31 = stackAr23.toString();
        stackAr1.push((java.lang.Object) stackAr23);
        org.autotest.StackAr stackAr34 = new org.autotest.StackAr((int) 'a');
        java.lang.String str35 = stackAr34.toString();
        org.autotest.StackAr stackAr37 = new org.autotest.StackAr((int) 'a');
        org.autotest.StackAr stackAr38 = new org.autotest.StackAr();
        boolean boolean39 = stackAr38.isFull();
        int int40 = stackAr38.size();
        boolean boolean41 = stackAr38.isEmpty();
        stackAr37.push((java.lang.Object) stackAr38);
        boolean boolean43 = stackAr34.equals((java.lang.Object) stackAr38);
        org.autotest.StackAr stackAr45 = new org.autotest.StackAr((int) '4');
        int int46 = stackAr45.size();
        int int47 = stackAr45.size();
        boolean boolean48 = stackAr45.isFull();
        org.autotest.StackAr stackAr50 = new org.autotest.StackAr((int) ' ');
        stackAr45.push((java.lang.Object) ' ');
        boolean boolean52 = stackAr38.equals((java.lang.Object) stackAr45);
        org.autotest.StackAr stackAr54 = new org.autotest.StackAr((int) '4');
        int int55 = stackAr54.size();
        boolean boolean56 = stackAr54.isEmpty();
        stackAr54.push((java.lang.Object) (byte) 0);
        java.lang.String str59 = stackAr54.toString();
        stackAr38.push((java.lang.Object) stackAr54);
        int int61 = stackAr54.size();
        stackAr1.push((java.lang.Object) stackAr54);
        java.lang.Object obj63 = stackAr54.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr54", stackAr54.repOK());
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test329");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) 'a');
        boolean boolean3 = stackAr1.equals((java.lang.Object) (-1.0f));
        boolean boolean5 = stackAr1.equals((java.lang.Object) "");
        stackAr1.push((java.lang.Object) (-1.0d));
        java.lang.Object obj8 = stackAr1.top();
        java.lang.Object obj9 = stackAr1.top();
        java.lang.String str10 = stackAr1.toString();
        java.lang.Object obj11 = stackAr1.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr1", stackAr1.repOK());
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test330");
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
        java.lang.Object obj17 = stackAr0.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr0", stackAr0.repOK());
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test331");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) (short) 1);
        org.autotest.StackAr stackAr3 = new org.autotest.StackAr((int) 'a');
        boolean boolean5 = stackAr3.equals((java.lang.Object) (-1.0f));
        boolean boolean6 = stackAr3.isFull();
        org.autotest.StackAr stackAr7 = new org.autotest.StackAr();
        boolean boolean8 = stackAr7.isFull();
        int int9 = stackAr7.size();
        boolean boolean10 = stackAr7.isEmpty();
        org.autotest.StackAr stackAr12 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean13 = stackAr12.isFull();
        java.lang.Class<?> wildcardClass14 = stackAr12.getClass();
        stackAr7.push((java.lang.Object) wildcardClass14);
        org.autotest.StackAr stackAr17 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean18 = stackAr17.isEmpty();
        boolean boolean19 = stackAr17.isEmpty();
        org.autotest.StackAr stackAr20 = new org.autotest.StackAr();
        java.lang.Class<?> wildcardClass21 = stackAr20.getClass();
        boolean boolean22 = stackAr17.equals((java.lang.Object) stackAr20);
        java.lang.Class<?> wildcardClass23 = stackAr20.getClass();
        stackAr7.push((java.lang.Object) wildcardClass23);
        stackAr3.push((java.lang.Object) stackAr7);
        stackAr1.push((java.lang.Object) stackAr7);
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
        boolean boolean46 = stackAr27.isFull();
        org.autotest.StackAr stackAr48 = new org.autotest.StackAr((int) 'a');
        java.lang.String str49 = stackAr48.toString();
        stackAr48.push((java.lang.Object) 0.0f);
        org.autotest.StackAr stackAr53 = new org.autotest.StackAr((int) '4');
        java.lang.String str54 = stackAr53.toString();
        boolean boolean55 = stackAr48.equals((java.lang.Object) stackAr53);
        org.autotest.StackAr stackAr57 = new org.autotest.StackAr((int) '4');
        int int58 = stackAr57.size();
        java.lang.Class<?> wildcardClass59 = stackAr57.getClass();
        stackAr53.push((java.lang.Object) stackAr57);
        int int61 = stackAr53.size();
        boolean boolean62 = stackAr53.isEmpty();
        stackAr27.push((java.lang.Object) stackAr53);
        boolean boolean64 = stackAr27.isFull();
        java.lang.Object obj65 = stackAr27.top();
        boolean boolean66 = stackAr27.isFull();
        stackAr7.push((java.lang.Object) stackAr27);
        boolean boolean68 = stackAr7.isEmpty();
        java.lang.Object obj69 = stackAr7.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr7", stackAr7.repOK());
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test332");
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
        org.autotest.StackAr stackAr54 = new org.autotest.StackAr((int) '4');
        int int55 = stackAr54.size();
        boolean boolean56 = stackAr54.isEmpty();
        stackAr54.push((java.lang.Object) (byte) 0);
        java.lang.String str59 = stackAr54.toString();
        stackAr1.push((java.lang.Object) stackAr54);
        java.lang.Object obj61 = stackAr54.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr54", stackAr54.repOK());
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test333");
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
        java.lang.String str30 = stackAr6.toString();
        java.lang.String str31 = stackAr6.toString();
        org.autotest.StackAr stackAr32 = new org.autotest.StackAr();
        boolean boolean33 = stackAr32.isFull();
        int int34 = stackAr32.size();
        boolean boolean35 = stackAr32.isEmpty();
        boolean boolean36 = stackAr32.isFull();
        boolean boolean37 = stackAr32.isFull();
        boolean boolean38 = stackAr32.isFull();
        boolean boolean39 = stackAr32.isFull();
        boolean boolean40 = stackAr32.isEmpty();
        int int41 = stackAr32.size();
        java.lang.String str42 = stackAr32.toString();
        org.autotest.StackAr stackAr44 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean45 = stackAr44.isEmpty();
        int int46 = stackAr44.size();
        boolean boolean47 = stackAr44.isFull();
        org.autotest.StackAr stackAr49 = new org.autotest.StackAr((int) (short) 100);
        boolean boolean50 = stackAr44.equals((java.lang.Object) stackAr49);
        boolean boolean51 = stackAr44.isFull();
        boolean boolean52 = stackAr32.equals((java.lang.Object) boolean51);
        org.autotest.StackAr stackAr54 = new org.autotest.StackAr((int) '4');
        int int55 = stackAr54.size();
        java.lang.String str56 = stackAr54.toString();
        int int57 = stackAr54.size();
        boolean boolean58 = stackAr54.isEmpty();
        java.lang.String str59 = stackAr54.toString();
        boolean boolean60 = stackAr32.equals((java.lang.Object) stackAr54);
        boolean boolean61 = stackAr6.equals((java.lang.Object) boolean60);
        java.lang.Object obj62 = stackAr6.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr6", stackAr6.repOK());
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test334");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '4');
        org.autotest.StackAr stackAr3 = new org.autotest.StackAr((int) (short) 1);
        stackAr1.push((java.lang.Object) (short) 1);
        org.autotest.StackAr stackAr5 = new org.autotest.StackAr();
        boolean boolean6 = stackAr5.isFull();
        int int7 = stackAr5.size();
        org.autotest.StackAr stackAr9 = new org.autotest.StackAr((int) (short) 0);
        stackAr5.push((java.lang.Object) (short) 0);
        java.lang.String str11 = stackAr5.toString();
        boolean boolean12 = stackAr1.equals((java.lang.Object) stackAr5);
        org.autotest.StackAr stackAr14 = new org.autotest.StackAr((int) 'a');
        java.lang.String str15 = stackAr14.toString();
        stackAr14.push((java.lang.Object) 0.0f);
        boolean boolean18 = stackAr14.isFull();
        java.lang.Object obj19 = stackAr14.top();
        boolean boolean20 = stackAr14.isFull();
        java.lang.String str21 = stackAr14.toString();
        boolean boolean22 = stackAr1.equals((java.lang.Object) stackAr14);
        boolean boolean23 = stackAr14.isEmpty();
        java.lang.Object obj24 = stackAr14.top();
        java.lang.Object obj25 = stackAr14.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr14", stackAr14.repOK());
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test335");
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
        java.lang.String str43 = stackAr32.toString();
        org.autotest.StackAr stackAr45 = new org.autotest.StackAr((int) 'a');
        java.lang.String str46 = stackAr45.toString();
        org.autotest.StackAr stackAr48 = new org.autotest.StackAr((int) 'a');
        org.autotest.StackAr stackAr49 = new org.autotest.StackAr();
        boolean boolean50 = stackAr49.isFull();
        int int51 = stackAr49.size();
        boolean boolean52 = stackAr49.isEmpty();
        stackAr48.push((java.lang.Object) stackAr49);
        boolean boolean54 = stackAr45.equals((java.lang.Object) stackAr49);
        boolean boolean55 = stackAr49.isFull();
        stackAr32.push((java.lang.Object) boolean55);
        java.lang.Object obj57 = stackAr32.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr32", stackAr32.repOK());
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test336");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) 'a');
        boolean boolean3 = stackAr1.equals((java.lang.Object) (-1.0f));
        boolean boolean5 = stackAr1.equals((java.lang.Object) "");
        stackAr1.push((java.lang.Object) (-1.0d));
        java.lang.Object obj8 = stackAr1.top();
        java.lang.Object obj9 = stackAr1.top();
        boolean boolean10 = stackAr1.isFull();
        org.autotest.StackAr stackAr12 = new org.autotest.StackAr((int) 'a');
        java.lang.String str13 = stackAr12.toString();
        stackAr12.push((java.lang.Object) 0.0f);
        org.autotest.StackAr stackAr17 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean18 = stackAr17.isFull();
        boolean boolean19 = stackAr17.isEmpty();
        stackAr12.push((java.lang.Object) boolean19);
        org.autotest.StackAr stackAr22 = new org.autotest.StackAr((int) '4');
        int int23 = stackAr22.size();
        java.lang.String str24 = stackAr22.toString();
        int int25 = stackAr22.size();
        boolean boolean26 = stackAr22.isEmpty();
        java.lang.String str27 = stackAr22.toString();
        boolean boolean28 = stackAr22.isFull();
        boolean boolean29 = stackAr12.equals((java.lang.Object) boolean28);
        java.lang.Object obj30 = stackAr12.top();
        java.lang.Object obj31 = stackAr12.top();
        boolean boolean32 = stackAr12.isEmpty();
        org.autotest.StackAr stackAr34 = new org.autotest.StackAr((int) '4');
        int int35 = stackAr34.size();
        int int36 = stackAr34.size();
        boolean boolean37 = stackAr34.isFull();
        org.autotest.StackAr stackAr39 = new org.autotest.StackAr((int) ' ');
        stackAr34.push((java.lang.Object) ' ');
        java.lang.String str41 = stackAr34.toString();
        java.lang.String str42 = stackAr34.toString();
        stackAr12.push((java.lang.Object) stackAr34);
        java.lang.Object obj44 = stackAr12.top();
        stackAr1.push((java.lang.Object) stackAr12);
        org.autotest.StackAr stackAr46 = new org.autotest.StackAr();
        boolean boolean47 = stackAr46.isFull();
        int int48 = stackAr46.size();
        org.autotest.StackAr stackAr49 = new org.autotest.StackAr();
        boolean boolean50 = stackAr49.isFull();
        boolean boolean52 = stackAr49.equals((java.lang.Object) (byte) -1);
        java.lang.String str53 = stackAr49.toString();
        boolean boolean55 = stackAr49.equals((java.lang.Object) 10L);
        java.lang.String str56 = stackAr49.toString();
        java.lang.Class<?> wildcardClass57 = stackAr49.getClass();
        boolean boolean58 = stackAr46.equals((java.lang.Object) wildcardClass57);
        boolean boolean59 = stackAr46.isEmpty();
        java.lang.String str60 = stackAr46.toString();
        org.autotest.StackAr stackAr62 = new org.autotest.StackAr((int) (short) 100);
        java.lang.String str63 = stackAr62.toString();
        boolean boolean64 = stackAr62.isFull();
        org.autotest.StackAr stackAr66 = new org.autotest.StackAr((int) 'a');
        java.lang.String str67 = stackAr66.toString();
        stackAr66.push((java.lang.Object) (short) 10);
        stackAr62.push((java.lang.Object) stackAr66);
        boolean boolean71 = stackAr66.isEmpty();
        boolean boolean72 = stackAr46.equals((java.lang.Object) boolean71);
        stackAr1.push((java.lang.Object) stackAr46);
        org.autotest.StackAr stackAr75 = new org.autotest.StackAr((int) 'a');
        java.lang.String str76 = stackAr75.toString();
        stackAr75.push((java.lang.Object) 0.0f);
        org.autotest.StackAr stackAr80 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean81 = stackAr80.isFull();
        boolean boolean82 = stackAr80.isEmpty();
        stackAr75.push((java.lang.Object) boolean82);
        org.autotest.StackAr stackAr85 = new org.autotest.StackAr((int) '4');
        int int86 = stackAr85.size();
        java.lang.String str87 = stackAr85.toString();
        int int88 = stackAr85.size();
        boolean boolean89 = stackAr85.isEmpty();
        java.lang.String str90 = stackAr85.toString();
        boolean boolean91 = stackAr85.isFull();
        boolean boolean92 = stackAr75.equals((java.lang.Object) boolean91);
        stackAr46.push((java.lang.Object) boolean92);
        java.lang.Object obj94 = stackAr46.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr46", stackAr46.repOK());
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test337");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) 'a');
        stackAr1.push((java.lang.Object) 'a');
        java.lang.Object obj4 = stackAr1.top();
        boolean boolean5 = stackAr1.isEmpty();
        java.lang.String str6 = stackAr1.toString();
        java.lang.String str7 = stackAr1.toString();
        java.lang.Object obj8 = stackAr1.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr1", stackAr1.repOK());
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test338");
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
        java.lang.String str17 = stackAr0.toString();
        java.lang.Object obj18 = stackAr0.top();
        java.lang.Object obj19 = stackAr0.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr0", stackAr0.repOK());
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test339");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) (short) 1);
        org.autotest.StackAr stackAr3 = new org.autotest.StackAr((int) 'a');
        boolean boolean5 = stackAr3.equals((java.lang.Object) (-1.0f));
        boolean boolean6 = stackAr3.isFull();
        org.autotest.StackAr stackAr7 = new org.autotest.StackAr();
        boolean boolean8 = stackAr7.isFull();
        int int9 = stackAr7.size();
        boolean boolean10 = stackAr7.isEmpty();
        org.autotest.StackAr stackAr12 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean13 = stackAr12.isFull();
        java.lang.Class<?> wildcardClass14 = stackAr12.getClass();
        stackAr7.push((java.lang.Object) wildcardClass14);
        org.autotest.StackAr stackAr17 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean18 = stackAr17.isEmpty();
        boolean boolean19 = stackAr17.isEmpty();
        org.autotest.StackAr stackAr20 = new org.autotest.StackAr();
        java.lang.Class<?> wildcardClass21 = stackAr20.getClass();
        boolean boolean22 = stackAr17.equals((java.lang.Object) stackAr20);
        java.lang.Class<?> wildcardClass23 = stackAr20.getClass();
        stackAr7.push((java.lang.Object) wildcardClass23);
        stackAr3.push((java.lang.Object) stackAr7);
        stackAr1.push((java.lang.Object) stackAr7);
        int int27 = stackAr7.size();
        int int28 = stackAr7.size();
        int int29 = stackAr7.size();
        java.lang.Object obj30 = stackAr7.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr7", stackAr7.repOK());
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test340");
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
        boolean boolean18 = stackAr10.isEmpty();
        boolean boolean19 = stackAr10.isFull();
        java.lang.Object obj20 = stackAr10.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr10", stackAr10.repOK());
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test341");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        boolean boolean1 = stackAr0.isFull();
        boolean boolean3 = stackAr0.equals((java.lang.Object) (byte) -1);
        org.autotest.StackAr stackAr5 = new org.autotest.StackAr((int) '4');
        boolean boolean6 = stackAr0.equals((java.lang.Object) '4');
        org.autotest.StackAr stackAr8 = new org.autotest.StackAr((int) (short) 100);
        java.lang.String str9 = stackAr8.toString();
        boolean boolean10 = stackAr8.isEmpty();
        java.lang.String str11 = stackAr8.toString();
        stackAr0.push((java.lang.Object) str11);
        java.lang.Object obj13 = stackAr0.top();
        java.lang.Object obj14 = stackAr0.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr0", stackAr0.repOK());
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test342");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) (short) 1);
        boolean boolean2 = stackAr1.isFull();
        org.autotest.StackAr stackAr4 = new org.autotest.StackAr((int) (short) 1);
        boolean boolean5 = stackAr4.isFull();
        boolean boolean6 = stackAr1.equals((java.lang.Object) stackAr4);
        boolean boolean7 = stackAr1.isFull();
        org.autotest.StackAr stackAr9 = new org.autotest.StackAr((int) '4');
        stackAr9.push((java.lang.Object) (-1L));
        boolean boolean12 = stackAr9.isEmpty();
        java.lang.String str13 = stackAr9.toString();
        boolean boolean14 = stackAr1.equals((java.lang.Object) stackAr9);
        boolean boolean15 = stackAr9.isEmpty();
        boolean boolean16 = stackAr9.isFull();
        boolean boolean17 = stackAr9.isFull();
        boolean boolean18 = stackAr9.isEmpty();
        org.autotest.StackAr stackAr20 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean21 = stackAr20.isEmpty();
        int int22 = stackAr20.size();
        boolean boolean23 = stackAr20.isFull();
        boolean boolean24 = stackAr20.isFull();
        int int25 = stackAr20.size();
        boolean boolean26 = stackAr20.isFull();
        boolean boolean27 = stackAr9.equals((java.lang.Object) boolean26);
        java.lang.Object obj28 = stackAr9.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr9", stackAr9.repOK());
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test343");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) ' ');
        org.autotest.StackAr stackAr2 = new org.autotest.StackAr();
        org.autotest.StackAr stackAr3 = new org.autotest.StackAr();
        boolean boolean4 = stackAr3.isFull();
        int int5 = stackAr3.size();
        boolean boolean6 = stackAr3.isEmpty();
        org.autotest.StackAr stackAr8 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean9 = stackAr8.isFull();
        java.lang.Class<?> wildcardClass10 = stackAr8.getClass();
        stackAr3.push((java.lang.Object) wildcardClass10);
        boolean boolean12 = stackAr2.equals((java.lang.Object) stackAr3);
        java.lang.Class<?> wildcardClass13 = stackAr2.getClass();
        stackAr1.push((java.lang.Object) stackAr2);
        boolean boolean15 = stackAr1.isEmpty();
        boolean boolean16 = stackAr1.isEmpty();
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
        boolean boolean36 = stackAr17.isFull();
        org.autotest.StackAr stackAr38 = new org.autotest.StackAr((int) 'a');
        java.lang.String str39 = stackAr38.toString();
        stackAr38.push((java.lang.Object) 0.0f);
        org.autotest.StackAr stackAr43 = new org.autotest.StackAr((int) '4');
        java.lang.String str44 = stackAr43.toString();
        boolean boolean45 = stackAr38.equals((java.lang.Object) stackAr43);
        org.autotest.StackAr stackAr47 = new org.autotest.StackAr((int) '4');
        int int48 = stackAr47.size();
        java.lang.Class<?> wildcardClass49 = stackAr47.getClass();
        stackAr43.push((java.lang.Object) stackAr47);
        int int51 = stackAr43.size();
        boolean boolean52 = stackAr43.isEmpty();
        stackAr17.push((java.lang.Object) stackAr43);
        java.lang.String str54 = stackAr17.toString();
        stackAr1.push((java.lang.Object) stackAr17);
        boolean boolean56 = stackAr17.isEmpty();
        int int57 = stackAr17.size();
        org.autotest.StackAr stackAr58 = new org.autotest.StackAr();
        boolean boolean59 = stackAr58.isFull();
        boolean boolean61 = stackAr58.equals((java.lang.Object) (byte) -1);
        org.autotest.StackAr stackAr63 = new org.autotest.StackAr((int) '4');
        boolean boolean64 = stackAr58.equals((java.lang.Object) '4');
        org.autotest.StackAr stackAr66 = new org.autotest.StackAr((int) 'a');
        boolean boolean68 = stackAr66.equals((java.lang.Object) (-1.0f));
        boolean boolean70 = stackAr66.equals((java.lang.Object) "");
        boolean boolean71 = stackAr58.equals((java.lang.Object) "");
        org.autotest.StackAr stackAr73 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean74 = stackAr73.isEmpty();
        boolean boolean75 = stackAr73.isEmpty();
        stackAr58.push((java.lang.Object) stackAr73);
        java.lang.String str77 = stackAr58.toString();
        java.lang.Object obj78 = stackAr58.top();
        org.autotest.StackAr stackAr79 = new org.autotest.StackAr();
        int int80 = stackAr79.size();
        java.lang.String str81 = stackAr79.toString();
        int int82 = stackAr79.size();
        stackAr79.push((java.lang.Object) (short) 1);
        java.lang.Class<?> wildcardClass85 = stackAr79.getClass();
        boolean boolean86 = stackAr58.equals((java.lang.Object) stackAr79);
        boolean boolean87 = stackAr17.equals((java.lang.Object) stackAr58);
        java.lang.Object obj88 = stackAr17.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr17", stackAr17.repOK());
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test344");
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
        boolean boolean40 = stackAr7.isFull();
        java.lang.Object obj41 = stackAr7.top();
        java.lang.Object obj42 = stackAr7.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr7", stackAr7.repOK());
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test345");
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
        java.lang.Object obj37 = stackAr1.top();
        java.lang.Object obj38 = stackAr1.top();
        boolean boolean39 = stackAr1.isFull();
        java.lang.Object obj40 = stackAr1.top();
        java.lang.Object obj41 = stackAr1.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr1", stackAr1.repOK());
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test346");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '4');
        int int2 = stackAr1.size();
        boolean boolean3 = stackAr1.isEmpty();
        stackAr1.push((java.lang.Object) (byte) 0);
        java.lang.Object obj6 = new java.lang.Object();
        boolean boolean7 = stackAr1.equals(obj6);
        boolean boolean8 = stackAr1.isEmpty();
        java.lang.Object obj9 = stackAr1.top();
        boolean boolean10 = stackAr1.isEmpty();
        org.autotest.StackAr stackAr12 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean13 = stackAr12.isFull();
        int int14 = stackAr12.size();
        org.autotest.StackAr stackAr16 = new org.autotest.StackAr((int) 'a');
        java.lang.String str17 = stackAr16.toString();
        stackAr16.push((java.lang.Object) 0.0f);
        org.autotest.StackAr stackAr21 = new org.autotest.StackAr((int) '4');
        java.lang.String str22 = stackAr21.toString();
        boolean boolean23 = stackAr16.equals((java.lang.Object) stackAr21);
        stackAr21.push((java.lang.Object) 1.0f);
        boolean boolean26 = stackAr12.equals((java.lang.Object) stackAr21);
        org.autotest.StackAr stackAr28 = new org.autotest.StackAr((int) 'a');
        java.lang.String str29 = stackAr28.toString();
        stackAr28.push((java.lang.Object) 0.0f);
        org.autotest.StackAr stackAr33 = new org.autotest.StackAr((int) '4');
        java.lang.String str34 = stackAr33.toString();
        boolean boolean35 = stackAr28.equals((java.lang.Object) stackAr33);
        org.autotest.StackAr stackAr37 = new org.autotest.StackAr((int) 'a');
        boolean boolean39 = stackAr37.equals((java.lang.Object) (-1.0f));
        boolean boolean41 = stackAr37.equals((java.lang.Object) "");
        org.autotest.StackAr stackAr42 = new org.autotest.StackAr();
        boolean boolean43 = stackAr42.isFull();
        stackAr37.push((java.lang.Object) stackAr42);
        boolean boolean45 = stackAr33.equals((java.lang.Object) stackAr37);
        boolean boolean46 = stackAr21.equals((java.lang.Object) stackAr33);
        org.autotest.StackAr stackAr47 = new org.autotest.StackAr();
        boolean boolean48 = stackAr47.isFull();
        int int49 = stackAr47.size();
        boolean boolean50 = stackAr47.isEmpty();
        org.autotest.StackAr stackAr52 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean53 = stackAr52.isFull();
        java.lang.Class<?> wildcardClass54 = stackAr52.getClass();
        stackAr47.push((java.lang.Object) wildcardClass54);
        org.autotest.StackAr stackAr57 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean58 = stackAr57.isEmpty();
        java.lang.Class<?> wildcardClass59 = stackAr57.getClass();
        boolean boolean60 = stackAr47.equals((java.lang.Object) wildcardClass59);
        boolean boolean61 = stackAr47.isFull();
        boolean boolean62 = stackAr47.isEmpty();
        org.autotest.StackAr stackAr63 = new org.autotest.StackAr();
        boolean boolean64 = stackAr63.isFull();
        boolean boolean66 = stackAr63.equals((java.lang.Object) (byte) -1);
        java.lang.String str67 = stackAr63.toString();
        boolean boolean69 = stackAr63.equals((java.lang.Object) 10L);
        boolean boolean70 = stackAr63.isEmpty();
        boolean boolean71 = stackAr63.isEmpty();
        java.lang.String str72 = stackAr63.toString();
        boolean boolean73 = stackAr47.equals((java.lang.Object) str72);
        stackAr33.push((java.lang.Object) boolean73);
        java.lang.String str75 = stackAr33.toString();
        java.lang.String str76 = stackAr33.toString();
        int int77 = stackAr33.size();
        boolean boolean78 = stackAr33.isEmpty();
        boolean boolean79 = stackAr1.equals((java.lang.Object) stackAr33);
        java.lang.Object obj80 = stackAr33.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr33", stackAr33.repOK());
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test347");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        boolean boolean1 = stackAr0.isFull();
        boolean boolean3 = stackAr0.equals((java.lang.Object) (byte) -1);
        org.autotest.StackAr stackAr5 = new org.autotest.StackAr((int) '4');
        boolean boolean6 = stackAr0.equals((java.lang.Object) '4');
        org.autotest.StackAr stackAr8 = new org.autotest.StackAr((int) 'a');
        boolean boolean10 = stackAr8.equals((java.lang.Object) (-1.0f));
        boolean boolean12 = stackAr8.equals((java.lang.Object) "");
        boolean boolean13 = stackAr0.equals((java.lang.Object) "");
        java.lang.String str14 = stackAr0.toString();
        java.lang.String str15 = stackAr0.toString();
        int int16 = stackAr0.size();
        org.autotest.StackAr stackAr17 = new org.autotest.StackAr();
        boolean boolean18 = stackAr17.isFull();
        int int19 = stackAr17.size();
        boolean boolean20 = stackAr17.isEmpty();
        boolean boolean21 = stackAr17.isFull();
        boolean boolean22 = stackAr17.isFull();
        boolean boolean23 = stackAr0.equals((java.lang.Object) stackAr17);
        org.autotest.StackAr stackAr24 = new org.autotest.StackAr();
        boolean boolean25 = stackAr24.isFull();
        org.autotest.StackAr stackAr27 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean28 = stackAr27.isEmpty();
        boolean boolean29 = stackAr27.isFull();
        boolean boolean30 = stackAr24.equals((java.lang.Object) boolean29);
        boolean boolean31 = stackAr24.isFull();
        boolean boolean32 = stackAr0.equals((java.lang.Object) boolean31);
        org.autotest.StackAr stackAr34 = new org.autotest.StackAr((int) 'a');
        boolean boolean36 = stackAr34.equals((java.lang.Object) (-1.0f));
        boolean boolean37 = stackAr34.isFull();
        org.autotest.StackAr stackAr38 = new org.autotest.StackAr();
        boolean boolean39 = stackAr38.isFull();
        int int40 = stackAr38.size();
        boolean boolean41 = stackAr38.isEmpty();
        org.autotest.StackAr stackAr43 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean44 = stackAr43.isFull();
        java.lang.Class<?> wildcardClass45 = stackAr43.getClass();
        stackAr38.push((java.lang.Object) wildcardClass45);
        org.autotest.StackAr stackAr48 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean49 = stackAr48.isEmpty();
        boolean boolean50 = stackAr48.isEmpty();
        org.autotest.StackAr stackAr51 = new org.autotest.StackAr();
        java.lang.Class<?> wildcardClass52 = stackAr51.getClass();
        boolean boolean53 = stackAr48.equals((java.lang.Object) stackAr51);
        java.lang.Class<?> wildcardClass54 = stackAr51.getClass();
        stackAr38.push((java.lang.Object) wildcardClass54);
        stackAr34.push((java.lang.Object) stackAr38);
        java.lang.Object obj57 = stackAr38.top();
        stackAr0.push((java.lang.Object) stackAr38);
        java.lang.Object obj59 = stackAr38.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr38", stackAr38.repOK());
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test348");
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
        int int19 = stackAr10.size();
        org.autotest.StackAr stackAr20 = new org.autotest.StackAr();
        boolean boolean21 = stackAr20.isFull();
        int int22 = stackAr20.size();
        boolean boolean23 = stackAr20.isEmpty();
        boolean boolean24 = stackAr20.isFull();
        boolean boolean25 = stackAr20.isFull();
        boolean boolean26 = stackAr20.isFull();
        org.autotest.StackAr stackAr28 = new org.autotest.StackAr((int) '4');
        int int29 = stackAr28.size();
        org.autotest.StackAr stackAr31 = new org.autotest.StackAr((int) 'a');
        stackAr31.push((java.lang.Object) 'a');
        java.lang.Object obj34 = stackAr31.top();
        boolean boolean35 = stackAr31.isEmpty();
        java.lang.Object obj36 = stackAr31.top();
        stackAr28.push(obj36);
        stackAr20.push((java.lang.Object) stackAr28);
        stackAr10.push((java.lang.Object) stackAr20);
        org.autotest.StackAr stackAr41 = new org.autotest.StackAr((int) 'a');
        org.autotest.StackAr stackAr42 = new org.autotest.StackAr();
        boolean boolean43 = stackAr42.isFull();
        int int44 = stackAr42.size();
        boolean boolean45 = stackAr42.isEmpty();
        stackAr41.push((java.lang.Object) stackAr42);
        org.autotest.StackAr stackAr48 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean49 = stackAr48.isEmpty();
        boolean boolean50 = stackAr48.isFull();
        org.autotest.StackAr stackAr51 = new org.autotest.StackAr();
        boolean boolean52 = stackAr51.isFull();
        org.autotest.StackAr stackAr54 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean55 = stackAr54.isEmpty();
        boolean boolean56 = stackAr54.isFull();
        boolean boolean57 = stackAr51.equals((java.lang.Object) boolean56);
        boolean boolean58 = stackAr48.equals((java.lang.Object) stackAr51);
        int int59 = stackAr51.size();
        stackAr41.push((java.lang.Object) int59);
        org.autotest.StackAr stackAr62 = new org.autotest.StackAr((int) '4');
        int int63 = stackAr62.size();
        java.lang.String str64 = stackAr62.toString();
        int int65 = stackAr62.size();
        org.autotest.StackAr stackAr66 = new org.autotest.StackAr();
        boolean boolean67 = stackAr66.isFull();
        boolean boolean69 = stackAr66.equals((java.lang.Object) (byte) -1);
        boolean boolean70 = stackAr62.equals((java.lang.Object) (byte) -1);
        java.lang.String str71 = stackAr62.toString();
        boolean boolean72 = stackAr41.equals((java.lang.Object) stackAr62);
        java.lang.Object obj73 = stackAr41.top();
        boolean boolean74 = stackAr41.isEmpty();
        stackAr20.push((java.lang.Object) stackAr41);
        boolean boolean76 = stackAr41.isEmpty();
        java.lang.Object obj77 = stackAr41.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr41", stackAr41.repOK());
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test349");
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
        java.lang.String str14 = stackAr0.toString();
        java.lang.Object obj15 = stackAr0.top();
        int int16 = stackAr0.size();
        boolean boolean17 = stackAr0.isEmpty();
        org.autotest.StackAr stackAr19 = new org.autotest.StackAr((int) '4');
        int int20 = stackAr19.size();
        boolean boolean21 = stackAr19.isEmpty();
        stackAr19.push((java.lang.Object) (byte) 0);
        java.lang.Object obj24 = new java.lang.Object();
        boolean boolean25 = stackAr19.equals(obj24);
        int int26 = stackAr19.size();
        boolean boolean27 = stackAr19.isEmpty();
        boolean boolean28 = stackAr19.isEmpty();
        boolean boolean29 = stackAr0.equals((java.lang.Object) stackAr19);
        java.lang.Object obj30 = stackAr19.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr19", stackAr19.repOK());
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test350");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '4');
        java.lang.String str2 = stackAr1.toString();
        java.lang.String str3 = stackAr1.toString();
        int int4 = stackAr1.size();
        org.autotest.StackAr stackAr5 = new org.autotest.StackAr();
        java.lang.String str6 = stackAr5.toString();
        boolean boolean7 = stackAr5.isEmpty();
        boolean boolean8 = stackAr1.equals((java.lang.Object) stackAr5);
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
        org.autotest.StackAr stackAr25 = new org.autotest.StackAr((int) '4');
        java.lang.String str26 = stackAr25.toString();
        boolean boolean27 = stackAr25.isEmpty();
        boolean boolean28 = stackAr25.isFull();
        boolean boolean29 = stackAr14.equals((java.lang.Object) boolean28);
        boolean boolean30 = stackAr1.equals((java.lang.Object) stackAr14);
        org.autotest.StackAr stackAr32 = new org.autotest.StackAr((int) 'a');
        java.lang.String str33 = stackAr32.toString();
        stackAr32.push((java.lang.Object) 0.0f);
        org.autotest.StackAr stackAr37 = new org.autotest.StackAr((int) '4');
        java.lang.String str38 = stackAr37.toString();
        boolean boolean39 = stackAr32.equals((java.lang.Object) stackAr37);
        org.autotest.StackAr stackAr40 = new org.autotest.StackAr();
        boolean boolean41 = stackAr40.isFull();
        boolean boolean43 = stackAr40.equals((java.lang.Object) (byte) -1);
        org.autotest.StackAr stackAr45 = new org.autotest.StackAr((int) '4');
        boolean boolean46 = stackAr40.equals((java.lang.Object) '4');
        org.autotest.StackAr stackAr48 = new org.autotest.StackAr((int) 'a');
        boolean boolean50 = stackAr48.equals((java.lang.Object) (-1.0f));
        boolean boolean52 = stackAr48.equals((java.lang.Object) "");
        boolean boolean53 = stackAr40.equals((java.lang.Object) "");
        org.autotest.StackAr stackAr55 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean56 = stackAr55.isEmpty();
        boolean boolean57 = stackAr55.isEmpty();
        stackAr40.push((java.lang.Object) stackAr55);
        boolean boolean59 = stackAr55.isEmpty();
        stackAr37.push((java.lang.Object) boolean59);
        java.lang.String str61 = stackAr37.toString();
        java.lang.String str62 = stackAr37.toString();
        org.autotest.StackAr stackAr63 = new org.autotest.StackAr();
        boolean boolean64 = stackAr63.isFull();
        int int65 = stackAr63.size();
        boolean boolean66 = stackAr63.isEmpty();
        boolean boolean67 = stackAr63.isFull();
        boolean boolean68 = stackAr63.isFull();
        boolean boolean69 = stackAr63.isFull();
        boolean boolean70 = stackAr63.isFull();
        boolean boolean71 = stackAr63.isEmpty();
        int int72 = stackAr63.size();
        java.lang.String str73 = stackAr63.toString();
        org.autotest.StackAr stackAr75 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean76 = stackAr75.isEmpty();
        int int77 = stackAr75.size();
        boolean boolean78 = stackAr75.isFull();
        org.autotest.StackAr stackAr80 = new org.autotest.StackAr((int) (short) 100);
        boolean boolean81 = stackAr75.equals((java.lang.Object) stackAr80);
        boolean boolean82 = stackAr75.isFull();
        boolean boolean83 = stackAr63.equals((java.lang.Object) boolean82);
        org.autotest.StackAr stackAr85 = new org.autotest.StackAr((int) '4');
        int int86 = stackAr85.size();
        java.lang.String str87 = stackAr85.toString();
        int int88 = stackAr85.size();
        boolean boolean89 = stackAr85.isEmpty();
        java.lang.String str90 = stackAr85.toString();
        boolean boolean91 = stackAr63.equals((java.lang.Object) stackAr85);
        boolean boolean92 = stackAr37.equals((java.lang.Object) boolean91);
        boolean boolean93 = stackAr37.isEmpty();
        stackAr1.push((java.lang.Object) stackAr37);
        java.lang.Object obj95 = stackAr1.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr1", stackAr1.repOK());
    }
}

