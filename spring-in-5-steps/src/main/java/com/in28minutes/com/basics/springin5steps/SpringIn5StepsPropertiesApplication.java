package com.in28minutes.com.basics.springin5steps;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.in28minutes.com.basics.springin5steps.basic.BinarySearchImpl;
import com.in28minutes.com.basics.springin5steps.properties.SomeExternalService;

@Configuration
@ComponentScan("com.in28minutes.com.basics.springin5steps")
@PropertySource("classpath:app.properties")
public class SpringIn5StepsPropertiesApplication {

	// What are the beans?
	// What are the dependencies of a bean?
	// Where to search for beans? => No need (Spring will automatically search the package / subpackages of the file containing @SpringBootApplication Tag
	
	public static void main(String[] args) {
		//BinarySearchImpl binarySearch = new BinarySearchImpl(new QuickSortAlgorithm());
		
		try (AnnotationConfigApplicationContext applicationContext =
				new AnnotationConfigApplicationContext(SpringIn5StepsPropertiesApplication.class)){
		SomeExternalService service =
				applicationContext.getBean(SomeExternalService.class);
		System.out.println(service);
		
		}
	}

}
