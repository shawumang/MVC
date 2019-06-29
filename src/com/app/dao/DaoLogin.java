/**@Umang
 * Project:create, delete update records from front end using mvc */


package com.app.dao;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.app.model.Department;
import com.app.model.Employee;
import com.app.model.User;


public class DaoLogin {
		ResultSet rs;
		Department department = new Department();   //object for Department pojo class
		User user=new User();                       //object for User pojo class
		Employee employee= new Employee();          //object for Employee pojo class
//		private int empid;
       
		public Connection getConnection() {         //method for connection to database 
			Connection con=null;
			try {
				Class.forName("com.mysql.jdbc.Driver");
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/world", "root", "root123");

			} catch (ClassNotFoundException | SQLException e) { //handling sql exception also
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return con;                               //return Connection object		
		}
		
		public User login(String username, String password) {  //method for login returning user object
			try {
				PreparedStatement stmt = getConnection().prepareStatement("select * from usr where Username=? and Password=?");
				stmt.setString(1, username);        //taking data from Login.jsp
				stmt.setString(2, password);
				rs=stmt.executeQuery();             //storing data in ResultSet object rs
				while(rs.next()) {                  
//				user.setId(rs.getInt(1));
				user.setPass(rs.getString(2));     //storing ResultSet data into user object
				user.setUser(rs.getString(1));
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			return user;                   //returning user object with data from database
			}
		
		public int register(String ename, int salary, long phone, int empdept ) { //employee registration method
			int result = 0;
			try {
	        String sql = "INSERT INTO em (ename, salary, phone, empdept) VALUES (?, ?, ?, ?)";
	        PreparedStatement stmt = getConnection().prepareStatement(sql);
	    	stmt.setString(1, ename);              //taking user input from Register.jsp
			stmt.setInt(2, salary);
			stmt.setLong(3, phone);
			stmt.setInt(4,  empdept);
		    result =stmt.executeUpdate();        //storing the integer value in result variable
			}
	        catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			return result;                     //returning the integer result
			}
	       
		public int signup(String username, String password) {   //Signing up method
			int auth = 0;
			try {
	        String sql = "INSERT INTO usr (Username, Password) VALUES (?, ?)";
	        PreparedStatement stmt = getConnection().prepareStatement(sql);
	     	stmt.setString(1, username);       //taking data from Signup.jsp
			stmt.setString(2, password);
			auth =stmt.executeUpdate();
			}
	        catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return auth;                       //returning data in integer
		}

		
			public List<Employee> registerdisp(){  //Arraylist to store all the data and display
				List<Employee> emplist=new ArrayList<Employee>(); //emplist object for Employee list
				
				try {
			    	Statement stmt=getConnection().createStatement();
			     rs=stmt.executeQuery("SELECT E.Empid,E.ename,E.salary,E.phone,E.empdept,D.deptid,D.deptname FROM em E, depart D where E.empdept = D.deptid");
			    	while(rs.next()) {		
			    		Employee emp = new Employee();   
			    		Department dep = new Department();
			    		emp.setEmpid(rs.getInt(1));
			    		emp.setEname(rs.getString(2));
			    		emp.setSal(rs.getInt(3));
			    		emp.setPhone(rs.getInt(4));
			    		emp.setEmpdept(rs.getInt(5));
			    		dep.setId(rs.getInt(6));
			    		dep.setDname(rs.getString(7));
			    		emp.setDepartment(dep);
			    		emplist.add(emp);          //adding all data into list using add()
			    	}
				}catch (SQLException er) {
					// TODO Auto-generated catch block
					er.printStackTrace();
				}
				return emplist;              //returning object of list with data  
				}
				
		public int delete(int id) {          //method for deleting a row
				try {
					String sql="Delete from em where Empid=?";
					PreparedStatement stmt=getConnection().prepareStatement(sql);
					stmt.setInt(1,id);    //setting id for deletion
					id=stmt.executeUpdate();
				}catch(Exception e) {
					System.out.println(e);
//					id = -1;
				}
				return id;              //returning data in id
			}
	
	
		public int update(Employee emp) {
			int id = 0;
			try {
				String sql="Update em set ename=?, salary=?, phone=?, empdept=? where Empid=?";
				PreparedStatement stmt=getConnection().prepareStatement(sql);
		
				stmt.setString(1,emp.getEname());
			    stmt.setInt(2,emp.getSal());
				stmt.setLong(3,emp.getPhone());
				stmt.setInt(4,emp.getEmpdept());
  				stmt.setInt(5,emp.getEmpid());
			id=stmt.executeUpdate();
			}catch(Exception e) {
				System.out.println(e);
//				id = -1;
			}
			return id;
		}
}