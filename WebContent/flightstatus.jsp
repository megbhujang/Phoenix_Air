<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
  <style>
  	body{
		margin: 0;
		padding: 40 px;
		background color: slateblue;
		background-size: cover;
		background-image:url("12.jpg");
		background-position: center;
		font-family: sans-serif,Arial;
	}
	
	h2{
			
			color: white;
		}

table {
  font-family: arial, sans-serif;
  border-collapse: collapse;
  width: 1
  color: white;
}

td, th {
  border: 1px solid #ffffff;
  text-align: left;
  padding: 10px;
}



tr:nth-child(even) {
  background-color: #ffffff;
}

tr:nth-child(odd) {
  background-color: #ffffff;
}

input{
			border-radius: 10px;
			width: 250px;
			height: 35px;
			text-indent: 5px;
			text-color: white;
			background-color: #ffffff;
		}

		input:focus{
			outline: none;
		}
		
		
		
		
.topnav {
  overflow: hidden;
  background-color: #cc33ff;
}

.topnav a {
  float: left;
  color: #f2f2f2;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
  font-size: 17px;
}

.topnav a:hover {
  background-color: #ddd;
  color: black;
}

.topnav a.active {
  background-color: #cc33ff;
  color: white;
}
</style>
</head>
<body>
<h2><center>FLIGHT AVAILABILITY STATUS</center></h2>
<div class="topnav">
  <a href="demo.html">Go back Home</a>
</div>

<div style="padding-left:16px">
</div>
    
	<form action="<%=request.getContextPath() %>/checkstatus" method="post">
	<br>
	<br>
	<br>
  Enter Date:
  <input type="text" name="flightdate">
  <br>
  <br>
  <br>
<input type="submit" name="Get status" value="Get status" >
  </form>

<h2>Flight STATUS</h2>

<table>
<thead>
  <tr>
    <th>Flightname</th>
    <th>From</th>
    <th>To</th>
     <th>Time</th>
  </tr>
  </thead>
  <c:forEach var="status" items="${listFlights}">
                <tr>
                    <td><c:out value="${status.flightname}" /></td>
                    <td><c:out value="${status.flightfrom}" /></td>
                    <td><c:out value="${status.flightto}" /></td>
                    <td><c:out value="${status.flighttime}" /></td>
                    
                </tr>
            </c:forEach>
       </table>

</body>
</html>