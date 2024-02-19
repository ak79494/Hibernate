package com.hibernate_demo2.dao;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.arun.hibernate_demo2.entity.StudentDTO;

public class StudentDAO {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		
		// read fetch
//	    StudentDTO dto = session.load(StudentDTO.class, 102);
//	    System.out.println(dto.getName()+" "+dto.getDesignation()+" "+dto.getSalary());
//	    Transaction transaction = session.beginTransaction();
//	    transaction.commit();
//	    session.close();
		
		//update
		
//		StudentDTO dto = session.load(StudentDTO.class, 102);
//		dto.setSalary(dto.getSalary()+10000);
//		session.update(dto);
//		Transaction transaction = session.beginTransaction();
//		transaction.commit();
//		session.close();
		
		// Delete
//		StudentDTO dto = session.load(StudentDTO.class, 102);
//		session.delete(dto);
//		Transaction transaction = session.beginTransaction();
//		transaction.commit();
//		session.close();
		
		//HQL fetch
//		Query  query = session.createQuery("from StudentDTO where id=102");
//		StudentDTO dto = (StudentDTO) query.uniqueResult();
//		System.out.println(dto.getId()+" "+dto.getDesignation()+" "+dto.getSalary());
//		session.close();
		
		// update
		Transaction transaction = session.beginTransaction();
		Query query = session.createQuery("update StudentDTO set salary = salary + 10000 where id=102");
		query.executeUpdate();
		session.close();
		
		
		
		
		
		
		
	    
		

	}

}
