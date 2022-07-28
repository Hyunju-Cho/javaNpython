package org.example;

import org.springframework.beans.factory.annotation.Autowired;

public class ChangePwdService {

    @Autowired //생성자 만들어서 넣어도 됨 그러나 선호하진 않음
    private MemberDao memberDao;

    public void chpwd(){
        memberDao.update();
    }
}
