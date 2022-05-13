package ex6_2;

public class MessageBeanImpl implements MessageBean {
	//필드
	private String name;
	//메소드
	public void waitAMoment(int msec) {
		try {
			Thread.sleep(5000);  //5초 지연 
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	//구현 메소드 
	public void sayHello() {
		waitAMoment(5000);
		System.out.println("Hello,"+ name + "!");
	}
	//setter() 
	public void setName(String name) {
		this.name = name;
	}

}
