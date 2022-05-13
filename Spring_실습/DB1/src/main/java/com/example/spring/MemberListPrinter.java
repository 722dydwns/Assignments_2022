package com.example.spring;

import java.util.Collection;

public class MemberListPrinter { //멤버 리스트를 출력 
	//필드
	private MemberDao memberDao;
	private MemberPrinter printer;

	//생성자
	public MemberListPrinter(MemberDao memberDao, MemberPrinter printer) {
		this.memberDao = memberDao;
		this.printer = printer;
	}
	
	//전체 멤버 출력 
	public void printAll() {
		Collection<Member> members = memberDao.selectAll();
		members.forEach(m -> printer.print(m));
	}

}
