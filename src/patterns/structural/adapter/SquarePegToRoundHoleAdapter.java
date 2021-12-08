package patterns.structural.adapter;

public class SquarePegToRoundHoleAdapter extends RoundPeg{
    private SquarePeg squarePeg;

    public SquarePegToRoundHoleAdapter(SquarePeg squarePeg) {
        this.squarePeg = squarePeg;
    }

    @Override
    public double getRadius() {
        return (Math.sqrt(Math.pow((squarePeg.getWidth() / 2), 2) * 2));
    }
}
