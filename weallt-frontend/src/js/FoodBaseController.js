(function(){
	'use strict';
	
	weallt.controller('FoodBaseController', [ '$http', '$window', function($http, $window){
		var vm = this;
		
		vm.shownFood = null;
		
		vm.retrieveFood = retrieveFood;
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
                },
                energy : {
                    value : 0,
                    metric : 'kcal'
                }
            }
		
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
		
		function retrieveWeightMetrics() {
            $http.get("/webapp/food/weightMetrics").then(
                    function(response) {
                        vm.weightMetrics = response.data;
                    }, function() {
                    });
        }

        retrieveWeightMetrics();

        function retrieveEnergyMetrics() {
            $http.get("/webapp/food/energyMetrics").then(
                    function(response) {
                        vm.energyMetrics = response.data;
                    }, function() {
                    });
        }

        retrieveEnergyMetrics();

        function addFood() {
            $http.put("/webapp/food/add", vm.food).then(
            		closeAddFood, closeAddFood);
        }
        
        function closeAddFood() {
        	$('#addFoodModal').modal('hide');
        }
	}]);
})();