package com.in28minutes.junit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyMathTest {
	
	MyMath myMath = new MyMath(); 
	
	@BeforeClass
	public static void beforeClass() {
		System.out.println("Before Class");
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("After Class");
	}
	
	@Before
	public void beforeTest() {
		System.out.println("Before");
	}
	
	@After
	public void afterTest() {
		System.out.println("After");
	}
	//MyMath.sum
	// 1,2,3 => 6
	@Test
	public void sum_with3numbers() {
		System.out.println("Test 1");
		assertEquals(6, myMath.sum(new int[] {1,2,3}));
	}
	
	@Test
	public void sum_with1number() {
		System.out.println("Test 2");
		assertEquals(3, myMath.sum(new int[] {3}));
	}
}
