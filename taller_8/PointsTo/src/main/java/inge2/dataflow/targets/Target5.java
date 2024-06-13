package inge2.dataflow.targets;

public class Target5 {
    private Target5 f1;

    public void entryPoint() {
        Target5 x = new Target5();
        Target5 y = new Target5();
        Target5 z = new Target5();
        x.f1 = y;
        y.f1 = z;
        z.f1 = x;

        Target5 t = z;
        t = t.f1;
        t = t.f1;
    }
}
