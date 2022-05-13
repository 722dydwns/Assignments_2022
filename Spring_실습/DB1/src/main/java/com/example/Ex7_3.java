package com.example;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.example.spring.Member;
import com.example.spring.MemberDao;

public class Ex7_3 {
	private static MemberDao memberDao;

	public static void main(String[] args) {
		
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:appCtx7_3.xml");
		memberDao = ctx.getBean("memberDao", MemberDao.class);
		Member mem = memberDao.selectByEmail("madvirus@madvirus.net");
		System.out.println(mem.getName());
		ctx.close();
	}
}
