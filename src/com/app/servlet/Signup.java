package com.app.servlet;

import javax.servlet.*;
import javax.servlet.http.*;

import com.app.service.LoginService;
import java.io.*;

public class Signup extends HttpServlet {
	LoginService sign=new LoginService();
	String message;
	protected void doPost(HttpServletRequest request, HttpServletResponse response)   
		     throws IOException,ServletException{
			response.setContentType("text/html");
			System.out.println("servlet entering");
			message = sign.signup(request.getParameter("username"), request.getParameter("password"));
			request.setAttribute("message",message);
			RequestDispatcher rd=request.getRequestDispatcher("Login.jsp");
		    rd.include(request, response);

	}


}
