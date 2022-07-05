package ex0705;

public class Ex02 {

	public static void main(String[] args) {

		A a1= new A();
		
		A a2=a1;//새로 A 클래스를 할당받는 게 아니라 a1이랑 같음
		
		a1.a+=10;
		System.out.println("a2.a = "+a2.a);
		
		//위 참조변수와 다름
		int a=10,b=a;
		
		a=20;
		System.out.println("a = "+a);
		System.out.println("b = "+b);
	}

}
