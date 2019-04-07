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

	
}
