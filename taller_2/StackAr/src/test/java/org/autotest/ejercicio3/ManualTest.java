package org.autotest;

import org.junit.FixMethodOrder;
import org.junit.jupiter.api.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ManualTest {

    public static boolean debug = false;

    @Test
    public void testEqualsItself() throws Throwable {
        if (debug) System.out.format("%n%s%n", "ManualTest.testEqualsItself");

        StackAr stackAr = new StackAr();

        org.junit.Assert.assertEquals(stackAr, stackAr);
    }

    @Test
    public void testHashesCanDiffer() throws Throwable {
        if (debug) System.out.format("%n%s%n", "ManualTest.testHashesCanDiffer");

        StackAr stackAr1 = new StackAr(3);
        stackAr1.push(23);
        stackAr1.push(32);

        StackAr stackAr2 = new StackAr(3);
        stackAr2.push(23);
        stackAr2.push(33);
        org.junit.Assert.assertNotEquals(stackAr1.hashCode(), stackAr2.hashCode());
    }
}

