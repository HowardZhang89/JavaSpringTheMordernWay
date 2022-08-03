package com.in28minutes.com.basics.springin5steps.cdi;

import static org.junit.Assert.*;
import org.springframework.test.context.junit4.SpringRunner;
import com.in28minutes.com.basics.springin5steps.SpringIn5StepsBasicApplication;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

//Load the context
@RunWith(MockitoJUnitRunner.class)
@ContextConfiguration(classes=SpringIn5StepsBasicApplication.class)
public class BinarySearchTest {
	
	//Inject Mock
	@InjectMocks
	SomeCdiBusiness business;
	
	// Create Mock
	@Mock
	SomeCdiDao daoMock;
	
	@Test
	public void testBasicScenario() {
		Mockito.when(daoMock.getData()).thenReturn(new int[] {2,4});
		// result is hard-coded so input doesn't matter
		int result = business.findGreatest();
		assertEquals(4, result);
	}
	
	@Test
	public void testBasicScenario_NoElements() {
		Mockito.when(daoMock.getData()).thenReturn(new int[] {});
		// result is hard-coded so input doesn't matter
		int result = business.findGreatest();
		assertEquals(Integer.MIN_VALUE, result);
	}
	
	@Test
	public void testBasicScenario_EqualElements() {
		Mockito.when(daoMock.getData()).thenReturn(new int[] {2,2,2});
		// result is hard-coded so input doesn't matter
		int result = business.findGreatest();
		assertEquals(2, result);
	}

}
