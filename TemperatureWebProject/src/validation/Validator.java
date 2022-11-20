package validation;



public class Validator {
	public boolean validate(String from,String to) {
		boolean validated = false;
		if((from.equals("kelvin") | from.equals("celcius") | from.equals("fahrenheit")) && 
				(to.equals("kelvin") | to.equals("celcius") | to.equals("fahrenheit"))) {
			validated = true;
			
		}
		return validated;
	}
}
