<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
            <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
                <%@ include file="template/Header.jsp" %>
            
    
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<link rel="stylesheet" href="<c:url value="/resources/bootstrap/css/bootstrap.min.css"/>"/>
	<link rel="stylesheet" href="http://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.6.3/css/font-awesome.min.css">
	<link rel="stylesheet" href="/The_Vastra/resources/style/css/viewproduct.css" type="text/css">
<style>
#item-display
{
margin:80px 10px 10px 0px;
height:auto;
width:300px;

}

#item-display:hover
{
    box-shadow: 0 4px 8px 0 rgba(0,0,0,0.2);  


}
	</style>
</head>

<body>

					<!-- Code for View Product -->
<div class="container" >
    <div class="content-wrapper">	
		<div class="item-container">	
			<div class="container">	
				
					<div class="center product col-md-5">
                    
						
							<img id="item-display" src="<c:url value="/resources/images/${p.productid}.jpg"/>" alt=""></img>
						
					</div>
					
					
			<div class="col-md-7" id="description" >
					<div class="product-title">${p.productname} By ${p.brand }</div>
					<hr>
					<div class="product-color">Color : ${p.color}</div>
					<div class="product-price">Price : <i class="fa fa-inr" style="font-size:24px"> ${p.price }</i></div>
					<div class="product-size">Size &nbsp;: ${p.size}</div>
					<c:choose>
						<c:when test="${p.stock!='0'}">
							<div class="product-stock">In Stock : ${p.stock}</div>
						</c:when>
					
					<c:otherwise>
							<div class="product-stock" style="color:red;">Out Of Stock</div>
					
					</c:otherwise>
					</c:choose>
					<hr>
	
 
										
				 <div ng-app = "cartApp" ng-controller="cartCtrl" >
				<c:if test="${pageContext.request.userPrincipal.name != 'meg@mail.com'}">
					
					<div class="btn-group cart">
					<c:if test= "${p.stock!='0' }">
						<a href="#" ng-click="addToCart('${p.productid}')" class="btn btn-success">
							Add to Bag 
						</a>
						</c:if>
					</div>
					</c:if>
					<c:if test="${pageContext.request.userPrincipal.name == 'meg@mail.com'}">
  		<a href="editproduct/${p.productid }">
   		<button type="button" class="btn btn-default">   &nbsp; Edit &nbsp;
		</button>
		</a>
  
  		<a href="deleteproduct/${p.productid }">
  		<button type="button" class="btn btn-default">
Delete  		</button>
  		</a>
  </c:if>
					
					
		</div>
	</div> 
</div>
</div>
</div>
</div>
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js"></script>
<script src="<c:url value="/resources/style/js/controller.js"/>"></script> 
<script src="<c:url value="/resources/bootstrap/js/jquery-3.1.0.min.js"/>"></script> 
<script src="<c:url value="/resources/bootstrap/js/bootstrap.min.js"/>"></script>

</body>
</html>

