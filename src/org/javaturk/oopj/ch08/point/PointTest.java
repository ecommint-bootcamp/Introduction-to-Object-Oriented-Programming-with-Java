package org.javaturk.oopj.ch08.point;

public class PointTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		Point point = new Point(5, 6);
		Point point0 = new Point(0, 0);
		Point point2 = new Point(-2, 3);
		
		
		System.out.println("Distance to the origin: " + point.distanceToOrigin());
		
		System.out.println("Distance from point to point0: " + point.distanceToPoint(point0));
		System.out.println("Distance from point to point2: " + point.distanceToPoint(point2));
		
		Point pointClone = (Point)point.clone();
		System.out.println("pointClone: " + pointClone.toString());
		
		pointClone.move(5, 1);
		System.out.println("The pointClone after moving: " + pointClone.toString());;
		
		

	}

}
