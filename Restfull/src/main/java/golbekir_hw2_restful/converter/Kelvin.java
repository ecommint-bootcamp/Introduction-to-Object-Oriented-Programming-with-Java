package golbekir_hw2_restful.converter;

public class Kelvin extends Tempeture implements CelciusConvertable, FahrenheitConvertable {

	public Kelvin(double tempeture) {
		super(tempeture);
	}

	@Override
	public double convertCelcius() {
		return tempeture - 273.15;
	}

	@Override
	public double convertFahrenheit() {
		return (tempeture - 273.15) * 9 / 5 + 32;
	}

}
