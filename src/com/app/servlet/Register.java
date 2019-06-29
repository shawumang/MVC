
package com.app.servlet;

import javax.servlet.*;
import javax.servlet.http.*;

import com.app.model.Employee;
import com.app.service.RegisterService;

import java.io.*;
import java.sql.*;

public class Register extends HttpServlet {
	RegisterService ls=new RegisterService();
	Employee employee;
	String message;
	protected void doPost(HttpServletRequest request, HttpServletResponse response)   
		     throws IOException,ServletException{
			response.setContentType("text/html");
			System.out.println("servlet entering");
			System.out.println(request.getParameter("salary")+"    "+request.getParameter("empdept"));
			message = ls.register(request.getParameter("ename"), Integer.parseInt(request.getParameter("salary")), Long.parseLong(request.getParameter("phone")), Integer.parseInt(request.getParameter("empdept")));
			request.setAttribute("message",message);
			RequestDispatcher rd=request.getRequestDispatcher("Employee");
		    rd.forward(request, response);
	}

}
