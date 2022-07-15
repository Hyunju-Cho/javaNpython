package ex0715;

public class Ex01 {

	public static void main(String[] args) {
		
		Friend[] uray = new Friend[10];
		
		uray[0] = new UniFriend("홍길동", "컴공","010-111-1111");		
		uray[1] = new UniFriend("박길동", "컴공","010-111-1111");
				
		uray[2] = new CompFriend("이길동","구매팀","010-222-2222");		
		uray[3] = new CompFriend("김길동","구매팀","010-222-2222");
		
		for(int i=0;i<4;i++){
			uray[i].showInfo();
		}
		
	}

}
