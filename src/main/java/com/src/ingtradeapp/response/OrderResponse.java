package com.src.ingtradeapp.response;

import java.util.Date;

import org.springframework.stereotype.Component;

@Component
public class OrderResponse {
	private Integer id;
	private String stock_name;
	private Integer volume;
	private Date trade_time;
	private Integer fees;
	private Double stock_price;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getStock_name() {
		return stock_name;
	}
	public void setStock_name(String stock_name) {
		this.stock_name = stock_name;
	}
	public Integer getVolume() {
		return volume;
	}
	public void setVolume(Integer volume) {
		this.volume = volume;
	}
	public Date getTrade_time() {
		return trade_time;
	}
	public void setTrade_time(Date trade_time) {
		this.trade_time = trade_time;
	}
	public Integer getFees() {
		return fees;
	}
	public void setFees(Integer fees) {
		this.fees = fees;
	}
	public Double getStock_price() {
		return stock_price;
	}
	public void setStock_price(Double stock_price) {
		this.stock_price = stock_price;
	}
}
