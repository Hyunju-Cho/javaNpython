package ex0711;

public class Quiz {

	public static void main(String[] args) {

		//ex01
		System.out.println("990925"+" "+"1012999");
		
		//ex02
		StringBuilder str1=new StringBuilder("990925-1012999");
		str1.delete(6, 7);
		//System.out.println(str1.toString());
		str1.replace(6, 6, " ");
		System.out.println(str1.toString());
	}

}
