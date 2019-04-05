package com.src.ingtradeapp.dao;

import java.util.List;

import org.springframework.stereotype.Component;

import com.src.ingtradeapp.model.Orders;
import com.src.ingtradeapp.model.Stock;

@Component
public interface OrderDAO {
	public List<Orders> getOrders();

	public void saveOrder(Orders order);

	public Stock getStockByName(String stockname);
}
