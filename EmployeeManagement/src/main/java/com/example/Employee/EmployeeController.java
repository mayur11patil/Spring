package com.example.Employee;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeServices employeeService;
	
	@RequestMapping(value="/employees")
	public List<Employee> getAllEmployee() {
		return employeeService.getAllEmployee();
	}
	
	@RequestMapping(value="/employee/{id}")
	public Employee getEmployee(@PathVariable int id) {
		return employeeService.getEMployee(id);
	}
	
	@RequestMapping(value="/addEmployee", method=RequestMethod.POST)
	public void addEmployee(@RequestBody Employee employee) {
		employeeService.addEmployee(employee);
	}
	
	@RequestMapping(value="/removeEmployee/{empId}", method = RequestMethod.DELETE)
	public void removeEmployee(@PathVariable int empId) {
		employeeService.removeEmployee(empId);
	}
	
	@RequestMapping(value="/updateEmployee/{empId}", method = RequestMethod.PUT)
	public void updateEmployee(@PathVariable int empId, @RequestBody Employee employee) {
		employeeService.updateEmployee(empId, employee);
	}

}
