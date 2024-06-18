package inge2.dataflow;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TallerTest {
    @Test
    public void testSetup() {
        JMLRunner runner = new JMLRunner();
        JMLResult result = runner.check("inge2.dataflow.Constante");
        assertFalse(result.isVerificationFailure(), result.getOutput());

        assertEquals(42, Constante.laConstante());
    }

    @Test
    public void testAbsoluto() {
        JMLRunner runner = new JMLRunner();
        JMLResult result = runner.check("inge2.dataflow.Absoluto");
        assertFalse(result.isVerificationFailure(), result.getOutput());

        assertEquals(42, Absoluto.valorAbsoluto(42));
        assertEquals(42, Absoluto.valorAbsoluto(-42));
    }

    @Test
    public void testBusquedaLineal() {
        JMLRunner runner = new JMLRunner();
        JMLResult result = runner.check("inge2.dataflow.BusquedaLineal");
        assertFalse(result.isVerificationFailure(), result.getOutput());

        int[] a = { 1, 2, 3 };
        assertTrue(BusquedaLineal.busquedaLineal(1, a));
        assertTrue(BusquedaLineal.busquedaLineal(2, a));
        assertTrue(BusquedaLineal.busquedaLineal(3, a));
        assertFalse(BusquedaLineal.busquedaLineal(4, a));
    }

    @Test
    public void testMapSumaUno() {
        JMLRunner runner = new JMLRunner();
        JMLResult result = runner.check("inge2.dataflow.MapSumaUno");
        assertFalse(result.isVerificationFailure(), result.getOutput());

        int[] a = { 1, 2, 3 };
        int[] b = { 2, 3, 4 };

        MapSumaUno.mapSumaUno(a);
        assertArrayEquals(b, a);
    }

    @Test
    public void testStackAr() {
        JMLRunner runner = new JMLRunner();
        JMLResult result = runner.check("inge2.dataflow.StackAr");
        assertFalse(result.isVerificationFailure(), result.getOutput());

        StackAr stack = new StackAr(2);
        assertTrue(stack.isEmpty());
        assertFalse(stack.isFull());
        assertEquals(0, stack.size());

        stack.push(42);
        assertFalse(stack.isEmpty());
        assertFalse(stack.isFull());
        assertEquals(1, stack.size());
        assertEquals(42, stack.peek());

        stack.push(43);
        assertFalse(stack.isEmpty());
        assertTrue(stack.isFull());
        assertEquals(2, stack.size());
        assertEquals(43, stack.peek());

        assertEquals(43, stack.pop());
        assertFalse(stack.isEmpty());
        assertFalse(stack.isFull());
        assertEquals(1, stack.size());
        assertEquals(42, stack.peek());

        assertEquals(42, stack.pop());
        assertTrue(stack.isEmpty());
        assertFalse(stack.isFull());
        assertEquals(0, stack.size());
    }
}