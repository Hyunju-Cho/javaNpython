package org.example.member;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static Map<String,MemberDTO> memberlist=new HashMap<>();

    private static AnnotationConfigApplicationContext ctx = null;

    public static void main(String[] args) throws Exception {
        ctx = new AnnotationConfigApplicationContext(Config11.class);

        MemberDTO md = new MemberDTO("aa@naver.com","홍길동","1234");
        memberlist.put("홍길동",md);

        MemberDTO md1 = new MemberDTO("bb@naver.com","이길동","12345");
        memberlist.put("이길동",md1);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true){
            System.out.println("1. 회원가입 new aaa@naver.com 이름 1234");
            System.out.println("2. 회원리스트 list");
            System.out.println("3. 회원삭제 del 이름");
            System.out.println("4. 종료 exit");

            String command = br.readLine();
            if(command.equalsIgnoreCase("exit")){
                System.out.println("프로그램 종료합니다.");
                break;
            }
            else if(command.startsWith("new ")){
                //hashmap 안에 회원 넣음
                String name = command.split(" ")[1];//split을 사용하여 0번 뒤에 입력값이 1번
                MemberDTO md2 = new MemberDTO("bb@naver.com",name,"12345");
                memberlist.put(name,md2);
                System.out.println("등록되었습니다.");
            }
            else if(command.equalsIgnoreCase("list")){
                System.out.println(ctx);
                System.out.println(ctx.getDefaultListableBeanFactory());
                MemberDAO dao = ctx.getBean(MemberDAO.class);
                Collection<MemberDTO> collection = dao.selectAll();
                collection.forEach(m-> System.out.println(m));

            }
        }
//        System.out.println(memberlist);
    }
}
