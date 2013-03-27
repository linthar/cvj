'use strict';

/* Services */
 
angular.module('cvServices', ['ngResource']).
	factory('Cv', function($resource, $routeParams){
  	//	return $resource('cvs/' + $routeParams.username + '.json', {}, {
        return $resource('/rest/cv/getJSON', {}, {
	
    		query: {method:'GET', params:{username: $routeParams.username}, isArray:false}
  		});
});
