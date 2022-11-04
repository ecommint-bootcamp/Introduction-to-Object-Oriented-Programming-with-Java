package Ansanami3;

public class Fahrenheit implements Itemperature{
	double sicaklik;
	
	public Fahrenheit(double sicaklik) {
		this.sicaklik = sicaklik;
	}

	@Override
	public double convertFahrenheit() {
		// TODO Auto-generated method stub
		return sicaklik;
	}

	@Override
	public double convertKelvin() {
		// TODO Auto-generated method stub
		return (sicaklik+459.67)*0.555555;
	}

	@Override
	public double convertCelcius() {
		// TODO Auto-generated method stub
		return (sicaklik/1.8)-32 ;
	}
	
	
	

}
