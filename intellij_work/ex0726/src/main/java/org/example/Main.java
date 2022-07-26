package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
    private static AnnotationConfigApplicationContext acac =null;
    public static void listCommand(){
        MemberService memberService=acac.getBean(MemberService.class);
        memberService.list();
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        acac=new AnnotationConfigApplicationContext(ClassConfig.class);

        try {
            while (true) {
                System.out.println("1. list or 2. new aa@naver.com 3. exit");
                String cmd = br.readLine();
                if(cmd.equalsIgnoreCase("list")){
                    //리스트 출력
                    listCommand();
                }
                else if(cmd.startsWith("new ")){
                    //리스트 입력
                }
                else if(cmd.equalsIgnoreCase("exit")){
                    System.out.println("종료합니다.");
                    break;
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        finally {
            acac.close();
        }

//        MemberDao dao = acac.getBean(MemberDao.class);
//
//        dao.selectAll();//출력값 없음
//        dao.insert(new MemberDto("홍길동","aaa@naver.com","1234"));//데이터 입력
//        dao.selectAll();//입력된 데이터 출력
//        dao.insert(new MemberDto("박길동","bbb@naver.com","1234"));
//        dao.selectAll();

    }
}