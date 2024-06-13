package inge2.dataflow.targets;

public class Target6 {
    private Target6 f1;

    public void entryPoint() {
        Target6 a = new Target6();
        Target6 b = new Target6();
        a.f1 = b;
        Target6 c = new Target6();
        Target6 d = new Target6();
        c.f1 = d;
        a = c;
        Target6 e = a.f1;
        e.f1 = b;
    }
}
