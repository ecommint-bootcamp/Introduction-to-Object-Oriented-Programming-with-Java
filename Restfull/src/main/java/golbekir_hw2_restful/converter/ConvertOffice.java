package golbekir_hw2_restful.converter;

public class ConvertOffice {
	private Tempeture from;
	private Tempeture to;

	public ConvertOffice(Tempeture from, Tempeture to) {
		this.to = to;
		this.from = from;
	}

	public double convert() {

		if (from instanceof Celcius) {
			return convertFromCelcius(to);
		} else if (from instanceof Fahrenheit) {
			return convertFromFahrenheit(to);
		} else {
			return convertFromKelvin(to);
		}
	}

	private double convertFromCelcius(Tempeture to) {
		Celcius celcius = (Celcius) from;

		if (to instanceof Fahrenheit) {
			return celcius.convertFahrenheit();
		}

		else if (to instanceof Kelvin) {
			return celcius.convertKelvin();
		}

		return from.tempeture;

	}

	private double convertFromFahrenheit(Tempeture to) {
		Fahrenheit fahrenheit = (Fahrenheit) from;

		if (to instanceof Celcius) {
			return fahrenheit.convertCelcius();
		} else if (to instanceof Kelvin) {
			return fahrenheit.convertKelvin();
		}

		return from.tempeture;

	}

	private double convertFromKelvin(Tempeture to) {
		Kelvin kelvin = (Kelvin) from;

		if (to instanceof Celcius) {
			return kelvin.convertCelcius();

		}

		else if (to instanceof Fahrenheit) {
			return kelvin.convertFahrenheit();
		}

		return from.tempeture;

	}

	public static double convertFromString(String from, String to, double temp) {
		double result = 0.0;

		switch (from) {
		case "celcius": {
			Celcius celcius = new Celcius(temp);
			if (to.equals("fahrenheit")) {
				result = celcius.convertFahrenheit();
			}

			else if (to.equals("kelvin")) {
				result = celcius.convertKelvin();
			}
		}

		case "fahrenheit": {
			Fahrenheit fahrenheit = new Fahrenheit(temp);
			if (to.equals("celcius")) {
				result = fahrenheit.convertCelcius();
			}

			else if (to.equals("kelvin")) {
				result = fahrenheit.convertKelvin();
			}
		}

		case "kelvin": {

			Kelvin kelvin = new Kelvin(temp);
			if (to.equals("celcius")) {
				result = kelvin.convertCelcius();
			}

			else if (to.equals("fahrenheit")) {
				result = kelvin.convertFahrenheit();
			}
		}

		}
		return result;

	}
}
