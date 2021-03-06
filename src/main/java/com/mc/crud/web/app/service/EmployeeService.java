package com.mc.crud.web.app.service;

import java.util.List;

import com.mc.crud.web.app.model.Employee;

public interface EmployeeService {
	List<Employee> getAllEmployees();
	void addEmployee(Employee employee);
	Employee getEmployeeById(long id);
	void deleteEmployeeById(long id);
}
