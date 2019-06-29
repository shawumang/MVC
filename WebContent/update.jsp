<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style>
p{
margin-left:60%;
}
h2{
text-align:center;
}
button{
width:150px;
}
.btn{
margin-top:1%;
margin-left:210px;

}
form{
margin-top:6%;
margin-left:30%;
}
.row{
width:600px;
margin-top:2%;
}


</style>
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.7.0/css/all.css" integrity="sha384-lZN37f5QGtY3VHgisS14W3ExzMWZxybE1SJSEsQp9S+oqd12jhcu+A56Ebc1zFSJ" crossorigin="anonymous">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Registration for Employee</h2>
 <form action="update" method="POST">
  <div class="row">
    <div class="col">
      <input type="text" class="form-control" name="ename" required placeholder="Employee Name">
    </div>
    <div class="col">
      <input type="text" class="form-control" name="salary" required placeholder="Salary">
    </div>
  </div>
  <div class="row">
    <div class="col">
      <input type="text" class="form-control" name="phone" required maxlength="12" placeholder="Phone number">
    </div>
  <div class="col-6"> 
 <div class="row">
  <div class="col-2"> Department:</div>
  <div class="col-4">
  <select class="form-control"  name="empdept" id="exampleFormControlSelect1">
      <option value="1">Developer</option>
      <option value="2">Tester</option>
      <option value="3">Backend</option>
   </select>
  </div> 
    </div>
    </div>
    </div>
    <div class="row">
    <div class="col">
    
      <input type="hidden" class="form-control" name="empid" readonly value="<%=request.getAttribute("id") %>">
    </div>
   
 </div>
<button type="submit" class="btn btn-primary btn btn-md">Register</button>
</form>
<p>Department:<br>1-Developer<br>2-Tester<br>3-Backend</p>

</body>
</html>