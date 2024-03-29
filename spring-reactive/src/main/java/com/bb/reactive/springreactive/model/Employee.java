package com.bb.reactive.springreactive.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@EqualsAndHashCode
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Document
public class Employee {

	@Id
	private String id;
	private String name;
	private Long salary;
	
}
