public class PointTest {
    public static void main(String[] args) {
        Point p1 = new Point(7,16);
        Point p2 = new Point(12,2);

        //Move
        p1.pointInfo();
        p1.move(-1,-4);
        p1.pointInfo();

        System.out.println("===================================");

        //Distance to center
        p2.pointInfo();
        System.out.println("p2 distance to center => "+p2.distanceToCenter());

        System.out.println("===================================");

        //Distance to point
        p1.pointInfo();
        p2.pointInfo();
        System.out.println("p1 distance to p2 => "+p1.distanceToPoint(p2));


        System.out.println("===================================");

        //Clone
        p2.pointInfo();
        Point clonePoint = p2.clone();
        clonePoint.pointInfo();

        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
        System.out.println(p2);
        System.out.println(p2.equals(p1));
    }
}
