package ex0707;

public class Person {

	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	//this는 생략이 가능하지만 동일한 변수명이 있을 경우 생략 불가
	//super도 생략가능
	public Person(String name) {
		//super();
		this.name = name;
	}
	
	public Person() {}
	
	public String toString() {
		return "Person name="+name;
	}
}
