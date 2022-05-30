package com.in28minutes.com.basics.springin5steps;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.in28minutes.com.basics.springin5steps.basic.BinarySearchImpl;
import com.in28minutes.com.basics.springin5steps.xml.XmlPersonDAO;

@Configuration
@ComponentScan("com.in28minutes.com.basics.springin5steps")
public class SpringIn5StepsXMLContextApplication {

	// What are the beans?
	// What are the dependencies of a bean?
	// Where to search for beans? => No need (Spring will automatically search the package / subpackages of the file containing @SpringBootApplication Tag
	
	public static void main(String[] args) {
		
		// load the application context from the XML
		try (ClassPathXmlApplicationContext applicationContext =
				new ClassPathXmlApplicationContext("applicationContext.xml")){
			
			// get the bean from the application context
			XmlPersonDAO personDao = 
					applicationContext.getBean(XmlPersonDAO.class);
			
			System.out.println(personDao);
			System.out.println(personDao.getXmlJdbcConnection());
		
		}
	}

}
