package egecoskun.degree;

public class Fahrenheit extends ThermalUnit implements Convertable{
    public Fahrenheit(double currentDegree) {
        super(currentDegree);
    }

    @Override
    public double convert(ThermalUnit thermalUnit) {
        if(thermalUnit instanceof Kelvin){
            return 1.8*(thermalUnit.getCurrentDegree()-273.15)+32;
        }else if(thermalUnit instanceof Celcius){
            return 1.8*thermalUnit.getCurrentDegree()+32;
        }else{
            throw new ThermalUnitNotRecognizedException();
        }

    }
}
