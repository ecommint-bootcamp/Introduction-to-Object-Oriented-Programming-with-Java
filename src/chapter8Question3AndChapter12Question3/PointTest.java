package chapter8Question3AndChapter12Question3;

public class PointTest {
    public static void main(String[] args) {
        Point point = new Point();
        point.setx(3);
        point.sety(4);
        point.calculateDistance();

        Point point2 = new Point();
        point2.setx(1);
        point2.sety(2);
        point.calculateDistance(point2);

        Point point3 = point.clone();
        System.out.println(point3.gety());

        // point.calculateDistance();

        // point.move(point2);

        // point.calculateDistance();

        System.out.println(point.gety());

        boolean equals = point.equals(point3);

        System.out.println("equals: " + equals);

        String stringPoint = point.toString();
        System.out.println(stringPoint);

        int hashCode = point.hashCode();
        int hashCode2 = point3.hashCode();
        System.out.println("hashCode: " + (hashCode == hashCode2));

    }
}
