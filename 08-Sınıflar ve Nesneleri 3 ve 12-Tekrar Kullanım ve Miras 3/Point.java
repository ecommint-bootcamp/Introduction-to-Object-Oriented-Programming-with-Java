import java.util.Objects;

public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double distanceToCenter(){
        return Math.pow((Math.pow(this.x,2)+Math.pow(this.y,2)),0.5);
    }

    public double distanceToPoint(Point diffPoint){
        return Math.pow((Math.pow(this.x-diffPoint.x,2)+Math.pow(this.y-diffPoint.y,2)),0.5);
    }

    public Point clone(){
        return new Point(this.x,this.y);
    }

    public void move(double x, double y){
        this.x += x;
        this.y += y;
    }

    public void pointInfo(){
        System.out.format("X => %f\nY => %f\n",this.x,this.y);
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    @Override
    public boolean equals(Object obj) {
        return (this == obj);
    }

    @Override
    public String toString() {
        return "Point" + " x= " + x + ", y= " + y;
    }
}
