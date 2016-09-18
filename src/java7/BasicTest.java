package java7;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class BasicTest {
	@Test
	public void absoluteOfMostNegativeValue(){
		final int mostNegative = Integer.MIN_VALUE;
		final int negated = Math.abs(mostNegative);
		assertFalse("test",negated > 0);
	}
	
	@Test
	public void objectMemoryAssignment(){
		List<String> list1 = new ArrayList<>(20);
		
		list1.add("test1");
		assertTrue(list1.size() == 1);
		
		List list2 = list1;
		list2.add("test2");
		assertTrue(list1.size() == 2);
			
	}
}
