package inge2.dataflow.targets;

public class Target3 {
    private Target3 f1;

    public void entryPoint() {
        Target3 x = new Target3();
        Target3 y = new Target3();
        x.f1 = y;
    }
}
