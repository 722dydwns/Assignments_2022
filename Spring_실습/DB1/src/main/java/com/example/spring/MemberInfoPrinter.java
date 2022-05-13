package com.example.spring;

public class MemberInfoPrinter { //멤버 DB'정보' 출력 객체 

	//필드
	private MemberDao memDao; //DB 연동해서 관리하는 객체 
	private MemberPrinter printer; // 소스 속 Member 출력 객체 

	//메소드 
	public void printMemberInfo(String email) { //이메일 값 기준으로 DB 속 멤버 정보 가져옴 
		Member member = memDao.selectByEmail(email); //DB 속 email 값 기준으로 Member 타입으로 객체 받아옴
		if (member == null) {
			System.out.println("데이터 없음\n");
			return;
		}
		printer.print(member); //DB에서 받아온 memeber 객체를 다시 프린터처리  
		System.out.println();
	}

	//set() 메소드 
	public void setMemberDao(MemberDao memberDao) {
		this.memDao = memberDao;
	}

	public void setPrinter(MemberPrinter printer) {
		this.printer = printer;
	}

}
