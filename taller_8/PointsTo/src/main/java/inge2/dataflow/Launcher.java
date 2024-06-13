package inge2.dataflow;

import inge2.dataflow.pointstoanalysis.PointsToAnalysis;
import org.slf4j.Logger;
import soot.*;
import soot.toolkits.graph.ExceptionalUnitGraph;

import java.util.Map;

import static org.slf4j.LoggerFactory.getLogger;

/**
 * Launcher class for the points-to analysis.
 */
public class Launcher {
    public static final String POINTS_TO_SOOT_PHASE_NAME = "jtp.PointsToAnalysis";

    private static PointsToAnalysis lastPointsToAnalysis;

    public static void main(String[] args) {
        // Reset soot in case we are calling it multiple times.
        soot.G.reset();
        setupPointsToAnalysis();
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
                "-p", POINTS_TO_SOOT_PHASE_NAME, "on",
                "-p", "jb", "use-original-names:true",
                "-p", "jb.ls", "off",
                "-p", "jb.sils", "off",
                "-p", "jb.ule", "off",
                "-p", "jb.cp", "off",
                "-keep-line-number",
        };

        Launcher.main(sootArgs);
    }

    public static void setupPointsToAnalysis() {
        Pack jtpPack = PackManager.v().getPack("jtp");

        // Add the analysis to the Jimple Transform Pack. This will make it run after the Jimple generation when Soot executes.
        // This analysis will be run on each method body.
        jtpPack.add(new Transform(POINTS_TO_SOOT_PHASE_NAME, new BodyTransformer() {

            /**
             * This method is called for each method body in the program.
             *
             * @param body the body on which to apply the transformation
             * @param phaseName the phasename for this transform; not typically used by implementations.
             * @param options the actual computed options; a combination of default options and Scene specified options.
             */
            @Override
            protected void internalTransform(Body body, String phaseName, Map<String, String> options) {
                if (!"entryPoint".equals(body.getMethod().getName())) {
                    // Ignore all methods that are not called "entryPoint".
                    return;
                }

                // Run the PointsToAnalysis on the body.
                // We use the ExceptionalUnitGraph to build a control flow graph that takes exceptions into account.
                lastPointsToAnalysis = new PointsToAnalysis(new ExceptionalUnitGraph(body));
            }
        }));
    }

    /**
     * Returns the last points-to analysis that was run.
     * @return a points-to analysis, or null.
     */
    public static PointsToAnalysis getLastPointsToAnalysis() {
        return lastPointsToAnalysis;
    }
}
