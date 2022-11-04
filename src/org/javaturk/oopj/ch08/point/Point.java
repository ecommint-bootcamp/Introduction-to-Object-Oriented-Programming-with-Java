package org.javaturk.oopj.ch08.point;

public class Point {
	private double Xhorizontal,Yvertical;
	
	public Point(double newXhorizontal,double newYvertical) {
		this.Xhorizontal=newXhorizontal;
		this.Yvertical=newYvertical;
	}
	
	public double getXhorizontal() {
		return Xhorizontal;
	}
	
	public void setXhorizontal(int newXhorizontal) {
		this.Xhorizontal=newXhorizontal;
	}
	
	public double getYvertical() {
        return Yvertical;
    }

    public void setYvertical(double newYvertical) {
        this.Yvertical = newYvertical;
    }
    
    public double calculateDistanceOrigin() {
        return Math.pow(Xhorizontal, 2) + Math.pow(Yvertical, 2);
    }
    
    public double calculateDistancePoint(Point point) {
        return Math.pow((Xhorizontal - point.Xhorizontal), 2) + Math.pow((Yvertical - point.Yvertical), 2);
    }
    
    public void move(double newXhorizontal, double newYvertical) {
		this.Xhorizontal += newXhorizontal;
		this.Yvertical += newYvertical;
	}
    
    public Point clone() {
		return new Point(Xhorizontal, Yvertical);
	}
    
    @Override
    public String toString() {
        return "Point Info: "+ "x= " + Xhorizontal +" y= " + Yvertical ;
    }
    
    @Override
    public boolean equals(Object o){
    	if (o == this)
            return  true;
        if(!(o instanceof Point)){
            return false;
        }

        Point other = (Point) o;

        return this.Xhorizontal == other.Xhorizontal && this.Yvertical == other.Yvertical;
    }
    
    @Override
	public int hashCode() {
		return (int) Xhorizontal + (int) Yvertical;
	}
    	
    
	
	}
