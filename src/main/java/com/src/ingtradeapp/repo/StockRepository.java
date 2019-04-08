package com.src.ingtradeapp.repo;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.src.ingtradeapp.model.Stock;

@Component
public interface StockRepository extends CrudRepository<Stock, Serializable>{
	List<Stock> findAll();
	List<Stock> findAllByOrderByRecommendedDesc();
	Stock findByName(String name);
}
