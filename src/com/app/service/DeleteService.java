package com.app.service;

import com.app.dao.DaoLogin;

public class DeleteService {
	DaoLogin ld=new DaoLogin();
	public int delete(int id){
		int del=ld.delete(id);
		return del;	
		}
}
