<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
        <%@ include file="/WEB-INF/views/template/Header.jsp" %>
    
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
    <jsp:useBean id="now" class="java.util.Date" />
    
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="<c:url value="/WEB-INF/resources/bootstrap/css/bootstrap.min.css"/>"/>
    <link rel="stylesheet" href="http://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.6.3/css/font-awesome.min.css">


<title>Order confirmation</title>

<style>



#shopping{
	text-align:center; 
	color:#816263;
	font-family: Papyrus, fantasy;

	font-size:30px;
	
}

#title
{
	
	font-family:cursive;
}

.info
{
	font-family:Comic Sans MS;
	padding-bottom:20px;
	margin-bottom:20px;
}

#total{
	
	font-family:Comic Sans MS;
	text-align:center;
}






</style>



</head>
<body>
<div class="container-wrapper">
    <div class="container">
        <div class="page-header" id="shopping" style="margin-top:90px;">
            

            <strong>Order confirmation</strong>
            
<div class="text-center">
                            <h1>Receipt</h1>
                        </div>            
        </div>

        <div class="container">
                        <form:form commandName="order" class="form-horizaontal">
        

            <div class="row">



                        <div class="row">
                            <div class="col-xs-6 col-sm-6 col-md-6">
                                <address>
                                    <strong>Shipping Address : </strong> ${order.cart.signup.bad.baddress}<br>
                                       
                                    
                                </address>
                            </div>
                            
                            <div class="col-xs-6 col-sm-6 col-md-6 text-right">
                                <p><strong>Shipping Date:</strong> <fmt:formatDate type="date" value="${now}"/> </p>
                            </div>
                        </div>
                        <div class="cart-info col-sm-11" >     
                                 <c:forEach var="item" items="${order.cart.cartitems}" >
                                  <div class="row" id="wrapper">
                                 
 
 <h4 class="pull-left" style="text-decoration:underline;" id="title" >
 
  
 ${item.product.productname} by ${item.product.brand}</h4>
                    
                
                	
                	<div class="info pull-right">
                   <strong> PRICE:</strong> <i class="fa fa-inr"></i> ${item.product.price}<br><br>
                    <strong> QUANTITY : </strong> ${item.quantity}<br><br>
                   
                   <div class="pull-right">
                   <strong> TOTAL : </strong> <i class="fa fa-inr"></i>  ${item.totalprice}</div>
                    </div>
                 </div>   
           </c:forEach>
           
           </div>
           
                </div>
                 <h4 id="total">Grand Total : <i class="fa fa-inr"></i>   ${order.cart.grandtotal} </h4><br><br>
                        <input type="hidden" name="_flowExecutionKey" />
 
                        <br><br>
                        <button class="btn btn-warning" name="_eventId_backTocollectCustomerInfo">Back</button>
                        <input type="submit" value="Submit Order" class="btn btn-success"
                               name="_eventId_orderConfirmed"/>
                        <button class="btn btn-danger" name="_eventId_cancel">Cancel</button>
                   </form:form>
                 
                    </div>

            </div>
        </div>
        
   
   
       
</body>
</html>