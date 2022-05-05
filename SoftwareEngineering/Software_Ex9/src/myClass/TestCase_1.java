package myClass;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCase_1 { //(1) 동등분할 테스팅(black box) 수행
	
	//Paragraph의 catWhiteSpace() 메소드는 입력되는 문자열 속 연속된 공백문자를 1개의 공백으로 바꿔서 반환하는 메소드이다. 
	//따라서 공백의 위치별로 테스트케이스를 작성했다.
	
	//동등분할 기준 : 입력 String 속 '공백 위치'에 따른 동등분할 ->  앞 / 중간 / 끝 공백

	@Test
	final void ForwardSpace() { // '앞 공백 문자열' 테스팅
		assertEquals(Paragraph.catWhiteSpace("      Apple"), " Apple");
	}
	@Test
	final void MiddleSpace() { //'중간 공백 문자열' 테스팅
		assertEquals(Paragraph.catWhiteSpace("A      pple"), "A pple");
	}
	@Test
	final void EndSpace() { //'끝 공백 문자열' 테스팅 
		assertEquals(Paragraph.catWhiteSpace("Apple      "), "Apple ");
	}
}
