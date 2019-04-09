package com.src.ingtradeapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.src.ingtradeapp.exceptions.AddFailException;
import com.src.ingtradeapp.model.Users;
import com.src.ingtradeapp.response.JSONResponse;
import com.src.ingtradeapp.services.AddUserService;

@RestController
@RequestMapping("/signup")
@CrossOrigin
public class AddUserController {

	@Autowired
	JSONResponse response;
	
	@Autowired
	AddUserService userService;
	
	@PostMapping("")
	public JSONResponse signUp(@RequestBody Users user) throws AddFailException {
		return userService.addUser(user);
	}
}
