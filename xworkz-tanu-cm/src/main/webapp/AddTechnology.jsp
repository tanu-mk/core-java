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

<form action="technology" method="post">

User Id<input value="${dto.userId}" readonly="readonly" name="userId"/>

<table>

<tr>
<td>Technology Name</td>
<td><input type="text" name="technologyName" value="${entity.technologyName}"/></td>
<tr>

<tr>
<td>Technology Language</td>
<td><input type="text" name="language" value="${entity.languange}"/></td>
<tr>

<tr>
<td>Technology Version</td>
<td><input type="text" name="version" value="${entity.version}"/></td>
<tr>

<tr>
<td>Technology Owner</td>
<td><input type="text" name="owner" value="${entity.owner}"/></td>
<tr>

<tr>
<td>Support From</td>
<td><input type="text" name="supportFrom" value="${entity.supportFrom}"/></td>
<tr>

<tr>
<td>Support To</td>
<td><input type="text" name="supportTo" value="${entity.supportTo}"/></td>
<tr>

<tr>
<td>License No</td>
<td><input type="text" name="licenseNo" value="${entity.licenseNo}"/></td>
<tr>

<tr>
<td>Open Source</td>
<td><input type="text" name="openSource" value="${entity.openSource}"/></td>
<tr>

<tr>
<td>OS Type</td>
<td><input type="text" name="osType" value="${entity.osType}"/></td>
<tr>

</table>

<br>

<button type="submit">Add</button>

</pre>


</form>


</body>
</html>