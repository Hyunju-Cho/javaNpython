package org.example;

class Person implements Cloneable{
    String name;//문자열 수정 불가, 깊은 복사의 대상에서 제외딤
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
//        Person p1 = (Person) super.clone();
//        p1.name=new String(name);
//        return p1;
        return super.clone();//이게 바람직함 (String은 한번 결정나면 변경이 불가능함)
    }
}
public class Ex03 {
    public static void main(String[] args) throws CloneNotSupportedException{
        Person p1 = new Person("홍길동",50);
        Person p2 = (Person) p1.clone();
        System.out.println(p1);
        System.out.println(p2);

        //이름과 나이가 p1에만 바뀌고 p2에는 바뀌지 않음
        p1.name="김길동";
        p1.age=100;
        System.out.println(p1);
        System.out.println(p2);
    }
}
