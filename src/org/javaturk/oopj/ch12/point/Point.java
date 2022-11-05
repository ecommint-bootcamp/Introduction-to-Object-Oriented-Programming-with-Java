package hw_08_03.point;


import java.util.Objects;

public class Point {

    private Double x;

    private Double y;


    public Point() {
    }

    public Point(Double x, Double y) {
        this.x = x;
        this.y = y;
    }

    public Double distanceFromCenter(){

        if(Objects.isNull(this.x) || Objects.isNull(this.y) ){
            throw new NullPointerException("x or y cannot be null");
        }
        return Math.sqrt(
                Math.pow(-1*this.y, 2) +
                        Math.pow(-1*this.x ,2));
    }

    public Double distanceBetweenTwoPoints(Double x, Double y){

        if(Objects.isNull(x) || Objects.isNull(y) || Objects.isNull(this.x) || Objects.isNull(this.y)){
            throw new NullPointerException("x or y cannot be null");
        }
        return Math.sqrt(
                Math.pow(y - this.y, 2) +
                        Math.pow(x - this.x ,2));
    }

    public Point cloneInstance(){
        return new Point(x, y);
    }

    public Double move(String direction, Double offset){

        direction = direction.toLowerCase();
        if(direction.equals("x")){
            return x + offset;
        }else if(direction.equals("y")){
            return y + offset;
        }

        throw new IllegalArgumentException("Wrong direction input, please check parameters and try again!");

    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return x.equals(point.x) && y.equals(point.y);
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
