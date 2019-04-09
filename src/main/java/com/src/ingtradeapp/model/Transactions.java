package com.src.ingtradeapp.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Transactions implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", length = 11)
	private Long id;

	@Column
	private String status;

	@Column
	private String srcAccountNumber;

	@Column
	private String destAccountNumber;

	@Column
	private Double transferAmount;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getSrcAccountNumber() {
		return srcAccountNumber;
	}

	public void setSrcAccountNumber(String srcAccountNumber) {
		this.srcAccountNumber = srcAccountNumber;
	}

	public String getDestAccountNumber() {
		return destAccountNumber;
	}

	public void setDestAccountNumber(String destAccountNumber) {
		this.destAccountNumber = destAccountNumber;
	}

	public Double getTransferAmount() {
		return transferAmount;
	}

	public void setTransferAmount(Double transferAmount) {
		this.transferAmount = transferAmount;
	}
}