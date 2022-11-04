package Ansanami3;

public class Celcius  implements Itemperature{
	double sicaklik;
	public Celcius(double sicaklik) {
		this.sicaklik = sicaklik;
	}
	@Override
	public double convertKelvin() {
		
		return sicaklik+ 273.15 ;	
	}
	@Override
	public double convertFahrenheit() {
		
	
		return sicaklik*1.8+ 32 ;	
	}
	@Override
	public  double convertCelcius() {
		
		return sicaklik;
	}

	
	
	
	
	public double getSicaklik() {
		return sicaklik;
	}

	public void setSicaklik(double sicaklik) {
		this.sicaklik = sicaklik;
	}
	

	
}
