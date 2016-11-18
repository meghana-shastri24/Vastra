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
<div class="container-fluid" style="height:1px;">
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
      <img class="img-responsive"  src="<c:url value="/resources/images/website-banners-26.jpg"/>" alt="Lehanga">
    </div>
    
    <div class="item">
      <img class="img-responsive" src="<c:url value="/resources/images/banner-05.jpg"/>" alt="Gown">
    </div>

    <div class="item">
      <img class="img-responsive" src="<c:url value="/resources/images/banner (1).jpg"/>" alt="Chudi">
    </div>
    
    <div class="item">
      <img class="img-responsive" src="<c:url value="/resources/images/londonbeauty-shop-banner.jpg"/>" alt="Sherwani">
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



<!-- Parallax image scrolling 1 -->
	<div class="parallax image1" style="">
	
	</div>
<!-- End -->	
	
	
	
	<!-- Featured Products -->
	
	<div class="container-fluid" id="feature" >
		
		<h2 class="text-center" id="fp"> <b>FEATURED PRODUCTS</b></h2>
		
		<div class="row">
		<div class="col-sm-3 col-xs-6">
            <img class="img-responsive i1" src="<c:url value="/resources/images/Hurley-Wilson-Short-Sleeve-Button-Up_5-387x380.png"/>">
			
		</div>
		<div class="col-sm-3 col-xs-6">
            <img class="img-responsive i2" src="<c:url value="/resources/images/Levis-Darox-Short-Sleeve-Oxford-Woven_5-387x380.png"/>">
		
		</div>
		<div class="col-sm-3 col-xs-6">
            <img class="img-responsive i3" src="<c:url value="/resources/images/Long-Sleeve-Jersey-Tee_4-387x380.png"/>">
		
		</div>
		<div class="col-sm-3 col-xs-6">
            <img class="img-responsive i4" src="<c:url value="/resources/images/Amuse-Society-Clover-Woven-Short-Sleeve-Top_1-387x380.png"/>">
		
		</div>
		</div>

<div class="shop text-center" style="margin-top:40px; margin-bottom:0px;">
		<a href="/The_Vastra/allproducts" class="btn btn-default" id="shop"> Shop Now</a>	
</div>

</div>
<!-- End -->
	
	
	
	<!-- Parallax image scrolling 1 -->
	
	<div class="parallax img2"  style="">
	</div>
	
	<!-- End -->
	
	
	
	<!-- images -->

<div class="container-fluid"  style="height:auto;margin-top:50px;">
    <div class="col-sm-6 col-md-6 col-lg-6">
    
    <a href="productlist?param=men collection">
            <img class="img-responsive bw" src="<c:url value="/resources/images/stylish-man-hd-wallpaper-e1435129334519.jpg"/>" alt="Chudi">
     </a>
    </div>
    <div class="col-sm-6 col-md-6 col-lg-6">
    
        			<a href="productlist?param=women collection">
            <img class="img-responsive bw" src="<c:url value="/resources/images/fashionista-girl-hd-wallpaper-1920x1080-3914-815x500.jpg"/>" alt="Chudi">
      
     </a>
    </div>
  </div>
 <div class="parallax img2" id="mg"  style="margin-top:30px;height:20%;width:100%">
	
	</div>


<script src="<c:url value="/resources/bootstrap/js/jquery-3.1.0.min.js"/>"></script> 
<script src="<c:url value="/resources/bootstrap/js/bootstrap.min.js"/>"></script>
    <%@ include file="template/footer.jsp" %>

</body>
</html>

