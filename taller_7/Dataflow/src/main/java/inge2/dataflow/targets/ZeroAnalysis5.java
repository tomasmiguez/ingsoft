package inge2.dataflow.targets;

public class ZeroAnalysis5 {
    public static int func(int y) {
        int x = y;
        y = 1;
        while (x != 1) {
            y = x * y;
            x = x - 1;
        }
        return y;
    }
}
