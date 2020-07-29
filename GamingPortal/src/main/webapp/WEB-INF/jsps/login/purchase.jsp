<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style>
body {
  background-image: url("/images/purchasepage.jpg/");
  background-size: 1200px;
}
h1  {
	color: red;
	text-align: center;
	
	}
h3  {
	text-align: center;
	color: black;
	}

</style>
<meta charset="ISO-8859-1">
<title>Purchase Zone</title>
</head>
<body>
<h1>ADD MONEY</h1>
<br>
<form action="/purchasepage" method="post">

<h3>AMOUNT: <input type="text" name="balance" required="required"/></h3>
<h3>CARD<input type="radio" name="payment"/></h3>
<h3>UPI<input type="radio" name="payment"/></h3>
<h3><a href="/purchasepage">PAY</button></h3>

</form>
</body>
</html>