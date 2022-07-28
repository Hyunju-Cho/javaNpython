package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        AnnotationConfigApplicationContext acac=new AnnotationConfigApplicationContext(AppCtx.class);
        MemberService ms = acac.getBean(MemberService.class);

        //Main->MemberService->MemberDao
        ms.regist();
        ms.getall();

        //Main->ChangePwdService->MemberDao
        ChangePwdService cs = acac.getBean(ChangePwdService.class);
        cs.chpwd();

        acac.close();
    }
}