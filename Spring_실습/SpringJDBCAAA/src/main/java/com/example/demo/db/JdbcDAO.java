package com.example.demo.db;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.example.demo.beans.JdbcBean;

public class JdbcDAO { //여기서 JDbcTemplate 사용하여 DB 쿼리문 전달
	//JdbcTemplate 객체 주입받아야 함 
	@Autowired
	private JdbcTemplate db;
	
	//mapper 역할 주입받기 
	@Autowired
	private MapperClass mapper;
	
	//저장
	public void insert_data(JdbcBean bean) {
		//String sql = "INSERT INTO "
		String sql = "insert into member (int_data, str_data) values (?,?)";
		db.update(sql, bean.getInt_data(), bean.getInt_data());
	}
	
	//select - 여기서 mapper 사용
	public List<JdbcBean> select_data() {
		String sql = "select int_data, str_data from member";
		List<JdbcBean> list = db.query(sql, mapper);
		return list;
	}
	
}
