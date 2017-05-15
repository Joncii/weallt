(function() {
    'use strict';

    weallt.controller('AddFoodController', [
            '$http',
            '$window',
            function($http, $window) {
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
                    },
                    energy : {
                        value : 0,
                        metric : 'kcal'
                    }
                }

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
                            redirectToAddFood, redirectToAddFood);
                }

                function redirectToAddFood() {
                    $window.location.href = '/webapp/#addFood';
                }

            } ]);
})();