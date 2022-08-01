package com.dip.org.member;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component //@Repository와 동일
public class MemberDao {

	private Map<String,MemberDto> datas=new HashMap();

	public void insert(MemberDto memberDto) {
		datas.put(memberDto.getEmail(), memberDto);
	}

	public Collection<MemberDto> selectall(){
		return datas.values();
	}
}
