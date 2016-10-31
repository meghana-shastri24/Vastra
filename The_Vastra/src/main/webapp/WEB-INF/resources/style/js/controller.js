

var cartApp = angular.module ("cartApp", []);

cartApp.controller("cartCtrl", function ($scope, $http){

    $scope.removeFromCart = function (cartitemid) {            
        $http.put('http://localhost:8080/The_Vastra/cart/remove/'+cartitemid).success(function (data) {    	
        	alert("Product successfully removed from the cart!"+cartitemid);

            $scope.refreshCart();
        });
    };
    $scope.addToCart = function (productid) {
        	$http.put('http://localhost:8080/The_Vastra/cart/add1/'+productid).success(function () {
            alert("Product successfully added to the cart!");
        });
    };


    $scope.refreshCart = function () {
        $http.get('http://localhost:8080/The_Vastra/cart/'+$scope.cartid).success(function (data) {
           $scope.cart=data;
           console.log($scope.cart);
           
           
        });
    };

    $scope.clearCart = function () {
        alert("Product successfully added to the cart!");

        $http.put('http://localhost:8080/The_Vastra/cart/clear/'+$scope.cartid).success(function (data) {
            alert("Product successfully added to the cart!");

        	$scope.refreshCart();
        });
    };

    $scope.initCartId = function (cartid) {
    	console.log("hi");
        $scope.cartid = cartid;
       console.log($scope.cartid);
        $scope.refreshCart();
    };
    
    $scope.calGrandTotal = function () {
    	
        var grandTotal=0;

        for (var i=0; i<$scope.cart.cartitems.length; i++) {
            grandTotal+=$scope.cart.cartitems[i].totalprice;
        }

        return grandTotal;
    };

});