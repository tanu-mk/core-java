<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>X-workz</title>

<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">

<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
	crossorigin="anonymous"></script>

</head>
<body>

	<nav class="navbar navbar-light bg-dark">
		<div class="container-fluid">
			<a class="navbar-brand"><img
				src="https://x-workz.in/static/media/Logo.cf195593dc1b3f921369.png"
				alt="" width="80" height="48" class="d-inline-block align-text-top"></a>
				
				<a href="index.jsp"> Home </a>

		</div>

	</nav>
	
	
	<h1> Display List </h1>
	
	<h3><span style = "color : red;"> ${message} </span></h3>
	
	
	<form action = "findByTwoProperties" method = "get">
	Search by Destination<input type = "search" name = "destination"/>
	Search by State<input type = "search" name = "state"/>
	<input type = "submit" value = "search">
	</form>
	
	
	
	
	<div>
		<table class = "table">
			<thead>
				<tr>
					<th>Id</th>
					<th>Destination</th>
					<th>Kilometers</th>
					<th>State</th>
					<th>Famous For</th>
					<th>Best Time To Visit</th>
					<th>Edit</th>
					<th>Delete</th>
				</tr>
				
			</thead>		
		
		<tbody>
		<c:forEach items="${arrayList}" var="k">

			<tr>
				<td>${k.id}</td>
				<td>${k.destination}</td>
				<td>${k.kilometers}</td>
				<td>${k.state}</td>
				<td>${k.famousFor}</td>
				<td>${k.bestTimeToVisit}</td>
				<td><a href="updateByDestination?id=${k.id}"> Edit </a></td>
				<td><a href="delete?id=${k.id}"> Delete </a></td>
			</tr>

		</c:forEach>
		
		</tbody>
		
	</table>
	
	
	</div>	
</html>