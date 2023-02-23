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

<nav class="navbar navbar-light bg-dark">
  <div class="container-fluid">
    <a class="navbar-brand"><img src="https://t3.ftcdn.net/jpg/00/98/56/46/360_F_98564657_nwro1XnJs2DgoEtMjPtHX4Ajf7KDJ6lx.jpg" alt="" width="80" height="48" class="d-inline-block align-text-top"></a>
    
    <form class="d-flex">
    
    </form>
    
  </div>
    
</nav>


<h1>Valentine Search</h1>
<h3><span style = "color:red">${message}</span></h3>

<form action="search" method = "get">

Search By Id<input type = "text" name = "id"/>
<input type = "submit" value = "Search"/>
</form>

<div>
<h3>Search Results: </h3>
companyName: ${dto.companyName}</br>
planeName: ${dto.planeName}</br>
cost: ${dto.cost}</br>
type: ${dto.type}</br>
country: ${dto.country}</br>
</div>

<body>

<form action = "search" method = "post">

</form>

</body>
</html>