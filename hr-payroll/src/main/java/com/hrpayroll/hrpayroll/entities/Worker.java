package com.hrpayroll.hrpayroll.entities;

import java.io.Serializable;
import java.util.Objects;

public class Worker implements Serializable{
	private static final long serialVersionUID = 1L;
	

	private Long id;
	private String nameString;
	private Double dailyincome;
	
	public Worker() {
		
	}

	public Worker(Long id, String nameString, Double dailyincome) {
		super();
		this.id = id;
		this.nameString = nameString;
		this.dailyincome = dailyincome;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNameString() {
		return nameString;
	}

	public void setNameString(String nameString) {
		this.nameString = nameString;
	}

	public Double getDailyincome() {
		return dailyincome;
	}

	public void setDailyincome(Double dailyincome) {
		this.dailyincome = dailyincome;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Worker other = (Worker) obj;
		return Objects.equals(id, other.id);
	}
	
	
	
}
