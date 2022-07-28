package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppCtx {
    //스프링 객체 담는 통
    @Bean
    public MemberService memberService(){
        return new MemberService();
    }

    @Bean
    public MemberDao memberDao(){
        return new MemberDao();
    }

    /*
    @Bean
    @Qualifier("memberdao1") //선언해야함(Service 객체에서 @Autowired 밑에도)
    public MemberDao memberDao1(){
        return new MemberDao();
    }
     */

    @Bean
    public ChangePwdService changePwdService(){
        return new ChangePwdService();
    }
}
