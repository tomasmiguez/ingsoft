package inge2.dataflow;

public class JMLResult {
    private final String stdout;
    private final String stderr;

    public JMLResult(String stdout, String stderr) {
        this.stdout = stdout;
        this.stderr = stderr;
    }

    public String getOutput() {
        return this.stdout;
    }

    public boolean isVerificationFailure() {
        return this.stdout.contains("verification failure") || this.stdout.contains("error");
    }
}
