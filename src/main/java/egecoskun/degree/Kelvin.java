package egecoskun.degree;

public class Kelvin extends ThermalUnit implements Convertable{
    public Kelvin(double currentDegree) {
        super(currentDegree);
    }

    @Override
    public double convert(ThermalUnit thermalUnit) {
        if(thermalUnit instanceof Celcius){
            return thermalUnit.getCurrentDegree()+273.15;
        }else if(thermalUnit instanceof  Fahrenheit){
            return 1.8*(thermalUnit.getCurrentDegree()-32)+273.15;
        }else{
            throw new ThermalUnitNotRecognizedException();
        }
    }
}
