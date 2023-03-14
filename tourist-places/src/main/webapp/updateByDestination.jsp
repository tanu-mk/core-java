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

<nav class="navbar navbar-light bg-dark">
	<div class="container-fluid">
		<a class="navbar-brand"><img
			src="https://x-workz.in/static/media/Logo.cf195593dc1b3f921369.png"
			alt="" width="80" height="48" class="d-inline-block align-text-top"></a>

		<form class="d-flex">

			<a href="touristPlaces"> Tourist </a> <a href="index.jsp"> Home </a>

		</form>

	</div>

</nav>



<h2>TouristPlace Destination Update Page</h2>

<c:forEach items="${errors}" var="e"></c:forEach>
<br>
<span style="color: red;"> ${e.message}</span>


<form action="updateByDestination" method="post">

	<div class="mb-3">
		<label for="formatFile" class="form-label"> Id </label> 
		<input type="text" class="form-control" name="id" readonly 
			value="${dto.id}" />
	</div>

	<div class="mb-3">
		<label for="formatFile" class="form-label"> Destination </label> <input
			type="text" class="form-control" name="destination" readonly
			value="${dto.destination}" />
	</div>

	<div class="mb-3">
		<label for="formatFile" class="form-label"> Kilometers </label> <input
			type="text" class="form-control" name="kilometers" readonly
			value="${dto.kilometers}" />
	</div>

	<div class="mb-3">
		<label for="formatFile" class="form-label"> Famous For </label> <input
			type="text" class="form-control" name="famousFor" readonly
			value="${dto.famousFor}" />
	</div>


	State <select class="form-select" aria-label="Default select example"
		name="state" required="required">
		<option selected value="${dto.state}">${dto.state}</option>
		<c:forEach items="${state}" var="s">
			<option value="${s}">${s}</option>
		</c:forEach>
	</select>
		
	BestTimeToVisit <select class="form-select" aria-label="Default select example"
		name="bestTimeToVisit" required="required">
		<option selected value="${dto.bestTimeToVisit}">${dto.bestTimeToVisit}</option>
		<c:forEach items="${bestTimeToVisit}" var="b">
			<option value="${b}">${b}</option>
		</c:forEach>
	</select> 
	
	<br>
	
 <input type="submit" value="Update" class="btn btn-primary" />


</form>

<body>

</body>
</html>