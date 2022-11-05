package hw1.tekrarkullanimvemiras.point;


public class PointTest {

    public static void main(String[] args) {

        Point point1 = new Point(9, 12);
        Point point2 = new Point(7, 13);

        System.out.println(point1.calculateDistanceToPoint(point2));  //secilen iki noktanin koordinatlarinin birbirlerine uzakligi
        System.out.println(point1.calculateDistanceToOrigin() + "//////" + point2.calculateDistanceToOrigin());  //secilen noktalarin koordinatlarinin ayri ayri merkeze uzakligi

 //      point1.move( 5,16, point2);
 //      System.out.println(point1.getX() + "," +point2.getY());

        point2.move( 1,3, point1);
        System.out.println(point1.getX() + "," +point2.getY());  //move method tested!

    }


}
