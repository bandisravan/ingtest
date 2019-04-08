package com.src.ingtradeapp.repo;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.src.ingtradeapp.model.Orders;

@Component
public interface OrderRepository extends CrudRepository<Orders, Serializable>{
	 List<Orders> findAll();
	 Orders findById(Long id);
}
