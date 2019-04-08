package com.src.ingtradeapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.src.ingtradeapp.model.HourStock;
import com.src.ingtradeapp.response.JSONResponse;
import com.src.ingtradeapp.services.HourStockService;

@RestController
@RequestMapping("/hourstocks")
@CrossOrigin
public class HourStockController {

	@Autowired
	JSONResponse response;
	
	@Autowired
	HourStockService hourStockService;
	
	@GetMapping("/{name}")
	public HourStock getHourStock(@PathVariable("name") String name) {
		return hourStockService.getHourStock(name);
	}
}

