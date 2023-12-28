package ak.po.figures;

public class GreaterThanZeroValidator {

    private static GreaterThanZeroValidator INSTANCE = new GreaterThanZeroValidator();

    private final String lessThanZero = "Wpisana wartość musi być większa od 0";


    public static GreaterThanZeroValidator getInstance() {
        return INSTANCE;
    }


    public void isValid(double a, double b, double c) {
        double[] values = {a, b, c};
        for (double number : values) {
            if (number < 0.0) {
                throw new IllegalArgumentException(lessThanZero + "\nPodano wartość: " + number);
            }
        }

    }


    public void isValid(double a, double b) {
        double[] values = {a, b};
        for (double number : values) {
            if (number < 0.0) {
                throw new IllegalArgumentException(lessThanZero + "\nPodano wartość: " + number);
            }
        }
    }

    private GreaterThanZeroValidator(){}


}
