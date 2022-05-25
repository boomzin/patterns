package patterns.behavioral.chainofresponsibility.v2;

public class CheckBlue extends ColorChecker{
    @Override
    public void check(Balloon balloon) {
        if (balloon.getColor().equals(Color.BLUE)) {
            System.out.println("Do something with blue balloon");
        } else {
            System.out.println(this.getClass().getSimpleName() + ": It`s not my color");
            this.getColorCheckerNext().check(balloon);
        }
    }
}
