package com.app.servlet;

import javax.servlet.*;
import javax.servlet.http.*;

import com.app.model.User;
import com.app.service.LoginService;

import java.io.*;

public class Login extends HttpServlet {
	LoginService ls=new LoginService();
	User user;
	protected void doPost(HttpServletRequest request, HttpServletResponse response)   
		     throws IOException,ServletException{
			response.setContentType("text/html");
			PrintWriter out=response.getWriter();
//			System.out.println("servlet entering");
//			System.out.println(request.getParameter("username"));
//			HttpSession hs = request.getSession();
//			hs.setAttribute("name", user);
		    user = ls.login(request.getParameter("username"), request.getParameter("password"));
			System.out.println(user);
			request.setAttribute("user",user);
			if(user.getUser() != null) {
				System.out.println("true");
			RequestDispatcher rd=request.getRequestDispatcher("Employee");
		    rd.forward(request, response);
			}else {
				out.println("User not found, Please sign up!!!");
				RequestDispatcher rd = request.getRequestDispatcher("Login.jsp");
				rd.include(request, response);	
			}
			
	}

}
