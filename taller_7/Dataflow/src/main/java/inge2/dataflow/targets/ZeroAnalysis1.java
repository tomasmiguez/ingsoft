package inge2.dataflow.targets;

public class ZeroAnalysis1 {
    public static int func(int m, int n) {
        int x = 0;
        int k = x * n;
        int j = m / k;
        return j;
    }
}
