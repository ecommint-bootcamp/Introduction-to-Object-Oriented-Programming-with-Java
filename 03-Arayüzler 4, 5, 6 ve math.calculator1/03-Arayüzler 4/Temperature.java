public abstract class Temperature implements Calculate{
    double temperature;

    public Temperature(double temperature) {
        this.temperature = temperature;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    @Override
    public void calculate(Temperature temperature) {
        System.out.println("Temperature type is not valid.");
    }
}
