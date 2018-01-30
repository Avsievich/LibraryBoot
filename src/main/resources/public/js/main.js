var  app =angular.module("sprinDemo",[]);


        app.controller('AppCtrl', function($scope, $http) {
         $http.get("http://localhost:8090/ipa/stackoverflow")
                .then(function (response) {
                    $scope.websites = response.data;
                });
        });



    ﻿

