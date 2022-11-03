package org.javaturk.oopj.hw1.Point;


public class Point {
	
	//for the equals method
	private int id;
	
	private double x;
	
	private double y;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
	
	
	
   public double distanceToOrigin() {
	   double temp =Math.sqrt(x*x+y*y);
	   return temp;
	   
   }
	
	public double distanceToPoint(double x, double y) {
		double temp= Math.sqrt(Math.pow(this.x-x, 2)+Math.pow(this.y-y,2));
		
		return temp;
	}
	
	
	public Point clone() {
		Point clone =new Point();
		clone.setX(x);
		clone.setY(y);
		
		return clone;
	}
	
	
	public void move(double move, String direction) {
		
		if(direction.equals("x")) {
			this.x+=move;
		}
		else if(direction.equals("y")) {
			this.y+=move;
		}
	}

	
	public String toString() {
		String s = new String();
		
		s += "Point Info\n";
		s += "X : " + x + "\n";
		s += "Y : " + y + "\n";
		
		return s;
		}
	
	
	public boolean equals(Object o) {
		
		Point p1=(Point)o;
	
		boolean b = false;
		
		if (id == p1.id && x==p1.x && y==p1.y) {
			b = true;
		}
		
		return b;
	}
	
	
	public int hashCode(){
		return (int)x + (int) y + id;
	}
	
	
}
