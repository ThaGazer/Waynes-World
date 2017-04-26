(function() {
  'use strict';

    angular.module('app')
        .controller('contactController', contactController);

    contactController.$inject = ['$http', 'contactService'];
    function contactController($http, contactService) {
      var vm = this;

      contactService.getMembers().then(function(response) {
        vm.members = response.data;
      }, function(reason) {
        console.log('The call to /members failed');
        vm.members = [];
      });
    }
})();
