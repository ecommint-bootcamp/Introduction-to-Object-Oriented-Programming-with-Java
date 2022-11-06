package javaturk.oopj.ch08.hw1;


public class PointTest {

    public static void main(String[] args) {
        Point point1 = new Point();
        Point point2 = new Point();

        System.out.println("First instance of Point");
        point1.setX(5);
        point1.setY(12);
        System.out.println(point1.distanceToOrigin());
        System.out.println(point1.distanceToOtherCoordinat(15, 20));
        point1.move(10);
        System.out.println("\n");
        System.out.println("Second instance of Point");
        point2.setX(8);
        point2.setY(15);
        System.out.println(point2.distanceToOrigin());
        System.out.println(point2.distanceToOtherCoordinat(3, 3));
        point2.move(12);
    }

}