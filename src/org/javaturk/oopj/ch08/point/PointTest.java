package org.javaturk.oopj.ch08.point;

public class PointTest {
    public static void main(String[]args) throws CloneNotSupportedException {
        Point point1=new Point(3,4);
        Point point2=new Point(-2,-3);

        System.out.println("1. " + point1);
        System.out.println("2. " +point2);

        Point point3= (Point) point1.clone();
        System.out.println("Point 1's Clone " +point3);

        System.out.print("\n");
        System.out.println("Distance of point1 to the origin: " +point1.calculateDistanceToOrigin());
        System.out.println("Distance of point2 to the origin: " +point2.calculateDistanceToOrigin());
        System.out.println("Distance of point1 to the origin: " +point3.calculateDistanceToOrigin());

        System.out.print("\n");
        System.out.println("Distance of the point1 to the point2: " +point1.calculateDistanceToPoint(point2));
        System.out.println("Distance of the point3 to the point1: " +point3.calculateDistanceToPoint(point1));


        System.out.print("Is point1 = point3: ");
        boolean b = point1 == point3;
        if (b)
            System.out.println("The same");
        else
            System.out.println("Different");

        System.out.print("\nIs point1 equals point3: ");

        b = point1.equals(point3);

        if (b)
            System.out.println("The same");
        else
            System.out.println("Different");


        System.out.print("\nIs point2 equals point1: ");

        b = point2.equals(point1);

        if (b)
            System.out.println("The same");
        else
            System.out.println("Different");

        System.out.print("\nIs point1 equals point2: ");

        b = point1.equals(point2);

        if (b)
            System.out.println("The same");
        else
            System.out.println("Different");

        System.out.println();

        System.out.println("1. " + point1);

        System.out.println("Hashcode of point1: " + point1.hashCode());
        System.out.println("Hashcode of point2: " + point2.hashCode());
        System.out.println("Hashcode of point3: " + point3.hashCode());


        System.out.print("\n");
        System.out.println("************Point 3 is moving*************");
        point3.move(-5,3);
        System.out.println("New Location of Point 3: ");
        System.out.println(point3);

        System.out.print("\nIs point1 equals point3: ");

        b = point1.equals(point3);

        if (b)
            System.out.println("The same");
        else
            System.out.println("Different");



    }


}


