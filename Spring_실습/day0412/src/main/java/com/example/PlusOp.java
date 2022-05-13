package com.example;

import org.springframework.beans.factory.annotation.Autowired;

public class PlusOp implements OperatorBean{
	//필드
	@Autowired
	Operand operand1;
	@Autowired
	Operand operand2; 
	//생성자
	public PlusOp() {
		
	}
	//인터페이스 구현 메소드 
	public double calc() {
		return operand1.getValue() + operand2.getValue();
	}
	public Operand getOperand1() {
		return operand1;
	}
	
	public void setOperand1(Operand op) {
		operand1 = op;
	}
	
	public Operand getOperand2() {
		return operand2;
	}
	public void setOperand2(Operand op) {
		operand2 = op;
	}
	
}
