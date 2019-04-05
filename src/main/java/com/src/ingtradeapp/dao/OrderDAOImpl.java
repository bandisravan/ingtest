package com.src.ingtradeapp.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.src.ingtradeapp.model.JSONResponse;
import com.src.ingtradeapp.model.Orders;

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
}
