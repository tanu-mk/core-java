<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
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

</div>
</nav>

<h1> Displaying Details </h1>

<form action = "login">
<h6> Display email: ${email}</h6>
<input type ="submit" value = "send"/>
</form>

<form action = "chatting">
<h6> Mobile name: ${mobile}</h6>
<input type = "submit" value = "send"/>
</form>

<form action = "number">
<h6>Adhaar Number: ${adhaar}</h6>
<input type = "submit" value = "send">
</form>


<form action = "vayasu">
<h6>Age: ${age}</h6>
<input type = "submit" value = "send"/>
</form>


<form action = "birth">
<h6>DOB: ${dob}</h6>
<input type = "submit" value = "send"/>
</form>

<form action = "salary">
<h6>Desired Salary: ${salary}</h6>
<input type = "submit" value = "send"/>
</form>



<form action = "friends">
<h6>Best Friends Names: </h6>
<input type = "submit" value = "send"/>

<ul>
	<c:forEach items = "${friend}" var="items">
	<li>${items}</li>
	</c:forEach>
</ul>
</form>



<form action = "places">
<h6>Most Visited Places: </h6>
<input type = "submit" value = "send"/>

<ul>
	<c:forEach items = "${places}" var = "items">
	<li>${items}</li>
	</c:forEach>
</ul>

</form>


<form action = "skills">
<h6>List Of Skill Set: </h6>
<input type = "submit" value = "send"/>

<ul>
	<c:forEach items = "${skill}" var = "items">
	<li>${items}</li>
	</c:forEach>
</ul>
</form>



<form action = "education">
<h6>Display Education DTO:  </h6>
<input type = "submit" value = "Education Dto" /></br>
<label>Education Id: ${data.id} </label></br>
<label>School Name: ${data.schoolName} </label></br>
<label>School Location: ${data.schoolLocation} </label></br>
<label>No of Students: ${data.noOfStudents} </label></br>
<label>No of Teachers: ${data.noOfTeachers} </label></br>
<label>No of Classes: ${data.noOfClasses} </label></br>
<label>Syllabus Type: ${data.syllabusType} </label></br>
<label>No of Students: ${data.noOfSubjects} </label></br>
<label>Principal Name: ${data.principalName} </label></br>
<label> School Bus Facility Available: ${data.isSchoolBusFacilityAvailable}</label></br>
</form>


<form action = "family">
<h6>Display Family DTO: </h6>
<input type = "submit" value = "Family DTO"/> </br>
<label>Family id: ${family.id}</label></br>
<label>Family name: ${family.familyName}</label></br>
<label>Family type: ${family.familyType}</label></br>
<label>No of Members: ${family.noOfMembers}</label></br>
<label>No of Childerns: ${family.noOfChilderns}</label></br>
<label>No of People Married: ${family.noOfPeopleMarried}</label></br>
<label>No of Senior Citizen: ${family.noOfSeniorCitizen}</label></br>
<label>Is Pet Animal Available: ${family.isPetAnimalAvailable}</label></br>
<label>No of Teenagers: ${family.noOfTeenagers}</label></br>
<label>No of Vehicles: ${family.noOfVehicles}</label></br>
</form>


<form action = "mobile" method = "post">
<h6>Display Mobile DTO: </h6>
<input type = "submit" value = "Mobile DTO"></br>
<label>Mobile id: ${mobile.id}</label></br>
<label>Brand Name: ${mobile.brandName}</label></br>
<label>Mobile price: ${mobile.price}</label></br>
<label>Mobile color: ${mobile.color}</label></br>
<label>Storage Capacity: ${mobile.storageCapacity}</label></br>
</form>


<form action = "drink">
<h6>Display Beverages DTO: </h6>
<input type = "submit" value = "Beverage DTO"/></br>
<label>Beverage id: ${drink.id}</label></br>
<label>Name: ${drink.name}</label></br>
<label>Price: ${drink.price}</label></br>
<label>Quantity: ${drink.quantity}</label></br>
<label>Bar Code No: ${drink.barCodeNo}</label></br>
<label>Is Preservatives Added: ${drink.isPreservativesAdded}</label></br>
<label>Flavour: ${drink.flavour}</label></br>
<label>Color: ${drink.color}</label></br>
</form>


<form action = "chats" method = "post">
<h6>Display Chat DTO: </h6>
<input type = "submit" value = "Chat DTO"/></br>
<label>Chat id: ${chats.id}</label></br>
<label>Shop Gstin: ${chats.shopGstin}</label></br>
<label>Shop Name: ${chats.shopName}</label></br>
<label>Shop Owner Name: ${chats.shopQwnerName}</label></br>
<label>Shop Location: ${chats.shopLocation}</label></br>
<label>Street No: ${chats.streetNo}</label></br>
<label>Chat Name: ${chats.chatName}</label></br>
<label>Chat Price: ${chats.price}</label></br>
<label>Is Beverages Available: ${chats.isBeveragesAvailable}</label></br>
<label>Is Server Available: ${chats.isServerAvailable}</label></br>
<label>No of Varities: ${chats.noOfVarities}</label></br>
</form>











</body>
</html>