(function(){
	'use strict';
	
	weallt.controller('FoodBaseController', [ '$http', function($http){
		var vm = this;
		
		vm.shownFood = null;
		
		vm.retrieveFood = retrieveFood;
		
		function retrieveFoods(){
			$http.get("/webapp/foods").then(
					function(response){
						vm.foodList = response.data;
					},
					function(){});
		}
		
		function retrieveFood(id){
			$http.get("/webapp/food/" + id).then(
					function(response){
						vm.shownFood = response.data;
					},
					function(){});
		}
		
		retrieveFoods();
	}]);
})();