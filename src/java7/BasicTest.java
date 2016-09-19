package java7;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import java7.polymorphism_Inheritance.Rectangle;
import java7.polymorphism_Inheritance.Square;

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
		assertTrue(list2.size() == 2);
			
	}
	
	@Test
	public void polymorphiList(){
		List<Rectangle> rectangles = new ArrayList<>(3);
		rectangles.add(new Rectangle(5, 1));
		rectangles.add(new Rectangle(2, 10));
		rectangles.add(new Square(9));
	}
}
