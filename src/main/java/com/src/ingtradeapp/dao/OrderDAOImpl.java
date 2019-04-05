package com.src.ingtradeapp.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.src.ingtradeapp.model.Orders;
import com.src.ingtradeapp.model.Stock;

@Component
public class OrderDAOImpl implements OrderDAO {

	@Autowired
	SessionFactory sessionFactory;

	@Override
	public List<Orders> getOrders() {
		Session session = this.sessionFactory.openSession();
		List<Orders> result = session.createQuery("from Orders").list();
		session.close();
		return result;
	}

	@Override
	public void saveOrder(Orders order) {
		Session session = this.sessionFactory.openSession();
		Transaction txn = session.beginTransaction();
		session.save(order);
		txn.commit();
		session.close();
	}

	@SuppressWarnings("unchecked")
	@Override
	public Stock getStockByName(String name) {
		Session session = this.sessionFactory.openSession();
		Query query = session.createQuery("from Stock where name=:name");
		query.setParameter("name", name);
		List<Stock> result = query.list();
		session.close();
		return result == null ? new Stock() : result.get(0);
	}
}
