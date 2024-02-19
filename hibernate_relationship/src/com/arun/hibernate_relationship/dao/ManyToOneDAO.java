package com.arun.hibernate_relationship.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.arun.hibernate_relationship.entity.CityDTO;
import com.arun.hibernate_relationship.entity.CountryDTO;

public class ManyToOneDAO {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		
		CountryDTO countryDTO = new CountryDTO();
		countryDTO.setcName("India");
		
		
		CityDTO city1 = new CityDTO();
		city1.setCnName("Banglore");
		city1.setCountryDTO(countryDTO);
		session.save(city1);
		
		CityDTO city2 = new CityDTO();
		city2.setCnName("Delhi");
		city2.setCountryDTO(countryDTO);
		session.save(city2);
		
		Transaction transaction = session.beginTransaction();
		transaction.commit();
		
		

	}

}
