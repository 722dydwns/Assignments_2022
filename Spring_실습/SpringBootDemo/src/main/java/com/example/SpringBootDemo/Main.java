package com.example.SpringBootDemo;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath*:applicationContext.xml");
		Greeter g = (Greeter)ctx.getBean("greeter");
		String msg = g.greet("Spring");
		System.out.println(msg);
		ctx.close();
	}

}
