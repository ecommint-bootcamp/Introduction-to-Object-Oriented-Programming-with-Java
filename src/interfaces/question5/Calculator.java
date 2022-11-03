package interfaces.question5;

public class Calculator {
    private Convert convert;

    public Calculator(Convert convert) {
        this.convert = convert;
    }

    public void calculate(double degree) {
        convert.convert(degree);
    }
}
