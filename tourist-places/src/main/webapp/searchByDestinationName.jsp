<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

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

<nav class="navbar navbar-light bg-dark">
	<div class="container-fluid">
		<a class="navbar-brand"><img
			src="https://x-workz.in/static/media/Logo.cf195593dc1b3f921369.png"
			alt="" width="80" height="48" class="d-inline-block align-text-top"></a>

		<form class="d-flex">

			<a href="chats"> Chats </a> <a href="index.jsp"> Home </a>

		</form>

	</div>

</nav>



<h1>Tourist Search</h1>
<h3>
	<span style="color: red">${message}</span>
</h3>

<form action="searchByDestination" method="get">

	Search By Destination<input type="Search" name="destination" /> <input
		type="submit" value="Search" />
</form>



<div>

	<table class="table table-bordered">

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

		<c:forEach items="${lists}" var="t">

			<tr>
				<td>${t.id}</td>
				<td>${t.destination}</td>
				<td>${t.kilometers}</td>
				<td>${t.state}</td>
				<td>${t.famousFor}</td>
				<td>${t.bestTimeToVisit}</td>
				<td><a href="updateByDestination?id=${t.id}"> Edit </a></td>
				<td><a href="delete?id=${t.id}"> Delete </a></td>
			</tr>

		</c:forEach>


	</table>

</div>

<body>

</body>
</html>