package com.madushan.training.salesmanager.repository;

import java.util.List;

import com.madushan.training.salesmanager.model.Employee;

public interface EmployeeRepository {

	List<Employee> getAllEmployees();

}