package com.app.service;
import java.util.List;

import com.app.dao.DaoLogin;
import com.app.model.Employee;
public class ServicDisplay {
	public List<Employee> registerdisp(){
			DaoLogin ld=new DaoLogin();
			return ld.registerdisp();
}
}