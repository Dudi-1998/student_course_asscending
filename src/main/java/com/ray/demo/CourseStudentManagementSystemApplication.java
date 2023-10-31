package com.ray.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
@SpringBootApplication
public class CourseStudentManagementSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(CourseStudentManagementSystemApplication.class, args);
	}

}
