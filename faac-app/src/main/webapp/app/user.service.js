angular.module('faacApp').factory('User', User);

User.$inject = [ '$resource' ];

function User($resource) {
	var resourceUrl = 'api/users/:id';

	return $resource(resourceUrl, {id:'@id'}, {
		'update' : {
			method : 'PUT',
			
		}
	});
}