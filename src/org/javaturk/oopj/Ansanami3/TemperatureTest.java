package Ansanami3;

public class TemperatureTest {

	public static void main(String[] args) {
		Celcius a=new Celcius(0);
		System.out.println(a.convertFahrenheit());
		Fahrenheit b=new Fahrenheit(60);
		System.out.println(b.convertKelvin());
		System.out.println(b.convertCelcius());
		Kelvin c=new Kelvin(0);
		System.out.println(c.convertCelcius());
		System.out.println(c.convertFahrenheit());
	}
	
	
}
