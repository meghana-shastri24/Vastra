
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
        <%@ include file="/WEB-INF/views/template/Header.jsp" %>
    
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html">
<html>
<head>
	<link rel="stylesheet" href="<c:url value="/resources/bootstrap/css/bootstrap.min.css"/>"/>
<style>


.form-horizontal
{
width:auto;
}
.form
{
max-width:500px;
margin:30px 30px 0px;
}

#banner
{
margin:20px auto auto auto;
	font-family: Papyrus, fantasy;
	text-align:center; 

}

#label
{
font-family:Comic sens MS;

}
 
#info
{
margin:20px auto auto 30px;
text-decoration:underline;
text-align:left;
font-family:Comic sens MS;
}

#btn
{

width:100px;
margin:10px;
}

</style>
</head>
<body>



<!-- Code for Customer Info -->



<div id="banner" class="jumbotron row">
	
	<h1 style="text-align:center;">Checkout</h1>

</div>


<div class="container">
<form:form commandName="order" class="form-horizaontal">

<section id="checkout" class="page-section row">
	<div id="checkout-progress">
		 
   <h3  id="info">Personal Information :-</h3>



<div class="form-horizontal" id="wrapper">
<div class="form form-group-sm">
        <div class="form-group">
    <form:label path="cart.signup.username" for="username" id="label"> User Name : </form:label>
	<form:input path="cart.signup.username" class="form-control"></form:input>
 </div>
 
 
  <div class="form-group">
    <form:label path="cart.signup.email" for="email" id="label"> Email Address : </form:label>
	<form:input path="cart.signup.email" class="form-control"></form:input>
  </div>

       <div class="form-group">
    <form:label path="cart.signup.phonenumber" for="" id="label"> Phone No : </form:label>
	<form:input path="cart.signup.phonenumber" class="form-control"></form:input>
  </div>
</div>
</div>

   <h3  id="info">Billing Information :-</h3>


		<div class="form-horizontal" id="wrapper">
<div class="form form-group-sm">
		<div class="form-group">
    <form:label path="cart.signup.bad.baddress" for="" id="label"> Shipping Address : </form:label>
	<form:textarea path="cart.signup.bad.baddress"  class="form-control"></form:textarea>
  </div>
		
		
		
	</div>
	</div>
	
	
	 <input type="hidden" name="_flowExecutionKey" />

        <br><br>
        <input id ="btn" type="submit" value="Next" class="btn btn-success pull-right" name="_eventId_customerInfoCollected" />
        <button id ="btn" class="btn btn-danger pull-right" name="_eventId_cancel">Cancel</button>
		</div>
</section>
</form:form>
</div>
</body>
</html>
