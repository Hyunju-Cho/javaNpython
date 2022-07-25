package org.example.member;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config11 {

    @Bean
    public MemberDAO memberDAO(){
        return new MemberDAO();
    }

    @Bean
    public MemberREGservice memberREGservice(){
        return new MemberREGservice();
    }
}
