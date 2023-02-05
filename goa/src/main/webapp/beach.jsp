<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>

</head>


<body>

<nav class="navbar navbar-light bg-dark">
  <div class="container-fluid">
    <a class="navbar-brand"><img src="https://x-workz.in/static/media/Logo.cf195593dc1b3f921369.png" alt="" width="80" height="48" class="d-inline-block align-text-top"></a>
    
    <form class="d-flex">
      <a href = "index.jsp"> Home </a>
    </form>
    
    
  
</div>

  </nav>

</body>


<form action = "beach" method = "post">

<div class="mb-3">
  <label for="exampleFormControlInput1" class="form-label">Name</label>
  <input type="text" class="form-control" name = "name" id="exampleFormControlInput1" placeholder="enter beach name">
</div>



<div class="mb-3">
  <label for="exampleFormControlInput1" class="form-label">Location</label>
  <input type="text" class="form-control" name = "location" id="exampleFormControlInput1" placeholder="enter location">
</div>


		<div class="mb-3">
		<label>Is Beach Clean</label>
		<input type="radio" value="true" name="clean">yes 
		<input type="radio" value="false" name="clean">no
		</div>
		
		
		<div class="mb-3">
		<label>Games Available</label>
		<input type="radio" value="true" name="games">yes 
		<input type="radio" value="false" name="games">no
		</div>
		<div>


<div>
<input type = "Submit" value = "Send" class ="btn btn-dark">
</div>



</form>









</html>