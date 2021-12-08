package patterns.structural.adapter;

public class RoundHole {
    private double radius;

    public RoundHole(double radious) {
        this.radius = radious;
    }

    public double getRadius() {
        return radius;
    }

    public boolean fit(RoundPeg peg) {
        return this.radius >= peg.getRadius();
    }
}
