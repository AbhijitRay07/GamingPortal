<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>

<style>
body {
  background-image: url("/images/front.jpg/");
  background-size: 1600px;
}
h1 {
  color: white;
  text-align: center;
}
table th{
	color:yellow;
	text-align: left;
}
h3{
text-align: center;
}
h4{
	text-align: right;
}
.x {
  font-family: "Times New Roman", Times, serif;
  font-size: 50px;
}
.y{
  font-family: Arial, Helvetica, sans-serif;
  font-size: 25px;
}

.button {
  background-color: #4CAF50; 
  border: none;
  border-radius: 12px;
  color: white;
  padding: 5px 15px;
  text-align:center;
  text-decoration: none;
  display: inline-block;
  font-size: 16px;
  margin: 4px 2px;
  cursor: pointer;
}
.button1 {
  background-color: #008CBA;
  border: none;
  border-radius: 12px;
  color: white;
  padding: 5px 15px;
  text-align:center;
  text-decoration: none;
  display: inline-block;
  font-size: 16px;
  margin: 4px 2px;
  cursor: pointer;
}

</style>
<meta charset="ISO-8859-1">
<title>Register User</title>

</head>
<body>
<center>
<form action="/register" method="post">

<h1><p class="x">WELCOME TO GAMING PORTAL</h1></p>
<h1><p class="y">REGISTRATION PAGE</h1></p>
<table style="width: 40%">
<tr>
<th>NAME: </th><th><input type="text" name="name" required="required"/></th></tr>
<tr><th>AGE: </th><th><input type="text" name="age"/></th></tr>
<tr><th>EMAIL: </th><th><input type="text" name="email"/></th></tr>
<tr><th>PASSWORD: </th><th><input type="password" name="password"/></th></tr>
<tr><th>CONFIRM PASSWORD:</th><th> <input type="password" name="confirmpassword"/></th></tr>
</table>
<h3><input type="submit" value="Register"/></h2>
<h3><button class="button1"><a href="/loginpage">EXISTING USER</a></h3></button>
<h3><button class="button"><a href="/showadminlogin">ADMIN LOGIN</a></button></h3>

</form>
</center>
</body>
</html>