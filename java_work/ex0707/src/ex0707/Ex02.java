package ex0707;

public class Ex02 {

	Ex02(){
		
		zoo.Dog dog=new zoo.Dog();
		zoo.Cat cat=new zoo.Cat();
		zoo.Duck duck=new zoo.Duck();
		sound(dog, cat, duck);
	}
	
	public void sound(zoo.Dog dog, zoo.Cat cat, zoo.Duck duck) {
		dog.sound();
		cat.sound();
		duck.sound();
	}
	public static void main(String[] args) {

		new Ex02();//static->heap
		
	}

}
