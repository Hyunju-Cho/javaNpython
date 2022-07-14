package ex0714;

class A {
	public void doA() {
		System.out.println("doA A");
	}

	@Override
	public String toString() {
		return "A []";
	}
}

class B extends A {

	@Override
	public String toString() {
		return "B []";
	}
	
	public void doA() {
		System.out.println("doA B");
	}
}

class C extends B {

	@Override
	public String toString() {
		return "C []";
	}
	
	public void doA() {
		super.doA();//부모 클래스 참조하여 메서드 호출하게 됨
		System.out.println("doA C");
	}
}

public class Ex01 {
	/*
	 * 1. 부모클래스는 자식클래스를 참조함
	 * 2. 오버라이딩 된 메서드를 호출함
	 */

	public static void main(String[] args) {

		A a1 = new C();
		A a2 = new B();
		A a3 = new A();
		
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		
		a1.doA();
		a2.doA();
		a3.doA();
	}

}
