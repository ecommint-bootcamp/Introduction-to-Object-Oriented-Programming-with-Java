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
	
	public double distanceToOrigin() {
		return Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2));
	}
	
	public double distanceToPoint(final Point point) {
		return Math.sqrt(Math.pow(this.x - point.getX(), 2) + Math.pow(this.y - point.getY(), 2));
	}
	
	public Point clone() {
		return new Point(x, y);
	}
	
	public void move(double x, double y) {
		this.x += x;
		this.y += y;
	}
	
	
	@Override
	public boolean equals(Object o) {
		Point point = (Point) o;
		
		if (this.x == point.getX() && this.y == point.getY())
			return true;
		return false;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(this.x, this.y);
	}
	
	@Override
	public String toString() {
		return "Point x: " + this.x + ", y: " + this.y;
	}
}
