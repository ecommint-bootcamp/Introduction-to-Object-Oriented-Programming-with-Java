package org.javaturk.oopj.ch08.Point;

import java.util.Objects;

public class Point {

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    private double x;
    private double y;

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

    public double distanceToCentre() {
        return Math.sqrt(Math.pow(this.x,2) + Math.pow(this.y,2));
    }

    public double distanceToPoint(Point point) {
        return Math.sqrt(Math.pow(this.x - point.getX(),2) + Math.pow(this.y - point.getY(),2));
    }

    public Point pointClone() {
        return new Point(x,y);
    }

    public void move(double x, double y) {
        this.x += x;
        this.y += y;
    }

    @Override
    public String toString() {
        return "x = " + this.x + " y " + this.y;
    }

    @Override
    public boolean equals(Object obj) {
        Point point = (Point) obj;
        return x == point.getX() && y == point.getY();
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
