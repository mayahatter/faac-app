package com.faac.soap.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.faac.soap.dto.GetLoggedUsersRequest;
import com.faac.soap.dto.GetLoggedUsersResponse;
import com.faac.soap.dto.User;
import com.faac.spring.datajpa.UserMapper;

@Endpoint
public class LoggedUsersEndpoint {
	private static final String NAMESPACE_URI = "http://com.faac/soap/dto";
    private UserMapper userMapper;

    @Autowired
    public LoggedUsersEndpoint(UserMapper userMapper) {
        this.userMapper = userMapper;
    }
    
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getLoggedUsersRequest")
    @ResponsePayload
    public GetLoggedUsersResponse getLoggedUsers(@RequestPayload GetLoggedUsersRequest request) {
    	GetLoggedUsersResponse response = new GetLoggedUsersResponse();
    	Collection<com.faac.spring.datajpa.model.User> loggedUsers = userMapper.findAll();
    	for(com.faac.spring.datajpa.model.User u : loggedUsers) {
    		User userSoap = new User();
    		userSoap.setUserid(u.getUsername());
    		userSoap.setNome(u.getNome());
    		userSoap.setCognome(u.getCognome());
    		userSoap.setEmail(u.getEmail());
    		response.getUsers().add(userSoap);
    	}

        return response;
    }
}
