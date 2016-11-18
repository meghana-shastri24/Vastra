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


  

form { 
margin: 0px 10px; }

h2 {
  margin-top: 2px;
  margin-bottom: 2px;
}

#container { 
max-width: 450px;
margin-top:90px; }

.account
{
	font-family:Comic Sans MS;
}
#msg
{
color:red;
font-style:italic, bold;
font-family:cursive;

}

 

</style>
</head>
<body>


    <div class="container" id="container">
		<div class="row">
			<div class="panel panel-danger " id="wrapper">
				<div class="panel-body">
	<form:form class="form-horizontal" action="SignUpSuccess" method="post" commandName="signupform">
						<div class="form-group">
							<h1 style="	font-family:cursive;">Create account</h1>
						</div>
						<div class="form-group">
							<form:label path="username" for="username">User name :</form:label>
							<form:input path="username" type="text" maxlength="50" required="true" class="form-control"></form:input>
						</div>
						<div class="form-group">
							<form:label path="email" for="email">Email Address :</form:label>
							<form:input path="email" type="text" pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,3}$" required="true"
			title="Please enter a valid email" class="form-control"></form:input>
			<p id="msg">${msg }</p>
						</div>
						<div class="form-group">
							<form:label path="password" for="password">Password :</form:label>
							<form:input path="password" type="text" pattern=".{6,}" required="true"
			title="Password should be more than 6 characters" class="form-control"></form:input>
						</div>
						<div class="form-group">
							<form:label path="confirmPassword" for="confirmPassword">Confirm Password :</form:label>
							<form:input path="confirmPassword" type="text" required="true" class="form-control"></form:input>
						</div>
						
						<div class="form-group">
							<form:label path="phonenumber" for="phonenumber">Phone Number :</form:label>
							<form:input path="phonenumber" type="text" pattern="^\d{10}$" required="true"
			title="Please enter a valid phone number" class="form-control"></form:input>
						</div>
						
						<div class="form-group">
							<form:label path="address" for="address">Address :</form:label>
							<form:textarea  row="4" path="address" type="text" required="true" class="form-control"></form:textarea>
						</div>
						
						
						<div class="form-group">
							<button id="signupSubmit" type="submit" class="btn btn-info btn-block">Create your account</button>
						</div>
						<p class="form-group">By creating an account, you agree to our Terms of Use and our Privacy Policy</a>.</p>
						<hr>
						<p>Already have an account? <a href="/The_Vastra/login">Sign in</a></p>
					</form:form>
				</div>
			</div>
			</div>
			</div>
<script src="<c:url value="/resources/bootstrap/js/jquery-3.1.0.min.js"/>"></script> 
<script src="<c:url value="/resources/bootstrap/js/bootstrap.min.js"/>"></script>
</body>
</html>