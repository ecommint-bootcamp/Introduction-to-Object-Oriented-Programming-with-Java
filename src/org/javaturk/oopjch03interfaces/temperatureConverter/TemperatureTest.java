package org.javaturk.oopjch03interfaces.temperatureConverter;

public class TemperatureTest {
	public static void main(String ... args) {
		
		Temperature temperature = new Celsius(22.5);

        System.out.println("Celsius: " + temperature.convertToCelsius());
        System.out.println("Fahrenheit: " + temperature.convertToFahrenheit());
        System.out.println("Kelvin: " + temperature.convertToKelvin());

        System.out.println("--------------------------------");

        temperature = new Fahrenheit(72.5);

        System.out.println("Celsius: " + temperature.convertToCelsius());
        System.out.println("Fahrenheit: " + temperature.convertToFahrenheit());
        System.out.println("Kelvin: " + temperature.convertToKelvin());

        System.out.println("--------------------------------");


        temperature = new Kelvin(295.65);

        System.out.println("Celsius: " + temperature.convertToCelsius());
        System.out.println("Fahrenheit: " + temperature.convertToFahrenheit());
        System.out.println("Kelvin: " + temperature.convertToKelvin());
	}
}
