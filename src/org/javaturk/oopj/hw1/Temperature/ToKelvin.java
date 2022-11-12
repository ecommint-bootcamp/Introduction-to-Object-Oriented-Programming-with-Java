package org.javaturk.oopj.hw1.Temperature;

public class ToKelvin implements Converter {

	@Override
	public Unit calculate(Unit value) {
		
		
		double newValue=0;
		
		if(value instanceof Fahrenheit) {
			newValue=((((value.getValue()-32)*5)/9)+273.15);
		}
		else if(value instanceof Celcius) {
			newValue=value.getValue()+273.15;
		}
		
		

		Kelvin x =new Kelvin(newValue);
		
		return x;
	}

	

}
