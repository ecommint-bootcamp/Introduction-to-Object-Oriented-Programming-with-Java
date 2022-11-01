package egecoskun.point;

public class PointTest {
    public static void main(String[] args) {
       Point point1 = new Point(3,5);
       Point point2=new Point(7,12);
        System.out.println("Distance to origin  -> "+point2.calculateDistanceToOrigin());
        System.out.println("Distance between 2 points -> "+point2.calculateDistanceBetweenPoints(point1));
        System.out.println("Before move X -> "+point1.getX()+" Before move Y -> "+point1.getY());
        point1.move(3,8,point1);
        System.out.println("After move X -> "+point1.getX()+" After move Y -> "+point1.getY());
    }
}