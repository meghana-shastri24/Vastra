<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<div id="banner" class="jumbotron row">
	
	<h1>Checkout</h1>

</div>
<section id="checkout" class="page-section row">
	<div id="checkout-progress">
		{{ partial("shop-checkout-progress") }}	
	</div>
		
    <div class="col-sm-12 col-md-9">
					
		<div id="checkout-page">{{ partial('shop-checkout') }}</div>

	</div>
	
	<div id="cart-totals" class="col-sm-12 col-md-3">
		{{ open_form({'class': 'custom'}) }}
			{{ partial('shop-checkout-totals', {'items': items}) }}
		{{ close_form() }}
	</div>
	
</section>

</body>
</html>