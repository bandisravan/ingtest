package com.src.ingtradeapp.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.src.ingtradeapp.model.JSONResponse;
import com.src.ingtradeapp.model.Orders;
import com.src.ingtradeapp.response.OrderResponse;
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
	public List<OrderResponse> getOrders() {
		ArrayList<OrderResponse> response = new ArrayList();
		orderService.getAllOrders().stream().forEach(c-> {
			OrderResponse res = new OrderResponse();
			res.setId(c.getId().intValue());
			res.setStock_name(c.getStock().getName());
			res.setStock_price(c.getStockPrice());
			res.setVolume(c.getVolume());
			res.setFees(c.getFees().intValue());
			res.setTrade_time(c.getTradeTime());
			response.add(res);
		});
		return response;
	}
	
	
	@GetMapping("/{order_id}")
	public Orders getOrder(@PathVariable("order_id") Long id) {
		return new Orders();
	}

	@PostMapping("")
	public JSONResponse placeOrders(@RequestBody Orders order) {
		try {
			order.setId(null);
			orderService.saveOrder(order);
			response.setMsg("Added Succesfully");
			response.setStatus(true);
		} catch(Exception e) {
			e.printStackTrace();
			response.setMsg("Failed to add");
			response.setStatus(false);
		}
		return response;
	}
}
