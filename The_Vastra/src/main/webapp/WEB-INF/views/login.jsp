<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
        <%@ include file="template/Header.jsp" %>
    
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" href="<c:url value="/resources/bootstrap/css/bootstrap.min.css"/>"/>
  <style>


 
  #form{
  margin-top:75px;
  
  } 
  
  .form
	{
	margin:90px auto 0px;
	position:relative;
	max-width:500px;
	}
	
	</style>
</head>

<body>

<c:if test="${not empty msg}">
                <div class="msg" >${msg}</div>
            </c:if>
            
            <!-- Login Form -->
            
<div class="form-horizontal" id="wrapper">
<div class="form form-group-sm">


	 <form name="loginForm" action="<c:url value="/j_spring_security_check" />" method="post">
                
                <c:if test="${not empty error}">
                    <div class="error" style="color: #ff0000; margin-top:90px;">${error}</div>
                </c:if>
                
  <div class="conatiner">
  
  	<div class="form-group ">
  	<label for="email"> Email Address </label>
	<input name="j_email" class="form-control"></input>
    </div>
 
    <div class="form-group ">
	<label  for="password"> Password </label>
	<input name="j_password" class="form-control" type="password" ></input>
    </div>

  

    <button type="submit" class="btn btn-primary">Login</button>
    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />

 </div>
</form>
</div>
</div>

<!-- End of Form -->
<script src="<c:url value="/resources/bootstrap/js/jquery-3.1.0.min.js"/>"></script> 
<script src="<c:url value="/resources/bootstrap/js/bootstrap.min.js"/>"></script>
</body>
</html>