(function() {
  'use strict';

  angular
    .module('app')
    .service('getWellWithId', getWellWithId);
    
  getWellWithId.$inject = ['$http'];
  
  function getWellWithId($http) {
    
    var exports = {
      apiCall: apiCall
    };

    return exports;
    
    function apiCall(wellId) {
      // The well request
      var getWellRequest = {
        method: 'GET',
        url: /*somecall to db*/ + wellId
      }
      return $http(getWellRequest);
    }
  }
})();