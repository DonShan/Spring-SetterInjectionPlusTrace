package com.madushan.traning.salesmanager.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.madushan.training.salesmanager.repository.EmployeeRepository;
import com.madushan.training.salesmanager.repository.HibernateEmployeeRepositoryImpl;
import com.madushan.training.salesmanager.service.EmployeeService;
import com.madushan.training.salesmanager.service.EmployeeServiceImpl;


@Configuration
public class ApplicationConfiguration {
	
	@Bean(name = "employeeService")
	public EmployeeService getEmployeeService() {
		return new EmployeeServiceImpl();
	}
	
	EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
	employeeService.setEmployeeRepository(getEmployeeRepository());
	
	@Bean(name = "employeeRepository")
	public EmployeeRepository getEmployeeRepository() {
		return new HibernateEmployeeRepositoryImpl();
	}

}
