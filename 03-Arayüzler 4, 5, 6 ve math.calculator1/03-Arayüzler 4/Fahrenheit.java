public class Fahrenheit extends Temperature{

    public Fahrenheit(double temperature) {
        super(temperature);
    }

    @Override
    public void calculate(Temperature temperature) {
        if(temperature instanceof Kelvin){
            System.out.println("Kelvin = "+(this.temperature+459.67)*(5.0/9.0));
        } else if (temperature instanceof Celcius) {
            System.out.println("Celcius = "+(this.temperature-32)*(5.0/9.0));
        } else{
            System.out.println("Temperature type is not valid.");
        }
    }
}
