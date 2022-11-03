package org.javaturk.oopj.ch08.PointDistanceTest.java;


public class PointDistanceTest {

    public static void main(String[] args) {

        run();

    }

    public static void run() {
        Point p1 = new Point(5, 12);
        Point p2 = new Point(20.2);
        Point p3 = new Point();
        p3.setX(8);
        p3.setY(15);
        System.out.println("p1-> " + p1);
        System.out.println("p2-> " + p2);
        System.out.println("p3-> " + p3);


        System.out.println(".....");

        System.out.println("distance from p3 to center: " + p3.distance());
        System.out.println("distance from p1 to center: " + p1.distance());
        System.out.println("distance from p2 to center: " + p2.distance());
        System.out.println("distance between p1 and p2: " + p1.distance(p2));

        System.out.println(".....");


        p1.setX(17.5);
        p1.setY(32.12);

        System.out.println("p1-> " + p1);


        System.out.println(".....");


        Point p4 = p2.clone();
        System.out.println("p4-> " + p4);


        System.out.println(".....");

        p4.move(-12, 3.78);
        System.out.println("p4-> " + p4);
        System.out.println("p2-> " + p2);


        System.out.println(".....");
    }
