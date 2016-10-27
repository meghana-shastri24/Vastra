

var cartApp = angular.module ("cartApp", []);

cartApp.controller("cartCtrl", function ($scope, $http){

    $scope.removeFromCart = function (cartitemid) {            
    	alert("Product successfully added to the cart!"+cartitemid);

        $http.put('http://localhost:8080/The_Vastra/cart/remove/'+cartitemid).success(function (data) {    	alert("Product successfully added to the cart!"+cartitemid);

            $scope.refreshCart();
        });
    };
    $scope.addToCart = function (productid) {
        alert("Product successfully added to the cart!"+productid);

        	$http.put('http://localhost:8080/The_Vastra/cart/add/'+productid).success(function () {
            alert("Product successfully added to the cart!");
        });
    };


    $scope.refreshCart = function () {
        $http.get('http://localhost:8080/The_Vastra/cart/'+$scope.cartid).success(function (data) {
           $scope.cart=data;
        // window.alert($scope.cart);
         //  alert("after refresh")
          //$scope.cartItem=$scope.cart.cartItem;
           console.log($scope.cart);
           
           
        });
    };

    $scope.clearCart = function () {
        $http.put('http://localhost:8080/The_Vastra/cart/'+$scope.cartid).success(function (data) {
        	$scope.refreshCart();
        });
    };

    $scope.initCartId = function (cartid) {
    	console.log("hi");
        $scope.cartid = cartid;
       console.log($scope.cartid);
        $scope.refreshCart(cartid);
    };
    
    
    $scope.calGrandTotal = function () {
    	
        var grandTotal=0;

        for (var i=0; i<$scope.cart.cartitems.length; i++) {
            grandTotal+=$scope.cart.cartitems[i].totalprice;
        }

        return grandTotal;
    };

});