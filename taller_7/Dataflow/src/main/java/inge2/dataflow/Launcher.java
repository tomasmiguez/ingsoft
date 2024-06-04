package inge2.dataflow;

import inge2.dataflow.zeroanalysis.DivisionByZeroAnalysis;
import org.slf4j.Logger;
import soot.*;
import soot.tagkit.LineNumberTag;
import soot.tagkit.StringTag;
import soot.toolkits.graph.ExceptionalUnitGraph;

import java.util.Map;

import static org.slf4j.LoggerFactory.getLogger;

/**
 * Launcher class for the division by zero analysis.
 */
public class Launcher {
    private final static Logger LOGGER = getLogger(Launcher.class);

    public static final String DIVISION_BY_ZERO_SOOT_PHASE_NAME = "jtp.DivisionByZeroAnalysis";

    private static DivisionByZeroAnalysis lastDivisionByZeroAnalysis;

    public static void main(String[] args) {
        // Reset soot in case we are calling it multiple times.
        soot.G.reset();
        setupDivisionByZeroAnalysis();
        // Run Soot.
        soot.Main.main(args);
    }

    /**
     * Runs the division by zero analysis on a given target class.
     * The Soot class path is read from the system property "sootClassPath".
     * @param targetClass the target class to analyze.
     */
    public static void analyzeClass(String targetClass) {
        String sootClassPath = System.getProperty("sootClassPath");

        String[] sootArgs = {
                targetClass,
                "-cp", sootClassPath,
                "-f", "J",
                "-v",
                "-print-tags",
                "-p", "jtp.DivisionByZeroAnalysis", "on",
                "-p", "jb", "use-original-names:true",
                "-p", "jb.ls", "off",
                "-p", "jb.sils", "off",
                "-p", "jb.ule", "off",
                "-p", "jb.cp", "off",
                "-keep-line-number",
        };

        Launcher.main(sootArgs);
    }

    public static void setupDivisionByZeroAnalysis() {
        Pack jtpPack = PackManager.v().getPack("jtp");

        // Add the analysis to the Jimple Transform Pack. This will make it run after the Jimple generation when Soot executes.
        // This analysis will be run on each method body.
        jtpPack.add(new Transform(DIVISION_BY_ZERO_SOOT_PHASE_NAME, new BodyTransformer() {

            /**
             * This method is called for each method body in the program.
             *
             * @param body the body on which to apply the transformation
             * @param phaseName the phasename for this transform; not typically used by implementations.
             * @param options the actual computed options; a combination of default options and Scene specified options.
             */
            @Override
            protected void internalTransform(Body body, String phaseName, Map<String, String> options) {
                if ("<init>".equals(body.getMethod().getName())) {
                    // Ignore constructors.
                    return;
                }

                // Run the DivisionByZeroAnalysis on the body.
                // We use the ExceptionalUnitGraph to build a control flow graph that takes exceptions into account.
                lastDivisionByZeroAnalysis = new DivisionByZeroAnalysis(new ExceptionalUnitGraph(body));

                // A Unit is a code fragment such as an assignment, a method call, a return statement, etc.
                // For each unit in the body, check if it is offending (i.e., if it is a division by zero).
                for (Unit unit : body.getUnits()) {
                    if (lastDivisionByZeroAnalysis.unitIsOffending(unit)) {
                        // If the unit is offending, log it and add a tag to the unit.
                        unit.getTags()
                                .stream()
                                .filter(tag -> tag instanceof LineNumberTag)
                                .map(tag -> (LineNumberTag) tag)
                                .findFirst()
                                .ifPresent(lineNumberTag -> {
                                    LOGGER.error("Found a possible division by zero in line {}", lineNumberTag.getLineNumber());
                                });
                        unit.addTag(new StringTag("Possible division by zero here"));
                    }
                }
            }
        }));
    }

    /**
     * Returns the last division by zero analysis that was run.
     * @return a division by zero analysis, or null.
     */
    public static DivisionByZeroAnalysis getLastDivisionByZeroAnalysis() {
        return lastDivisionByZeroAnalysis;
    }
}
