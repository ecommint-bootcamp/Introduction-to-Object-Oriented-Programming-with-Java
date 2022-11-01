public class Kelvin extends Temperature{

    public Kelvin(double temperature) {
        super(temperature);
    }

    @Override
    public void calculate(Temperature temperature) {
        if(temperature instanceof Fahrenheit){
            System.out.println("Fahrenheit = "+((this.temperature*1.8)-459.67));
        } else if (temperature instanceof Celcius) {
            System.out.println("Celcius = "+(this.temperature-273.15));
        } else {
            System.out.println("Temperature type is not valid.");
        }
    }
}
