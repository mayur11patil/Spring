package com.example.student;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {

	private String name;
	private String collegeName;
	@Id
	private String id;
	
	public Student() {	
	}
	
	public Student(String name, String collegeName, String id) {
		super();
		this.name = name;
		this.collegeName = collegeName;
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", collegeName=" + collegeName + ", id=" + id + "]";
	}
	
	
}
