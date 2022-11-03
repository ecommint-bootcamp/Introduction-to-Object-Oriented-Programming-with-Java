package interfaces.question5;

public class Kelvin implements Convert {

    @Override
    public void convert(double degree) {
        double celcius = degree - 273.15;
        double fahrenheit = (degree - 273.15) * 9 / 5 + 32;

        System.out.println("Kelvin to Celcius: " + celcius);
        System.out.println("Kelvin to Fahrenheit: " + fahrenheit);
    }

}
