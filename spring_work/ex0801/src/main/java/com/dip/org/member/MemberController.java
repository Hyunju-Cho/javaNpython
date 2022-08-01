package com.dip.org.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller //url 주소 매핑
public class MemberController {

	@Autowired
	MemberService memberSerivce;
	
	@GetMapping("/memberinsert")
	@ResponseBody //문자가 나오게 됨
	public String memberinsert() {
		memberSerivce.newMember(new MemberDto("홍길동","aa@naver.com","1234"));
		return "inserted.";
	}
	
	@GetMapping("/memberselect")
	@ResponseBody
	public String memberselect() {
		memberSerivce.printMember();
		return "select";
	}
	
	
}
