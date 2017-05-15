(function(){
	'use strict';
	
	weallt.controller('AddFoodController', [ '$http', '$window', function($http, $window){
		var vm = this;
		
		vm.addFood = addFood;
		
		vm.food = {
				name : "",
				carbohydrate : {
					weightPortion : {
						value : 0,
						metric : 'g'
					}
				},
				protein : {
					weightPortion : {
						value : 0,
						metric : 'g'
					}
				},
				fat : {
					weightPortion : {
						value : 0,
						metric : 'g'
					}
				}
		}
		
		function retrieveMetrics(){
			$http.get("/webapp/food/metrics").then(
					function(response){
						vm.metrics = response.data;
					},
					function(){});
		}
		
		retrieveMetrics();
		
		function addFood(){
			$http.put("/webapp/food/add", vm.food).then(redirectToAddFood, redirectToAddFood);
		}
		
		function redirectToAddFood(){
			$window.location.href = '/webapp/#addFood';
		}
    
	}]);
})();