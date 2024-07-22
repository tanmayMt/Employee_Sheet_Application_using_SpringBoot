package org.employeesheet.employeesheet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmployeesheetApplication {

	public static void main(String[] args) {
		//System.out.println("\nHello");
		System.out.println(MyController.myMethod());
		SpringApplication.run(EmployeesheetApplication.class, args);
	}
}	