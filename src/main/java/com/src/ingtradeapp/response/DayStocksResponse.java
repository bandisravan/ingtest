package com.src.ingtradeapp.response;
import org.springframework.stereotype.Component;

@Component
public class DayStocksResponse {

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
	public DayStocksResponse(String name,Long volume) {
		this.name = name;
		this.volume = volume.intValue();
	}
	public DayStocksResponse() {
	}
}