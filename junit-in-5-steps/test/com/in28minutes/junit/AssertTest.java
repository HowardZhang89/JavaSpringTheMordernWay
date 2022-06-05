package com.in28minutes.junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class AssertTest {

	@Test
	public void test() {
		boolean cond = true;
		boolean fCond = false;
		String s1 = null;
		String s2 = "Hello";
		assertEquals(1,1);
		assertTrue(cond);
		assertFalse(fCond);
		assertNull(s1);
		assertNotNull(s2);
		assertNotEquals(1,2);
	}

}
