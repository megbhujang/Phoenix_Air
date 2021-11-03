<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<title>Login-Phoenix Air</title>
<head>
<head>
  <link rel="stylesheet" href="css/styles.css">
<style>
body {
  background-image: url("img/air1.jpg");
  background-repeat: no-repeat;
  background-size: 1500px 655px;
}
.imgcontainer {
  text-align: center;
  margin: 24px 0 12px 0;
}

img.avatar {
  width: 40%;
  border-radius: 50%;
}

</style>
</head>
<center>
<p>
<form action="<%=request.getContextPath()%>/login" method="post">
<h2>LOGIN PAGE</h2>
<h4><I>Please login for further services</I></h4>
<div class="imgcontainer">
    <img src="img/avt.png" alt="Avatar" class="avatar">
  </div>
Emailid:
<input type="text" name="emailid" placeholder="Enter your emailid" required/>
<br>
<br>
Password:
<input type="password" name="password" placeholder="Enter your password" required/>
<br>
<br>
<input type="submit" name="submit" value="Login"/>
<br>
<br>
<a href="reg.html">Click here to sign up</a>
<br>
<br>
</form>
</p>
</center>
</html>