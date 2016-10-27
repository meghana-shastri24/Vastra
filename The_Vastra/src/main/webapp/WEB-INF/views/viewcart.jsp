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


<h3 id="shopping"><strong> My Shopping Bag</strong></h3>

<div ng-repeat = "item in cart.cartitems">

  <div class="cart-info">       
                   <div>
                   <a href="#" ng-click="removeFromCart(item.cartitemid)" class="pull-right">
                        <span class="glyphicon glyphicon-remove"></span></a>
                   <h4 class="pull-left" style="text-decoration:underline;" id="title"> {{item.product.productname}} by {{item.product.brand}}</strong></h4><br><br><br>
                    
                
                	</div>
                	<div class="info">
                   <strong> PRICE:</strong> <i class="fa fa-inr"></i> {{item.product.price}}<br><br>
                   <strong> QUANTITY : </strong> {{item.quantity}}
                   
                   <div class="pull-right">
                   <strong> TOTAL : </strong> <i class="fa fa-inr"></i>  {{item.totalprice}}</div>
                    </div>
                
                </div>
               </div>
               <div >
                 <h4 id="total">Grand Total : <i class="fa fa-inr"></i>   {{calGrandTotal()}} </h4><br><br>
                    
                   
		<div style="margin-bottom:100px;">
			<a href="<c:url value="/order/${cartid}"/>" class="btn btn-success pull-right">
			Check out
                </a>
            <a href="<c:url value="/allproducts" />" class="btn btn-primary pull-left">Continue Shopping</a>
			
</div>
</div>
</div>
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js"></script>

<script src="<c:url value="/resources/style/js/controller.js"/>"></script> 

</body>
</html>