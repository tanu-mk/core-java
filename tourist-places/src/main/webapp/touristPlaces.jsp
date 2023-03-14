<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>X-workz</title>

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

<h2>Welcome to Tourist Place Data Saving...</h2>


<c:forEach items = "${error}" var = "e">
<p> <span style ="color:red"> ${e.message}</span></p>
</c:forEach>


<body>

<form action = "myWish" method = "post">

<pre>

Destination <input type = "text" name = "destination" value = "${dto.destination}"/>

Kilometers <input type = "number" name = "kilometers" value = "${dto.kilometers}"/>

State <select name = "state">
		<option value = ""> Select </option>
		<c:forEach items = "${state}" var = "s">
		<option value = "${s}" > ${s}</option>
		</c:forEach>
	  </select>

Famous For <input type = "text" name = "famousFor" value = "${dto.famousFor}"/>

Best Time To Visit <select name = "bestTimeToVisit">
				   <option value = ""> Select </option>
		   			<c:forEach items = "${bestTimeToVisit}" var = "b">
		  			 <option value = "${b}" > ${b}</option>
		  		    </c:forEach>
				   </select>


<input type = "Submit" value = "Save" class = "btn btn-primary"/>



</pre>
</form>

</body>

</html>