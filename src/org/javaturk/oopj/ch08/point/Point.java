package org.javaturk.oopj.ch08.point;


public class Point implements  Cloneable{
    private int x,y;

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

    public double calculateDistanceToOrigin(){
        return Math.sqrt(Math.pow(x,2) + Math.pow(y,2));

    }

    public double calculateDistanceToPoint(Point otherPoint){
        int x2=otherPoint.x;
        int y2=otherPoint.y;

        double distanceY = Math.abs(y2 - y);
        double distanceX  = Math.abs(x2 - x);

        return Math.sqrt(Math.pow(distanceX,2) + Math.pow(distanceY,2));

    }

    public Point clone() throws CloneNotSupportedException {
        super.clone();
        return new Point(x,y);
    }

    public void move(int movementX, int movementY){
        x+=movementX;
        y+=movementY;
    }

    public String getInfo() {
        return "Point Info: " + "x= " + x + " y= " + y ;
    }
}