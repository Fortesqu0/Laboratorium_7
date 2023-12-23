package ak.po.figures;

public class Cuboid extends Solid {

    private double a, b, c;

    public final double EPSILON = 0.000001;

    private Unit unit;


    public Cuboid(double a, double b, double c, Unit unit) {
        super(unit);
        GreaterThanZeroValidator.getInstance().isValid(a, b, c);
        this.a = a;
        this.b = b;
        this.c = c;

    }


    public boolean equals(Cuboid cuboid) {
        if (!super.equals(cuboid)) return false;
        return Math.abs(a - cuboid.a) < EPSILON &&
                Math.abs(b - cuboid.b) < EPSILON &&
                Math.abs(c - cuboid.c) < EPSILON;


    }

    @Override
    public double volume() {
        return a * b * c;

    }


    @Override
    public double surfaceArea() {
        return 2 * (a * b + b * c + c * a);
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nBok a: " + this.a + "\nBok b: " + this.b + "\nBok c: " + this.c;
    }
}
