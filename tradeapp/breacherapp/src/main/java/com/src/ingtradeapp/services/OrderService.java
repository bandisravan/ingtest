package com.src.ingtradeapp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.src.ingtradeapp.dao.OrderDAO;
import com.src.ingtradeapp.model.Orders;

@Component
public class OrderService {
	@Autowired
	OrderDAO orderDAO;
	
	public List<Orders> getAllOrders() {
		return orderDAO.getOrders();
	}
}
