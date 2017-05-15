(function(){
	'use strict';
	
	weallt.factory('RegisterDao', [ '$http', function($http) {

    return {
        registerUser : function(user) {
            var userData = {
                email : user.email,
                password : user.password
            };

            $http.post('/webapp/register', userData);
        }
    };

} ]);
})();