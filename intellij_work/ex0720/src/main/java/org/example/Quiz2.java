package org.example;
class Business implements Cloneable{
    private String company;
    private String work;
    public Business(String company, String work){
        this.company=company;
        this.work=work;
    }
    public void showBusinessInfo(){
        System.out.println("회사 : " +company);
        System.out.println("업무 : "+work);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class PersonalInfo implements Cloneable{
    String name;
    private int age;
    private Business bz;
    public PersonalInfo(String name, int age, String company, String work){
        this.name=name;
        this.age=age;
        bz=new Business(company,work);
    }
    public void showPersonalInfo(){
        System.out.println("이름: "+name);
        System.out.println("나이: "+age);
        bz.showBusinessInfo();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
public class Quiz2 {
    public static void main(String[] args) throws CloneNotSupportedException {
        PersonalInfo personalInfo = new PersonalInfo("홍길동",30,"dip","개발");
        PersonalInfo person = (PersonalInfo) personalInfo.clone();

        personalInfo.name="김길동";
        personalInfo.showPersonalInfo();
        person.showPersonalInfo();
    }
}
