package ex0706;

class Circle{
	
	private int rad;//다른 클래스 접근x
	final double PI=3.14;
	
	public int getRad() {
		return rad;
	}
	public void setRad(int rad) {
		if (rad<0) {
			System.out.println("반지름은 음수가 없습니다.");
			return;
		}
		this.rad = rad;
	}
	public double getPI() {
		return PI;
	}
	public void printArea() {
		System.out.println("넓이는 = "+PI*rad*rad);
	}
	
}

public class Ex03 {

	public static void main(String[] args) {
		
		Circle c1=new Circle();
		c1.setRad(10);
		//c1.rad=1; private로 선언해서 변수 rad가 은닉됨
		
		
	}

}
