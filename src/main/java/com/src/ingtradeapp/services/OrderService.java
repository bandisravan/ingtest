package com.src.ingtradeapp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.src.ingtradeapp.dao.OrderDAO;
import com.src.ingtradeapp.model.Orders;
import com.src.ingtradeapp.model.Stock;

@Component
public class OrderService {
	@Autowired
	OrderDAO orderDAO;
	
	public List<Orders> getAllOrders() {
		return orderDAO.getOrders();
	}
	
	public Double getFee(Orders order) {
/*		double fee=order.getFees();
		if(fee<500) {
			fee=fee*0.10/100;
		}
		*/
		return new Double("-1");
	}
	
	public Stock getStockByName(String stockname) {
		return orderDAO.getStockByName(stockname);
	}
	
	public void saveOrder(Orders order) {
		orderDAO.saveOrder(order);
	}
}
