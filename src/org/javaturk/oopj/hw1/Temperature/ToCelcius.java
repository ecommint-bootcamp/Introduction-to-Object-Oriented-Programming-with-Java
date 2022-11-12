package org.javaturk.oopj.hw1.Temperature;

public class ToCelcius implements Converter{

	@Override
	public Unit calculate(Unit value) {
		
		double newValue=0;
		
		if(value instanceof Kelvin) {
			newValue=value.getValue()-273.15;
		}
		else if(value instanceof Fahrenheit) {
			newValue=((((value.getValue()-32)*5)/9));
		}
		
		Celcius x =new Celcius(newValue);
		
		return x;
		
		
	}

}
