package com.src.ingtradeapp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.src.ingtradeapp.exceptions.AddFailException;
import com.src.ingtradeapp.model.Orders;
import com.src.ingtradeapp.response.JSONResponse;
import com.src.ingtradeapp.services.OrderService;

@RestController
@RequestMapping("/orders")
@CrossOrigin
public class OrderController {

	@Autowired
	JSONResponse response;
	
	@Autowired
	OrderService orderService;
	
	@GetMapping("")
	public List<Orders> getOrders() {
		return orderService.getAllOrders();
	}
	
	
	@GetMapping("/{order_id}")
	public Orders getOrder(@PathVariable("order_id") Long id) {
		return orderService.getById(id);
	}

	@PostMapping("")
	public JSONResponse placeOrders(@RequestBody Orders order) throws AddFailException {
		order.setId(null);
		orderService.saveOrders(order);
		response.setMsg("Added Succesfully");
		response.setStatus(true);
		return response;
	}
}
