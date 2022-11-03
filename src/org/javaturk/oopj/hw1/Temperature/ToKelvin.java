package org.javaturk.oopj.hw1.Temperature;

public class ToKelvin implements Calculator {

	@Override
	public Unit calculate(Unit value) {
		
		
		double newValue=0;
		
		if(value instanceof Fahrenheit) {
			newValue=(value.getValue()-32*(5/9)+237.15);
		}
		else if(value instanceof Celcius) {
			newValue=(value.getValue()+237.15);
		}
		
		
		
		Unit x= new Kelvin(newValue);
		return x;
	}

	

}
