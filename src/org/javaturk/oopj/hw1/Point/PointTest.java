package org.javaturk.oopj.hw1.Point;



public class PointTest {

	public static void main(String[] args) {
		
		Point point1=new Point();
		Point point2=new Point();
		
		 point1.setId(1);
		 point1.setX(3);
		 point1.setY(4);
		
		 point2.setId(2);
		 point2.setX(7);
		 point2.setY(8);
		 
		System.out.println("Point1 merkeze olan uzaklığı : "+point1.distanceToOrigin());
		System.out.println("Point2 merkeze olan uzaklığı : "+point2.distanceToOrigin());
		
		
		System.out.println("Point1 ile point2 arasındaki uzaklık : "+point1.distanceToPoint(point2.getX(), point2.getY()));
		
		System.out.println("Point1 adresi : " + point1+", Point1 clone adresi: "+point1.clone());
		
		
		point1.move(4,"x");
		System.out.println("Point1 x düzleminde 4 kaydırtıktan sonraki origine uzaklığı " + point1.distanceToOrigin());
		

		point1.move(-5,"y");
		System.out.println("Point1 y düzleminde -5 birim kaydırtıktan sonraki origine uzaklığı " + point1.distanceToOrigin());
		
		
		point1.toString();
		System.out.println(point1);
		
		
		
		
	}

}

