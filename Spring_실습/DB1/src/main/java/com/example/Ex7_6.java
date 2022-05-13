package com.example;

import java.time.LocalDateTime;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.example.spring.Member;
import com.example.spring.MemberDao;

public class Ex7_6 {  // 실습 7-6 

	private static MemberDao memberDao;

	public static void main(String[] args) {
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:appCtx7_3.xml");
		memberDao = ctx.getBean("memberDao", MemberDao.class);
		
		// 새 멤버 추가 테스트, 실행할 때마다 email 값을 변경하여야 함
		Member member = new Member("guest1@gmail.com", "aaa", "Mr.Lee", LocalDateTime.now()); //새로 추가한 멤버 데이터 
		memberDao.insert(member); //주입하고 
		System.out.println(member.getId()); // 잘들어갔는지 ID 프린터 해보기 
	}

}
