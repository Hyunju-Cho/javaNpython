package ex0706;

/* 클래스명이 같아 오류가 남*/
//import aa.AAA;
//import bb.AAA;

public class Ex02 {

	public static void main(String[] args) {

		aa.AAA a1=new aa.AAA();//풀 패키지명을 적음
		bb.AAA a2=new bb.AAA();
		cc.AAA a3=new cc.AAA();
		
	}

}
