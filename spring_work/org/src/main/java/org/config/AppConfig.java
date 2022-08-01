package org.config;

import org.member.MemberDao;
import org.member.MemberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan(basePackages= {"org.member"})
public class AppConfig {

	@Bean
	public MemberDao memberdao() {
		return new MemberDao();
	}
	
	
//	@Bean
//	public MemberService memberservice() {
//		return new MemberService();
//	}
}
