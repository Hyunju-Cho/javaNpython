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

    public static void newCommand(MemberDto dto) {
        MemberService memberService = acac.getBean(MemberService.class);
        try {
            memberService.regist(dto);
        } catch (Exception e) {
            System.out.println("email 중복됨....넣을 수 없음...");
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        acac=new AnnotationConfigApplicationContext(ClassConfig.class);

        try {
            while (true) {
                System.out.println("1. list or 2. new 3. exit");
                String cmd = br.readLine();
                if(cmd.equalsIgnoreCase("list")){
                    //리스트 출력
                    listCommand();
                }
                else if(cmd.startsWith("new")){
                    //리스트 입력
                    try{
                        String email=cmd.split(" ")[1];
                        String name=cmd.split(" ")[2];
                        String pwd=cmd.split(" ")[3];
                        MemberDto md=new MemberDto(name,email,pwd);
                        newCommand(md);
                    }catch (Exception e){
                        System.out.println("new 이메일 이름 비밀번호 \n이렇게 입력하세요");
                    }

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
    }
}