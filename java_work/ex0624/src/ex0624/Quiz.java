package ex0624;

public class Quiz {

	public static void main(String[] args) {

		//문제1
		
		int num1=10;
		int num2=20;
		int num3=30;
		
		num1=num2=num3;
			
		System.out.println("num1 = "+num1);
		System.out.println("num2 = "+num2);
		System.out.println("num3 = "+num3);
		
		//문제2
		
		float res= ((25*5)+(36-4)-72)/5;
		System.out.println(res);
		
		//문제3
		int sum=3;
		for(int i=6;i<=12;i+=3) {
			sum+=i;
			System.out.println(sum);
		}
		
			
		//문제4
		int n1=3+6;
		int n2=3+6+9;
		int n3=3+6+9+12;
		
		System.out.println(n1>n2 && n2>n3);
		
		//문제5
		int n4=((25+5)+(36/4)-72)*5;
		int n5=((25*5)+(36-4)+71)/4;
		int n6=(128/4)*2;
		
		System.out.println(n4>n5 && n5>n6);
		
		
	}

}
