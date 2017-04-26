(function() {
  'use strict';

    angular.module('app')
      .config(config)

    config.$inject = ['$stateProvider', '$urlRouterProvider'];
    function config($stateProvider, $urlRouterProvider) {

      $urlRouterProvider.otherwise('/about');

      $stateProvider
        .state('about', {
          url: '/about',
            templateUrl: 'about/about.html',
            controller: 'aboutController',
            controllerAs: 'about'
        })
        .state('contact', {
          url: '/contact',
          templateUrl: 'contact/contact.html',
          controller: 'contactController',
          controllerAs: 'contact'
        })
        .state('interactive_upload', {
          url: '/interactive_upload',
          templateUrl: 'interactive_upload/interactive_upload.html',
          controller: 'interactive_uploadController',
          controllerAs: 'interactive_upload'
        })
        .state('well', {
          url: '/well',
          templateUrl: 'well/well.html',
          controller: 'wellController',
          controllerAs: 'well'
        });
    };

})();
