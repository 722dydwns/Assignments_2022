package com.example;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.example.spring.MemberDao;

public class Ex7_4 {

	private static MemberDao memberDao;
	
	public static void main(String[] args) {
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:appCtx7_3.xml");
		memberDao = ctx.getBean("memberDao", MemberDao.class);
		System.out.println("Member #: " + memberDao.count() );
	}
	
	
}
