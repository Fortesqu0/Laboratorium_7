package ak.po.figures;

public class Cuboid extends Solid {

    private double a, b, c;

    public final double EPSILON = 0.000001;

    private Unit unit;


    public Cuboid(double a, double b, double c, Unit unit) {
        super(unit);
        this.a = a;
        this.b = b;
        this.c = c;
    }



    public boolean equals(Cuboid cuboid) {
        super.equals(cuboid);
        return Math.abs(a - cuboid.a) < EPSILON &&
                Math.abs(b - cuboid.b) < EPSILON &&
                Math.abs(c - cuboid.c) < EPSILON;


    }
    @Override
    public double volume(){
        return a * b * c;

    }


    @Override
    public double surfaceArea(){
        return 2 * (a * b + b * c + c * a);
    }


}
