package org.javaturk.oopj.hw1.Temperature;

public class TemperatureTest {

	public static void main(String[] args) {
		
		ToFahrenheit toFahrenheit= new ToFahrenheit();
		ToCelcius toCelcius= new ToCelcius();
		ToKelvin toKelvin= new ToKelvin();
		
		
		Kelvin kelvin1= new Kelvin(10);
		

		Fahrenheit fahrenheit1=new Fahrenheit(35);
		
		
		Celcius celcius1= new Celcius(50);
		
		
		System.out.println(celcius1.getValue() +" Celcius to Fahrenheit : "+toFahrenheit.calculate(celcius1).getValue());
		System.out.println(kelvin1.getValue() +" Kelvin to Fahrenheit : "+toFahrenheit.calculate(kelvin1).getValue());
		
		System.out.println(fahrenheit1.getValue() +" Fahrenheit to Kelvin : "+toKelvin.calculate(fahrenheit1).getValue());
		System.out.println(celcius1.getValue() +" Celcius to Kelvin : "+toKelvin.calculate(celcius1).getValue());
		
		System.out.println(fahrenheit1.getValue() +" Fahrenheit to Celcius : "+toCelcius.calculate(fahrenheit1).getValue());
		System.out.println(kelvin1.getValue() +" Kelvin to Celcius : "+toCelcius.calculate(kelvin1).getValue());
		
	}

}
