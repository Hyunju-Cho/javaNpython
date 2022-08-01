package org.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component //@Service와 동일
public class MemberService {
	
	@Autowired
	private MemberDao memberDao;
	

	public void newMember(MemberDto memberDto) {

		//해당되는 email 존재? 없으면 data추가, 아니면 메시지 띄움
		
		//memberDao.getSelectByEmail(memberDto.getEmail());//이메일 조회
		
		memberDao.insert(memberDto);//member 추가

		
	}
	
	public void printMember() {
		memberDao.selectall().forEach(m->System.out.println(m));
	}
	
	
	
}
