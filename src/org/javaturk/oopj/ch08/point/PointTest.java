package org.javaturk.oopj.ch08.point;

public class PointTest {
    public static void main(String[] args) {
    	
    	Point point1 = new Point(10,8);
		Point point2 = new Point(9,5);
		
		System.out.println("point2 X COORDINATE: " + point2.getXhorizontal() + " Y COORDINATE: " + point2.getYvertical());
		
		point2.setXhorizontal(2);
		point2.setYvertical(3);
		
		point1.calculateDistanceOrigin();
        point2.calculateDistancePoint(point1);
        
        System.out.println("FIRST X COORDINATE: " + point1.getXhorizontal() + " FIRST Y COORDINATE: " + point1.getYvertical());
        point1.move(4,5);
        System.out.println("LAST X COORDINATE: " + point1.getXhorizontal() + " LAST Y COORDINATE: " + point1.getYvertical());
        
        System.out.println("FIRST X COORDINATE: " + point1.getXhorizontal() + " FIRST Y COORDINATE: " + point1.getYvertical());
        point1.move(6,7);
        System.out.println("LAST X COORDINATE: " + point1.getXhorizontal() + " LAST Y COORDINATE: " + point1.getYvertical());
        
        Point point3 = point1.clone();
        System.out.println("point3 X COORDINATE: " + point3.getXhorizontal() + " Y COORDINATE: " + point3.getYvertical());
        
        System.out.println("point1 equal to point3:  " + point1.equals(point3));
        System.out.println("point1 equal to point2:  " + point1.equals(point2));
       
        System.out.println("point1 hashCode: " + point1.hashCode());
        System.out.println("point3 hashCode: " + point3.hashCode());
        System.out.println("point2 hashCode: " + point2.hashCode());
        
        System.out.println(point1.toString());
        System.out.println(point2.toString());
        }

    
		

}
