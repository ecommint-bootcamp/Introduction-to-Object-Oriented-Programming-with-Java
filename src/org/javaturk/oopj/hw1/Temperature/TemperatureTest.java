package org.javaturk.oopj.hw1.Temperature;

public class TemperatureTest {

	public static void main(String[] args) {
		
		ToFahrenheit toFahrenheit= new ToFahrenheit();
		ToCelsius toCelcius= new ToCelsius();
		ToKelvin toKelvin= new ToKelvin();
		
		
		Kelvin kelvin1= new Kelvin(10);
		Kelvin kelvin2= new Kelvin(10);

		Fahrenheit fahrenheit1=new Fahrenheit(35);
		Fahrenheit fahrenheit2=new Fahrenheit(35);
		
		Celcius celisus1= new Celcius(50);
		Celcius celisus2= new Celcius(50);
		
		
		
		System.out.println(toFahrenheit.calculate(celisus1).getValue());
		
		
	}

}
