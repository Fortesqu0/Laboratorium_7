package ak.po.figures;

public class Cone extends Solid {

    private double radius;
    private double height;
    private final double EPSILON = 0.00001;

    private double l = Math.sqrt(radius * radius + height * height);


    public Cone (double radius, double height, Unit unit){
        super(unit);
        this.radius = radius;
        this.height = height;

    }


    @Override
    public double volume() {
        return (1.0 / 3.0) * Math.PI * radius * radius * height;
    }

    @Override
    public double surfaceArea() {
        return (Math.PI * radius * radius) + (Math.PI * radius * l);
    }


    public boolean equals(Cone cone) {
        super.equals(cone);
        return Math.abs(radius - cone.radius) < EPSILON &&
                Math.abs(height - cone.height) < EPSILON;


    }


}
