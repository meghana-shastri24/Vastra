<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ include file="template/Header.jsp" %>
    
    
<!DOCTYPE html>
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" href="<c:url value="/resources/bootstrap/css/bootstrap.min.css"/>"/>
  
  <link rel="stylesheet" href="/The_Vastra/resources/style/css/index.css" type="text/css">
  
</head>



<body>




<!-- CAROUSEL -->
<div class="container">
  	<div id="myCarousel" class="carousel slide" data-ride="carousel">
  	
 <!-- Indicators -->
  <ol class="carousel-indicators">
    <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
    <li data-target="#myCarousel" data-slide-to="1"></li>
    <li data-target="#myCarousel" data-slide-to="2"></li>
    <li data-target="#myCarousel" data-slide-to="3"></li>
    
  </ol>

<!-- Wrapper for slides -->
  <div class="carousel-inner "  role="listbox">
    <div class="item active">
      <img class="img-responsive"  src="<c:url value="/resources/images/Saree.jpg"/>" alt="Lehanga">
    </div>
    
    <div class="item">
      <img class="img-responsive" src="<c:url value="/resources/images/Gown.jpg"/>" alt="Gown">
    </div>

    <div class="item">
      <img class="img-responsive" src="<c:url value="/resources/images/chudi 1.jpg"/>" alt="Chudi">
    </div>
    
    <div class="item">
      <img class="img-responsive" src="<c:url value="/resources/images/sherwani 3.jpg"/>" alt="Sherwani">
    </div>
    
    
  </div>

 <!-- Left and right controls -->
  <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
    <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
    <span class="sr-only">Previous</span>
  </a>
  <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
    <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
    <span class="sr-only">Next</span>
  </a>
</div>
</div>


<!-- images -->

<div class="container" style="padding-top:30px;">
<div class="row">
    <div class="col-sm-6 col-md-4 col-lg-4">
      
        <img class="img-responsive img-circle bw "  id="image"  src="<c:url value="/resources/images/Lehanga.jpg"/>" alt="Lehanga"  style="width:300px;
 height:300px;
 margin-bottom:100px;">
      
    </div>
    <div class="col-sm-6 col-md-4 col-lg-4">
     
        
        <img class="img-responsive img-circle bw" id="image" src="<c:url value="/resources/images/saree2.jpg"/>" alt="Saree" style="width:300px;
 height:300px;
 margin-bottom:100px;">
     
    </div>
    <div class="col-sm-6 col-md-4 col-lg-4">
      
        <img class="img-responsive img-circle bw" id="image" src="<c:url value="/resources/images/chudi.jpg"/>" alt="ware" style="width:300px;
 height:300px;
 margin-bottom:100px;">
      
    </div>
  </div>
</div>

<script src="<c:url value="/resources/bootstrap/js/jquery-3.1.0.min.js"/>"></script> 
<script src="<c:url value="/resources/bootstrap/js/bootstrap.min.js"/>"></script>

</body>
</html>
        <%@ include file="template/footer.jsp" %>

