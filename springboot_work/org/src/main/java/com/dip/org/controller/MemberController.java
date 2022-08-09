package com.dip.org.controller;

import com.dip.org.components.AA;
import com.dip.org.dto.MemberDto;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/*
@RestController: 문자열 반환
@Controller: html 파일 반환 -> @ResponseBody 적으면 문자열 반환
 */

@RestController
public class MemberController {

    //127.0.0.1:8080/rest/member
    @GetMapping("member")
    public String member(){
        return "member";
    }
}
