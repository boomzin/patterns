package patterns.behavioral.chainofresponsibility.v2;

public class ColorCheckerChainStarter {
    private ColorChecker colorChecker;

    public void setColorChecker(ColorChecker colorChecker) {
        this.colorChecker = colorChecker;
    }

    public void start(Balloon balloon) {
        colorChecker.check(balloon);
    }
}
