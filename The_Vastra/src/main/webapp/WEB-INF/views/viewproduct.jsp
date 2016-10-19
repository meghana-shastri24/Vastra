<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
            <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
                <%@ include file="template/Header.jsp" %>
            
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<link rel="stylesheet" href="<c:url value="/resources/bootstrap/css/bootstrap.min.css"/>"/>
	  <link rel="stylesheet" href="http://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.6.3/css/font-awesome.min.css">
	
	<link rel="stylesheet" href="/The_Vastra/resources/style/css/viewproduct.css" type="text/css">
	
</head>
<body>

<div class="container">
    <div class="content-wrapper">	
		<div class="item-container">	
			<div class="container">	
				
					<div class="product col-md-5 service-image-left">
                    
						<center>
							<img id="item-display" src="<c:url value="/resources/images/${p.productid}.jpg"/>" alt=""></img>
						</center>
					</div>
					
					
			
					
				<div class="col-md-7" id="description">
					<div class="product-title">${p.productname} By ${p.brand }</div>
					<hr>
					<div class="product-color">Color : ${p.color}</div>
					<div class="product-price">Price : <i class="fa fa-inr" style="font-size:24px"> ${p.price }</i></div>
					<div class="product-size">Size &nbsp;: ${p.size}</div>
					<div class="product-stock">In Stock : ${p.stock}</div>
					
					<hr>
					<div class="btn-group cart">
						<button type="button" class="btn btn-success">
							Add to cart 
						</button>
					</div>
					<div class="btn-group buy">
						<button type="button" class="btn btn-danger">
							Order Now
						</button>
					</div>
				</div>
			</div> 
		</div>
		
	</div>
</div>
<script src="<c:url value="/resources/bootstrap/js/jquery-3.1.0.min.js"/>"></script> 
<script src="<c:url value="/resources/bootstrap/js/bootstrap.min.js"/>"></script>

</body>
</html>

        <%@ include file="template/footer.jsp" %>
