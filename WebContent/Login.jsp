<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    
<!DOCTYPE html>
<html>
<head>

<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.7.0/css/all.css" integrity="sha384-lZN37f5QGtY3VHgisS14W3ExzMWZxybE1SJSEsQp9S+oqd12jhcu+A56Ebc1zFSJ" crossorigin="anonymous">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<style>
form{
margin-top:110px;
margin-left:550px;
width:20%;
} 
button{
width:100%;
}

h2{
margin-left:620px;
margin-top:60px
}
p{
margin-left:570px;
margin-top:4px;
}
i{

}
</style>

<body>

<h2>Sign In</h2>

<form  action="login" method="POST">

  <div class="form-group">
<i class="fas fa-user"></i><input type="text" class="form-control" required id="exampleInputEmail1" aria-describedby="emailHelp" name=username placeholder="Username">
  </div>
  <div class="form-group">
<i class="fas fa-lock"></i><input type="password" class="form-control" required id="exampleInputPassword1" name="password" placeholder="Password">
  </div>
  
  <button type="submit" class="btn btn-primary btn btn-md">Sign In</button>
</form>


<p>Dont have an account?<a href="Signup.jsp"><span>Create one</span></a></p>

</body>
</html>