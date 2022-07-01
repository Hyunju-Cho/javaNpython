package ex0701;

public class Ex03 {

	public static void main(String[] args) {

		doA();
		System.out.println("result="+doB());
		System.out.println("result="+doC());
		
		String a=doD();
		System.out.println("result="+a);
	}
	
	public static void doA() {
		System.out.println("doA");
		return; //생략 가능
	}
	
	public static int doB() {
		System.out.println("doB");
		return 10;
	}
	
	public static double doC() {
		return 10.5;
	}
	
	public static String doD() {
		return "doD";
	}

}
