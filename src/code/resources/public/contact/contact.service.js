(function() {
  'use strict';

    angular.module('app')
        .service('contactService', contactService);

    contactService.$inject = ['$http'];
    function contactService($http) {

      var exports = {
        getMembers: getMembers
      };

      function getMembers() {
        return $http.get('/members');
      }

      return exports;
    }
})();
