package com.src.ingtradeapp.model;
import org.springframework.stereotype.Component;

@Component
public class JSONResponse {
	private String msg;

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
}
