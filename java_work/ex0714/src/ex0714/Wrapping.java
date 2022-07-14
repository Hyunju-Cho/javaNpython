package ex0714;

class Box{
	public void basicWrap() {
		System.out.println("Simple Wrapping");
	}
	public void Wrap() {
		basicWrap();
	}
}

class PaperBox extends Box{
	public void paperWrap() {
		System.out.println("Paper Wrapping");
	}
	public void Wrap() {
		paperWrap();
	}
}

class GoldPaperBox extends PaperBox{
	public void goldWrap() {
		System.out.println("Gold Wrapping");
	}
	public void Wrap() {
		goldWrap();
	}
}

public class Wrapping {

	public static void main(String[] args) {

		Box box1 = new Box();
		PaperBox box2 = new PaperBox();
		GoldPaperBox box3 = new GoldPaperBox();
		
		wrapBox(box1);
		wrapBox(box2);
		wrapBox(box3);
	}
	
	/*
	 * instanceof 연산자를 사용하지 않고 만듦
	 * 하위클래스들이 오버라이딩함
	 */
	public static void wrapBox(Box box) {
		box.Wrap();
	}

}
