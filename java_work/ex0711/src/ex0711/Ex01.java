package ex0711;

public class Ex01 {
	
	//메서드 오버로딩
	Ex01(){
		AA aa = new AA();
		aa.doA();
		aa.doA(20);
		aa.doA(10, 20);
	}

	public static void main(String[] args) {

		new Ex01();
	}

}
