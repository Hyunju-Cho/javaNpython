package aa.bb;
interface AA{
    int AAA=345;
    void doA();
}
class AAA implements AA{
    //매개변수로 인터페이스, lambda 함수를 보낼 수 있음

    @Override
    public void doA() {
        System.out.println("AAA 클래스 안에 doA메서드");
    }
}
/*
1. class를 만들어서 상속받아 재정의 하는방법
2. new AAA() 인터페이스 생성과 동시에 메서드 재정의 하는방법
 */
public class Ex01 {
    public static void main(String[] args) {
        System.out.println(AA.AAA);
        //첫번째 방법
        AAA a1= new AAA();// java 1.4
        a1.doA();

        //두번째 방법
        AA a2 = new AA() {
            @Override
            public void doA() {
                System.out.println("AA 인터페이스안에 doA메서드");
            }
        };
        a2.doA();//java 1.6

        AA a3=()->{
            System.out.println("a3람다 안에 doA메서드");
        };
        a3.doA();
    }
}
