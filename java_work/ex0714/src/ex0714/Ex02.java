package ex0714;

class Super{
	
}
class Sub extends Super{
	
}
public class Ex02 {

	public static void main(String[] args) {

		Super super1=new Sub();
		Sub sub1=(Sub)super1;//형변환을 하면 부모클래스를 강제로 자식클래스에 넣을 수 있음
		
	}

}
