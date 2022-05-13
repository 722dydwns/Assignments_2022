package com.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.example"})
public class JavaConfig { //설정 클래스
	
	@Bean 
	public OperatorBean operatorBean() {
		OperatorBean plusOp = new PlusOp();
		return plusOp;
	}
	/*
	@Bean
	@Scope("prototype")
	public Operand operand() {
		return new Operand(30);
	}
	*/
}
