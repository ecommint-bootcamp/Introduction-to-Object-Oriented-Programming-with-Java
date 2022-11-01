public class Celcius extends Temperature{

    public Celcius(double temperature) {
        super(temperature);
    }

    @Override
    public void calculate(Temperature temperature) {
        if(temperature instanceof Kelvin){
            System.out.println("Kelvin = "+(this.temperature+273.15));
        } else if (temperature instanceof Fahrenheit) {
            System.out.println("Fahrenheit = "+((this.temperature*1.8)+32));
        } else{
            System.out.println("Temperature type is not valid.");
        }
    }
}
