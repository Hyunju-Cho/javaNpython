package ex0713;

class A{
	int a=10;
	public void doA() {
		System.out.println("doA");
	}
}
class B extends A{
	public void doB() {
		doA();//super가 생략됨
		System.out.println("doB a = "+a);
		
	}
}
public class Ex01 {

	public static void main(String[] args) {

		B b = new B();
		b.doB();
		
	}

}
