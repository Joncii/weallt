(function(){
	'use strict';
	
	weallt.controller('ExerciseBaseController', [ '$http', '$window', '$sce', function($http, $window, $sce){
		var vm = this;
		
		vm.addExercise = addExercise;
		
		vm.retrieveExercise = retrieveExercise;
		
		vm.newExercise = {
			name : "",
			videoLink : "",
			targetedMuscleGroups : []
		}
		
		vm.trustSrc = function(src) {
			  return $sce.trustAsResourceUrl(src);
		}
		
		function retrieveMuscleGroups(){
			$http.get("/webapp/exercise/musclegroups").then(
                    function(response) {
                        vm.muscleGroups = response.data;
                    }, function() {
                    });
		}
		
		retrieveMuscleGroups();
		
		function retrieveExercises(){
			$http.get("/webapp/exercises").then(
                    function(response) {
                        vm.exerciseList = response.data;
                    }, function() {
                    });
		}
		
		retrieveExercises();
		
		function addExercise() {
            $http.put("/webapp/exercise/add", vm.newExercise).then(
            		closeAddExercise, closeAddExercise);
        }
        
        function closeAddExercise() {
        	$('#addExerciseModal').modal('hide');
        	retrieveExercises();
        }
        
        function retrieveExercise(id){
			$http.get("/webapp/exercise/" + id).then(
					function(response){
						vm.shownExercise = response.data;
					},
					function(){});
		}
	}]);
})();