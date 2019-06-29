<%@page import="java.util.List"%>
<%@page import="com.app.model.Employee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%
	List<Employee> empList = (List) request.getAttribute("emp");
%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.7.0/css/all.css" integrity="sha384-lZN37f5QGtY3VHgisS14W3ExzMWZxybE1SJSEsQp9S+oqd12jhcu+A56Ebc1zFSJ" crossorigin="anonymous">

<style>
.add a{
margin-left:40px;

}
h3 {
	text-align: center;
}

table {
	margin-top: 20px;
}
</style>
<link rel="stylesheet"
	href="https://use.fontawesome.com/releases/v5.7.0/css/all.css"
	integrity="sha384-lZN37f5QGtY3VHgisS14W3ExzMWZxybE1SJSEsQp9S+oqd12jhcu+A56Ebc1zFSJ"
	crossorigin="anonymous">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">

<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h3>Employee Table</h3>
<div class="add">	
<a href="Register.jsp"><i class="fas fa-plus"></i>Add Employee</a>
</div>
	<table class="table table-bordered">
		<thead>
			<tr>
				<th scope="col">EMP ID</th>
				<th scope="col">EMPLOYEE NAME</th>
				<th scope="col">SALARY</th>
				<th scope="col">PHONE</th>
				<th scope="col">DEPARTMENT</th>
				<th scope="col">UPDATE</th>
				<th scope="col">DELETE</th>
			</tr>
		</thead>
		<tbody>
			<%
				if (empList != null) {
					for (int i = 0; i < empList.size(); i++) {
			%>
			<tr>
				<td><%=empList.get(i).getEmpid()%></td>
				<td><%=empList.get(i).getEname()%></td>
				<td><%=empList.get(i).getSal()%></td>
				<td><%=empList.get(i).getPhone()%></td>
				<td><%=empList.get(i).getDepartment().getDname()%></td>
				<td><a href="update?empid=<%=empList.get(i).getEmpid()%>"><i class="fas fa-pencil-alt"></i></a></td>
				<td><a href="delete?empid=<%=empList.get(i).getEmpid()%>"><i class="fas fa-trash-alt"></i></a></td>				
			</tr>
			<%
				}
				}
			%>
		</tbody>
	</table>
</body>
</html>