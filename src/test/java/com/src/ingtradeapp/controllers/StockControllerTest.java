package com.src.ingtradeapp.controllers;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.src.ingtradeapp.model.Stock;
import com.src.ingtradeapp.repo.StockRepository;
import com.src.ingtradeapp.response.JSONResponse;
import com.src.ingtradeapp.services.StockService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StockControllerTest {
	
	@Mock
	private StockRepository stockRepo;
	
	@Mock
	JSONResponse response;
	
	@Mock
	StockService stockService;

	@Autowired
	@InjectMocks
	private StocksController stockController;
	
	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void getStocksTest() {
		List<Stock> result = new ArrayList<>();
		Long oneid = new Long("1");
		Long twoid = new Long("2");
		Stock one = new Stock(oneid,"Test 1");
		Stock two = new Stock(twoid,"Test 2");
		result.add(one);
		result.add(two);
		when(stockService.getAllStocks()).thenReturn(result);
		List<Stock> stocksResponse = stockController.getStocks();
		assertEquals(result.size(),stocksResponse.size());
	}
}
