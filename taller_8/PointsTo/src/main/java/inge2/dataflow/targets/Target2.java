package inge2.dataflow.targets;

public class Target2 {
    private Target2 f1;

    public void entryPoint() {
        Target2 x = new Target2();
        Target2 z = x;
        z.f1 = x;
    }
}
