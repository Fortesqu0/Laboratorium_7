package ak.po.figures;

public abstract class Solid {


    enum Unit {
        mm("mm"),
        cm("cm"),
        dm("dm"),
        m("m");

        private final String abbreviation;

        Unit(String abbreviation) {
            this.abbreviation = abbreviation;
        }

        @Override
        public String toString() {
            return this.abbreviation;
        }

    }

    private Unit unit;

    Solid(Unit unit) {
        this.unit = unit;

    }


    public Unit getUnit() {
        return unit;
    }

    public boolean equals(Solid solid) {
      return unit == solid.unit;

    }

    public abstract double volume();

    public abstract double surfaceArea();





}
