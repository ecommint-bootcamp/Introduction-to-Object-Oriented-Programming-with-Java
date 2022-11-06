package javaturk.oopj.ch08.hw1;

class Point {

    private Integer x;
    private Integer y;

    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public Integer getY() {
        return y;
    }

    public void setY(Integer y) {
        this.y = y;
    }

    public Double distanceToOrigin() {
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }

    public Double distanceToOtherCoordinat(Integer z, Integer t) {
        return Math.sqrt(Math.pow(x - z, 2) + Math.pow(y - t, 2));
    }

    public Point clone() {
        Point point = new Point();
        point.setX(x);
        point.setY(y);
        return point;
    }

    public void move(Integer k) {
        Point point = new Point();
        point.setX(x + k);
        Integer addtionalCoordinatX = point.getX();
        System.out.println(addtionalCoordinatX);
    }
}

