package com.sky.microservice;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDao {

	public List<Employee> getEmployee(){
		return Stream.of(
				new Employee(101,"Steve J","SVP",80,"MALE"),
				new Employee(102,"Milli R","VP",66,"FEMALE"),
				new Employee(103,"Jones","AVP",82,"MALE"),
				new Employee(104,"Pravin J","BA",78,"MALE"),
				new Employee(105,"Storm J","SSP",80,"MALE"),
				new Employee(106,"Sky J","AVP",83,"MALE")
				).collect(Collectors.toList());
	}
}
