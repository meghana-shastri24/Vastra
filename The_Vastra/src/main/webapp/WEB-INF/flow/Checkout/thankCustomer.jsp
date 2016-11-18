<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
                <%@ include file="/WEB-INF/views/template/Header.jsp" %>
                
                
                <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
        <%@ include file="/WEB-INF/views/template/Header.jsp" %>
    
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html">
<html>
<head>
	<link rel="stylesheet" href="<c:url value="/resources/bootstrap/css/bootstrap.min.css"/>"/>
</head>
<body>
<div class="container-wrapper">
    <div class="container">
        <section>
            <div class="jumbotron">
                <div class="container">
                    <h1>Thank you for your business!</h1>

                    <p>Your order will be shipped in two business days!</p>
                </div>
            </div>
        </section>

        <section class="container">
            <p>
                <a href="<spring:url value="/" />" class="btn btn-default">OK</a>
            </p>
        </section>

    </div>
</div>

<script src="<c:url value="/resources/bootstrap/js/jquery-3.1.0.min.js"/>"></script> 
<script src="<c:url value="/resources/bootstrap/js/bootstrap.min.js"/>"></script>
</body>
</html>
