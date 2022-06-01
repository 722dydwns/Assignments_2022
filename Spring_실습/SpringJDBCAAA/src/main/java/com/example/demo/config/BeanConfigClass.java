package com.example.demo.config;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.jdbc.core.JdbcTemplate;

import com.example.demo.beans.JdbcBean;
import com.example.demo.db.JdbcDAO;
import com.example.demo.db.MapperClass;

@Configuration
public class BeanConfigClass {
	//DB 연결하기 
	//1) DataSource 객체 생성 - 접속 정보 객체 
	@Bean
	public DataSource source() {
		//스프링부트에서 DataSouce 객체 등록을 위해서는 pom.xml 에 추가할 의존 설정 
		BasicDataSource source = new BasicDataSource();
		source.setDriverClassName("com.mysql.cj.jdbc.Driver");
		source.setUrl("jdbc:mysql://localhost:3306/yjdb?useUnicode=true&characterEncoding=utf8&serverTimezone=Asia/Seoul");
		source.setUsername("root");
		source.setPassword("1234");
		
		return source;
	}
	//2) JDBC Template  등록 : DataSouce 의 접속 정보 활용하여 DB 연결 
	@Bean 
	public JdbcTemplate db(BasicDataSource source) {
		JdbcTemplate db = new JdbcTemplate(source); //DB 연동
		return db;
	}
	
	//빈 등록 -> '데이터객체'
	@Bean 
	@Scope("prototype")
	public JdbcBean jdbcBean() {
		JdbcBean jdbcBean = new JdbcBean();
		return jdbcBean;
	}
	//DAO 객체 등록
	@Bean 
	public JdbcDAO jdbcDao() {
		JdbcDAO jdbcDao = new JdbcDAO() ;
		return jdbcDao;
	}
	//Mapper 객체 등록O
	@Bean
	public MapperClass mapperClass() {
		MapperClass mapperClass = new MapperClass();
		return mapperClass;
	}
	
	
	
	
}
