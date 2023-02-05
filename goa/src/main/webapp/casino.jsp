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


<form action = "casino" method = "post">

<div class="mb-3">
  <label for="exampleFormControlInput1" class="form-label">Name</label>
  <input type="text" class="form-control" name = "name" id="exampleFormControlInput1" placeholder="enter casino name">
</div>



<div class="mb-3">
  <label for="exampleFormControlInput1" class="form-label">Cruise</label>
  <input type="text" class="form-control" name = "cruise" id="exampleFormControlInput1" placeholder="enter cruise name">
</div>


<div class="mb-3">
  <label for="exampleFormControlInput1" class="form-label">Entry Fees</label>
  <input type="text" class="form-control" name = "entryFee" id="exampleFormControlInput1" placeholder="enter cruise name">
</div>


		<div class="mb-3">
		<label>freeFood</label>
		<input type="radio" value="true" name="freeFood">yes 
		<input type="radio" value="false" name="freeFood">no
		</div>
		
		
		<div class="mb-3">
		<label>freeAlcohol</label>
		<input type="radio" value="true" name="freeAlcohol">yes 
		<input type="radio" value="false" name="freeAlcohol">no
		</div>
		
		


<div>
<input type = "Submit" value = "Send" class ="btn btn-dark">
</div>



</form>











</html>