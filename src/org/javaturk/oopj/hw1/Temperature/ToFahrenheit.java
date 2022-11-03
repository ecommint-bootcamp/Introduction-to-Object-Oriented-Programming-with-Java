package org.javaturk.oopj.hw1.Temperature;

public class ToFahrenheit implements Calculator {

	@Override
	public Unit calculate(Unit value) {

		double newValue=0;
		
		if(value instanceof Kelvin) {
			newValue=((value.getValue()- 273.15)*9/5 + 32);
		}
		else if(value instanceof Celcius) {
			newValue=(value.getValue()*(9/5)+32);
		}
		
		Unit x= new Fahrenheit(newValue);
		
		return x;
	}

}
