/**
 * Created by Sparky on 4/24/17.
 */
(function() {
    'use strict';

    angular.module('app')
        .controller('interactive_uploadController', interactive_uploadController);

    interactive_uploadController.$inject = ['$http', 'interactive_uploadService'];
    function interactive_uploadController($http, interactive_uploadService) {
        var vm = this;

        interactive_uploadService.uploadInfo().then(function(response) {
            vm.members = response.data;
        }, function(reason) {
            console.log('The call to /updateDB failed');
            vm.members = [];
        });
    }
})();
