package golbekir_hw2_restful.converter;

public class Celcius extends Tempeture implements FahrenheitConvertable, KelvinConvertable {

	public Celcius(double tempeture) {
		super(tempeture);
	}

	@Override
	public double convertFahrenheit() {
		return (tempeture * 9 / 5) + 32;
	}

	@Override
	public double convertKelvin() {
		return tempeture + 273.15;
	}
}
