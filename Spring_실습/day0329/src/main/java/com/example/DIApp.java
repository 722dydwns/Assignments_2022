package com.example;

import org.springframework.context.support.GenericXmlApplicationContext;

public class DIApp {
	
	public static void main(String[] args) {
		//컨테이너 생성 
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath*:applicationContext.xml");
		OperatorBean operator = (OperatorBean)ctx.getBean("operatorBean"); //컨테이너 속 getBean
		double value = operator.calc();
		System.out.println("The result value:" + value);
		ctx.close(); //컨테이너 닫음 
		}

}
