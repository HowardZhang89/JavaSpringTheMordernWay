package com.in28minutes.com.basics.springin5steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.in28minutes.com.basics.springin5steps.scope.PersonDAO;


@SpringBootApplication
public class SpringIn5StepsScopeApplication {

	// What are the beans?
	// What are the dependencies of a bean?
	// Where to search for beans? => No need (Spring will automatically search the package / subpackages of the file containing @SpringBootApplication Tag
	
	private static Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsScopeApplication.class);
			
	public static void main(String[] args) {
		//BinarySearchImpl binarySearch = new BinarySearchImpl(new QuickSortAlgorithm());
		
		ApplicationContext applicationContext =
				SpringApplication.run(SpringIn5StepsScopeApplication.class, args);
		
		PersonDAO personDao =
				applicationContext.getBean(PersonDAO.class);
		PersonDAO personDao2 =
				applicationContext.getBean(PersonDAO.class);
		
		// We should see same personDao object (Singleton), but different JdbcConnection (Prototype + Proxy)
		LOGGER.info("{}", personDao);
		LOGGER.info("{}", personDao.getJdbcConnection());
		LOGGER.info("{}", personDao.getJdbcConnection());
		
		LOGGER.info("{}", personDao2);
		LOGGER.info("{}", personDao2.getJdbcConnection());
	}

}
