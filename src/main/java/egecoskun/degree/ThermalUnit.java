package egecoskun.degree;

public class ThermalUnit {
    private double currentDegree;

    public ThermalUnit(double currentDegree) {
        this.currentDegree = currentDegree;
    }

    public double getCurrentDegree() {
        return currentDegree;
    }

    public void setCurrentDegree(double currentDegree) {
        this.currentDegree = currentDegree;
    }
}
