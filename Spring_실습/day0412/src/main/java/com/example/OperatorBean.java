package com.example;

public interface OperatorBean {

	//인터페이스 속 추상 메소드 
	double calc();
	
	Operand getOperand1();
	
	void setOperand1(Operand op);
	
	Operand getOperand2();
	
	void setOperand2(Operand op);
	
}
