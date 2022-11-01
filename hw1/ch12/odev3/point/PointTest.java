package hw1.ch12.odev3.point;

public class PointTest {
	public static void main(String[] args) {
		Point p1 = new Point(5, 12);
		Point p2 = new Point(7, 13);
		System.out.println("Distance between points: " + p2.calculateDistanceToPoint(p1));
		System.out.println("Distanece to origin: " + p1.calculateDistanceToOrigin());
		System.out.println("Distanece to origin: " + p2.calculateDistanceToOrigin());
		System.out.println("Before move: " + p1.getX() + "," + p2.getY());
		p1.move(5, 6, p2);
		System.out.println("After move: " + p1.getX() + "," + p1.getY());

	}

}
