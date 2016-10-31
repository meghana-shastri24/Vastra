<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
                <%@ include file="template/Header.jsp" %>
        
    
<!DOCTYPE html>
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="<c:url value="/resources/bootstrap/css/bootstrap.min.css"/>"/>
<link rel="stylesheet" href="/The_Vastra/resources/style/css/AddProducts.css" type="text/css">
</head>

<body>

<div class="form-horizontal" id="wrapper">
  <div class="form form-group-sm">

			<!-- Form for Add Products -->

<form:form action="AddProducts" commandName="addproduct" method="POST" id="form" enctype="multipart/form-data">


  <div class="form-group">
	<form:label path="productname" for="productname" id="label"  > Product Name :  </form:label>
	<form:input path="productname" class="form-control" ></form:input>
 </div>
  
 <div class="form-group">
  
	<form:label path="brand" for="brand" id="label"  > Brand :  </form:label>
	<form:input path="brand" class="form-control" ></form:input>
 </div>
 
 
 <div class="form-group">
<form:label path="category" for="category" id="label"> Category : </form:label><br>
	
	<form:radiobutton path="category" value="men collection"></form:radiobutton>

<form:label path="category" for="category" id="label"> Men Collection </form:label> &nbsp; &nbsp; &nbsp;
	
	<form:radiobutton path="category" value="women collection"></form:radiobutton>

<form:label path="category" for="category" id="label"> Women Collection </form:label>
</div>
		
 <div class="form-group">
  <form:label path="color" for="color" id="label"  > Color :  </form:label>
  <form:input path="color" class="form-control" ></form:input>
 </div>

 
 <div class="form-group">
   <form:label path="size" for="size" id="label"  > Size :  </form:label>
   <form:input path="size" class="form-control" ></form:input>
 </div>

 <div class="form-group">
    <form:label path="stock" for="stock" id="label">In Stock : </form:label>
	<form:input path="stock" class="form-control"></form:input>
</div>

 <div class="form-group">
    <form:label path="price" for="price" id="label"> Price </form:label>
	<form:input path="price" class="form-control"></form:input>
</div>
 
 <div class="form-group">
  <form:input path="profilePicture" type="file" class="form-control"></form:input>
</div>


  <button type="submit" class="btn btn-success" >Add Product</button>


</form:form>
<!-- End of Form -->

</div>
</div>

<script src="<c:url value="/resources/bootstrap/js/bootstrap.min.js"/>"></script>

</body>

</html>

