package lesson11.lecture.junit.test;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestHello {


	
	@Test
	public void testMyMethod() {
		String returnString = Hello.hello();
		assertEquals("not equal", "Hallo", returnString);
	}
	
	@Test
	public void testMyMethod1() {
		String returnString = Hello.hello();
		assertEquals("Hello", returnString);
	}

}
