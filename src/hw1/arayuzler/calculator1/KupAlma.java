package hw1.arayuzler.calculator1;

public class KupAlma implements MathFunction {


    private static String name = "Power";

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double calculate(double arg) {
        return Math.pow(arg, 3);
    }
}
