package com.in28minutes.com.basics.springin5steps;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.in28minutes.com.basics.springin5steps.basic.BinarySearchImpl;

@Configuration
@ComponentScan("com.in28minutes.com.basics.springin5steps")
public class SpringIn5StepsBasicApplication {

	// What are the beans?
	// What are the dependencies of a bean?
	// Where to search for beans? => No need (Spring will automatically search the package / subpackages of the file containing @SpringBootApplication Tag
	
	public static void main(String[] args) {
		//BinarySearchImpl binarySearch = new BinarySearchImpl(new QuickSortAlgorithm());
		
		ApplicationContext applicationContext =
				new AnnotationConfigApplicationContext(SpringIn5StepsBasicApplication.class);
		BinarySearchImpl binarySearch =
				applicationContext.getBean(BinarySearchImpl.class);
		BinarySearchImpl binarySearch1 =
				applicationContext.getBean(BinarySearchImpl.class);
		System.out.println(binarySearch);
		System.out.println(binarySearch1);
		int result = 
				binarySearch.binarySearch(new int[] {12,  4, 6}, 3);
		System.out.println(result);
		
		
	}

}
