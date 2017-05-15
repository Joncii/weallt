(function(){
	'use strict';
	
	weallt.controller('RegisterController', [ 'RegisterDao', function(RegisterDao) {
		var vm = this;

		vm.register = register;

		function register() {
			var user = {
				email : vm.email,
				password : vm.password,
				repassword : vm.repassword
			};
			RegisterDao.registerUser(user);
		}
	} ]);
})();