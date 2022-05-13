package com.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DIApp3 {
	
	public static void main(String[] args) {
		//컨테이너 생성 
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(JavaConfig.class);
		OperatorBean operator = (OperatorBean)ctx.getBean("operatorBean");
		double value = operator.calc();
		System.out.println("the result value: " + value);
		ctx.close(); //컨테이너 닫음 
		}

}
