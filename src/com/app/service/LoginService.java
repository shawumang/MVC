package com.app.service;

import com.app.dao.DaoLogin;
import com.app.model.User;

public class LoginService {
	//User user;
	DaoLogin ld=new DaoLogin();
	public User login(String username, String password) {
		return ld.login(username, password);
	}
	
	public String signup(String username, String password) {
		int result=ld.signup(username, password);
		String message = null;
		if(result>0) {
			message = "Registered successfully, Please Login";
		}else {
			message = "failed to Sign up, please try again";
		}
		
		return message;
	}
	}


