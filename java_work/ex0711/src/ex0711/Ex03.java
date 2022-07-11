package ex0711;

public class Ex03 {
	Ex03(){
		BB b1=new BB();
		
		System.out.println(b1);
		
		System.out.println("abc".equals(new String("abc")));//문자열 비교
		System.out.println("abc"==(new String("abc")));//다른 인스턴스 참조(다른 메모리 주소 참조함)
		
		String a= 12+"";
		String b= String.valueOf(12);
	}

	public static void main(String[] args) {

		new Ex03();
	}

}
