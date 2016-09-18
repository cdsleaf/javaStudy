package java7;

import static org.junit.Assert.*;

import org.junit.Test;

public class ComplexTest {
	//같은 타입의 다른 모든 인스턴스가 private멤버 변수에 접근 할 수 있는 것을 확인 하는 test case
	@Test
	public void complexNumberAddition(){
		final Complex expected = new Complex(6,2);
		final Complex a = new Complex(8,0);
		final Complex b = new Complex(-2,2);
		
		assertEquals(a.add(b), expected);
	}
}
