<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<title>Sign Up-Phoenix Air</title><head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">

	<title>Phoenix Air</title>
	<link rel="stylesheet" type="text/css" href="css/bootstrap.css"/>
	<link rel="stylesheet" href="./css/styles1.css"/>
	<script type="text/javascript" src="js/bootstrap.min.js"/></script>
	<script type="text/javascript" src="js/jquery.min.js"/></script>
	<script type="text/javascript" src="js/popper.min.js"/></script>
</head>
<style>
body {
  background-image: url("img/bg.jpg");
  background-repeat: no-repeat;
  background-size: 1600px 900px;
}
</style>
<center>
<br>
<B>
<h3>Welcome to Phoenix Air Community</h3>
<h5>You will be a part of our family.</h5>
<h5>Take an oath to serve the customers as per guidelines</h5></center>
</B>
<br><br>
<div class="container">

<center>
<form action="<%=request.getContextPath()%>/register" method="post">

<h4>AGENT SIGNUP PAGE</h4>
<br>
Name:
<input type="text" name="name" placeholder="Enter your full name" required/>
<br>
<br>
Contact Number:
<input type="text" name="contact" placeholder="Enter your phone number" required/>
<br>
<br>
E-mail ID:
<input type="text" name="emailid" placeholder="Enter your email id" required/>
<br>
<i>(Enter this field correctly)</i>
<br>
<br>
Address:
<input type="text" name="address" placeholder="Enter your address" required/>
<br>
<br>
Create password:
<input type="password" name="password" placeholder="Enter your password" required/>
<br>
<br>
Re-enter password:
<input type="password" name="password" placeholder="Enter your password" required/>
<br>
<br>
<input type="submit" name="submit" value="Submit"/>
<input type="reset" name="reset" value="Reset"/>
<br>
<br>

</form>
</center>
</div>
</p>
</html>