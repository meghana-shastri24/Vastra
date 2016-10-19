<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
            <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<link rel="stylesheet" href="<c:url value="/resources/bootstrap/css/bootstrap.min.css"/>"/>
  
<title>Insert title here</title>
</head>
<body>



<div class="col-sm-8">
<div class="form-horizontal" id="wrapper">
<form:form action="editproduct/${product.productid }" method="post" commandName="product" id="form" enctype="multipart/form-data">
<div class="conatiner">

  <div class="form-group form-group-sm">
  <div class="col-xs-6">
	<form:label path="productname" for="productname" id="label"  > Product Name :  </form:label>
	<form:input path="productname" class="form-control" ></form:input>
 </div>
 </div>
 
 <div class="form-group form-group-sm">
  <div class="col-xs-6">
	<form:label path="brand" for="brand" id="label"  > Brand :  </form:label>
	<form:input path="brand" class="form-control" ></form:input>
 </div>
 </div>
 
 <form:label path="category" for="category" id="label"> Category : </form:label><br>
		<form:radiobutton path="category" value="men collection"></form:radiobutton>
				<form:label path="category" for="category" id="label"> Men Collection </form:label> &nbsp; &nbsp; &nbsp;
		
				<form:radiobutton path="category" value="women collection"></form:radiobutton>
						<form:label path="category" for="category" id="label"> Women Collection </form:label>
		
 <div class="form-group form-group-sm">
  <div class="col-xs-6">
	<form:label path="color" for="color" id="label"  > Color :  </form:label>
	<form:input path="color" class="form-control" ></form:input>
 </div>
 </div>
 
 <div class="form-group form-group-sm">
  <div class="col-xs-6">
	<form:label path="size" for="size" id="label"  > Size :  </form:label>
	<form:input path="size" class="form-control" ></form:input>
 </div>
 </div>

<div class="form-group form-group-sm">
 <div class="col-xs-6">
		<form:label path="stock" for="stock" id="label">In Stock : </form:label>
		<form:input path="stock" class="form-control"></form:input>
</div>
</div>

<div class="form-group form-group-sm">
 <div class="col-xs-6">
		<form:label path="price" for="price" id="label"> Price </form:label>
		<form:input path="price" class="form-control"></form:input>
</div>
</div>

<div class="form-group form-group-sm">
 <div class="col-xs-6">
		
		<form:input path="profilePicture" type="file" class="form-control"></form:input>
</div>
</div>





</div>

<img src="<c:url value="/resources/images/${product.productid}.jpg"/>" alt="image" style="width:90px; height:120px;"/>
<button type="submit" class="btn btn-Warning" >Add Product</button>


</form:form>
</div>
</div>

<script src="<c:url value="/resources/bootstrap/js/jquery-3.1.0.min.js"/>"></script> 
<script src="<c:url value="/resources/bootstrap/js/bootstrap.min.js"/>"></script>
</body>
</html>