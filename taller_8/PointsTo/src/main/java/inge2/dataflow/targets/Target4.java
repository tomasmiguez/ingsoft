package inge2.dataflow.targets;

public class Target4 {
    private Target4 f1;

    public void entryPoint() {
        Target4 x = new Target4();
        Target4 y = new Target4();
        x.f1 = y;
        Target4 temp = x.f1;
        y.f1 = temp;
    }
}
