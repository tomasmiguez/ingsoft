package inge2.dataflow.targets;

public class ZeroAnalysis2 {
    public static int func(int m, int n) {
        int x = n - n;
        int i = x + m;
        int j = m / x;
        return j;
    }
}
