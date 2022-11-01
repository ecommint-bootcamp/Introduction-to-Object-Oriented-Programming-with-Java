package hw1.fonksiyonel.ch3.odev5;

public class Fahrenheit extends Units implements IConvert {

	public Fahrenheit(double currentDegree) {
		super(currentDegree);
		
	}

	@Override
	public double convert(Units units) {
		// Multiply 1.8 = 5/9
		if (units instanceof Kelvin) {
			return ((units.getCurrentDegree() - 273) * 1.8) + 32;
		} else if (units instanceof Celcius) {
			return (units.getCurrentDegree() * 1.8) + 32;
		} else {
			throw new RuntimeException();
		}
	}

}
