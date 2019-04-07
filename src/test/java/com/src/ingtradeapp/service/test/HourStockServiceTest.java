package com.src.ingtradeapp.service.test;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.src.ingtradeapp.model.HourStock;
import com.src.ingtradeapp.repo.HourStockRepository;
import com.src.ingtradeapp.services.HourStockService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HourStockServiceTest {
	
	@Autowired
	@InjectMocks
	private HourStockService hourStockService;
	
	@Mock
	private HourStockRepository hourStockRepository;
	
	@Test
	public void getHourStockTest() {
		when(hourStockRepository.getHourStock(any(String.class))).thenReturn(1);	
		HourStock response = hourStockService.getHourStock("Test");
		assertNotNull(response);
	}

}
