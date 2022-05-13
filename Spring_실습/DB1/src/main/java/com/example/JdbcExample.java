 package com.example;

import java.sql.*;

public class JdbcExample {  // 기존 JDBC 프로그래밍 
	
	public static void main(String[] args) {
			//커넥션 객체 변수
			Connection conn = null; 
			//실행문 객체 변수 
			Statement stmt = null;
			
			try{
				//(1) JDBC 클래스 지정 
				
				Class.forName("com.mysql.cj.jdbc.Driver");
				//(2) 커넥션 객체 연결 생성 
				conn = DriverManager.getConnection("jdbc:mysql://localhost/spring5fs?" + 
									"characterEncoding=utf-8&serverTimezone=UTC","spring5","spring5");
				//(3) Statement 객체 생성 
				stmt = conn.createStatement();
				
				//(4) SQL문 실행 
				String sql = "SELECT * FROM Member";  //실행문 작성
				ResultSet rs = stmt.executeQuery(sql);  //실행문 실행 후 ResultSet으로 결과 반환 받음 
				
				//(5) sql 결과 정보 차례로 조회 
				while(rs.next()){
					String email = rs.getString("email");
					String name = rs.getString("name");
					System.out.println("Email: " + email + ", Name: " + name);
				}
				
			//연결 닫기 
			rs.close();
			stmt.close();
			conn.close();
			
			} catch(SQLException se) { 
				se.printStackTrace();
			} catch(Exception e){
				e.printStackTrace();
			} finally{ 
				try{
				if(stmt!=null) 
					stmt.close();
				} catch(SQLException se2){ 
					
				}
				try{
					if(conn!=null) 
						conn.close();
					}catch(SQLException se){ 
						se.printStackTrace(); }
					}
			}
		}
