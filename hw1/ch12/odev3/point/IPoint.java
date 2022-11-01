package hw1.ch12.odev3.point;

public interface IPoint {

	double calculateDistanceToOrigin();
	double calculateDistanceToPoint(Point point);
	Point move(int x, int y, Point point);
}
