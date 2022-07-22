package org.example;

class MySingle {
    public static MySingle ms;

    public static MySingle getInstance() {
        if (ms == null) {
            ms = new MySingle();
            return ms;
        } else {
            return ms;
        }
    }

    public void doA() {
        System.out.println("doA");
    }
}
public class Ex05 {
    Ex05(){
        MySingle ms1 = new MySingle();
        ms1.doA();
        MySingle ms2 = new MySingle();
        ms2.doA();

        MySingle ms3= MySingle.getInstance();
        ms3.doA();
        MySingle ms4 = MySingle.getInstance();
        ms4.doA();

        //주소값 다름
        System.out.println(ms1);
        System.out.println(ms2);
        //주소값 같음(Spring 툴 사용 안 할 경우 이렇게 함)
        System.out.println(ms3);
        System.out.println(ms4);
    }
    public static void main(String[] args) {
        new Ex05();
    }
}
