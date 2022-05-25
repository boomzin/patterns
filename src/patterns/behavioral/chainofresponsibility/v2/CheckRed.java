package patterns.behavioral.chainofresponsibility.v2;

public class CheckRed extends ColorChecker{
    @Override
    public void check(Balloon balloon) {
        if (balloon.getColor().equals(Color.RED)) {
            System.out.println("Do something with red balloon");
        } else {
            System.out.println(this.getClass().getSimpleName() + ": It`s not my color");
            this.getColorCheckerNext().check(balloon);
        }
    }
}
