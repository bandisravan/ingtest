package com.src.ingtradeapp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.src.ingtradeapp.model.JSONResponse;
import com.src.ingtradeapp.model.Stock;
import com.src.ingtradeapp.services.StocksService;

@RestController
@RequestMapping("/stocks")
@CrossOrigin
public class StocksController {

	@Autowired
	JSONResponse response;
	
	@Autowired
	StocksService stocksService;
	
	@GetMapping("")
	public List<Stock> getStocks() {
		return stocksService.getAllStocks();
	}
}
