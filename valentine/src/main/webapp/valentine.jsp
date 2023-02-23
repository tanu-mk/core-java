<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>			 
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title> X-workz </title>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>

</head>

<nav class="navbar navbar-light bg-dark">
  <div class="container-fluid">
    <a class="navbar-brand"><img src="https://x-workz.in/static/media/Logo.cf195593dc1b3f921369.png" alt="" width="80" height="48" class="d-inline-block align-text-top"></a>
    
    <form class="d-flex">
    
    <a href = "index.jsp"> Home </a>
    
    </form>
    
  </div>
    
</nav>

<h2>Welcome to Valentine Data Saving...</h2>


<c:forEach items = "${error}" var = "e">
<p> <span style ="color:red"> ${e.message}</span></p>
</c:forEach>

<body>

<form action = "valentine" method = "post">

<pre>

Name <input type = "text" name = "name" value = "${dto.name}"/>

Valentine Name <input type = "text" name = "valentineName" value = "${dto.valentineName}"/>

Place Name <select name = "place">
		   <option value = ""> Select </option>
		   <c:forEach items = "${place}" var = "p">
		   <option value = "${p}" > ${p}</option>
		   </c:forEach>
		   </select>

Gift <select name = "gift">
	 <option value = "">Select</option>
	 <c:forEach items = "${gift}" var = "g">
	 <option value= "${g}"> ${g} </option>
	 </c:forEach>
	</select>
	
	
<input type = "submit" value = "Save" class = "btn btn-primary"/>


</pre>
</form>

</body>

</html>