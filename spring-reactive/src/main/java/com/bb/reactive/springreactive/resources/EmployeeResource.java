package com.bb.reactive.springreactive.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bb.reactive.springreactive.model.Employee;
import com.bb.reactive.springreactive.repository.EmployeeRepository;

import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/api")
public class EmployeeResource {

	EmployeeRepository employeeRepository;
	
	//constructor injection
	public EmployeeResource(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}
	
	public Flux<Employee> getAll() {
		
		return this.employeeRepository.findAll();
	}
}
