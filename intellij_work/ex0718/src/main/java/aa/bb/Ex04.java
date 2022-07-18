package aa.bb;

public class Ex04 {

    public static void main(String[] args) {
        try {
            doA();
        } catch (Exception e) {
            System.out.println("내가 호출한 메서드호출 문제");
        }
    }
    public static void doA() throws Exception{
        System.out.println("doA메서드에서 예외발생할 수도 있음");
    }
}
