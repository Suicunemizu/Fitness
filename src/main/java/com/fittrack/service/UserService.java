package com.fittrack.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fittrack.handler.UserHandler;

@Service
public class UserService {
	
	@Autowired
	UserHandler userHandler;
	
	public boolean validateUser() {
		return userHandler.validateUser();
	}

}
