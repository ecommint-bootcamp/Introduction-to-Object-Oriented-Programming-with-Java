package converter;

import domain.Celcius;
import domain.Fahrenheit;
import domain.Kelvin;
import domain.Unit;

public class ToKelvin implements Convert {

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
