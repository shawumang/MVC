package com.app.servlet;

import java.io.*;
import java.sql.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app.service.ServicDisplay;

public class Employee extends HttpServlet {
	
	ServicDisplay sd = new ServicDisplay();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		response.setContentType("text/html");
		request.setAttribute("emp", sd.registerdisp());
//		System.out.println(sd.registerdisp().get(0).getEname());
		RequestDispatcher rd = request.getRequestDispatcher("List.jsp");
		rd.include(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		response.setContentType("text/html");
		request.setAttribute("emp", sd.registerdisp());
//		System.out.println(sd.registerdisp().get(0).getEname());
		RequestDispatcher rd = request.getRequestDispatcher("List.jsp");
		rd.include(request, response);
	}


}
