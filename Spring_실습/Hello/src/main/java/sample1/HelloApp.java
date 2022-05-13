package sample1;

import org.springframework.context.support.GenericXmlApplicationContext;

public class HelloApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath*:applicationContext.xml");
			MessageBean bean = (MessageBean)ctx.getBean("messageBean"); 
			bean.sayHello();
			ctx.close();
	}

}
