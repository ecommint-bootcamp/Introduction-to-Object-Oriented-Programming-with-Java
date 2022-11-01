package egecoskun.degree;

public class Celcius extends ThermalUnit implements Convertable{
    public Celcius(double currentDegree) {
        super(currentDegree);
    }

    @Override
    public double convert(ThermalUnit thermalUnit) {
        if(thermalUnit instanceof Kelvin){
            return thermalUnit.getCurrentDegree()-273.15;
        }else if(thermalUnit instanceof Fahrenheit){
            return (thermalUnit.getCurrentDegree()-32)/1.8;
        }else{
            throw new ThermalUnitNotRecognizedException();
        }
    }
}
