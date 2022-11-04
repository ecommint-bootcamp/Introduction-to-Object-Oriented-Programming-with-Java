package Ansanami0;

import Ansanami.Reader;

public class Point {
	int x;
	int y;
	double m;
	public Point(int x,int y) {
		this.x=x;
		this.y=y;
	}
	public double distance(int a,int b) {
		m=Math.pow(x-a,2)+Math.pow(y-b,2);
		return Math.sqrt(m);
	}
	//overload
	public double distance(Point a) {
		m=Math.pow(x-a.x,2)+Math.pow(y-a.y,2);
		return Math.sqrt(m);
	}
	public Point Clone(Point p){
			Point a=new Point(p.x,p.y);
			return a;
	}
	
	public void Move(int x,int y) {
		this.x+=x;
		this.y+=y;
	}

	
	@Override
	public String toString() {
		String s=new String();
		s+="\nPoint Info\n";	
		s+="x:  "+x+ "\n";	
		s+="y:  "+y+ "\n";	
		return s;
	}
	
	@Override //
	public boolean equals(Object b) {
		Point r1=(Point)b;
		boolean a=false;
		if(this.x==r1.x && this.y==r1.y) {
			a=true;
		}
		return a;
	}
	
	
	@Override//x+y leri aynıysa dedik
	public int hashCode() {
		return x+y;
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
	
	
	
}