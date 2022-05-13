package sample3;

import org.springframework.context.support.GenericXmlApplicationContext;

public class HelloApp {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//스프링 컨테이너 생성 
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath*:applicationContext.xml");
		//빈 객체 getBean
		MessageBean bean = (MessageBean)ctx.getBean("messageBean");
		bean.sayHello("Spring");
		ctx.close();
	}
}
