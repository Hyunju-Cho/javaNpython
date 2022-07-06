package ex0705;

public class Quiz {

	public static void main(String[] args) {

		Triangle tr1=new Triangle(3, 5);
		tr1.change(7, 10);
		System.out.println("넓이 = "+tr1.area()+"\n");
		
		Triangle tr2=new Triangle(30,50);
		System.out.println("넓이 = "+tr2.area());
	}
                                                                                                         
}
