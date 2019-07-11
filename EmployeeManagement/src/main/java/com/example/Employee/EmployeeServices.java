package com.example.Employee;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Service;

@Service
public class EmployeeServices {
	
	Employee emp1=new Employee("MAyur", "PAtil", 788);
	Employee emp2 = new Employee("Ajinkya", "Rahane", 27);
	
	List<Employee> employeeList = new ArrayList<Employee>();
	
	public List<Employee> getAllEmployee(){
		return employeeList;
	}
	
	public Employee getEMployee(int id) {
		Employee employee = employeeList.stream()
							.filter(e -> id==(e.getEmpId()))
							.findFirst()
							.orElse(null);
		
		return employee;
	}
	
	public void addEmployee(Employee employee) {
		employeeList.add(employee);
		System.out.println("Added employee record Successfully : "+employee);
	}
	
	public void removeEmployee(int empId) {
//		employeeList.stream()
//					.forEach(e ->{
//						if(e.getEmpId()==empId) {
//							employeeList.remove(e);
//						}
//					});
		
		Predicate<Employee> isid = emp -> emp.getEmpId() == empId;
		
		employeeList.stream().filter(isid)
							 .forEach(e -> e.getEmpId());
		employeeList.removeIf(isid);
		
		System.out.println("Employee deleted with Id :"+empId);
	}
	
	public void updateEmployee(int empId,Employee employee) {
		employeeList.stream()
		.forEach(e ->{
			if(e.getEmpId()==empId) {
				e.setEmpId(employee.getEmpId());
				e.setFirstName(employee.getFirstName());
				e.setLastName(employee.getLastName());
			}
		});
		
		System.out.println("Employee Record updated with id : "+empId);
	}
	
}
