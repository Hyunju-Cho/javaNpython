package ex0627;

public class quiz {

	public static void main(String[] args) {

		// 문제 1
		int num = 120;

		if (num > 0 && (num % 2) == 0) {
			System.out.println("양수이면서 짝수");
		}

		// 문제 2

		int num1 = 50, num2 = 100;
		int big, diff;

		if (num1 > num2) {
			big = num1; 
			System.out.println("큰 수 : " + big);
			diff = num1 - num2;
			System.out.println("절댓값 : " + diff);
		} else {
			big = num2;
			System.out.println("큰 수 : " + big);
			diff = num2 - num1;
			System.out.println("절댓값 : " + diff);
		}

		// 문제 3

		int n = 3;

		switch (n) {
		case 1:
			System.out.println("Simple Java");
			break;
		case 2:
			System.out.println("Funny Java");
			break;
		case 3:
			System.out.println("Fantastic Java");
			break;
		default:
			System.out.println("The best programming language");
			break;
		}
		System.out.println("Do you like JAVA?");

		if (n == 1)
			System.out.println("Simple Java"); 
		else if (n == 2)
			System.out.println("Funny Java");
		else if (n == 3)
			System.out.println("Fantastic Java");
		else
			System.out.println("The best programming language");

		System.out.println("Do you like JAVA?");

		// 문제 4
		// 범위를 알고 싶을 때 나눗셈의 몫을 이용하여 판단

		int n1 = 24;

		switch (n1 / 10) {
		case 0:
			System.out.println("0이상 10미만의 수");
			break;
		case 1:
			System.out.println("10이상 20미만의 수");
			break;
		case 2:
			System.out.println("20이상 30미만의 수");
			break;
		default:
			System.out.println("음수 혹은 30이상의 수");
			break;
		}
	}
}
