package hw1.tekrarkullanimvemiras.point;


import java.util.Objects;

public class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Point clone() {
           Point point = new Point(x, y);
        return point;
    }

    public void move(int x, int y, Point p) {

        p.setX(p.x + x);
        p.setY(p.y + y);

    }


    void printInfo() {
        System.out.println("Point [x=" + x + ", y=" + y + "]");
    }

    public double calculateDistanceToOrigin() {
        return Math.sqrt(x * x + y * y);
    }

    public double calculateDistanceToPoint(Point p) {
        return Math.sqrt(Math.pow((x - p.x), 2) + Math.pow((y - p.y), 2));
    }




    @Override
    public String toString() {
        return "Point{" + "x=" + x + ", y=" + y + '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);

//       int result = x;
//       result = 31 * result + y;
//       return result;

    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Point point = (Point) obj;

        if (x != point.x) return false;
        return y == point.y;

    }




}