package com.example.spring;

public class MemberPrinter { //Member 프린터 

	public void print(Member member) { //자바 속 Member 객체 출력하는 메소드 
		System.out.printf(
				
				"회원 정보: 아이디=%d, 이메일=%s, 이름=%s, 등록일=%tF\n", 
				member.getId(), member.getEmail(),
				member.getName(), member.getRegisterDateTime());
	}

}
