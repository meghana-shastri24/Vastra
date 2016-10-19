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
color:white;
}
  

.errorblock
{
color:white;
}
body
  {
  height:1000px;
  background-image: url("<c:url value="/resources/images/bg.jpeg"/>")
  } 
  #wrapper{
  margin-left:345px;
  }
  #form{
  margin-top:75px;
  align:center;
  } 
	#label{
	size:16px;
	color:White;
	padding:1px;
	
	}

</style>
</head>
<body>
<div class="form-horizontal" id="wrapper">

<form:form action="SignUpSuccess"  commandName="signupform" method="POST" id="form">
<form:errors path="*" cssClass="errorblock" element="div" />
<div class="conatiner">


  <div class="form-group form-group-sm">
    <div class="col-xs-6">
  
	<form:label path="Username" for="username" id="label"> User Name </form:label>
	
	<form:input path="Username" class="form-control"></form:input>
 </div>
 </div>
 
  <div class="form-group form-group-sm">
   <div class="col-xs-6">
 
		<form:label path="Password" for="password" id="label" > Password </form:label>
		<form:password path="Password" class="form-control"></form:password>
</div>
</div>

  <div class="form-group form-group-sm">

  <div class="col-xs-6">

		<form:label path="ConfirmPassword" for="confirmPassword" id="label"> Confirm Password </form:label>
		<form:password path="ConfirmPassword" class="form-control"></form:password>
</div>
</div>
  <div class="form-group form-group-sm">
  <div class="col-xs-6">

		<form:label path="Email" for="email" id="label"> Email Address </form:label>
		<form:input path="Email" class="form-control"></form:input>
</div>
</div>

  <div class="form-group form-group-sm">
		  <div class="col-xs-6">
		
		<form:label path="Address" for="Address" id="label"> Address </form:label>
		<form:input path="Address" class="form-control"></form:input>
</div>
</div>
<button type="submit" class="btn btn-primary">SignUp</button>
</div>

</form:form>
</div>

<script src="<c:url value="/resources/bootstrap/js/jquery-3.1.0.min.js"/>"></script> 
<script src="<c:url value="/resources/bootstrap/js/bootstrap.min.js"/>"></script>
</body>
</html>