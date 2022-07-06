package ex0706;

import myclass.ZZZ;//다른 패키지에 있어서 import함

public class Ex01 {

	public static void main(String[] args) {

		AAA aaa=new AAA();
		aaa.doA();
		
		ZZZ zzz=new ZZZ();
		zzz.doA();
	}

}
