<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<title>Airlines Booking-Phoenix Air</title><head>
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
  background-image: url("img/flight1.jpg");
  background-repeat: no-repeat;
  background-size: 1500px 750px;
}
</style>
</head>
<div class="container">
<div class="row">

<div class="col-lg-6">
<br><br><br><br><br><br>
<center>
<form id="form1" action="<%=request.getContextPath()%>/flight" method="post">
<h4>Choose A Flight</h4>
<br>
Flight Name:
<select name="flightname" id="ddl1" required>
  <option value="">-- select one --</option>
<option value="Phoenix AirBus 319 Single">Phoenix AirBus 319 Single</option>
<option value="Phoenix AirBus 319 Mixed">Phoenix AirBus 319 Mixed</option>
<option value="Boeing 777-200LR">Boeing 777-200LR</option>
<option value="B737-800">B737-800</option><br>
</select>
<br>
<br>
Booking Date:
<input type="text" name="flightdate" placeholder="format DD-MON-YYYY" required/>
<br>
<br>
From:
<select name="flightfrom" required>
  <option value="">-- select one --</option>
<option value="Port Blair,Andaman and Nicobar Islands">Port Blair,Andaman and Nicobar Islands</option>
<option value="Visakhapatnam,Andhra Pradesh">Visakhapatnam,Andhra Pradesh</option>
<option value="Hyderabad,Telangana">Hyderabad,Telangana</option>
<option value="Guwahati,Assam">Guwahati,Assam</option>
<option value="New Delhi,Delhi">New Delhi,Delhi</option>
<option value="Dabolim,(Village)he	Goa">Dabolim,(Village)he	Goa</option>
<option value="Ahmedabad,Gujarat">Ahmedabad,Gujarat</option>
<option value="Bengaluru,Karnataka">Bengaluru,Karnataka</option>
<option value="Mangalore,Karnataka">Mangalore,Karnataka</option>
<option value="Kochi,Kerala">Kochi,Kerala</option>
<option value="Kozhikode,Kerala">Kozhikode,Kerala</option>
<option value="Thiruvananthapuram,Kerala">Thiruvananthapuram,Kerala</option>
<option value="Mumbai,Maharashtra">Mumbai,Maharashtra</option>
<option value="Nagpur,Maharashtra">Nagpur,Maharashtra</option>
<option value="Imphal,Manipur">Imphal,Manipur</option>
<option value="Bhubaneswar,Odisha">Bhubaneswar,Odisha</option>
<option value="Amritsar,Punjab">Amritsar,Punjab</option>
<option value="Jaipur,Rajasthan">Jaipur,Rajasthan</option>
<option value="Chennai,Tamil Nadu">Chennai,Tamil Nadu</option>
<option value="Coimbatore,Tamil Nadu">Coimbatore,Tamil Nadu</option>
<option value="Tiruchirapalli,Tamil Nadu">Tiruchirapalli,Tamil Nadu</option>
<option value="Lucknow,Uttar Pradesh">Lucknow,Uttar Pradesh</option>
<option value="Varanasi,Uttar Pradesh">Varanasi,Uttar Pradesh</option>
<option value="Kolkata,West Bengal">Kolkata,West Bengal</option>
<option value="Gaya,Bihar">Gaya,Bihar</option>
<option value="Surat,Gujarat">Surat,Gujarat</option>
<option value="Vadodara,Gujarat">Vadodara,Gujarat</option>
<option value="Srinagar,Jammu and Kashmir">Srinagar,Jammu and Kashmir</option>
<option value="Kannur,Kerala">Kannur,Kerala</option>
<option value="Pune,Maharashtra">Pune,Maharashtra</option>
<option value="Ranchi,Jharkhand">Ranchi,Jharkhand</option>
<option value="Siliguri,West Bengal">Siliguri,West Bengal</option>
</select>
<br>
<br>
To:
<select name="flightto" required>
  <option value="">-- select one --</option>
  <option value="Port Blair,Andaman and Nicobar Islands">Port Blair,Andaman and Nicobar Islands</option>
<option value="Visakhapatnam,Andhra Pradesh">Visakhapatnam,Andhra Pradesh</option>
<option value="Hyderabad,Telangana">Hyderabad,Telangana</option>
<option value="Guwahati,Assam">Guwahati,Assam</option>
<option value="New Delhi,Delhi">New Delhi,Delhi</option>
<option value="Dabolim,(Village)he	Goa">Dabolim,(Village)he	Goa</option>
<option value="Ahmedabad,Gujarat">Ahmedabad,Gujarat</option>
<option value="Bengaluru,Karnataka">Bengaluru,Karnataka</option>
<option value="Mangalore,Karnataka">Mangalore,Karnataka</option>
<option value="Kochi,Kerala">Kochi,Kerala</option>
<option value="Kozhikode,Kerala">Kozhikode,Kerala</option>
<option value="Thiruvananthapuram,Kerala">Thiruvananthapuram,Kerala</option>
<option value="Mumbai,Maharashtra">Mumbai,Maharashtra</option>
<option value="Nagpur,Maharashtra">Nagpur,Maharashtra</option>
<option value="Imphal,Manipur">Imphal,Manipur</option>
<option value="Bhubaneswar,Odisha">Bhubaneswar,Odisha</option>
<option value="Amritsar,Punjab">Amritsar,Punjab</option>
<option value="Jaipur,Rajasthan">Jaipur,Rajasthan</option>
<option value="Chennai,Tamil Nadu">Chennai,Tamil Nadu</option>
<option value="Coimbatore,Tamil Nadu">Coimbatore,Tamil Nadu</option>
<option value="Tiruchirapalli,Tamil Nadu">Tiruchirapalli,Tamil Nadu</option>
<option value="Lucknow,Uttar Pradesh">Lucknow,Uttar Pradesh</option>
<option value="Varanasi,Uttar Pradesh">Varanasi,Uttar Pradesh</option>
<option value="Kolkata,West Bengal">Kolkata,West Bengal</option>
<option value="Gaya,Bihar">Gaya,Bihar</option>
<option value="Surat,Gujarat">Surat,Gujarat</option>
<option value="Vadodara,Gujarat">Vadodara,Gujarat</option>
<option value="Srinagar,Jammu and Kashmir">Srinagar,Jammu and Kashmir</option>
<option value="Kannur,Kerala">Kannur,Kerala</option>
<option value="Pune,Maharashtra">Pune,Maharashtra</option>
<option value="Ranchi,Jharkhand">Ranchi,Jharkhand</option>
<option value="Siliguri,West Bengal">Siliguri,West Bengal</option>

</select>
<br>
<br>
Time:
<select name="flighttime" required>
  <option value="">-- select one --</option>
  <option value="00:00">00:00</option>
  <option value="2:00">2:00</option>
  <option value="4:00">4:00</option>
    <option value="6:00">6:00</option>
    <option value="8:00">8:00</option>
    <option value="10:00">10:00</option>
   <option value="12:00">12:00</option>
  <option value="14:00">14:00</option>
  <option value="16:00">16:00</option>
  <option value="18:00">18:00</option>
  <option value="20:00">20:00</option>
  <option value="22:00">22:00</option>
</select>
<br>
<br>
<input type="submit" name="submit" value="Submit"/>
<input type="reset" name="reset" value="Reset"/>

<br>
<br>
</form>
</center>
</div>
<div class="col=lg-5">

<br><br><br>
<br><br><br>

</p>
</div>
</html>