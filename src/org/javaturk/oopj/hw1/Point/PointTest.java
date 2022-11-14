package Point;

public class PointTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		Point p1 = new Point(6, 8);
		Point p2 = new Point(6, 7);

		System.out.println("Is P1 equal to P2? " + p1.equals(p2));
		System.out.println("p1 hascode: " + p1.hashCode());
		System.out.println("p2 hascode: " + p2.hashCode());

		System.out.println("Distance To The Center Point1: " + p1.distanceToTheCenter());
		System.out.println("Distance To The Center Point2: " + p2.distanceToTheCenter());
		System.out.println("Distance Comparsion: " + p1.pointDistanceComparison(p2));
		System.out.println(p1.toString());
		Point obj2 = (Point) p1.clone();
		Point p3 = new Point(obj2.xCoordinate, obj2.yCoordinate);
		System.out.println(p3.getxCoordinate());


		System.out.println("Before X: " + p1.getxCoordinate() + " Before Y:" + p1.getyCoordinate());
		p1.move(4, 5, p1);
		System.out.println("After X: " + p1.getxCoordinate() + " After Y:" + p1.getyCoordinate());

	}

}
