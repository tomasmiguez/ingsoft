package inge2.dataflow.targets;

public class ZeroAnalysis7 {
    public static int func() {
        int i = 0;
        int j = 1;
        int d = j / i;

        if (d > 0) {
            d = 1;
        }

        return d;
    }
}
