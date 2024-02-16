package com.arun.hibernate.entity;

import java.util.Scanner;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.arun.hibernate.dao.StudentDAO;

public class Controller {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Process started");
		System.out.println("Enter your id");
		String id = sc.nextLine();
		
		System.out.println("Enter your name");
		String name = sc.nextLine();
		
		System.out.println("Enter your Address");
		String address = sc.nextLine();
		
		System.out.println("Enter your gmail");
		String gmail = sc.nextLine();
		
		System.out.println("Enter your phone");
		String phone = sc.nextLine();
		if(phone.length()!=10 || !phone.matches("\\d++")) {
			System.out.println("Reistration unSuccessFul phone number must be 10 character");
		}
		System.out.println("Enter your salary");
		String salary = sc.nextLine();
		
		StudentDTO dto = new StudentDTO();
		
		dto.setName(name);
		dto.setAddress(address);
		dto.setGmail(gmail);
		dto.setSalary(salary);
		dto.setPhone(phone);
		session.save(dto);
		System.out.println("Done");
		
		StudentDAO dao = new StudentDAO();
		transaction.commit();
		
		
		

	}

}
