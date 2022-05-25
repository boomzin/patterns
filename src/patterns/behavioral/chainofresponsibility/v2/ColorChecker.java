package patterns.behavioral.chainofresponsibility.v2;

public abstract class ColorChecker {
    private ColorChecker colorCheckerNext;

    public ColorChecker linkWth(ColorChecker colorCheckerNext) {
        this.colorCheckerNext = colorCheckerNext;
        return colorCheckerNext;
    }

    public ColorChecker getColorCheckerNext() {
        return colorCheckerNext;
    }

    public abstract void check(Balloon balloon);
}
