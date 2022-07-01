package ex0701;

public class Quiz {

	public static void main(String[] args) {

		division(10,5);//문제 1
		abs(2,5);//문제 2
		
		//문제 3
		System.out.println("원의 넓이 = "+circle1(3));
		System.out.println("원의 둘레 = "+circle2(3));
		
		//문제 4
		for(int i=1;i<=100;i++)
		{
			if(pn(i)==true)
				System.out.println(i);
		}
		
		System.out.println(pow(3));//문제 5
		
		binary(10);//문제 6
		
	}
	
	public static void division(int num1, int num2) {
		//문제 1
		System.out.println("덧셈 = "+(num1+num2));
		System.out.println("뺄셈 = "+(num1-num2));
		System.out.println("곱셈 = "+(num1*num2));
		System.out.println("몫 = "+(num1/num2)+" 나머지 = "+(num1%num2));
	}
	
	public static void abs(int num1, int num2) {
		//문제 2
		if(num1<num2) {
			System.out.println(num2-num1);
			return;
		}
		System.out.println(num1-num2);
	}
	
	//문제 3
	public static double circle1(int r) {
		return Math.PI*r*r; 
	}
	public static double circle2(int r) {
		return Math.PI*r*2; 
	}
	
	public static boolean pn(int num) {
		//문제 4
		int count=0;
		for(int i=1;i<=num;i++) {
			if(num%i==0)
				count++;
		}
		if(count>2 || num==1)
			return false;
		else
			return true;
	}
	 
	public static int pow(int n) {
		//문제 5
		if(n==0)
			return 1;
		else
			return 2*pow(n-1);
	}
	
	public static void binary(int num) {
		//문제 6
		
		if(num>1)
			binary(num/2);
		System.out.print(num%2);
	}

}
