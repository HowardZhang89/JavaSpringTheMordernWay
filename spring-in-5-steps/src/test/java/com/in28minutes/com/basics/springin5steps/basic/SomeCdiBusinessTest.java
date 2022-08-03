package com.in28minutes.com.basics.springin5steps.basic;

import static org.junit.Assert.*;
import org.springframework.test.context.junit4.SpringRunner;
import com.in28minutes.com.basics.springin5steps.SpringIn5StepsBasicApplication;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

//Load the context
@RunWith(SpringRunner.class)
@ContextConfiguration(classes=SpringIn5StepsBasicApplication.class)
public class SomeCdiBusinessTest {
	
	//Get the bean from the context
	@Autowired
	BinarySearchImpl binarySearch;
	
	@Test
	public void testBasicScenario() {
		// result is hard-coded so input doesn't matter
		int result = binarySearch.binarySearch(new int[] {1, 2,3}, 5);
		assertEquals(3, result);
	}

}
