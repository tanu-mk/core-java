<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css"
	integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2"
	crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"
	integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
	crossorigin="anonymous"></script>
	
</head>


<body>
<nav class="navbar navbar-light bg-dark">
		<div class="container-fluid">
			<a class="navbar-brand" href="#"> 
			
		</div>
	</nav>
	
	<h1>Welcome To Casino </h1>
	
	<h4> Name: ${name}</h4>
	<h4> Cruise Name: ${cruise}</h4>
	<h4> Entry Fees: ${entryFee}</h4>
	<h4> Free Food: ${freeFood}</h4>
	<h4> Free Alcohol: ${freeAlcohol}</h4>
	
	
	<a href = "casino.jsp"> Casino </a>
	<a href = "index.jsp"> Home </a>
				
</body>
</html>