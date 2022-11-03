package org.javaturk.oopj.TemperatureConverter.java;

public class TestTheTemperature{

	public static void main(String[] args) {
		
		ToCelsius toCelcius= new ToCelsius();
		ToKelvin toKelvin= new ToKelvin();
		ToFahrenheit toFahrenheit= new ToFahrenheit();
		
	
    Celcius celisus1= new Celcius(50);
		Celcius celisus2= new Celcius(50);
		Fahrenheit fahrenheit1=new Fahrenheit(35);
		Fahrenheit fahrenheit2=new Fahrenheit(35);
		Kelvin kelvin1= new Kelvin(10);
		Kelvin kelvin2= new Kelvin(10);
		Celcius celisus1= new Celcius(50);
		Celcius celisus2= new Celcius(50);
		
		
		
		System.out.println(toFahrenheit.calculate(celisus1).getValue());
		
		
	}

}
