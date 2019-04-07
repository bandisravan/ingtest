package com.src.ingtradeapp.controller.test;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.src.ingtradeapp.controllers.StocksController;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StocksControllerTest {
	
	    @Autowired
	    private WebApplicationContext wac;

	    private MockMvc mockMvc;

	    @Before
	    public void setup() {
	        this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();
	    }

	    @Test
	    public void getStocks() throws Exception{

	         mockMvc.perform(get("/stocks")
	                 .accept(MediaType.parseMediaType("application/json;charset=UTF-8")))
	                 .andExpect(status().isOk())
	                 .andExpect(content().contentType("application/json"));
	    }

}
