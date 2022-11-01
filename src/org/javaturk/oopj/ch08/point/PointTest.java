package org.javaturk.oopj.ch08.point;

public class PointTest {
    public static void main(String[]args) throws CloneNotSupportedException {
        Point point1=new Point(3,4);
        Point point2=new Point(-2,-3);

        System.out.println("1. " + point1.getInfo());
        System.out.println("2. " +point2.getInfo());

        Point point3=point1.clone();
        System.out.println("Point 1's Clone " +point3.getInfo());

        System.out.print("\n");
        System.out.println("Distance of point1 to the origin: " +point1.calculateDistanceToOrigin());
        System.out.println("Distance of point2 to the origin: " +point2.calculateDistanceToOrigin());
        System.out.println("Distance of point1 to the origin: " +point3.calculateDistanceToOrigin());

        System.out.print("\n");
        System.out.println("Distance of the point1 to the point2 " +point1.calculateDistanceToPoint(point2));
        System.out.println("Distance of the point3 to the point1 " +point3.calculateDistanceToPoint(point1));

        System.out.print("\n");
        System.out.println("************Point 3 is moving*************");
        point3.move(-5,3);
        System.out.println("New Location of Point 3: ");
        System.out.println(point3.getInfo());


    }
}


