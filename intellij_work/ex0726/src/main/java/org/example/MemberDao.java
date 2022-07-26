package org.example;

import java.util.HashMap;

//멤버 테이블 DB 접근 객체
public class MemberDao {

    public static HashMap<String,MemberDto> data=new HashMap<>();

    public void selectAll() {
        //System.out.println(data);
        System.out.println("[data 출력 시작]");
        if(data.size()==0)
            System.out.println("data 내용 없음");
        data.values().forEach(memberDto -> System.out.println(memberDto));
        System.out.println();
    }

    public void insert(MemberDto dto) {
        data.put(dto.getEmail(),dto);
    }
}
