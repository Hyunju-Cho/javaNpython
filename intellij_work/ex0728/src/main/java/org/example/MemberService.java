package org.example;

import org.springframework.beans.factory.annotation.Autowired;

public class MemberService {

    //생성자, setter에 의한 의존방식 안 써도 됨
    @Autowired
    private MemberDao memberDao;//getBean 안 써도 자동으로 들어옴

    //저장
    public void regist(){
        memberDao.insert();
    }

    //보기
    public void getall(){
        memberDao.selectall();
    }

    //삭제
    //변경
}
