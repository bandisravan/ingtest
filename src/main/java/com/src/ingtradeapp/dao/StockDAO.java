package com.src.ingtradeapp.dao;

import java.util.List;

import org.springframework.stereotype.Component;

import com.src.ingtradeapp.model.JSONResponse;
import com.src.ingtradeapp.model.Orders;
import com.src.ingtradeapp.model.Stock;

@Component
public interface StockDAO {
	public List<Stock> getStocks();
}
