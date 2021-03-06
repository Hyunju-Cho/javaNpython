package ex0714;

//Cake는 ACake 참조가능
//Cake는 BCake 참조가능
class Cake {

}

class ACake extends Cake {
	public void doA() {
		System.out.println("doA");
	}
}

class BCake extends Cake {
	public void doB() {
		System.out.println("doB");
	}
}

public class Ex03 {

	public static void main(String[] args) {

		Cake cake[] = new Cake[10];
		cake[0] = new ACake();
		cake[1] = new BCake();
		cake[2] = new ACake();

		if (cake[0] instanceof ACake) {//형변환가능 여부 확인
			//True(cake[0]에 ACake 있음)
			ACake ac = (ACake) cake[0];
			ac.doA();
		}
		if (cake[1] instanceof BCake) {
			BCake ab = (BCake) cake[1];
			ab.doB();
		}

		ACake ac3 = (ACake) cake[2];
		BCake ac4 = (BCake) cake[2];//BCake로 형변환 못 함 
	}

}
