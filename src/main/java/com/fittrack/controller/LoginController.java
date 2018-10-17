package com.fittrack.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.fittrack.service.UserService;

@Controller
public class LoginController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "/login", method=RequestMethod.GET)
	public String myLogin() {
		
		if (userService.validateUser()) {
			System.out.println("validate!");
		}
		
		return "login";
	}
	
	

}
