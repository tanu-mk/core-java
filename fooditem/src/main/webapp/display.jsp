<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>X-workz</title>

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
    
    
<h1> Page to send Food item </h1>

<form action = "clear" method = "post">

<div class="mb-3">
  <label for="exampleFormControlInput1" class="form-label">Name</label>
  <input type="text" class="form-control" name = "name" id="exampleFormControlInput1" placeholder="enter candidate name">
</div>

    
<div class="mb-3">
  <label for="exampleFormControlInput1" class="form-label">Email</label>
  <input type="email" class="form-control" name = "email" id="exampleFormControlInput1" placeholder="enter email">
</div>


<div class="mb-3">
  <label for="exampleFormControlInput1" class="form-label">Contact Number</label>
  <input type="number" class="form-control" name = "number" id="exampleFormControlInput1" placeholder="enter contact number">
</div>


<div>
<select class="form-select" aria-label="Default select example" name = "stream">
  <option selected>Open this select menu</option>
  <option value="CSE">CSE</option>
  <option value="Mech">Mech</option>
  <option value="ECE">ECE</option>
  <option value="EEE">EEE</option>
  <option value="ISE">ISE</option>
</select>
</div>

<input type = "Submit" value = "send">




</body>
</html>