package hw1.ch8Odev4;

/**
 * @author <a href="mailto:akin@javaturk.org">Akin Kaldiroglu</a>
 *         <p>
 *         For more info please
 * @see <a href="http://www.javaturk.org">http://www.javaturk.org</a>
 * @see <a href="http://www.selsoft.com.tr">http://www.selsoft.com.tr</a>
 *      </p>
 */
public class Point {
	int x;
	int y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public Point clone() {
		Point point = new Point(x, y);
		return point;
	}

	void printInfo() {
		System.out.println("Point [x=" + x + ", y=" + y + "]");
	}

	public double calculateDistanceToPoint(Point p) {
		return Math.sqrt(Math.pow((x - p.x), 2) + Math.pow((y - p.y), 2));
	}

	public double calculateDistanceToOrigin() {
		// TODO Auto-generated method stub
		return Math.sqrt(x * x + y * y);
	}

	public Point move(int x, int y, Point point) {
		// TODO Auto-generated method stub
		point.setX(point.x + x);
		point.setY(point.y + y);
		return point;
	}
}
