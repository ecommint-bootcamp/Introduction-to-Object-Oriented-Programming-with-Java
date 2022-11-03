package interfaces.question5;

public class Test {
    public static void main(String[] args) {
        Convert celcius = new Celcius();
        // Convert fahrenheit = new Fahrenheit();
        // Convert kelvin = new Kelvin();

        Calculator calculator = new Calculator(celcius);

        calculator.calculate(100);
    }
}
