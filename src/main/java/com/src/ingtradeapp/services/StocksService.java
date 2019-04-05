package com.src.ingtradeapp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.src.ingtradeapp.dao.StockDAO;
import com.src.ingtradeapp.model.Stock;

@Component
public class StocksService {
	@Autowired
	StockDAO stockDAO;
	
	public List<Stock> getAllStocks() {
		return stockDAO.getStocks();
	}
}
