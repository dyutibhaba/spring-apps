package com.bb.reactive.springreactive.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.bb.reactive.springreactive.model.Employee;

public interface EmployeeRepository extends ReactiveMongoRepository<Employee, String>{

}
