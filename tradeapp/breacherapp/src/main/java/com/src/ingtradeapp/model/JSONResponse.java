package com.src.ingtradeapp.model;
import org.springframework.stereotype.Component;

@Component
public class JSONResponse {
	private String msg;
	private Boolean status;

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
}
