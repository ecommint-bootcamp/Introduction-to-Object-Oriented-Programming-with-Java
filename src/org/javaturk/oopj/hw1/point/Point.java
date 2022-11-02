/*----------------------------------------------------------------------
	FILE        : Point.java
	AUTHOR      : Furkan Zengin
	LAST UPDATE : 10.31.2022

	Point class that represents a point in 2 Dimension.
	This class includes the solutions for ch8-3 and ch12-3 questions
-----------------------------------------------------------------------*/

package org.javaturk.oopj.hw1.point;

import java.util.Objects;

public class Point {

    private double x;
    private double y;

    Point(){
      this(0,0);
    }

    Point(double x){
        this(x,0);
    }

    Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double distance(double x, double y) {
        return Math.sqrt((this.x - x) * (this.x - x) + (this.y) * (this.y));
    }

    public double distance(double x){
        return distance(x, 0);
    }

    public double distance(){
        return distance(0, 0);
    }

    public double distance(Point p){
        return distance(p.x, p.y);
    }

    @Override
    public Point clone() {
        return new Point(x, y);
    }

    public void move(double x, double y) {

        this.x += x;
        this.y += y;
    }

    public void move(double x) {
        move(x, 0);
    }

    @Override
    public boolean equals(Object obj) {
        if(super.equals(obj))
            return true;

        if(obj == null)
            return false;

        if (!(obj instanceof Point)) {
            return false;
        }

        return ((Point) obj).getX() == x && ((Point) obj).getY() == y;
    }

    @Override
    public String toString() {
        return "x=" + x +", y=" + y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
