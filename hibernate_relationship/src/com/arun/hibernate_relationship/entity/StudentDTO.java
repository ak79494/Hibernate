package com.arun.hibernate_relationship.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class StudentDTO {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int studentId;
	private String studentName;
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getstudentName() {
		return studentName;
	}
	public void setstudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	
	
	
	
}
