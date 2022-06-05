package com.in28minutes.junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyMathTest {
	
	MyMath myMath = new MyMath(); 
	//MyMath.sum
	// 1,2,3 => 6
	@Test
	public void sum_with3numbers() {
		assertEquals(6, myMath.sum(new int[] {1,2,3}));
	}
	
	@Test
	public void sum_with1number() {
		assertEquals(3, myMath.sum(new int[] {3}));
	}
}
