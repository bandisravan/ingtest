package com.src.ingtradeapp.service.test;

import static org.junit.Assert.assertNotEquals;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.src.ingtradeapp.model.Stock;
import com.src.ingtradeapp.repo.StockRepository;
import com.src.ingtradeapp.services.StockService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StockServiceTest {
	
	@Autowired
	private StockService service;
	
	@MockBean
	private StockRepository repository;
	
	@Test
	public void getAllStocksTest() {
		when(repository.findAll()).thenReturn(Stream.of(new Stock(1L,"HCL"),new Stock(2L,"HDFC")).collect(Collectors.toList()));
		assertNotEquals(2, service.getAllStocks().size());
	}

}
