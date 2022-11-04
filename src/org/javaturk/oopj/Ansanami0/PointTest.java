package Ansanami0;

public class PointTest {
	public static void main(String [] arg) {
		Point p1=new Point(3,4);
		p1.distance(0,0);
		Point p2=new Point(8,12);
		System.out.println(p1.distance(0,0));
		System.out.println(p1.distance(p2));
		p1.Move(5, 8);
		System.out.println(p1.getX());
		System.out.println(p1.getY());
		p1.toString();
		System.out.println(p1.toString());
		System.out.println(p1.hashCode());
		System.out.println(p1.equals(p2));
		System.out.println(p1.distance(p2));
	}
}
