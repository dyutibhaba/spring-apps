package com.bb.reactive.springreactive;

import java.util.UUID;
import java.util.stream.Stream;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.bb.reactive.springreactive.model.Employee;
import com.bb.reactive.springreactive.repository.EmployeeRepository;

@SpringBootApplication
public class SpringReactiveApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringReactiveApplication.class, args);
	}
	
	@Bean
	CommandLineRunner employees(EmployeeRepository employeeRepository) {
		return args -> {
			employeeRepository.deleteAll().subscribe(null, null, () -> {
				Stream.of(new Employee(UUID.randomUUID().toString(), "Bhaba", 41000L),
						new Employee(UUID.randomUUID().toString(), "Deba", 41000L),
						new Employee(UUID.randomUUID().toString(), "Kanhu", 41000L),
						new Employee(UUID.randomUUID().toString(), "Sanu", 41000L))
						.forEach(employee -> {
							employeeRepository.save(employee)
							.subscribe( System.out::println);
						});
			});
		};
	}
}
