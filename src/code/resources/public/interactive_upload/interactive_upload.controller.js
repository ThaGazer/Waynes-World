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


        vm.uploader = function uploader() {
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

            interactive_uploadService.uploadInfo().then(success, error);
        }
    }
})();
