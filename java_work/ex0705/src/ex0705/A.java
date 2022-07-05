package ex0705;

public class A {
	
	//alt+shift+s->o 생성자 자동으로 만들기
//	public A(int a) {
//		super();
//		this.a = a;
//	}
	public int a=10;
	public void doA() {
		System.out.println("doA a = "+a);
	}
	public int doB() {
		System.out.println("doB a = "+a);
		return 10;
	}
	public double doC(double c) {
		System.out.println("doC");
		return c*c;
	}
}
