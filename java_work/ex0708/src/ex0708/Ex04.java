package ex0708;

public class Ex04 {

	int num=1;
	static int n=2;
	
	public static void main(String[] args) {
		
		Ex04 a =new Ex04();
		System.out.println("num = "+a.num);
		//System.out.println("num = "+num);접근 불가
		System.out.println("num = "+n);
	}

}
