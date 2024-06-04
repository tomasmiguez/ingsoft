package inge2.dataflow;

import inge2.dataflow.zeroanalysis.DivisionByZeroAnalysis;
import inge2.dataflow.zeroanalysis.ZeroAbstractSet;
import inge2.dataflow.zeroanalysis.ZeroAbstractValue;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TallerTest {
    @Test
    public void testTarget1() {
        Launcher.analyzeClass("inge2.dataflow.targets.ZeroAnalysis1");
        DivisionByZeroAnalysis zeroAnalysis = Launcher.getLastDivisionByZeroAnalysis();

        Map<Integer, String> divisionsByZero = zeroAnalysis.getPossibleDivisionByZeroExpressions();
        assertEquals(1, divisionsByZero.size());
        assertTrue(divisionsByZero.containsKey(7));
        assertEquals("j = m / k", divisionsByZero.get(7));

        ZeroAbstractSet inSet = zeroAnalysis.getINSetForLineNumber(8);
        assertEquals(ZeroAbstractValue.ZERO, inSet.getValue("x"));
        assertEquals(ZeroAbstractValue.ZERO, inSet.getValue("k"));
        assertEquals(ZeroAbstractValue.MAYBE_ZERO, inSet.getValue("m"));
        assertEquals(ZeroAbstractValue.MAYBE_ZERO, inSet.getValue("n"));
        assertEquals(ZeroAbstractValue.BOTTOM, inSet.getValue("j"));
    }

    @Test
    public void testTarget2() {
        Launcher.analyzeClass("inge2.dataflow.targets.ZeroAnalysis2");
        DivisionByZeroAnalysis zeroAnalysis = Launcher.getLastDivisionByZeroAnalysis();

        Map<Integer, String> divisionsByZero = zeroAnalysis.getPossibleDivisionByZeroExpressions();
        assertEquals(1, divisionsByZero.size());
        assertTrue(divisionsByZero.containsKey(7));
        assertEquals("j = m / x", divisionsByZero.get(7));

        ZeroAbstractSet inSet = zeroAnalysis.getINSetForLineNumber(8);
        assertEquals(ZeroAbstractValue.MAYBE_ZERO, inSet.getValue("x"));
        assertEquals(ZeroAbstractValue.MAYBE_ZERO, inSet.getValue("m"));
        assertEquals(ZeroAbstractValue.MAYBE_ZERO, inSet.getValue("n"));
        assertEquals(ZeroAbstractValue.MAYBE_ZERO, inSet.getValue("i"));
        assertEquals(ZeroAbstractValue.MAYBE_ZERO, inSet.getValue("j"));
    }

    @Test
    public void testTarget3() {
        Launcher.analyzeClass("inge2.dataflow.targets.ZeroAnalysis3");
        DivisionByZeroAnalysis zeroAnalysis = Launcher.getLastDivisionByZeroAnalysis();

        Map<Integer, String> divisionsByZero = zeroAnalysis.getPossibleDivisionByZeroExpressions();
        assertEquals(1, divisionsByZero.size());
        assertTrue(divisionsByZero.containsKey(6));
        assertEquals("j = m / n", divisionsByZero.get(6));

        ZeroAbstractSet inSet = zeroAnalysis.getINSetForLineNumber(7);
        assertEquals(ZeroAbstractValue.ZERO, inSet.getValue("x"));
        assertEquals(ZeroAbstractValue.MAYBE_ZERO, inSet.getValue("m"));
        assertEquals(ZeroAbstractValue.MAYBE_ZERO, inSet.getValue("n"));
        assertEquals(ZeroAbstractValue.MAYBE_ZERO, inSet.getValue("j"));
    }

    @Test
    public void testTarget4() {
        Launcher.analyzeClass("inge2.dataflow.targets.ZeroAnalysis4");
        DivisionByZeroAnalysis zeroAnalysis = Launcher.getLastDivisionByZeroAnalysis();

        Map<Integer, String> divisionsByZero = zeroAnalysis.getPossibleDivisionByZeroExpressions();
        assertEquals(1, divisionsByZero.size());
        assertTrue(divisionsByZero.containsKey(11));
        assertEquals("j = n / x", divisionsByZero.get(11));

         ZeroAbstractSet inSet = zeroAnalysis.getINSetForLineNumber(12);
         assertEquals(ZeroAbstractValue.MAYBE_ZERO, inSet.getValue("x"));
         assertEquals(ZeroAbstractValue.MAYBE_ZERO, inSet.getValue("m"));
         assertEquals(ZeroAbstractValue.MAYBE_ZERO, inSet.getValue("n"));
         assertEquals(ZeroAbstractValue.MAYBE_ZERO, inSet.getValue("j"));
    }

    @Test
    public void testTarget5() {
        Launcher.analyzeClass("inge2.dataflow.targets.ZeroAnalysis5");
        DivisionByZeroAnalysis zeroAnalysis = Launcher.getLastDivisionByZeroAnalysis();

        Map<Integer, String> divisionsByZero = zeroAnalysis.getPossibleDivisionByZeroExpressions();
        assertEquals(0, divisionsByZero.size());

        ZeroAbstractSet inSet = zeroAnalysis.getINSetForLineNumber(11);
        assertEquals(ZeroAbstractValue.MAYBE_ZERO, inSet.getValue("x"));
        assertEquals(ZeroAbstractValue.MAYBE_ZERO, inSet.getValue("y"));
    }

    @Test
    public void testTarget6() {
        Launcher.analyzeClass("inge2.dataflow.targets.ZeroAnalysis6");
        DivisionByZeroAnalysis zeroAnalysis = Launcher.getLastDivisionByZeroAnalysis();

        Map<Integer, String> divisionsByZero = zeroAnalysis.getPossibleDivisionByZeroExpressions();
        assertEquals(0, divisionsByZero.size());

        ZeroAbstractSet inSet = zeroAnalysis.getINSetForLineNumber(12);
        assertEquals(ZeroAbstractValue.MAYBE_ZERO, inSet.getValue("x"));
        assertEquals(ZeroAbstractValue.MAYBE_ZERO, inSet.getValue("r"));
        assertEquals(ZeroAbstractValue.NOT_ZERO, inSet.getValue("y"));
    }

    @Test
    public void testTarget7() {
        Launcher.analyzeClass("inge2.dataflow.targets.ZeroAnalysis7");
        DivisionByZeroAnalysis zeroAnalysis = Launcher.getLastDivisionByZeroAnalysis();

        Map<Integer, String> divisionsByZero = zeroAnalysis.getPossibleDivisionByZeroExpressions();
        assertEquals(1, divisionsByZero.size());
        assertTrue(divisionsByZero.containsKey(7));
        assertEquals("d = j / i", divisionsByZero.get(7));

        ZeroAbstractSet inSet = zeroAnalysis.getINSetForLineNumber(13);
        assertEquals(ZeroAbstractValue.ZERO, inSet.getValue("i"));
        assertEquals(ZeroAbstractValue.NOT_ZERO, inSet.getValue("j"));
        assertEquals(ZeroAbstractValue.NOT_ZERO, inSet.getValue("d"));
    }
}
