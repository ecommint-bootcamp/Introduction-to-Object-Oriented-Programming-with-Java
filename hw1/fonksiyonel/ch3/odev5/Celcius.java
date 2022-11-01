package hw1.fonksiyonel.ch3.odev5;

public class Celcius extends Units implements IConvert {

	public Celcius(double currentDegree) {
		super(currentDegree);

	}

	@Override
	public double convert(Units units) {
		// Multiply 1.8 = 5/9
		if (units instanceof Fahrenheit) {
			return (units.getCurrentDegree() - 32) / 1.8;
		} else if (units instanceof Kelvin) {
			return units.getCurrentDegree() - 273;
		} else {
			throw new RuntimeException();
		}
	}

}
