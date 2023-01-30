<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title> X-Workz </title>
</head>
<body>

<h2> Sending Details of Favourite Person</h2>

<form action = "favourite" method ="Post">
<pre>
First Name <input type = "text" name = "Fname"/>
Last Name <input type = "text" name = "Lname"/>
Gender <input type = "radio" name = "gender" value = "Female"/> Female
	   <input type = "radio" name = "gender" value = "Male"/>Male
	   <input type = "radio" name = "gender" value = "Not Disclosed"/>Not Disclosed
	   
Reason<textarea rows = "2" cols = "11" name = "reason"></textarea>
Address<textarea rows = "2" cols = "11" name = "address"></textarea>
</pre>
<input type = "Submit" value = "Send"/>

</form>

</body>
</html>