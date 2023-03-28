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
	
	
<script>
function acceptAgreement(){
	
	var agreement = document.getElementById('agrrementId');
	console.log(agrement.checked);
	if(agreement.checked){
		document.getElementById('submitId').disabled=false;
	}
	else{
		document.getElementById('submitId').disabled='disabled';
	}
	
}

</script>	
	
	

</head>

<nav class="navbar navbar-light bg-dark">
  <div class="container-fluid">
    <a class="navbar-brand"><img src="https://x-workz.in/static/media/Logo.cf195593dc1b3f921369.png" alt="" width="80" height="48" class="d-inline-block align-text-top"></a>
    
    <form class="d-flex">
    
    <a href = "index.jsp"> Home </a>
    
    </form>
    
  </div>
    
</nav>

<h3> Welcome to Sign up Page </h3>


<c:forEach items = "${error}" var = "e">
<p> <span style ="color:red"> ${e.message}</span></p>
</c:forEach>


<body>

<form action = "unique" method = "post"> 

<pre>

UserId <input type = "text" name = "userId" />

Email <input type = "email" name = "email"/>

Mobile Number <input type = "number" name = "mobileNumber" />

Password <input type = "password" name = "password" />

Confirm Password <input type = "password" name = "confirmPassword" />

Accept Agreement <input type="checkbox" id="agreementId" name="acceptAgreement" onclick="acceptAgreement()">
				
				
							
<input type = "Submit"  id = "submitId" disabled = "true" />

</pre>

</form>

</body>


</html>