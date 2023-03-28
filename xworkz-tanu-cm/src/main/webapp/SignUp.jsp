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

			<a href="index.jsp"> Home </a>

		</form>

	</div>

</nav>

<h3>Welcome to Sign up Page</h3>


<c:forEach items="${error}" var="e">
	<p>
		<span style="color: red"> ${e.message}</span>
	</p>
</c:forEach>


<body>

	<form  name = "myForm"  action="unique" method="post" onSubmit="return validateform()">

<pre>

UserId <input type="text" name="userId" />

Email <input type="email" name="email" .././>

Mobile Number <input type="number" name="mobileNumber" />
			  <span id = "numloc"></span>

Password <input type="password" name="password" />

Confirm Password <input type="password" name="confirmPassword" />

Accept Agreement <input type="checkbox" id="agreementId"
				name="acceptAgreement" onclick="Agreement()"/>
				
				
							
<input type="Submit" id="submitId" disabled="true" />

</pre>

</form>

<script>
function Agreement() {

			var agreement = document.getElementById('agreementId');
			console.log(agreement.checked);
			if (agreement.checked) {
				document.getElementById('submitId').disabled = false;
			} else {
				document.getElementById('submitId').disabled = 'disabled';
			}

		}
	

function validateform(){
	console.log("calling validateform")
	
	var userId = document.myForm.userId.value;
	var password = document.myForm.password.value;
	
	if(userId == null || userId==""){
		alert("Name can't be blank");
		return false;
	}
	else if(password.length < 6){
		alert("Password must be atleast 6 characters long")
		return false;
	}
	return validateNumber();
}
   return validateEmail();
}


function validateNumber(){
	
	var mobileNumber = document.myForm.mobileNumber.value;
	console.log(mobileNumber);
	
	if(isNaN(mobileNumber) || mobileNumber == null || mobileNumber==""){
		console.log(mobileNumber.checked);
		document.getElementById("numloc").innerHTML = "Enter Numeric value only";
		return false;
	}
	else{
		return true;
	}	
}

function validateEmail(){
	
	var email = document.myForm.email.value;
	var er = email.indexOf("@");
	var dotposition = email.lastindexOf(".");
	
	if(atposition<1 || dotposition<atposition+2 || dotposition+2>=email.length){
		
		alert("Please enter a valid e-mail address\n atposition:"+atposition+"\n dotposition:" + dotposition);
		
		return false;
	}
	
}



</script>
	
	
	

</body>


</html>