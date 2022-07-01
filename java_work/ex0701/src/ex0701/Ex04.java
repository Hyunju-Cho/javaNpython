package ex0701;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {

		Scanner scan= new Scanner(System.in);
		System.out.println("첫 번째 수 입력");
		int num1=scan.nextInt();
		
		System.out.println("두 번째 수 입력");
		int num2=scan.nextInt();
		
		division(num1,num2);
			
		scan.close();
		
	}
	
	public static void division(int num1, int num2) {
		
		if(num2==0) {
			System.out.println("0으로 나눌 수 없습니다.");
			return;
		}
		System.out.println("num1/num2="+num1/num2);
	}

}
