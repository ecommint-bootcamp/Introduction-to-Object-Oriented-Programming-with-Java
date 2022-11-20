package converter;

import domain.Celcius;
import domain.Conversion;
import domain.Fahrenheit;
import domain.Kelvin;
import domain.Unit;

public  class Converter {
	

	public static Conversion convert(String from,String to,double temp) {
		
		Unit unit=null;
		Conversion conversion = null;
		
		//if the same
		if(from.equals(to)) {
			 conversion = new Conversion(from,to,temp,temp);
			 return conversion;
		}
		
		
		
		if(from.equals("kelvin")) {
			unit = new Kelvin(temp);
		}
		else if(from.equals("fahrenheit")){
			unit = new Fahrenheit(temp);
		}
		else if(from.equals("celcius")){
			unit = new Celcius(temp);
		}
		
		
		
		if(to.equals("kelvin")) {	
			 conversion = new Conversion(from,to,temp,unit.convert(new ToKelvin()).getValue());
		}
		else if(to.equals("fahrenheit")) {	
			 conversion = new Conversion(from,to,temp,unit.convert(new ToFahrenheit()).getValue());
		}
		else if(to.equals("celcius")) {
			 conversion = new Conversion(from,to,temp,unit.convert(new ToCelcius()).getValue());
		}
		
		
		
	
		return conversion;
	}
	
	
	
	

	
	
}
