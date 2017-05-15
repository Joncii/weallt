(function(){
	'use strict';
	
	weallt.controller('NavbarController', function(){
		var vm = this;
		var activeTab;
		
		vm.changeTab = changeTab;
		
		function changeTab(id){
			var newTab = angular.element(document).find('#' + id);
			if(newTab[0].id != activeTab[0].id){
				newTab.addClass('active');
				activeTab.removeClass('active');
				activeTab = newTab;
			}
		}
		
		function initActiveTab(){
			activeTab = angular.element(document).find('#summary');
		}
		
		initActiveTab();
	});
})();