package org.javaturk.oopj.hw1._03.arayuzler.hesapmakinesi;

public class FiboniacciFunction implements MathFunction {
    @Override
    public String getName() {
        return "Fib";
    }

    @Override
    public double calculate(double value) {
        double total =0;
        for (int i = 0; i<value; i++){
            long fib = fib(i);
            if(fib>=value)
                break;
            total+=fib;


        }

        return total;
    }

    @Override
    public String toString() {
        return getName();
    }

    public static long fib(long n) {
        if ((n == 0) || (n == 1))
            return n;
        else
            return fib(n - 1) + fib(n - 2);
    }
}
