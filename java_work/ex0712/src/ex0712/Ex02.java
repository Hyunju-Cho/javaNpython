package ex0712;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {

		String a = " 3 5 7";
		Scanner scan = new Scanner(a);
		
		//공백이나 개행을 기준으로 받음
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();
		int n3 = scan.nextInt();
		
		System.out.println(n1+n2+n3);
	}

}
