package com.arun.hibernate_relationship.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.arun.hibernate_relationship.entity.CarDTO;
import com.arun.hibernate_relationship.entity.EngineDTO;

public class OneToOneDAO {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		
		EngineDTO engineDTO= new EngineDTO();
		engineDTO.setEname("Arun");
		
		CarDTO carDTO= new CarDTO();
		carDTO.setSname("Arun1");
		carDTO.setEngineDTO(engineDTO);
		session.save(carDTO);
		System.out.println("hellow");
		/* EngineDTO engineDTO  = new EngineDTO();
		 engineDTO.setEname("Power Engine");
		 
		 CarDTO carDTO = new CarDTO();
		 carDTO.setSname("BMW");
		 carDTO.setEngineDTO(engineDTO);
		 session.save(carDTO);*/
		 transaction.commit();

	}

}
