package com.example.spring;

import java.time.LocalDateTime;

public class MemberRegisterService { //멤버 등록 서비스 객체 
	//멤버 DB 관리 객체 필드
	private MemberDao memberDao;

	//생성자 
	public MemberRegisterService(MemberDao memberDao) {
		this.memberDao = memberDao;
	}
	//등록 멤소드 
	public Long regist(RegisterRequest req) throws Exception{
		
		Member member = memberDao.selectByEmail(req.getEmail()); //등록할 이메일 받아와서 
		if (member != null) {
			throw new Exception("dup email" + req.getEmail()); 
		}
		//새 멤버 처리 
		Member newMember = new Member(
				req.getEmail(), req.getPassword(), req.getName(), 
				LocalDateTime.now());
		memberDao.insert(newMember);
		return newMember.getId();
	}
}
