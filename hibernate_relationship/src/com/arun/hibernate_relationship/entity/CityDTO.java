package com.arun.hibernate_relationship.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.GenericGenerator;


@Entity

public class CityDTO {
	@Id
	@GeneratedValue(generator="auto")
	@GenericGenerator(name="auto", strategy = "increment")
	private int cnId;
	private String cnName;
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="cid")
	private CountryDTO countryDTO;
	public int getCnId() {
		return cnId;
	}
	public void setCnId(int cnId) {
		this.cnId = cnId;
	}
	public String getCnName() {
		return cnName;
	}
	public void setCnName(String cnName) {
		this.cnName = cnName;
	}
	public CountryDTO getCountryDTO() {
		return countryDTO;
	}
	public void setCountryDTO(CountryDTO countryDTO) {
		this.countryDTO = countryDTO;
	}
	
	
}
