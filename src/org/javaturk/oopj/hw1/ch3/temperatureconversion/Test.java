package ch3.temperatureconversion;

public class Test {

	public static void main(String[] args) {
		KelvinUnit kelvinTemp = new KelvinUnit(1);
		System.out.println("Kelvin: " + kelvinTemp.convertKelvin());
		System.out.println("Fahrenhit: " + kelvinTemp.convertFahrenheit());
		System.out.println("Celcius: " + kelvinTemp.convertCelcius());
		
		System.out.println("------------");
		
		FahrenheitUnit fahrenTemp = new FahrenheitUnit(23.4);
		System.out.println("Kelvin: " + fahrenTemp.convertKelvin());
		System.out.println("Fahrenhit: " + fahrenTemp.convertFahrenheit());
		System.out.println("Celcius: " + fahrenTemp.convertCelcius());
		
		System.out.println("------------");
		
		CelciusUnit celciusTemp = new CelciusUnit(67.9);
		System.out.println("Kelvin: " + celciusTemp.convertKelvin());
		System.out.println("Fahrenhit: " + celciusTemp.convertFahrenheit());
		System.out.println("Celcius: " + celciusTemp.convertCelcius());
	}

}
