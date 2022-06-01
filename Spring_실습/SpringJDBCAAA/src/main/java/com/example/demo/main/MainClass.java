package com.example.demo.main;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.demo.beans.JdbcBean;
import com.example.demo.config.BeanConfigClass;
import com.example.demo.db.JdbcDAO;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfigClass.class);
		
		//DAO 가져옴
		JdbcDAO dao = ctx.getBean(JdbcDAO.class);
		
		
		List<JdbcBean> list = dao.select_data();
		for(JdbcBean bean3 : list) {
			System.out.printf("int_data: %d\n", bean3.getInt_data());
			System.out.printf("str_data: %s\n", bean3.getStr_data());
			System.out.println("----------------------------------");
		}
		

		
		ctx.close();
	}

}
