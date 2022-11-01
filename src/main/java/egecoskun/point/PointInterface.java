package egecoskun.point;

public interface PointInterface {

    double calculateDistanceToOrigin();
    double calculateDistanceBetweenPoints(Point point);
    Point move(int x,int y,Point point);

}
