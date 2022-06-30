package ex0630;

public class Quiz {

	public static void main(String[] args) {
		
		ex01();
		ex02();
		ex03();
		ex04();
		ex05();
		ex06();
		ex07();
		ex08();
		ex09();
		
	}
	
	public static void ex01() {
		//문제 1
		int num=1, sum=0;
		
		while(num<=99) {
			sum+=num;
			num++;
		}
		System.out.println("sum = "+sum);
	}
	public static void ex02() {
		//문제 2
		int num=1;
		while(num<=100) {
			System.out.println(num);
			num++;
		}
		System.out.println();
		--num;
		do {
			System.out.println(num);
			num--;
		}while(num>=1);
	}
	public static void ex03() {
		//문제 3
		int num=1,sum=0;
		while(num<=1000) {
			if(num%2==0 && num%7==0) {
				System.out.println(num);
				sum+=num;
			}
			num++;
		}
		System.out.println("최종 합="+sum);
	}
	public static void ex04() {
		//문제 4
		int mul=1;
		
		for(int i=1;i<=10;i++) {
			mul*=i;
		}
		System.out.println(mul);
	}
	public static void ex05() {
		//문제 5
		for(int i=1;i<=9;i++)
			System.out.println("5x"+i+"="+5*i);
	}
	public static void ex06() {
		//문제 6
		int count=0;
		
		for(int num=1;num<100;num++) {
			if(num%5!=0 || num%7!=0)
				continue;
			count++;
			System.out.println(num);
		}
		System.out.println("count: "+count);
	}
	public static void ex07() {
		//문제 7
		int sum=0;
		
		for(int num=1;;num++) {
			if(num%2!=0)
				sum+=num;
			if(sum>1000) {
				System.out.println("1000이 넘어선 값: "+sum);
				System.out.println("마지막으로 더한 값: "+num);
				break;
			}
		}
	}
	public static void ex08() {
		//문제 8
		for(int i=2;i<=8;i+=2) {
			for(int j=1;j<=i;j++) {
				System.out.println(i+"x"+j+"="+i*j);
			}
			System.out.println();
		}
	}
	public static void ex09() {
		//문제 9
		int a,b;
		for(a=0;a<=9;a++) {
			for(b=0;b<=9;b++) {
				if(a+b==9)
					System.out.println("A = "+a+" B = "+b);
			}
		}
	}
	

}
