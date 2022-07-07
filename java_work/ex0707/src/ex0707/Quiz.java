package ex0707;

public class Quiz {

	public static void main(String[] args) {

		Circle c=new Circle(2,2,4);
		c.showCircleInfo();
	}

}
class Point {
	
	int xPos, yPos;
	public Point(int x, int y) {
		yPos=y;
		xPos=x;
	}
	public void showPointInfo() {
		System.out.println("["+xPos+", "+yPos+"]");
	}

}
class Circle{
	
	int x;
	int y;
	int r;
	
	public Circle(int x, int y, int r) {
		super();
		this.x = x;
		this.y = y;
		this.r=r;
	}
		
	public void showCircleInfo() {
		Point pt = new Point(x, y);
		pt.showPointInfo();
		System.out.println("반지름 = "+r);
	}
}
