package ex0706;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Car c1=new Car();
		Scanner scanner=new Scanner(System.in);
		
		while(true) {
			System.out.println("1. 속도입력");
			System.out.println("2. 속도출력");
			
			int select=scanner.nextInt();
			if(select==1) {
				System.out.println("속도 입력?");
				int speed=scanner.nextInt();
				c1.setSpeed(speed);
			}else {
				int speed=c1.getSpeed();
				System.out.println("현재 속도는"+speed);
			}
		}
		
	}
}
