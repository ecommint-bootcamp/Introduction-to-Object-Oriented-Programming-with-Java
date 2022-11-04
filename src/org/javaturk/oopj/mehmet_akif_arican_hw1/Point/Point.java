import java.util.Objects;

public class Point {
    private double coordinateX;
    private double coordinateY;

    public Point(double coordinateX, double coordinateY) {
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
    }

    public double getCoordinateX() {
        return coordinateX;
    }

    public void setCoordinateX(double coordinateX) {
        this.coordinateX = coordinateX;
    }

    public double getCoordinateY() {
        return coordinateY;
    }

    public void setCoordinateY(double coordinateY) {
        this.coordinateY = coordinateY;
    }

    public double distanceToCenter(){
        return Math.pow((Math.pow(this.coordinateX,2)+Math.pow(this.coordinateY,2)),0.5);
    }

    public double distanceToPoint(Point diffPoint){
        return Math.pow((Math.pow(this.coordinateX - diffPoint.coordinateX, 2)+Math.pow(this.coordinateY - diffPoint.coordinateY, 2)), 0.5);
    }

    public Point clone(){
        return new Point(this.coordinateX,this.coordinateY);
    }

    public void move(double x, double y){
        this.coordinateX += x;
        this.coordinateY += y;
    }

    public void pointInfo(){
        System.out.format("X = %f\nY = %f\n",this.coordinateX, this.coordinateY);
    }

    @Override
    public int hashCode() {
        return Objects.hash(coordinateX, coordinateY);
    }

    @Override
    public boolean equals(Object obj) {
        return (this == obj);
    }

    @Override
    public String toString() {
        return "Coordinates;" + " X = " + coordinateX + ", Y = " + coordinateY;
    }
}
