package com.src.ingtradeapp.services;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.src.ingtradeapp.model.Orders;
import com.src.ingtradeapp.response.DayStocksResponse;

@Component
public class DayStocksService {
	
	@Autowired
	EntityManager entityManager;
	
	public List<DayStocksResponse> getLastDayStocks(Integer days) {
		LocalDate date = LocalDate.now().minusDays(days);
		CriteriaBuilder cbuilder = entityManager.getCriteriaBuilder();
		CriteriaQuery<DayStocksResponse> query = cbuilder.createQuery(DayStocksResponse.class);
		Root<Orders> root = query.from(Orders.class);
		query.multiselect(root.get("stockName").alias("name"), cbuilder.sum(root.get("volume")).alias("volume"));
		query.where(cbuilder.greaterThan(root.get("creationTime"), date));
		query.groupBy(root.get("stockName"));
		List<DayStocksResponse> response = entityManager.createQuery(query).getResultList();
		return response;
	}
}
