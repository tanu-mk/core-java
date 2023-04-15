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

				<a href="SignUp.jsp"> Sign Up </a>
				<a href="SignIn.jsp"> Sign In </a>
						
		</div>

</nav>
	
	<form action="reset" method="post">
	<pre>
	
	Email<input type="email" name="email" id="emailId" onchange="validEmail()"> <span id="emailError" style="color: red"></span><br>
		<span id="display" style="color: red"></span>
		
	<button type="submit">ResetPassword</button>
	</pre>
	
	</form>
	
	<div>
		<span style="color: green;"> ${message} </span>
	</div>
	
	<script>
	
	function validEmail() {
		var userEmail = document.getElementById('emailId');
		var userEmailvalue = userEmail.value;
		console.log(userEmailvalue);
		if (userEmailvalue != null && userEmailvalue != ""
				&& userEmailvalue.length > 4 && userEmailvalue.length < 40) {
			console.log('valid email');
			document.getElementById('emailError').innerHTML = '';
		} else {
			console.log('invalid email');
			document.getElementById('emailError').innerHTML = 'Please enter valid email';
		}

		const xhttp = new XMLHttpRequest();
		console.log('Running in ajax');
		console.log(userEmailvalue);
		xhttp.open("GET", "http://localhost:8080/xworkz-tanu-cm/email/"
				+ userEmailvalue);
		xhttp.send();
		xhttp.onload = function() {
			console.log(this);
			document.getElementById("display").innerHTML = this.responseText
		}
	}

	
	
	
	</script>
	

</body>
</html>