(function(){
	'use strict';
	
	weallt.controller('LoginController', [ '$window', function($window) {
		var vm = this;
		vm.redirectToRegister = redirectToRegister;

		function redirectToRegister() {
			$window.location.href = $window.location.host;
		}
	} ]);
})();