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

        function uploadInfo(wellID, usage, aquafier_code, type_code, comment, top_depth, bottom_depth, depth,
                            water_level_elevation, land_elevation, bottom_elevation, diameter, casingID, pump_description, latitude,
                            longitude, state, country, ownerID, owner_name, owner_type, transID, trans_name, trans_type) {
            var upload = {
                method: 'POST',
                url: '/updateDB',
                we: {
                    wellID: wellID,
                    usage: usage,
                    aquafier_code: aquafier_code,
                    type_code: type_code,
                    comment: comment,
                    top_depth: top_depth,
                    bottom_depth: bottom_depth,
                    depth: depth,
                    water_level_elevation: water_level_elevation,
                    land_elevation: land_elevation,
                    bottom_elevation: bottom_elevation,
                    diameter: diameter,
                    casingID: casingID,
                    pump_description: pump_description,
                    latitude: latitude,
                    longitude: longitude,
                    state: state,
                    country: country,
                    ownerID: ownerID
                },
                ow: {
                    ownerID: ownerID,
                    owner_name: owner_name,
                    owner_type: owner_type
                },
                trans: {
                    wellID: wellID,
                    transID: transID,
                    trans_name: trans_name,
                    trans_type: trans_type
                }
            }
            return $http(upload);
        }
        return exports;
    }
})();
