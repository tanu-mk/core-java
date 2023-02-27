<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

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



<body>

<form action = "chats" method = "post">

<pre>

Shop Name <input type = "text" name = "shopName"/>

GSTIN <input type = "text" name = "gstin"/>

Chat Name<select name = "chatName">
		<option value = ""> Select </option>
		 <c:forEach items = "${chatNames}" var = "c">
		 <option value = "${c}" > ${c}</option>
		 </c:forEach>	
		 </select>

Type <select name = "type">
	 <option value = ""> Select </option>
		 <c:forEach items = "${types}" var = "t">
		 <option value = "${t}" > ${t}</option>
		 </c:forEach>	
		 </select>
	 </select>

Price <input type = "number" name = "price"/>

<input type = "Submit" value = "Save" class = "btn btn-primary"/>


</pre>

</form>

</body>
</html>