package ex0708;

class A{
	static int a=0;
	int b=10;
	A(){
		a++;
		System.out.println("a = "+a);
	}
}

public class Ex01 {

	public static void main(String[] args) {

		A a1=new A();
		A a2=new A();
		A a3=new A();
		
		//System.out.println(A.b); static으로 선언되지 않았기 때문에 참조불가
		System.out.println(a1.b);//heap 영역에 있기 때문에
		
	}

}
