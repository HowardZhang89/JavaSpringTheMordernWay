package com.in28minutes.com.basics.springin5steps.scope;

import org.springframework.stereotype.Component;

@Component
public class JdbcConnection {
	public JdbcConnection() {
		System.out.println("JDBC Connection");
	}
}
