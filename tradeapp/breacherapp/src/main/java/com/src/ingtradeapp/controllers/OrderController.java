package com.src.ingtradeapp.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
public class OrderController {
	@GetMapping("")
	public String getOrders() {
		return "{ \r\n" + 
				"  \"id\":1,\r\n" + 
				"  \"stock_name\":\"Test 123\",\r\n" + 
				"  \"stock_price\":120,\r\n" + 
				"  \"volume\":1,\r\n" + 
				"  \"trade_time\":\"2018-02-03 05:34+GMT\",\r\n" + 
				"  \"fees\":12\r\n" + 
				"}";
	}

	@PostMapping("")
	public String PlaceOrders() {
		return "{\r\n" + "  \"id\":1,\r\n" + "  \"name\":\"rte\"\r\n" + "}";
	}
}
