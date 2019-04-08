package com.src.ingtradeapp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.src.ingtradeapp.response.DayStocksResponse;
import com.src.ingtradeapp.response.JSONResponse;
import com.src.ingtradeapp.services.DayStocksService;

@RestController
@RequestMapping("/daystocks")
@CrossOrigin
public class DayStocksController {

	@Autowired
	JSONResponse response;
	
	@Autowired
	DayStocksService dayStockService;
	
	@GetMapping("")
	public List<DayStocksResponse> getLastDayStocks() {
		return dayStockService.getLastDayStocks(1);
	}
	
	
	@GetMapping("{days}")
	public List<DayStocksResponse> getDaysStocks(@PathVariable("days") Integer days) {
		return dayStockService.getLastDayStocks(days);
	}

}
