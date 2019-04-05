package com.src.ingtradeapp.dao;

import java.util.List;

import org.springframework.stereotype.Component;

import com.src.ingtradeapp.model.JSONResponse;
import com.src.ingtradeapp.model.Orders;

@Component
public interface OrderDAO {
	public List<Orders> getOrders();
}
