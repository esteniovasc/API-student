package com.crud_test.api_student;

import org.springframework.boot.SpringApplication;

public class TestApiStudentApplication {

	public static void main(String[] args) {
		SpringApplication.from(ApiStudentApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
