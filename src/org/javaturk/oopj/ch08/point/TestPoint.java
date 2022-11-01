package org.javaturk.oopj.ch08.point;

public class TestPoint {
    public static void main(String[] args) throws CloneNotSupportedException {
        Point p1 = new Point(3, 3);
        Point p2 = new Point(5, 5);

        System.out.println("Distance of point p1 from the center: " + p1.distanceToCenter());
        System.out.println("Distance from point p1 to point p2: "+ p1.distanceToPoint(p2));
        System.out.println("old coordinate p1: (" + p1.getX() + "," + p1.getY() + ")");
        p1.move(7,7);
        System.out.println("new coordinate p1: (" + p1.getX() + "," + p1.getY() + ")");

        Point pClone = p1.clone();
        System.out.println("p1: (" + p1.getX() + ","+ p1.getY() + ") Clone p: (" + pClone.getX() + "," + pClone.getY() + ")");
        System.out.println(p1.equals(pClone));
        System.out.println(p2.toString());
        System.out.println(p2.hashCode());
    }
}
