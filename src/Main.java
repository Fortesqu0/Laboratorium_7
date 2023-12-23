import ak.po.figures.Cone;
import ak.po.figures.Cuboid;
import ak.po.figures.Solid;


public class Main {
    public static void main(String[] args) {

        try {
            Cuboid cuboid = new Cuboid(1.004, 2.002, 3.004, Solid.Unit.cm);
            Cuboid cuboid1 = new Cuboid(2.004, 3.006, 4.004, Solid.Unit.dm);

            System.out.println(cuboid.equals(cuboid1));
            System.out.println(cuboid.surfaceArea());
            System.out.println(cuboid.volume());

            System.out.println(cuboid.toString());
            System.out.println("\n" + cuboid1.toString());
            System.out.println(cuboid1.equals(cuboid));
            System.out.println(cuboid1.surfaceArea());
            System.out.println(cuboid1.volume());

            Cuboid cuboid2 = new Cuboid(6.0, 6.0, 6.0, Solid.Unit.cm);
            Cuboid cuboid3 = new Cuboid(6.0, 6.0, 6.0, Solid.Unit.cm);
            System.out.println(cuboid2.equals(cuboid3));

            Cuboid cuboid4 = new Cuboid(1.0, 2.0, 5.0, Solid.Unit.cm);
            System.out.println(cuboid4.toString());

            Cone cone = new Cone(3.0, 4.0, Solid.Unit.cm);
            Cone cone1 = new Cone(3.0, 4.0, Solid.Unit.cm);
            System.out.println(cone.surfaceArea());
            System.out.println(cone.volume());


//        Cone cone1 = new Cone(-1.0,2.0, Solid.Unit.cm);

            System.out.println(cone.toString());
            System.out.println("\n" + cuboid.toString());

            System.out.println(cone.equals(cone1));


        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }


    }
}