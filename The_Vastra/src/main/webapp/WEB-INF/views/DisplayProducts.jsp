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
</head>
<body>


<div 
xmlns:spring="http://www.springframework.org/tags" 
xmlns:security="http://www.springframework.org/security/tags" 
> 

<!-- Code for Displaying Products -->
	<div ng-app = "cartApp" ng-controller="cartCtrl">	

	<c:forEach items="${prod}" var="p">

<div class="col-sm-6 col-lg-3 col-md-4 ">
<div class="card">
<div class="container-fluid">

<a style="text-decoration:none" href="viewproduct/${p.productid}">
<div>
  <img class="card-img-top image-responsive" src="<c:url value="/resources/images/${p.productid}.jpg"/>" alt="image" style="width:auto; height:375px;" alt="Card image cap">
  <div class="card-block" style="height:50px;margin:0px 0px 0px 10px;">
  <h4  class="card-title">${p.productname} By ${p.brand} </h4></div>
  <div style="height:20px;margin:0px 0px 20px 20px;"><p class="card-text">
    	PRICE: <i class="fa fa-inr" aria-hidden="true"> ${p.price}</i></p></div>
    	<c:choose>
						<c:when test="${p.stock!='0'}">
							<div class="card-text" style="height:20px;margin:-15px 0px 20px 20px; color:green;">In Stock : ${p.stock}</div>
						</c:when>
					
					<c:otherwise>
							<div class="card-text" style="height:20px;margin:-15px 0px 20px 20px;color:red;">Out Of Stock</div>
					
					</c:otherwise>
					</c:choose>
  </div>
  </a>
  
  
  <div style="margin:auto auto 10px 100px;">
  
 </div>
<c:if test="${(pageContext.request.userPrincipal.name != 'meg@mail.com') && (p.stock!='0') }" >

	<div  style="height:30px;margin:0px 0px 20px 80px;">
						<a href="#" ng-click="addToCart('${p.productid }')" class="btn btn-default" id="bag">
							<i class="fa fa-shopping-bag" aria-hidden="true">&nbsp; &nbsp;Add to Bag </i>
						</a>
	</div>
						
</c:if>					

	</div>
  
</div>
</div>
</c:forEach>

</div>
</div>

<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js"></script>
<script src="<c:url value="/resources/style/js/controller.js"/>"></script> 
<script src="<c:url value="/resources/bootstrap/js/jquery-3.1.0.min.js"/>"></script> 
<script src="<c:url value="/resources/bootstrap/js/bootstrap.min.js"/>"></script>


</body>
</html>