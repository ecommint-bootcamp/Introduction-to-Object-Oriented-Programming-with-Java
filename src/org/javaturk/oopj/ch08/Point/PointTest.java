package org.javaturk.oopj.ch08.Point;

public class PointTest {

    public static void main(String[] args) {
        Point point1 = new Point(3,4);
        Point point2 = new Point(2,7);


        System.out.println("Distance to origin: " + point1.distanceToCentre());
        System.out.println("Distance to origin: " + point2.distanceToCentre());
        System.out.println("Distance to point: " + point1.distanceToPoint(point2));


        point1.move(4,5);
        System.out.println("New point " + point1);

        point2.move(4,5);
        System.out.println("New point " + point2);

        boolean a = point1.equals(point2);
        if (a) {
            System.out.println("The same");
        }else {
            System.out.println("Different");
        }

        System.out.println("Hashcode: " + point1.hashCode());
        System.out.println("Hashcode: " + point2.hashCode());

    }
}
