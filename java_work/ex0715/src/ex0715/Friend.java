package ex0715;

public class Friend {

	private String name;
	private String phone;
	
	public Friend(String name, String phone) {
		super();//사실 상위 클래스에 object 클래스가 있어서(생략됨) super가 자동생성됨 
		this.name = name;
		this.phone = phone;
	}
	
	public void showInfo() {
		System.out.println("이름 = "+name);
		System.out.println("전화 = "+phone);
	}

	@Override
	public String toString() {
		return "Friend [name=" + name + ", phone=" + phone + "]";
	}
	
}
