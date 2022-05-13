package com.example;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.example.spring.Member;
import com.example.spring.MemberDao;

public class Ex7_5 {  //Ex7-5 실습   
	
	private static MemberDao memberDao;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:appCtx7_3.xml");
		memberDao = ctx.getBean("memberDao", MemberDao.class);
		// 암호변경
		Member member = memberDao.selectByEmail("madvirus@madvirus.net"); //이 이메일로 가입한 멤버 객체 가져와서 
		try {
			member.changePassword("1234", "aaaa"); // 기존 1234 였던 비번을 aaaa로 변경처리 
		} catch (Exception e) {
			e.printStackTrace();
		}
		memberDao.update(member); //다시 DB에 변경한 Member 내용 객체 업데이트 처리
		//업데이트 제대로 됐는지 확인 위해 다시 해당 이메일로 가입한 멤버 객체 가져옴 
		member = memberDao.selectByEmail("madvirus@madvirus.net"); 
		System.out.println(member.getPassword()); //변경 내용 확인

	}

}
