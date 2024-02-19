package com.arun.hibernate_relationship.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
@Entity
public class TeacherDTO {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int teacherId;
	@Column(name="trainerName")
	private String teacherName;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="teacherId")
	private List<StudentDTO> listOfStudent;
	public int getTeacherId() {
		return teacherId;
	}
	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
	}
	public String getTeacherName() {
		return teacherName;
	}
	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}
	public List<StudentDTO> getListOfStudent() {
		return listOfStudent;
	}
	public void setListOfStudent(List<StudentDTO> listOfStudent) {
		this.listOfStudent = listOfStudent;
	}
	
	
	
	
}
