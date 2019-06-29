package com.app.service;

import com.app.dao.DaoLogin;

public class RegisterService {
		
		DaoLogin ld=new DaoLogin();
		public String register(String ename, int salary, long phone, int empdept){
			int result = ld.register(ename, salary, phone, empdept);
			String message = null;
			if(result>0) {
				message = "saved successfully";
			}else {
				message = "failed to save, please try again";
			}
			
			return message;
		}
	

}


