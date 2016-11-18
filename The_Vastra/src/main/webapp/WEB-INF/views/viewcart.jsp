<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
            <%@ include file="template/Header.jsp" %>
    
    
    
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="<c:url value="/resources/bootstrap/css/bootstrap.min.css"/>"/>
    <link rel="stylesheet" href="/The_Vastra/resources/style/css/viewcart.css" type="text/css">
        <link rel="stylesheet" href="http://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.6.3/css/font-awesome.min.css">
    



</head>
<body>


<div class="container" style="margin-top:90px;">

<div ng-app= "cartApp" ng-controller = "cartCtrl" ng-init= "initCartId('${cartid}')">

<div>
<h3 id="shopping"><strong> My Shopping Bag</strong></h3>
<a class="btn btn-danger pull-right" id="clearcart" href="#" ng-click="clearCart('${cartid }')">Clear Cart</a><br><br><br>
</div>
<div ng-repeat = "item in cart.cartitems">
<div class="row" id="wrapper">

<a href="#" ng-click="removeFromCart(item.cartitemid)" class="pull-right">
                        <span class="glyphicon glyphicon-remove"></span></a>

<div class="cart-info col-sm-4">

<img id="item-display" src="<c:url value="/resources/images/{{item.product.productid}}.jpg"/>" alt=""></img>

</div>
  <div class="cart-info col-sm-7">     
 
 <h4 class="pull-left" style="text-decoration:underline;" id="title"> {{item.product.productname}} by {{item.product.brand}}</h4><br><br><br>
                    
                
                	
                	<div class="info">
                   <strong> PRICE:</strong> <i class="fa fa-inr"></i> {{item.product.price}}<br><br>
                  <strong> COLOR : </strong> {{item.product.color}}<br><br>
                    <strong> QUANTITY : </strong> {{item.quantity}}
                   
                   <div class="pull-right">
                   <strong> TOTAL : </strong> <i class="fa fa-inr"></i>  {{item.totalprice}}</div>
                    </div>
           </div>
           
                </div>
               </div>
               <div >
                 <h4 id="total">Grand Total : <i class="fa fa-inr"></i>   {{calGrandTotal()}} </h4><br><br>
                    
                   
		<div style="margin-bottom:100px; font-family:Comic Sans MS;" >
			<a href="<c:url value="/order/${cartid}"/>" class="btn btn-success pull-right">
			Check out
                </a>
            <a href="<c:url value="/allproducts" />" class="btn btn-primary pull-left">Continue Shopping</a>
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