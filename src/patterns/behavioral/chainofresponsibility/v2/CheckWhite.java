package patterns.behavioral.chainofresponsibility.v2;

public class CheckWhite extends ColorChecker{
    @Override
    public void check(Balloon balloon) {
        if (balloon.getColor().equals(Color.WHITE)) {
            System.out.println("Do something with white balloon");
        } else {
            System.out.println(this.getClass().getSimpleName() + ": It`s not my color");
            this.getColorCheckerNext().check(balloon);
        }
    }
}
