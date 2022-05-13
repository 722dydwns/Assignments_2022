package sample1;

import java.io.IOException;

public class MessageBeanImpl implements MessageBean{
	//필드
	private String name;
	private String greeting;
	private Outputter outputter;
	//구현하여 재정의한 메소드
	public void sayHello() {
		String message = greeting + name + "!";
		System.out.println(message);
		try { outputter.output(message);
		} catch(IOException e) {
			e.printStackTrace(); 
		}
	}
	//생성자 
	public MessageBeanImpl(String name) {
	this.name = name;
	}
	
	//Setter() 메소드 
	public void setGreeting(String greeting) {
	this.greeting = greeting;
	}
	public void setOutputter(Outputter outputter) {
	this.outputter = outputter;
	}
}
