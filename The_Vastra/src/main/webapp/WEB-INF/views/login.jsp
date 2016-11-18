<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>        
    <%@ include file="template/Header.jsp" %>
    
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" href="<c:url value="/resources/bootstrap/css/bootstrap.min.css"/>"/>
	
	  <link rel="stylesheet" href="/The_Vastra/resources/style/css/login.css" type="text/css">
	
  <style>

#container { 
max-width: 450px;
margin-top:90px;
}

form { 
margin: 0px 10px;
}
	
	</style>
</head>

<body>

<c:if test="${not empty msg}">
                <div class="msg" >${msg}</div>
            </c:if>
            
            <!-- Login Form -->
<div class="container" id="container">
		<div class="row">
			<div class="panel " id="wrapper">
				<div class="panel-body">            



	 <form class="form-horizontal" name="loginForm" action="<c:url value="/j_spring_security_check" />" method="post">
                
                <c:if test="${not empty error}">
                    <div class="error" style="color: #ff0000; margin-top:90px;">${error}</div>
                </c:if>
                
  
  
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

 
</form>
</div>
</div>
</div>
</div>
<!-- End of Form -->
<script src="<c:url value="/resources/bootstrap/js/jquery-3.1.0.min.js"/>"></script> 
<script src="<c:url value="/resources/bootstrap/js/bootstrap.min.js"/>"></script>
</body>
</html>