package org.javaturk.oopj.ch08.point;

import java.util.Objects;

public class Point implements Cloneable {
    private int x;
    private int y;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Point point = (Point) o;
        return x == point.x && y == point.y;
    }

    @Override // hashcode sor
    public int hashCode() {
        return Objects.hash(x, y);
    }

    @Override
    public String toString() {
        return "Point: " + "(" + x + "," + y + ")";
    }

    public double distanceToCenter() {
        return Math.sqrt(Math.pow((-this.x), 2) + Math.pow((-this.y), 2));
    }

    public double distanceToPoint(Point p) {
        return Math.sqrt(Math.pow((this.x - p.x), 2) + Math.pow((this.y - p.y), 2));
    }

    public void move(int x, int y) {
        this.x += x;
        this.y += y;
    }

    @Override
    public Point clone() throws CloneNotSupportedException {
        return (Point) super.clone();
        // Object classının clone() methodu sayesinde yukarıdaki gibi bir çözüm yaratabilirmişiz.
        // bu parent methodu kullanmak için "throws CloneNotSupportedException" ihtiyacımız varmış.
        //bu kısmı sor
    }
}
