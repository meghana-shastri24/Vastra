<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
        <%@ include file="template/Header.jsp" %>
    
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<link rel="stylesheet" href="<c:url value="/resources/bootstrap/css/bootstrap.min.css"/>"/>
<style>

.error
{
color:red;
}
  

.errorblock
{
color:red;
}

#wrapper
{
margin-top: 90px;
}

.form-horizontal
{
width:auto;
}
.form
{
max-width:500px;
margin:90px auto 0px;
}
body{
background:#f5f3f3;
}

#signup{
background-color:#816263;
color:white;
}
 

</style>
</head>
<body>


<div class="form-horizontal" id="wrapper">
<div class="form form-group-sm">

<!-- Code for SignUp Form -->

<form:form action="SignUp"  commandName="signupform" method="POST" id="form">
<form:errors path="*" cssClass="errorblock" element="div" />

  <div class="form-group">
    <form:label path="Username" for="username" id="label"> User Name </form:label>
	<form:input path="Username" class="form-control"></form:input>
 </div>
 
 
  <div class="form-group">
    <form:label path="Email" for="email" id="label"> Email Address </form:label>
	<form:input path="Email" class="form-control"></form:input>
  </div>

 
  <div class="form-group">
    <form:label path="Password" for="password" id="label" > Password </form:label>
	<form:password path="Password" class="form-control"></form:password>
 </div>

  <div class="form-group">
  	<form:label path="ConfirmPassword" for="confirmPassword" id="label"> Confirm Password </form:label>
	<form:password path="ConfirmPassword" class="form-control"></form:password>
  </div>


  <div class="form-group">
    <form:label path="phonenumber" for="" id="label"> Phone No : </form:label>
	<form:input path="phonenumber" class="form-control"></form:input>
  </div>
  
  <div class="form-group">
    <form:label path="Address" for="Address" id="label"> Address </form:label>
	<form:textarea rows="4"  path="Address" class="form-control"></form:textarea>
  </div>

<button type="submit" class="btn btn-default" id="signup">Sign Up</button>

</form:form>
</div>
</div>
<script src="<c:url value="/resources/bootstrap/js/jquery-3.1.0.min.js"/>"></script> 
<script src="<c:url value="/resources/bootstrap/js/bootstrap.min.js"/>"></script>
</body>
</html>