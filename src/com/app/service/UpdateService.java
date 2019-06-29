package com.app.service;

import com.app.dao.DaoLogin;
import com.app.model.Employee;

public class UpdateService {
	DaoLogin ld=new DaoLogin();
	public int update(Employee emp){
		int upd=ld.update(emp);
		return upd;	
		}
}