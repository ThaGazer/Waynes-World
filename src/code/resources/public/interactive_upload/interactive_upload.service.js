/**
 * Created by Sparky on 4/24/17.
 */
(function() {
    'use strict';

    angular.module('app')
        .service('interactive_uploadService', interactive_uploadService);

    interactive_uploadService.$inject = ['$http'];
    function interactive_uploadService($http) {

        var exports = {
            uploadInfo : uploadInfo
        };

        function uploadInfo() {
            var upload = {
                method: 'POST',
                url: '/updateDB'
            }
            return $http(upload);
        }
        return exports;
    }
})();
