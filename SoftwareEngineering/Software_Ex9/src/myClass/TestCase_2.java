package myClass;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCase_2 { //(2) 기본 경로 테스팅(white 박스)  수행
 
	//catWhiteSpace() 메소드의 순환복잡도는 7 이 나온다. 
	                    // '조건의 수 이용' : 6개 + 1 = 7
	                    // '흐름 그래프 이용'  E - N + 2 = 22 - 17 + 2 = 7 
	//즉, 적어도 1번씩 각 경로를 거쳐서 모든 경로를 테스팅하려면 7가지의 테스팅 메소드가 필요한 것이다.
	
	@Test  // 테스트 경로 : 1->2->17 
	final void NullcatWhiteSpace() { // (1) null인 경우 
		assertEquals(Paragraph.catWhiteSpace(null), null);
	}
	
	@Test //테스트 경로 : 1->3->4->5->6->'7->9->10->12->8->15->4->5->6->8->13->14->15->4->16->17
	final void FirstSpace() { //(2) 앞부분 공백 		
		assertEquals(Paragraph.catWhiteSpace("			CAT"), " CAT");
	}
	
	@Test //테스트 경로 : 1->3->4->5->6->8->13->14->15->4->4->6->7->8->9->10->12->8->13->15->4->5->6->8->13->14->15->4->16->17
	final void MiddleSpace() {//(3) 중간 공백
		assertEquals(Paragraph.catWhiteSpace("C 	 AT"), "C AT");
	}
	
	@Test //테스트 경로 : 1->3->4->5->6->8->13->14->15->4->5->6->7->8->9->10->12->8->13->15->4->16->17
	final void EndSpace() { //(4) 끝 공백
		assertEquals(Paragraph.catWhiteSpace("CAT     "), "CAT ");
	}
	
	@Test //테스트 경로 : 1->3->4->5->6->7->8->9->10->12->8->9->10->'11'->13->15->4->16->17
	final void AllSpace() { //(5) 모두 공백
		assertEquals(Paragraph.catWhiteSpace("		   "), " ");
	}
	
	@Test //테스트 경로: 1->3->4->5->6->7->8->9->10->12->8->9->10->11->13->14->15->4->16->17
	final void FirstEndSpace() { //(6) 앞 뒤 공백
		assertEquals(Paragraph.catWhiteSpace("     CAT			"), " CAT ");
	}

	@Test //테스트 경로 : 1->3->4->5->6->7->8->9->10->2->8->9->10->11->13->14->15->4->16->17
	final void BetweenSpace() { //(7) 사이사이 공백
		assertEquals(Paragraph.catWhiteSpace("     C    A   T      "), " C A T ");
	}

}
