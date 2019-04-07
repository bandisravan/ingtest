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
public class Stock implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "id", length = 11)
	private Long id;

	@Column
	private String name;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	@Column
	private Integer recommended = 0;

	public Integer getRecommended() {
		return recommended;
	}

	public void setRecommended(Integer recommended) {
		this.recommended = recommended;
	}

	
	public Stock(Long id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public Stock() {
		
	}

}
