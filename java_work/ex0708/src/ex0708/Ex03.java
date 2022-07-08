package ex0708;

public class Ex03 {

	public static void doA() {
		System.out.println("doA 메서드");
	}
	public void doB() {
		System.out.println("doB 메서드");
	}
	public static void main(String[] args) {

		Ex03.doA();
		//Ex03.doB();static으로 선언되지 않은 메서드 바로 호출불가
		Ex03 ex03=new Ex03();
		ex03.doB();//객체 생성하여 heap 메모리 영역에 할당해야만 호출가능
	}

}
