package org.example;

class A{
    public void doA(){
        System.out.println("doA");
    }
    public static void doB(){
        System.out.println("doB");
    }
}
public class Ex01 {
    public static void main(String[] args) {
        Integer integer = Integer.valueOf(3);
        Integer integer1 = Integer.valueOf(10);
        
        int maxvalue=Integer.max(integer,integer1);
        System.out.println(maxvalue);
        int minvalue=Integer.min(integer,integer1);
        System.out.println(minvalue);
        int sumvalue=Integer.sum(integer,integer1);
        System.out.println(sumvalue);

        System.out.println("2진수"+Integer.toBinaryString(integer));
        System.out.println("8진수"+Integer.toOctalString(integer1));
        System.out.println("16진수"+Integer.toHexString(integer1));

        //A.doA() 오류
        A a = new A();
        a.doA();

        A.doB();
        //Integer static method 알 수 있음
    }
}
