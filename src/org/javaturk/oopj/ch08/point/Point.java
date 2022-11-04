package org.javaturk.oopj.ch08.point;

import java.util.Objects;

public class Point {
	private double x;
	private double y;
	
	public Point() {
		this(0, 0);
	}
	
	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}
	
	public void setX(double x) {
		this.x = x;
	}
	
	public void setY(double y) {
		this.y = y;
	}
	
	public double calculateDistanceToOrigin() {
		return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
	}
	
	public double calculateDistanceToPoint(final Point point) {
		return Math.sqrt(Math.pow(x - point.getX(), 2) + Math.pow(y - point.getY(), 2));
	}
	
	public Point clone() {
		return new Point(x, y);
	}
	
	public void move(double x, double y) {
		this.x += x;
		this.y += y;
	}
	
	/*@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (!(o instanceof Point))
			return false;
		
		Point point = (Point) o;
		
		if (x == point.getX() && y == point.getY())
			return true;
		return false;
	}*/
	
	@Override
	public boolean equals(Object o) {
		Point point = (Point) o;
		
		if (x == point.getX() && y == point.getY())
			return true;
		return false;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(x, y);
	}
	
	@Override
	public String toString() {
		return "Point x: " + x + ", y: " + y;
	}
}