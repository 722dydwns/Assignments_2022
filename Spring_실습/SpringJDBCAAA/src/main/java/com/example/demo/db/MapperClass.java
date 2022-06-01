package com.example.demo.db;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.example.demo.beans.JdbcBean;
//select 조회시 데이터 가져온다.
public class MapperClass implements RowMapper<JdbcBean>{
	
	@Override
	public JdbcBean mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		
		JdbcBean bean = new JdbcBean();
		bean.setInt_data(rs.getInt("int_data"));
		bean.setStr_data(rs.getString("str_data"));
		
		return bean;
	}
	
	
	
	
}
