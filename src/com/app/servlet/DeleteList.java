package com.app.servlet;

import java.io.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app.service.DeleteService;

public class DeleteList extends HttpServlet {
	DeleteService ds=new DeleteService();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)   
		     throws IOException,ServletException{
			response.setContentType("text/html");
			int del=ds.delete(Integer.parseInt(request.getParameter("empid")));
			if(del>0) {
				System.out.println(del+"deleted");			
//			RequestDispatcher rd=request.getRequestDispatcher("Employee");
		    response.sendRedirect("Employee");
		    }else {
		    	System.out.println("Not deleted");
		    }
 
	}
}