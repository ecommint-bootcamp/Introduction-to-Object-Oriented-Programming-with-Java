package hw1_degree;

public class Test {
	public static void main(String[] args) {
		 	Degree degree = new Celcius(33.6);
	        System.out.println(degree.toString());

	        System.out.println("Celcius: " + degree.toCelcius());
	        System.out.println("Kelvin: " + degree.toKelvin() );
	        System.out.println("Fahrenheit: " + degree.toFahrenheit() );

	        System.out.println("------------------------------------");

	        degree = new Fahrenheit(49.12 );
	        System.out.println(degree.toString());

	        System.out.println("Fahrenheit: " + degree.toFahrenheit());
	        System.out.println("Kelvin: " + degree.toKelvin() );
	        System.out.println("Celcius: " + degree.toCelcius() );

	        System.out.println("------------------------------------");


	        degree = new Kelvin(213.98 );
	        System.out.println(degree.toString());

	        System.out.println("Kelvin: " + degree.toKelvin() );
	        System.out.println("Fahrenheit: " + degree.toFahrenheit());
	        System.out.println("Celcius: " + degree.toCelcius() );
    }
}
