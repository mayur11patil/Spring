package com.example.student;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	
	@Autowired
	private StudentService studentservice;
	
	@RequestMapping(value="/students", method = RequestMethod.GET)
	public List<Student> getALlStudents(){
		
		return studentservice.gatAllStudent();
	}
	
	@RequestMapping(value="/students", method = RequestMethod.POST)
	public void addStudent(@RequestBody Student student) {
		
		studentservice.addStudent(student);
	}
	
	@RequestMapping(value = "/student/{id}", method = RequestMethod.GET)
	public Optional<Student> getStudent(@PathVariable String id){
		return studentservice.getStudent(id);
	}
	
	@RequestMapping(value = "/student/{id}", method = RequestMethod.DELETE)
	public void deleteStudent(@PathVariable String id) {
		studentservice.deleteStudent(id);
	}
	
	@RequestMapping(value = "/student/{id}", method = RequestMethod.PUT)
	public void updateStudent(@PathVariable String id, @RequestBody Student student) {
		studentservice.updateStudent(id, student);
	}
	
	
}
