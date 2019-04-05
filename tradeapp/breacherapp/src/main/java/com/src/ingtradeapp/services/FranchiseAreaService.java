package com.src.ingtradeapp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.src.ingtradeapp.dao.FranchiseDAO;

@Component
public class FranchiseAreaService {
	@Autowired
	FranchiseDAO franchDAO;
}
