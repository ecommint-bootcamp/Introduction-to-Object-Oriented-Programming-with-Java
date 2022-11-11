package golbekir_hw2_restful.converter;

public class Fahrenheit extends Tempeture implements CelciusConvertable, KelvinConvertable {

	public Fahrenheit(double tempeture) {
		super(tempeture);
	}

	@Override
	public double convertCelcius() {
		return (tempeture - 32) * 5 / 9;
	}

	@Override
	public double convertKelvin() {
		return (tempeture - 32) * 5 / 9 + 273.15;
	}

}
