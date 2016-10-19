<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ include file="template/Header.jsp" %>   
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<link rel="stylesheet" href="<c:url value="/resources/bootstrap/css/bootstrap.min.css"/>"/>
  <link rel="stylesheet" href="/The_Vastra/resources/style/css/DispalyProducts.css" type="text/css">
  
  <link rel="stylesheet" href="http://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.6.3/css/font-awesome.min.css">
  
 
  
  
  
  <style>
 
  
  </style>
</head>
<body>
<div 
xmlns:spring="http://www.springframework.org/tags" 
xmlns:security="http://www.springframework.org/security/tags" 
> 


<c:forEach items="${prod}" var="p">

<div class="col-sm-6 col-lg-3 col-md-4 ">
<div class="card">
<div class="container-fluid">

<a style="text-decoration:none" href="viewproduct/${p.productid}">
<div>
  <img class="card-img-top" src="<c:url value="/resources/images/${p.productid}.jpg"/>" alt="image" style="width:100%; height:400px;" alt="Card image cap">
  <div class="card-block" style="height:75px;margin:0px 0px 0px 10px;">
    <h4  class="card-title">${p.productname} By ${p.brand} </h4></div>
    <div style="height:25px;margin:0px 0px 20px 20px !important;"><p class="card-text">${p.price}</p></div>
   </div>
   	
	</a>
	
	<div class="btn-group cart">
						<button type="button" class="btn btn-success">
							Add to cart 
						</button>
					</div>
					<div class="btn-group buy">
						<button type="button" class="btn btn-danger">
							Order Now
						</button>
					</div>

	<c:if test="${pageContext.request.userPrincipal.name != null}">
    	  <security:authorize ifAnyGranted="ROLE_ADMIN">
  <a href="editproduct/${p.productid }">
  <span class="glyphicon glyphicon-pencil"></span>
  </a>
  
  <a href="deleteproduct/${p.productid }">
  <span class="glyphicon glyphicon-remove"></span>
  </a>
  </security:authorize>
  </c:if>
  
</div>
</div></div>

</c:forEach>
</div>

</div>


<script src="<c:url value="/resources/bootstrap/js/jquery-3.1.0.min.js"/>"></script> 
<script src="<c:url value="/resources/bootstrap/js/bootstrap.min.js"/>"></script>

</body>
</html>