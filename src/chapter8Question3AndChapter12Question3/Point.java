package chapter8Question3AndChapter12Question3;

public class Point {
    private int x;

    public int getx() {
        return x;
    }

    public void setx(int pX) {
        x = pX;
    }

    private int y;

    public int gety() {
        return y;
    }

    public void sety(int pY) {
        y = pY;
    }

    public void calculateDistance() {
        double sum = Math.pow(x, 2) + Math.pow(y, 2);
        System.out.println(Math.sqrt(sum));
    }

    public void calculateDistance(Point point) {
        double sum = Math.pow((x - point.x), 2) + Math.pow((y - point.y), 2);
        System.out.println(Math.sqrt(sum));
    }

    public Point clone() {
        Point newPoint = new Point();
        newPoint.x = x;
        newPoint.y = y;
        return newPoint;
    }

    public void move(Point point) {
        x += point.x;
        y += point.y;
    }

    // Chapter 12 Question 3 Answer

    @Override
    public boolean equals(Object obj) {
        Point point = (Point) obj;
        return x == point.x && y == point.y;
    }

    @Override
    public String toString() {
        return "This point x: " + x + "\n" + "This point y: " + y;
    }

    @Override
    public int hashCode() {
        return x + y;
    }
}
