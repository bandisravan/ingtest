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
	
	public Long calculateFee(Integer volume) {
		Long fee = (long) 0;
		if(volume < 500) {
			fee = (long) (volume * 0.10);
		}else {
			fee = (long) (volume * 0.15);
		}
		return fee;
	}
	
	public void saveOrder(Orders order) {
		Long fee = calculateFee(order.getVolume());
		order.setFees(fee);
		orderDAO.saveOrder(order);
	}
}
