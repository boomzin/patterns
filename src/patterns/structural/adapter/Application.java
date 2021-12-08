package patterns.structural.adapter;

public class Application {
    public static void main(String[] args) {
        RoundHole roundHole = new RoundHole(10);
        RoundPeg roundPeg = new RoundPeg(8);
        System.out.println("Round peg 8 is fit to round hole 10? " + roundHole.fit(roundPeg));
        SquarePeg squarePeg = new SquarePeg(9);
        SquarePegToRoundHoleAdapter squarePegToRoundHoleAdapter = new SquarePegToRoundHoleAdapter(squarePeg);
        System.out.println("Square peg 8 is fit to round hole 10? " + roundHole.fit(squarePegToRoundHoleAdapter));
    }
}
