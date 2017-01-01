package java7.WeakReferenceStack;

import static org.junit.Assert.*;

import org.junit.Test;

public class WeakReferenceStackTest<E>{
	
	@Test
	public void weakReferenceStackManipulation(){
		final WeakReferenceStack<ValueContainer> stack = new WeakReferenceStack<>();
		
		final ValueContainer expected = new ValueContainer("Value for the stack");
		stack.push(new ValueContainer("Value for the stack"));
		
		ValueContainer peekedValue = stack.peek(); //peekedValue에 stack의 강한 참조가 걸린다.

		assertEquals(expected.get(), peekedValue.get());	
		assertEquals(expected.get(), stack.peek().get());
		peekedValue = null; //stack에 걸린 강한 참조인 peekedValue가 null이 됨으로써 stack의 peek에 있던 참조는 강한 참조가 없어짐. gc 발생 시 가비지 컬렉션의 대상이 될 수 있다.
		System.gc();
		assertNull(stack.peek()); //만약 위의 System.gc(); 를 주석 처리하면 테스트는 실패한다. GC의 대상은 되지만 해당 시점에 GC가 안되어 있을 수도 있으므로.
	}
}
