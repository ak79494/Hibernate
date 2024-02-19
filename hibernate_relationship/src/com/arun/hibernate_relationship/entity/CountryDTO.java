package com.arun.hibernate_relationship.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class CountryDTO {
	@Id
	@GeneratedValue(generator = "auto")
	@GenericGenerator(name="auto",strategy="increment")
	private int cId;
	private String cName;
	public int getcId() {
		return cId;
	}
	public void setcId(int cId) {
		this.cId = cId;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	
	
}
