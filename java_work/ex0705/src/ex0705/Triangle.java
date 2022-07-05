package ex0705;

public class Triangle {

	int under;
	int height;
	
	public Triangle(int under, int height) {
		super();
		this.under = under;
		this.height = height;
		System.out.println("밑변 = "+under+" 높이 = "+height);
	}
//	public Triangle(int uline, int heightline) {
//		under=uline;
//		height=heightline;
//		System.out.println("밑변 = "+under+" 높이 = "+height);
//	
//	}
//	public void change(int uline, int heightline) {
//		under=uline;
//		height=heightline;
//		System.out.println("변경된 밑변 = "+uline + " 변경된 높이 = "+heightline);
//	}
	
	public void change(int under, int height) {
		this.under=under;
		this.height=height;
		System.out.println("변경된 밑변 = "+under + " 변경된 높이 = "+height);
	}
	
	public double area() {
		return under*height/2;
	}

}
