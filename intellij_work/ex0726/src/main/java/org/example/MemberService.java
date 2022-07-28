package org.example;

import org.springframework.beans.factory.annotation.Autowired;

public class MemberService {

    @Autowired
    private MemberDao memberDao;
    @Autowired
    private MemberPrinter memberPrinter;

//    public MemberService(){}
//    public MemberService(MemberDao memberDao) {
//        this.memberDao = memberDao;
//    }
//    public void setMemberPrinter(MemberPrinter memberPrinter) {
//        this.memberPrinter = memberPrinter;
//    }
//    public void setMemberDao(MemberDao memberDao) {
//        this.memberDao = memberDao;
//    }

    public void list() {
        memberDao.selectAll();
    }

    /*
    * datamap 안에 같은 이메일 있다면 저장할 수 없음
    * 이외의 경우에는 저장해야함
    */
    public void regist(MemberDto dto) throws Exception {
        //System.out.println(dto);
        String result=memberDao.getSelectByEmail(dto.getEmail());
        if(result.equals("exist"))
            throw new Exception();
        else
            memberDao.insert(dto);
    }

    public void update(String email, String oldpwd, String newpwd) {
        memberDao.update(email,oldpwd,newpwd);
    }
}
