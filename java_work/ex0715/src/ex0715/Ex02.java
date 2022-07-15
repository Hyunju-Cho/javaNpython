package ex0715;

interface A{
	public void doA(); //재정의 해서 사용해야 함, 오버라이드 해서 사용해야 함
	
}

interface B{
	public void doB();
}
public class Ex02 implements A,B {//인터페이스는 다중상속이 가능함

	public static void main(String[] args) {

		
	}

	@Override
	public void doA() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doB() {
		// TODO Auto-generated method stub
		
	}

}
