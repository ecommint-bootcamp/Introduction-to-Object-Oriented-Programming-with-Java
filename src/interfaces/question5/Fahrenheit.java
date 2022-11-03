package interfaces.question5;

public class Fahrenheit implements Convert {

    @Override
    public void convert(double degree) {
        double celcius = (degree - 32) * 5 / 9;
        double kelvin = (degree - 32) * 5 / 9 + 273.15;

        System.out.println("Fahrenheit to Celcius: " + celcius);
        System.out.println("Fahrenheit to Kelvin: " + kelvin);
    }

}
