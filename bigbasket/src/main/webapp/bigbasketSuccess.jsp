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

</body>

<h1> Big Basket Data Saved Successfully</h1>


<h6>First Name: ${dto.firstName}</h6>
<h6>Last Name: ${dto.lastName}</h6>
<h6>Area: ${dto.area}</h6>
<h6>E-mail: ${dto.email}</h6>
<h6>Contact Number: ${dto.contactNumber}</h6>
<h6>Password: ${dto.password}</h6>
<h6>Item list: ${dto.itemList}</h6>
<h6>Take Away: ${dto.takeAway}</h6>


</html>