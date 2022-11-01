package egecoskun.point;

import java.util.Objects;

public class Point implements PointInterface{
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

    @Override
    public boolean equals(Object o){
        if(o==this){
            return true;
        }
        if(!(o instanceof Point)){
            return false;
        }
        Point point = (Point) o;
        return (Double.compare(x,point.x)==0 && Double.compare(y,point.y)==0);
    }

    public Point clone(){
        return new Point(x,y);
    }
    @Override
    public String toString() {
        return "Point x=" + x + ", y=" + y ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    @Override
    public double calculateDistanceToOrigin() {
        return Math.sqrt(Math.pow(x,2+Math.pow(y,2)));
    }

    @Override
    public double calculateDistanceBetweenPoints(Point point) {
        return Math.sqrt(Math.pow(x-point.x,2)+Math.pow(y-point.y,2));
    }

    @Override
    public Point move(int x, int y, Point point) {
        point.setX(point.x+x);
        point.setY(point.y+y);
        return point;
    }


}
