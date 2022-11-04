public class PointTest {
    public static void main(String[] args) {
        Point point1 = new Point(4,8);
        Point point2 = new Point(15,12);

        
        point1.pointInfo();
        point1.move(1,5);
        System.out.println("After moving new coordinates are;");
        point1.pointInfo();

        System.out.println("\n");

        System.out.println("Ponit 2;");
        point2.pointInfo();
        System.out.println("Point2 distance to origin = "+point2.distanceToCenter());

        System.out.println("\n");

        System.out.println("Ponit 1;");
        point1.pointInfo();
        System.out.println("Ponit 2;");
        point2.pointInfo();
        System.out.println("Point1 distance to Point2 = "+point1.distanceToPoint(point2));


        System.out.println("\n");

        
        point2.pointInfo();
        Point clonePoint = point2.clone();
        clonePoint.pointInfo();

        System.out.println("\nhashCodes for each point are; ");
        System.out.println(point1.hashCode());
        System.out.println(point2.hashCode());
        System.out.println("\n");
        System.out.println(point2);
        System.out.println("\n");
        System.out.println(point2.equals(point1));
    }
}
