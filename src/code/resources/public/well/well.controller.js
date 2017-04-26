(function() {
    'use strict';

    angular.module('app')
        .controller('wellController', wellController);

    wellController.$inject = ['$stateParams', 'getWellWithId'];

    function wellController($http, $stateParams, getWellWithId) {
            
      var vm = this;

      // Grab the State Parameter wellId
      // (from the app.route.js that will load in the URL)
      vm.wellId = $stateParams.wellId;
      vm.wellObj = [];

      vm.getWell = function getWell(wellId) {
        
        // Success Scenario
        var success = function(response) {
          // Grab the well object
          vm.wellObj = response.data;
          console.log('Got well id num: ' + wellId);
          //console.log(vm.name + ' ' + vm.release + ' ' + vm.description);        
        };
  
        // Error Scenario
        var error = function(response) {
          document.getElementById("well-fail").innerHTML = 'Failed to get well';
          console.log(response.data);
        };
  
        return getWellWithId.apiCall(wellId).then(success, error);
      };
      
      // Invoke the getPodcast function upon page load
      vm.getWell(vm.wellId);
    }

})();