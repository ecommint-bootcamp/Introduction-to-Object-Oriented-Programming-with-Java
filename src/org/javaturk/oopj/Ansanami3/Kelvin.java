package Ansanami3;

public class Kelvin implements Itemperature{
	double sicaklik;
	

	public Kelvin(double sicaklik) {
		this.sicaklik = sicaklik;
	}
	
	public void setSicaklik(double sicaklik) {
		this.sicaklik = sicaklik;
	}

	@Override
	public double convertFahrenheit() {
		// TODO Auto-generated method stub
		return (sicaklik-459.67)/0.5555;
	}

	@Override
	public double convertKelvin() {
		// TODO Auto-generated method stub
		return sicaklik;
	}

	@Override
	public double convertCelcius() {
		// TODO Auto-generated method stub
		return sicaklik-273.15;
	}
}
