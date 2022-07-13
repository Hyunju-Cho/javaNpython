package ex0713;


class AA{
	AA(){
		System.out.println("AA 기본생성자");
	}
}
class BB extends AA{
	BB(){//super, 생성자 생략됨, 부모 클래스 무조건 호출하게 됨
		System.out.println("BB 기본생성자");
	}
}
public class Ex04 {

	public static void main(String[] args) {

		new BB();//기본생성자
	}

}
