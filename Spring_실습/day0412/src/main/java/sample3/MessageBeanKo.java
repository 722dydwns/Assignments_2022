package sample3;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class MessageBeanKo implements MessageBean, InitializingBean, DisposableBean{
	//MessageBean의 구현 메소드 재정의 
	public void sayHello(String name) {
		System.out.println("안녕하세요," + name);
	}
	
	//(초기화 함수)InitializingBean의 메소드 재정의 
	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Client.afterPropertiesSet() 실행");
	}
	//(소멸 함수)DisposableBean의 메소드 재정의 
	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Client.destroy() 실행");
	}
}
