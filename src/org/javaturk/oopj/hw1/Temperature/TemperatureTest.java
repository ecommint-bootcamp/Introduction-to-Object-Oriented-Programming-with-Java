package org.javaturk.oopj.hw1.Temperature;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TemperatureTest {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("org/javaturk/oopj/hw1/applicationContext.xml");
		
		
		Converter kelvinCalculator = context.getBean("kelvin",Converter.class);
		Converter fahrenheitCalculator = context.getBean("fahrenheit",Converter.class);
		Converter celciusCalculator = context.getBean("celcius",Converter.class);
		
		context.close();
		
			
		//first unit
		Unit unit= new Celcius(50);
		System.out.println(unit.getValue() +" Celcius");
		
		
		//celcius to fahrenheit -- unit refer to fahrenheit
		unit=unit.convert(fahrenheitCalculator);
		System.out.println("Celcius to Fahrenheit : "+unit.getValue());
		
		// fahreneit to kelvin -- unit refer to fahrenheit
		unit=unit.convert(kelvinCalculator);
		System.out.println("Fahrenheit to Kelvin : "+unit.getValue());
		
		
		// kelvin to celcius -- unit refer to fahrenheit
		unit=unit.convert(celciusCalculator);
		System.out.println("Kelvin to Celcius : "+unit.getValue());
		
		
		
		
	}

}
