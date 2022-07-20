package org.example;

class Point1{
    private int xPos;
    private int yPos;

    public Point1(int xPos, int yPos) {
        this.xPos = xPos;
        this.yPos = yPos;
    }

    @Override
    public boolean equals(Object obj) {
        Point1 point=(Point1) obj;
        if(this.xPos==point.xPos && this.yPos==point.yPos) {
            return true;
        }
        else {
            return false;
        }
    }
}

class Rectangle{
    private Point1 upperLeft;//좌측 상단 좌표
    private Point1 lowerRight;//우측 하단 좌표
    public Rectangle(int x1, int y1, int x2, int y2){
        upperLeft=new Point1(x1,y1);
        lowerRight=new Point1(x2,y2);
    }

    @Override
    public boolean equals(Object obj) {
        Rectangle rectangle = (Rectangle) obj;
        if(this.upperLeft.equals(rectangle.upperLeft) && this.lowerRight.equals(rectangle.lowerRight))
            return true;
        else
            return false;
//        if(this.upperLeft==rectangle.upperLeft && this.lowerRight==rectangle.lowerRight)
//            return true;
//        else
//            return false;
    }
}
public class Quiz1 {
    public static void main(String[] args) {
        Point1 point1 = new Point1(3,5);
        Point1 point2 = new Point1(3,5);
        Point1 point3 = new Point1(7,5);

        Rectangle rectangle1 = new Rectangle(1,1,9,9);
        Rectangle rectangle2 = new Rectangle(1,1,9,9);
        Rectangle rectangle3 = new Rectangle(2,2,7,7);

        System.out.println(point1.equals(point2));
        System.out.println(point1.equals(point3));
        System.out.println(rectangle1.equals(rectangle2));
        System.out.println(rectangle1.equals(rectangle3));
    }
}
