<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="/The_Vastra/resources/style/css/Header.css" type="text/css">

<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

</head>

<body>

<div 
xmlns:spring="http://www.springframework.org/tags" 
xmlns:security="http://www.springframework.org/security/tags" 
> 

<!-- Navigation bar -->

 <div class="navbar-default navbar-fixed-top" id="menu">
		<div class="container">
    			<button class="navbar-toggle" data-toggle="collapse"  data-target=".navHeaderCollapse">
    				<span class="icon-bar"></span>
   		 			<span class="icon-bar"></span>
    				<span class="icon-bar"></span>
    	
    			</button>
    <div class="navbar-header">
    			<a class="navbar-brand" href="/The_Vastra"><i>Vastra-The Fashion</i></a>
    </div>
    
      			<div class="navbar-collapse collapse navHeaderCollapse">
      				<ul class="nav navbar-nav">
        			<li class="dropdown">
        			<a class="dropdown-toggle dropbtn" data-toggle="dropdown" href="">Shopping<span class="caret"></span></a> 
      				<div class="dropdown-content">
      				<a href="productlist?param=men collection">Men Collection</a>
        			<a href="productlist?param=women collection">Women Collection</a>
        			<a href="allproducts">All</a>
        			
    				</div>
    				</li>
    				
    	<!-- Search Bar-->
	<li>
	<form class="navbar-form" action="prosearch">
    		<div class="input-group" id="searchsize">
        		<input type="Search" name="srch" class="form-control" placeholder="Search Here..." id="Search" />
        	<div class="input-group-btn">
            	<button type="button" class="btn btn-default" id="search">
                <span class="glyphicon glyphicon-search"></span>
            	</button>
        	</div>
    		</div>
	</form>
	</li>
  </ul>
    	  
    	  <div>
    	  <ul class="nav navbar-nav navbar-right">
    	 
    	  <c:if test="${pageContext.request.userPrincipal.name != null}">
                            <li><a>Welcome:${pageContext.request.userPrincipal.name} </a></li>
                            <li><a href="<c:url value="/j_spring_security_logout" />">Logout</a></li>
                            
                                	  <c:if test="${pageContext.request.userPrincipal.name != 'm@m'}">
                            
                            <li><a href="<c:url value="/customer/viewcart" />"><i class="fa fa-shopping-bag" style="font-size:20px;"></i>
</a></li>
</c:if>
          </c:if>
    	      	  
    	      	  
    	      	  
         
          <c:if test="${pageContext.request.userPrincipal.name  == null}">
          <li><a href="login"> <span class="glyphicon glyphicon-log-in"></span>&nbsp; &nbsp;Login</a></li>
      	  <li><a href="SignUp"> <span class="glyphicon glyphicon-user"></span> &nbsp;Sign Up</a></li>
      	  </c:if>
      	  
      	  <c:if test="${pageContext.request.userPrincipal.name =='m@m'}">
    	  <li><a href="AddProducts">Add Items</a></li>
    	  </c:if>
    	  
    	  </ul> 
    	 </div>
     </div>
   </div>
 </div>
</div>
</body>
</html>