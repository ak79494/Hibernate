package com.arun.hibernate_relationship.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.arun.hibernate_relationship.entity.StudentDTO;
import com.arun.hibernate_relationship.entity.TeacherDTO;

public class OneToManyDAO {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		
//		
//		StudentDTO s1 = new StudentDTO();
//		s1.setstudentName("Arun");
//		
//		StudentDTO s2 = new StudentDTO();
//	    s2.setstudentName("Shradha");
//
//	    List<StudentDTO> list = new ArrayList<StudentDTO>();
//	    list.add(s1);
//	    list.add(s2);
//	    
//	    TeacherDTO teacherDTO = new TeacherDTO();
//	    teacherDTO.setTeacherName("Azam");
//	    teacherDTO.setListOfStudent(list);
//	    session.save(teacherDTO);
//	    session.beginTransaction().commit();
		TeacherDTO teacherDTO =session.load(TeacherDTO.class,1);
		System.out.println("teacher name: "+teacherDTO.getTeacherName());
		List<StudentDTO> listOfStudent = teacherDTO.getListOfStudent();
		for(StudentDTO studentDTO : listOfStudent) {
			System.out.println("StudentName: "+studentDTO.getstudentName());
		}
	}

}
