package com.src.ingtradeapp.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.src.ingtradeapp.model.Orders;
import com.src.ingtradeapp.model.Stock;

@Component
public class StockDAOImpl implements StockDAO {

	@Autowired
	SessionFactory sessionFactory;

	@Override
	public List<Stock> getStocks() {
		Session session = this.sessionFactory.openSession();
		List<Stock> result = session.createQuery("from Stock").list();
		session.close();
		return result;
	}
}
