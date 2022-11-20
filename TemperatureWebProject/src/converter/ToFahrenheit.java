package converter;

import domain.Celcius;
import domain.Fahrenheit;
import domain.Kelvin;
import domain.Unit;

public class ToFahrenheit implements Convert {

	@Override
	public Unit calculate(Unit value) {

		double newValue=0;
		
		if(value instanceof Kelvin) {
			newValue=((((value.getValue()- 273.15)*9)/5)+32);
		}
		else if(value instanceof Celcius) {
			newValue=(((value.getValue()*9)/5)+32);
		}
		
		

		Fahrenheit x =new Fahrenheit(newValue);
		
		return x;
	}

}
