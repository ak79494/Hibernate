package com.arun.hibernate_relationship.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity
public class CarDTO {
	
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Id
	private int sid;
	private String sname;
	@OneToOne(cascade= CascadeType.ALL)
	private EngineDTO engineDTO;
	
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public EngineDTO getEngineDTO() {
		return engineDTO;
	}
	public void setEngineDTO(EngineDTO engineDTO) {
		this.engineDTO = engineDTO;
	}
	
}
