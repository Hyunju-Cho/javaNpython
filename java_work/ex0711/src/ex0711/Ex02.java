package ex0711;

public class Ex02 {
	
	//생성자 오버로딩
	public Ex02() {
		System.out.println("기본생성자");
	}
	public Ex02(int a) {
		System.out.println("파라미터 1개 a = "+a);
	}
	public Ex02(int a, int b) {
		System.out.println("파라미터 2개 a = "+a);
		System.out.println("파라미터 2개 b = "+b);
	}

	public static void main(String[] args) {

		new Ex02();
		new Ex02(10);
		new Ex02(10,20);
	}

}
