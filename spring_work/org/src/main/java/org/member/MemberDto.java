package org.member;

public class MemberDto {

	private String name;
	private String email;
	private String pwd;
	
	//alt+shift+s->r(g&s), o(generator), s(tostring)

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public MemberDto() {} //기본생성자는 직접 작성
	public MemberDto(String name, String email, String pwd) {
		super();
		this.name = name;
		this.email = email;
		this.pwd = pwd;
	}
	
	@Override
	public String toString() {
		return "MemberDto [name=" + name + ", email=" + email + ", pwd=" + pwd + "]";
	}
	
	
}
