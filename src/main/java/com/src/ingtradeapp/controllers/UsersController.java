package com.src.ingtradeapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.src.ingtradeapp.response.JSONResponse;

@RestController
@RequestMapping("/users")
@CrossOrigin
public class UsersController {

	@Autowired
	JSONResponse response;
	
	@GetMapping("")
	public String getStocks() {
		return "Hello User";
	}
}
