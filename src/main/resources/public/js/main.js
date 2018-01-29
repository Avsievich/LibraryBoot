var  app =angular.module("sprinDemo",[]);

    app.controller('AppCtrl', ['$scope', function ($scope) {


        $http({
            method: 'GET',
            url: 'http://localhost:8090/ipa/stackoverflow'
        }).then(function successCallback(response) {
            $scope.websites =response.data;
            // this callback will be called asynchronously
            // when the response is available
        }, function errorCallback(response) {
            // called asynchronously if an error occurs
            // or server returns response with an error status.
        });



    }]);﻿

