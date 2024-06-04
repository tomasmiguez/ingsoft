package inge2.dataflow.targets;

public class ZeroAnalysis6 {
    public static int func(int x) {
        int y;
        if (x == 0) {
            y = 1;
        } else {
            y = 2;
        }
        int r = x / y;
        return r;
    }
}
