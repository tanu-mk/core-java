<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>X-workz</title>

<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN"
	crossorigin="anonymous"></script>

</head>


<body>

<nav class="navbar navbar-expand-lg-navbar-Light bg-dark">
		<div class="container-fluid">
			<a class="navbar-brand" href="#"> <img
				src=" https://x-workz.in/static/media/Logo.cf195593dc1b3f921369.png"
				alt="" width="80" height="48" class="d-inline-block align text-top">

				<a href="index.jsp" class="btn btn-warning">Home</a>
				 <a href="SignIn.jsp" class="btn btn-warning">SignIn</a>
				
				<span style="color: white;">Welcome:${userID}</span>
				
				<img src="download?fileName=${dtoPic}" height="50" width="80">
		</div>

	</nav>
	
	
	<table class="table table-dark table-hover">
	
	<tr>
	<th>Technology Name</th>
	<th>Technology Language</th>
	<th>Technology Version</th>
	<th>Technology Owner</th>
	<th>Support From</th>
	<th>Support To</th>
	<th>License</th>
	<th>Open Source</th>
	<th>OS Type</th>	
	</tr>
	
	<c:forEach items="${viewTech}" var="t">
	
	<tr>
	<td>${t.technologyName}</td>
	<td>${t.languange}</td>
	<td>${t.version}</td>
	<td>${t.owner}</td>
	<td>${t.supportFrom}</td>
	<td>${t.supportTo}</td>
	<td>${t.licenseNo}</td>
	<td>${t.openSource}</td>
	<td>${t.osType}</td>
	
	
	
	</c:forEach>
	
	
	
	</table>
	
	
	
	
	

</body>
</html>