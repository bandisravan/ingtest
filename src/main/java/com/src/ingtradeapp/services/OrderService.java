package com.src.ingtradeapp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.src.ingtradeapp.exceptions.AddFailException;
import com.src.ingtradeapp.model.Orders;
import com.src.ingtradeapp.model.Stock;
import com.src.ingtradeapp.repo.OrderRepository;
import com.src.ingtradeapp.repo.StockRepository;

@Component
public class OrderService {

	@Autowired
	OrderRepository orderRepo;

	@Autowired
	StockRepository stockRepo;

	public List<Orders> getAllOrders() {
		return orderRepo.findAll();
	}

	public Stock getStockByName(String stockname) {
		return stockRepo.findByName(stockname);
	}

	public Long calculateFee(Integer volume) {
		return (long) (volume < 500 ? (volume * 0.10) : (volume * 0.15));
	}

	public void saveOrders(Orders order) throws AddFailException {
		try {
			Long fee = calculateFee(order.getVolume());
			order.setFees(fee);
			orderRepo.save(order);
		} catch (Exception e) {
			throw new AddFailException("Failed while Adding Order");
		}
	}

	public Orders getById(Long id) {
		return orderRepo.findById(id);
	}
}
