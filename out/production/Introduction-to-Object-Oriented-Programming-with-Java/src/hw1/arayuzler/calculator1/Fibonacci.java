package hw1.arayuzler.calculator1;

public class Fibonacci implements MathFunction {


    @Override
    public String getName() {
        return "FibonacciFunction";
    }

    @Override
    public double calculate(double arg) {
    return fibonacci(arg);
    }
    public int fibonacci(double arg) {
        if (arg > 1) {
            return fibonacci(arg - 1) + fibonacci(arg - 2);
        } else if (arg == 1) {
            return 1;
        } else if (arg == 0) {
            return 0;
        } else {
            System.out.println("1'e eşit veya daha büyük bir boyut girmelisiniz");
            return -1;
        }
    }
}
