package com.madushan.training.salesmanager.repository;

import java.util.ArrayList;
import java.util.List;

import com.madushan.training.salesmanager.model.Employee;

@Repository("employeeRepository")
public class HibernateEmployeeRepositoryImpl implements EmployeeRepository {
	
	@Override
	public List<Employee> getAllEmployees(){
		List<Employee> employees = new ArrayList<>();
		
		Employee employee = new Employee();
		employee.setEmployeeName("Madushan");
		employee.setEmployeeLocation("Kalaniya");
		employees.add(employee);
		return employees;
	}

}
