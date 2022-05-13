package com.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.Scope;

@Configuration
@ImportResource("classpath:appCtxEx6_4.xml")
public class JavaConfig { //설정 클래스
	@Bean 
	public OperatorBean operatorBean() {
		OperatorBean plusOp = new PlusOp();
		return plusOp;
	}
	@Bean
	public Operand operand() {
		return operand();
	}
	
}
