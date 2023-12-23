package ak.po.figures;

public class Cone extends Solid {

    private double radius;
    private double height;
    private final double EPSILON = 0.00001;

    private double l;


    public Cone(double radius, double height, Unit unit) {
        super(unit);
        GreaterThanZeroValidator.getInstance().isValid(radius, height);
        this.radius = radius;
        this.height = height;
        this.l = Math.sqrt((radius * radius) + (height * height));

    }


    @Override
    public double volume() {
        return (1.0 / 3.0) * Math.PI * radius * radius * height;
    }

    @Override
    public double surfaceArea() {
        return Math.PI * radius * l + Math.PI * radius * radius;
    }


    public boolean equals(Cone cone) {
        if (!super.equals(cone)) return false;
        return Math.abs(radius - cone.radius) < EPSILON &&
                Math.abs(height - cone.height) < EPSILON;


    }

    @Override
    public String toString() {
        return super.toString();
    }
}
