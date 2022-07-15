package ex0715;

interface Printable{
	int MAX_PAGE = 20;//final static int와 동일
	public void print(String doc);//public 생략해도 무관
	default void printCMYK(String doc) {//default를 선언하여 메서드 재정의 안해도 됨
		System.out.println("컬러 프린터");
		print(doc);
	}
}

class SPrint implements Printable{
	@Override
	public void print(String doc) {
		System.out.println("삼성프린터");
		System.out.println(doc);
	}
}

class LPrint implements Printable{
	@Override
	public void print(String doc) {
		System.out.println("엘지프린터");
		System.out.println(doc);
	}
}
public class Ex03 {

	public static void main(String[] args) {

		System.out.println(Printable.MAX_PAGE);//여기서 MAX_PAGE 값 변경 불가
		Printable prn = new SPrint();
		prn.print("삼성 프린터로 출력");
		prn = new LPrint();
		prn.print("엘지 프린터로 출력");
		
		prn.printCMYK("프린터 출력");
	}

}
