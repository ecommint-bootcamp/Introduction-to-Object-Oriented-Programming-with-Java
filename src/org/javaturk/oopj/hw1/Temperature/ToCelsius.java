package org.javaturk.oopj.hw1.Temperature;

public class ToCelsius implements Calculator{

	@Override
	public Unit calculate(Unit value) {
		
		double newValue=0;
		if(value instanceof Kelvin) {
			newValue=((value.getValue()- 273.15)*9/5 + 32);
		}
		else if(value instanceof Fahrenheit) {
			newValue=(value.getValue()-32*(9/5));
		}
		
		Unit x= new Fahrenheit(newValue);
		return x;
		
		
	}

}
