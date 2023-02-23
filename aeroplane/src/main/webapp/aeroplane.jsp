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
    <a class="navbar-brand"><img src="https://t3.ftcdn.net/jpg/00/98/56/46/360_F_98564657_nwro1XnJs2DgoEtMjPtHX4Ajf7KDJ6lx.jpg" alt="" width="80" height="48" class="d-inline-block align-text-top"></a>
    
    <form class="d-flex">
    
    </form>
    
  </div>
    
</nav>

<body>

<form action="aeroplane" method = "post">

<pre>

Company Name <input type = "text" name = "companyName"/>

Plane Name <input type = "text" name = "planeName"/>

Cost <input type = "number" name = "cost"/>

Type <select name = "type"/>
	  <option value = "">Select</option>
	  <c:forEach items = "${type}" var = "t">
	  <option value = "${t}"> ${t}</option>
	  </c:forEach>
</select>

Country <select name = "country"/>
		<option value = "">Select</option>
		<c:forEach items = "${country}" var = "c">
		<option value = "${c}"> ${c}</option>
		</c:forEach>
</select>

<input type = "submit" value = "save" class = "btn btn-primary" />


</pre>

</form>

</body>
</html>