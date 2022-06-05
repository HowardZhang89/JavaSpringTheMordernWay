package com.in28minutes.junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class AssertTest {

	@Test
	public void test() {
		boolean cond = true;
		boolean fCond = false;
		assertEquals(1,1);
		assertTrue(cond);
		assertFalse(fCond);
		
		String s1 = null;
		String s2 = "Hello";
		assertNull(s1);
		assertNotNull(s2);
		assertNotEquals(1,2);
		
		int[] arr1 = new int[] {1,2,3};
		int[] arr2 = new int[] {1,2,3};
		assertArrayEquals(arr1, arr2);
		
	}

}
