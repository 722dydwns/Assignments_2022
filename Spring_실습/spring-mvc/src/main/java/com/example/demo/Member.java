package com.example.demo;

import java.time.LocalDateTime;

public class Member { // Member 데이터
	
	//필드 = DB 테이블 구조와 동일
	private Long id;
	private String email;
	private String password;
	private String name;
	private LocalDateTime registerDateTime;

	//생성자
	public Member(String email, String password, String name, LocalDateTime regDateTime) {
		this.email = email;
		this.password = password;
		this.name = name;
		this.registerDateTime = regDateTime;
	}

	//Get/set() 메소드
	void setId(Long id) {
		this.id = id;
	}

	public Long getId() {
		return id;
	}

	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}

	public String getName() {
		return name;
	}

	public LocalDateTime getRegisterDateTime() {
		return registerDateTime;
	}

	//메소드 - 비번 변경 처리 시 Member 데이터 내부도 변경 처리 위함 
	public void changePassword(String oldPassword, String newPassword) throws Exception{
		if (!password.equals(oldPassword))
			throw new Exception("Wrong ID/PASSWORKD");
		this.password = newPassword;
	}

}
