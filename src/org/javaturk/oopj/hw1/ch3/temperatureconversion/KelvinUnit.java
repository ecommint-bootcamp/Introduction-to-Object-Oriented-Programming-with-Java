package ch3.temperatureconversion;

public class KelvinUnit implements Convertable {
	protected double degree;

	KelvinUnit(double degree) {
		this.degree = degree;
	}

	@Override
	public double convertCelcius() {

		return degree - 272.15;
	}

	@Override
	public double convertFahrenheit() {
		return (degree - 273) * 1.8 + 32;

	}

	@Override
	public double convertKelvin() {

		return degree;
	}

}
