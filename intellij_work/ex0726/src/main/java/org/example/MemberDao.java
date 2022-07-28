package org.example;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;

//멤버 테이블 DB 접근 객체
public class MemberDao {
    @Autowired
    private MemberDao memberDao;

    public static HashMap<String,MemberDto> data=new HashMap<>();

    public void selectAll() {
        //System.out.println(data);
        //System.out.println(this);
        System.out.println("[data 출력 시작]");
        if(data.size()==0)
            System.out.println("data 내용 없음");
        data.values().forEach(memberDto -> System.out.println(memberDto));
        System.out.println();
    }

    public void insert(MemberDto dto) {
        //System.out.println(this);
        data.put(dto.getEmail(),dto);
    }

    public String getSelectByEmail(String email) {
        //System.out.println(this);
        MemberDto dto=data.get(email);
        if(dto!=null)
            return "exist";
        else
            return "not exist";

    }

    public void update(String email, String oldpwd, String newpwd) {
        MemberDto dto= data.get(email);

        if(dto==null){
            System.out.println("이메일을 다시 입력하세요");
        }
        else{
            String password= dto.getPwd();
            if(!password.equals(oldpwd))
                System.out.println("비밀번호가 틀렸습니다.");
            else{
                dto.setPwd(newpwd);
                System.out.println("변경되었습니다.");
            }
        }
    }
}
