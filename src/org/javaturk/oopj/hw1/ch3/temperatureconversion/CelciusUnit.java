package ch3.temperatureconversion;

public class CelciusUnit implements Convertable {
	protected double degree;

	CelciusUnit(double degree) {
		this.degree = degree;
	}

	@Override
	public double convertCelcius() {
		return degree;
	}

	@Override
	public double convertFahrenheit() {

		return (degree * 9 / 5) + 32;

	}

	@Override
	public double convertKelvin() {
		// TODO Auto-generated method stub
		return degree + 273.15;
	}

}
