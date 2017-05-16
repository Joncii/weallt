(function(){
	'use strict';
	
	weallt.config([ '$routeProvider', '$locationProvider', function($routeProvider, $locationProvider) {
		$routeProvider.when('/summary', {
			templateUrl : 'templates/summary.html'
		})
		.when('/', {
			templateUrl : 'templates/summary.html'
		})
		.when('/foodbase', {
			templateUrl : 'templates/foodbase.html'
		});
		$locationProvider.hashPrefix('');
	} ]);
})();