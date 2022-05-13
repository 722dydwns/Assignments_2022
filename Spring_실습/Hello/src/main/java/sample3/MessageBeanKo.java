package sample3;

public class MessageBeanKo implements MessageBean {
	//MessageBean의 구현 메소드 재정의 
	public void sayHello(String name) {
		System.out.println("안녕하세요," + name);
	}
	//(초기화 함수) 속성으로 지정하기 
	public void initMessage() {
		// TODO Auto-generated method stub
		System.out.println("MessageBeanKo.initMessage() 실행");
	}
	
	//(소멸 함수) 속성으로 지정하기 
	public void finishMessage() {
		// TODO Auto-generated method stub
		System.out.println("MessageBeanKo.finishMessage() 실행");
	} 
	
}
