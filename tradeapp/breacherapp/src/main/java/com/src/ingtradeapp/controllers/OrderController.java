package com.src.ingtradeapp.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.src.ingtradeapp.model.JSONResponse;
import com.src.ingtradeapp.model.Orders;

@RestController
@RequestMapping("/orders")
public class OrderController {

	@Autowired
	JSONResponse response;
	
	@GetMapping("")
	public List<Orders> getOrders() {
		return new ArrayList();
	}

	@PostMapping("")
	public JSONResponse placeOrders(@RequestBody Orders order) {
		response.setMsg("Added Succesfully");
		response.setStatus(true);
		return response;
	}
}
