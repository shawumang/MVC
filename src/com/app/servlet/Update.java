package com.app.servlet;


import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app.model.Employee;
import com.app.service.UpdateService;

public class Update extends HttpServlet {
	UpdateService us=new UpdateService() ;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response)   
		     throws IOException,ServletException{
			response.setContentType("text/html");
		    request.setAttribute("id", request.getParameter("empid"));
			request.getRequestDispatcher("update.jsp").include(request, response);

	    
	}
 
			protected void doPost(HttpServletRequest request, HttpServletResponse response)   
				     throws IOException,ServletException{
					response.setContentType("text/html");
					Employee emp = new Employee();
					emp.setEmpdept(Integer.parseInt(request.getParameter("empdept")));
					emp.setEmpid(Integer.parseInt(request.getParameter("empid")));
					emp.setEname(request.getParameter("ename"));
					emp.setPhone(Long.parseLong(request.getParameter("phone")));
					emp.setSal(Integer.parseInt(request.getParameter("salary")));
					int upd=us.update(emp);
					System.out.println("update servlet");
					if(upd>0) {
						System.out.println("updated"+upd);
				    request.getRequestDispatcher("Employee").forward(request, response);
				    }else {
				    	System.out.println("Not updated");
				    }
		 
}
}