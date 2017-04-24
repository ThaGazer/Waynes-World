(function() {
    'use strict';

    angular
        .module('app')
        .service('searchService', searchService);

    searchService.$inject = ['$http'];

    function searchService($http) {

        var exports = {
            getWell: getWell
        };

        return exports;

        function getWell() {
            var searchRequest = {
                method: 'GET',
                url: ''
            }
            
            return $http(searchRequest);
        }
    }
})();