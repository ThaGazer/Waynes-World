(function() {
  'use strict';

    angular.module('app')
      .config(config)

    config.$inject = ['$stateProvider', '$urlRouterProvider'];
    function config($stateProvider, $urlRouterProvider) {

      $urlRouterProvider.otherwise('/search');

      $stateProvider
        .state('about', {
          url: '/about',
          views : {
            '': {
              templateUrl: 'about/about.html',
              controller: 'aboutController',
              controllerAs: 'about'
            },
            'view1@about': {
              templateUrl: 'about/views/about-view1.html',
            },
            'view2@about': {
              templateUrl: 'about/views/about-view2.html',
            },
            'view3@about': {
              templateUrl: 'about/views/about-view3.html',
            },
          }
        })
        .state('contact', {
          url: '/contact',
          templateUrl: 'contact/contact.html',
          controller: 'contactController',
          controllerAs: 'contact'
        })
        .state('search', {
          url: '/search',
          templateUrl: 'search/search.html',
          controller: 'searchController',
          controllerAs: 'search'
        })
        .state('interactive_upload', {
          url: '/interactive_upload',
          templateUrl: 'interactive_upload/interactive_upload.html',
          controller: 'interactive_uploadController',
          controllerAs: 'interactive_upload'
        })
        .state('well', {
          url: '/well/{podcastId}',
          templateUrl: 'well/well.html',
          controller: 'wellController',
          controllerAs: 'well'
        });
    };

})();
