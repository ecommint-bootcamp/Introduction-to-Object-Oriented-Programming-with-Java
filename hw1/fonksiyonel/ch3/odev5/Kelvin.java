package hw1.fonksiyonel.ch3.odev5;

public class Kelvin extends Units implements IConvert {

	public Kelvin(double currentDegree) {
		super(currentDegree);

	}

	@Override
	public double convert(Units units) {
		// Multiply 1.8 = 5/9
		if (units instanceof Celcius) {
			return units.getCurrentDegree() + 273;
		} else if (units instanceof Fahrenheit) {
			return ((units.getCurrentDegree() - 32) * 1.8) + 273;
		} else {
			throw new RuntimeException();
		}
	}

}
