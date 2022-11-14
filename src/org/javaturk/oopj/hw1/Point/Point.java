package Point;


public class Point implements Cloneable {
	double xCoordinate;
	double yCoordinate;

	double xCenter = 0;
	double yCenter = 0;

	public Point(double xCoordinate, double yCoordinate) {
		this.xCoordinate = xCoordinate;
		this.yCoordinate = yCoordinate;
	}

	@Override
	public boolean equals(Object o) {
		Point p1 = (Point) o;
		boolean Isequals = false;
		if (p1.xCoordinate == this.xCoordinate) {
			Isequals = true;
		}
		
		return Isequals;
	}

	@Override
	public int hashCode() {
		return (int) xCoordinate + (int) yCoordinate;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		return super.clone();
	}
	
	

	@Override
	public String toString() {
		return "Point [xCoordinate=" + xCoordinate + ", yCoordinate=" + yCoordinate + ", xCenter=" + xCenter
				+ ", yCenter=" + yCenter + ", hashCode()=" + hashCode() + ", distanceToTheCenter()="
				+ distanceToTheCenter() + ", getxCoordinate()=" + getxCoordinate() + ", getyCoordinate()="
				+ getyCoordinate() + "]";
	}

	public double distanceToTheCenter() {
		return Math.sqrt(Math.pow(xCoordinate, 2) + Math.pow(yCoordinate, 2));
	}

	public double getxCoordinate() {
		return xCoordinate;
	}

	public void setxCoordinate(double xCoordinate) {
		this.xCoordinate = xCoordinate;
	}

	public double getyCoordinate() {
		return yCoordinate;
	}

	public void setyCoordinate(double yCoordinate) {
		this.yCoordinate = yCoordinate;
	}

	public double pointDistanceComparison(Point point) {
		
		return Math.sqrt(Math.pow((xCoordinate - point.xCoordinate),2) + Math.pow((yCoordinate - point.yCoordinate),2));
	}

	public Point move(double x, double y , Point point) {
		point.setxCoordinate(x+point.xCoordinate);
		point.setyCoordinate(y+point.yCoordinate);
		return point;
	}

}
