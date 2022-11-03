package interfaces.question5;

public class Celcius implements Convert {

    @Override
    public void convert(double degree) {
        double fahrenheit = (degree * 9 / 5) + 32;
        double kelvin = degree + 273.15;

        System.out.println("Celcius to Fahrenheit: " + fahrenheit);
        System.out.println("Celcius to Kelvin: " + kelvin);
    }

}
