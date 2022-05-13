package com.example;

import org.springframework.stereotype.Component;

@Component
public class Operand {
	//필드 
	double value = 30;
	//생성자
	public Operand() {
	}
	//Getter()
	public double getValue() {
		return value;
	}
	//Setter()
	public void setValue(double v) {
		value = v;
	}
	
	
}

