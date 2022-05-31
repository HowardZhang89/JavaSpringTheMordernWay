package com.in28minutes.com.basics.springin5steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.in28minutes.com.basics.springin5steps.basic.BinarySearchImpl;
import com.in28minutes.com.basics.springin5steps.xml.XmlPersonDAO;

public class SpringIn5StepsXMLContextApplication {

	// What are the beans?
	// What are the dependencies of a bean?
	// Where to search for beans? => No need (Spring will automatically search the package / subpackages of the file containing @SpringBootApplication Tag
	private static Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsXMLContextApplication.class);
	
	public static void main(String[] args) {
		
		// load the application context from the XML
		try (ClassPathXmlApplicationContext applicationContext =
				new ClassPathXmlApplicationContext("applicationContext.xml")){
			
			// get the bean from the application context
			XmlPersonDAO personDao = 
					applicationContext.getBean(XmlPersonDAO.class);
			
			LOGGER.info("Bean Loaded -> {}", 
					(Object) applicationContext.getBeanDefinitionNames());
			
			LOGGER.info("{} {}", personDao, personDao.getXmlJdbcConnection());
		
		}
	}

}
