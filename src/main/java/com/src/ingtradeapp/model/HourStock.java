package com.src.ingtradeapp.model;
import org.springframework.stereotype.Component;

@Component
public class HourStock {
	private String name;
	private Integer volume;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getVolume() {
		return volume;
	}
	public void setVolume(Integer volume) {
		this.volume = volume;
	}
	
	public HourStock() {};
	
	public HourStock(String name, Integer volume) {
		super();
		this.name = name;
		this.volume = volume;
	}
	@Override
	public String toString() {
		return "HourStock [name=" + name + ", volume=" + volume + "]";
	}
	
	
	

	
}
