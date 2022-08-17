package com.in28minutes.login;

public class LoginService {
	
	public boolean validateUser(String user, String password) {
		if(user.equals("in28Minutes") && password.contentEquals("dummy")) {
			return true;
		}
		
		return false;
	}

}
