package com.in28minutes;

public class UserValidationService {
	
	public boolean isUserValid(String user, String password) {
		if(user.equals("in28Minutes") && password.contentEquals("dummy")) {
			return true;
		}
		
		return false;
	}

}
