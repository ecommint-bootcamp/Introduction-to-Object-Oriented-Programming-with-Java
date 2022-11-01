package org.javaturk.oopj.ch08.point;

public class PointTest {

	public static void main(String[] args) {
		Point p1 = new Point(5, 6);
		Point p2 = new Point();
		
		System.out.println("Point p2 X: " + p2.getX() + " Y: " + p2.getY());
		
		p2.setX(3);
		p2.setY(4);
		
		System.out.println("Distance to origin: " + p1.calculateDistanceToOrigin());
        System.out.println("Distance between 2 points: " + p2.calculateDistanceToPoint(p1));
        
        System.out.println("---------------------");
        System.out.println("Before move X: " + p1.getX() + " Before move Y: " + p1.getY());
        p1.move(2, 3);
        System.out.println("After move X: " + p1.getX() + " After move Y: " + p1.getY());
        
        System.out.println("---------------------");
        System.out.println("Before move X: " + p1.getX() + " Before move Y: " + p1.getY());
        p1.move(-2, -3);
        System.out.println("After move X: " + p1.getX() + " After move Y: " + p1.getY());
        
        System.out.println("---------------------");
        Point p3 = p1.clone();
        System.out.println("Point p3 X: " + p3.getX() + " Y: " + p3.getY());
        
        System.out.println("---------------------");
        System.out.println("Is p1 equal to p3:  " + p1.equals(p3));
        System.out.println("Is p1 equal to p2:  " + p1.equals(p2));
        
        System.out.println("---------------------");
        System.out.println("p1 hashCode: " + p1.hashCode());
        System.out.println("p3 hashCode: " + p3.hashCode());
        System.out.println("p2 hashCode: " + p2.hashCode());
        
        System.out.println("---------------------");
        System.out.println(p1.toString());
        System.out.println(p2.toString());
	}
}
