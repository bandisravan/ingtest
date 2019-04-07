package com.src.ingtradeapp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.src.ingtradeapp.model.Orders;
import com.src.ingtradeapp.model.Stock;
import com.src.ingtradeapp.repo.OrderRepository;
import com.src.ingtradeapp.repo.StockRepository;

@Component
public class StockService {
	
	@Autowired
	StockRepository stockRepo;
	
	public List<Stock> getAllStocks() {
		return stockRepo.findAllByOrderByRecommendedDesc();
	}
}
