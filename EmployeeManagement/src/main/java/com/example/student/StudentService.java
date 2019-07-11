package com.example.student;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

	
	
	@Autowired
	private StudentRepository studentrepo;
	
	public List<Student> gatAllStudent(){
		System.out.println("get all student");
		List<Student> listOfStudent = new ArrayList<Student>();	
		studentrepo.findAll()
		.forEach(listOfStudent::add);
		return listOfStudent;
	}
	
	public void addStudent(Student student) {
		System.out.println("adding student");
		studentrepo.save(student);
	}
	
	public Optional<Student> getStudent(String id){
		return studentrepo.findById(id);
	}
	
	public void deleteStudent(String id) {
		studentrepo.deleteById(id);
	}
	
	public void updateStudent(String id, Student student) {
		
		/*
		 * Student updateStudent = studentrepo.findById(id).get();
		 * updateStudent.setCollegeName(student.getCollegeName());
		 * updateStudent.setName(student.getName());
		 */
		 
		
		studentrepo.save(student);
	}
	
}
