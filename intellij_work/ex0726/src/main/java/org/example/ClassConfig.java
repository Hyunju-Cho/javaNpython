package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//환경설정
@Configuration
public class ClassConfig {

    //객체 생성(스프링 컨테이너 안에 넣음)
    @Bean
    public MemberDao memberDao(){
        return new MemberDao();
    }

    //생성자에 의한 DI방식
//    @Bean
//    public MemberService memberService(){
//        return new MemberService(memberDao());
//    }

    //setter에 의한 DI 방식
    @Bean
    public MemberService memberService(){
        MemberService ms = new MemberService();
        ms.setMemberDao(memberDao());
        return ms;
    }
}
