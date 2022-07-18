package aa.bb;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex02 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        try{
            System.out.println("a ?");
            int a= scanner.nextInt();
            System.out.println("b ?");
            int b= scanner.nextInt();

            System.out.println("a/b="+a/b);
            System.out.println("정상실행");
        }catch (ArithmeticException ae){
            System.out.println("0으로 나눌 수 없음"+ae);
            ae.printStackTrace();
        }catch (InputMismatchException ime){
            System.out.println("int형만"+ime);
        }catch (Exception e){
            System.out.println("모든 예외 처리");
        }

        System.out.println("프로그램 종료");
    }
}
