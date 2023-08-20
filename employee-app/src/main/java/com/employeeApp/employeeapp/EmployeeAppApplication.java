package com.employeeApp.employeeapp;

import com.employeeApp.employeeapp.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class EmployeeAppApplication implements ApplicationRunner {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeAppApplication.class, args);
	}

	@Autowired
	private EmployeeService employeeService;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("Hello World");

		String newEmployee = employeeService.getNewEmployee();
		System.out.println(newEmployee);
		List<String> employeesList = employeeService.getNewEmployee(10);
		for (String employee : employeesList) {
			System.out.println(employee);
		}

	}
}
