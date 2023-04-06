package com.sky.microservice;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
@RequestMapping("/employee")
public class EmpserviceApplication {

	@Autowired
    private EmployeeDao employeeDao;
	
	public static void main(String[] args) {
		SpringApplication.run(EmpserviceApplication.class, args);
	}
	
	@GetMapping
    public List<Employee> fetchOrders() {
        return employeeDao.getEmployee().stream().
                sorted(Comparator.comparing(Employee::getWeight)).collect(Collectors.toList());
    }
	

}
