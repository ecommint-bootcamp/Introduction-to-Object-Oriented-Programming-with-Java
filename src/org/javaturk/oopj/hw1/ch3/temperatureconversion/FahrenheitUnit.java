package ch3.temperatureconversion;

public class FahrenheitUnit implements Convertable {
	protected double degree;

	FahrenheitUnit(double degree) {
		this.degree = degree;
	}

	@Override
	public double convertCelcius() {
		return (degree - 32) * 5 / 9;
	}

	@Override
	public double convertFahrenheit() {
		// TODO Auto-generated method stub
		return degree;
	}

	@Override
	public double convertKelvin() {
		// TODO Auto-generated method stub
		return (degree - 32) * 5 / 9 + 273.15;
	}

}
