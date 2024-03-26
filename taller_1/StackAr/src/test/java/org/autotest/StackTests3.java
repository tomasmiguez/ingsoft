package org.autotest;

import java.lang.reflect.Array;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class StackTests3 extends MutationAnalysisRunner {
    @Override
    protected boolean useVerboseMode() {
        return false;
    }

    public void testSizeIncreasesByOne() throws Exception {
        Stack stack = createStack();
        assertEquals(0, stack.size());
        stack.push(42);
        assertEquals(1, stack.size());
    }

    public void testDefaultConstructor() throws Exception {
        Stack stack = createStack();
        assertTrue(stack.isEmpty());
    }

    public void testConstructorWithSpecifiedCapacity() throws Exception {
        Stack stack = createStack(5);
    }

    public void testConstructorWithNegativeCapacity() {
        assertThrows(IllegalArgumentException.class, () -> {
            Stack stack = createStack(-1);
        });
    }

    public void testIsEmptyMethod() throws Exception {
        Stack stack = createStack();
        assertTrue(stack.isEmpty());
        stack.push(42);
        assertFalse(stack.isEmpty());
        stack.pop();
        assertTrue(stack.isEmpty());
    }

    public void testIsFullMethod() throws Exception {
        Stack stack = createStack(1);
        assertFalse(stack.isFull());
        stack.push(42);
        assertTrue(stack.isFull());
        stack.pop();
        assertFalse(stack.isFull());
    }

    public void testToStringMethod() throws Exception {
        Stack stack = createStack(2);
        assertEquals("[]", stack.toString());
        stack.push(42);
        assertEquals("[42]", stack.toString());
        stack.push(43);
        assertEquals("[42,43]", stack.toString());
    }

    public void testEqualsMethod() throws Exception {
        Stack stack1 = createStack(3);
        Stack stack2 = createStack(3);
        Stack stack3 = createStack(2);
        assertEquals(stack1, stack2);
        stack1.push(36);
        assertNotEquals(stack1, stack2);
        stack2.push(36);
        assertEquals(stack1, stack2);
        assertEquals(stack1, stack1);
        assertNotEquals(stack1, 36);
        assertNotEquals(stack1, null);
        assertNotEquals(stack1, new ArrayList(3).add(36));
        stack3.push(36);
        /* Esto testea un comportamiento inalcazable porque el
         * ultimo if de equals() ya esta cubierto por el anterior
         */
        assertNotEquals(stack1, stack3);
    }

    public void testHashCodeMethod() throws Exception {
        Stack stack1 = createStack(3);
        Stack stack2 = createStack(3);
        Stack stack3 = createStack(3);
        assertEquals(stack1.hashCode(), stack2.hashCode());
        stack1.push(23);
        stack1.push(32);
        stack3.push(23);
        stack3.push(33);
        assertNotEquals(stack1.hashCode(), stack3.hashCode());
    }

    public void testValidConstruction() throws Exception {
        assertDoesNotThrow(() -> createStack(0));
        assertThrows(java.lang.IllegalArgumentException.class, () -> createStack(-1));
    }

    public void testPopException() throws Exception {
        Stack stack = createStack(1);
        assertThrows(java.lang.IllegalStateException.class, () -> stack.pop());
    }

    public void testPop() throws Exception {
        Stack stack = createStack(1);
        stack.push(12);
        assertEquals(12, stack.pop());
    }

    public void testTop() throws Exception {
        Stack stack = createStack(1);
        stack.push(12);
        assertEquals(12, stack.top());
    }

    public void testInvalidTop() throws Exception {
        Stack stack = createStack(1);
        assertThrows(java.lang.IllegalStateException.class, () -> stack.top());
    }

    public void testDefaultCapacity() throws Exception {
        Stack stack = createStack();
        stack.push(65);
        assertDoesNotThrow(() -> stack.push(87));
    }

    public void testOverfill() throws Exception {
        Stack stack = createStack(1);
        stack.push(61);
        assertThrows(java.lang.IllegalStateException.class, () -> stack.push(28));
    }

}
