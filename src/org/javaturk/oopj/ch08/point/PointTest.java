package hw_08_03.point;

public class PointTest {

    public static void main(String[] args) {
        Point point = new Point(3.4 , 3.6);

        System.out.println(point.distanceFromCenter());

        System.out.println(point.distanceBetweenTwoPoints(2.6, 12.32));

        Point point2 = point.cloneInstance();

        System.out.println(point2);

        System.out.println(point.equals(point));

        System.out.println(point.hashCode() == point2.hashCode());

        System.out.println(point);

        System.out.println(point.move("x", -2.0));

        System.out.println(point.distanceBetweenTwoPoints(null ,2.1));

    }
}
