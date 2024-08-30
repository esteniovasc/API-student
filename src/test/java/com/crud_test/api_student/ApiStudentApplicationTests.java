package com.crud_test.api_student;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

@Import(TestcontainersConfiguration.class)
@SpringBootTest
class ApiStudentApplicationTests {

	@Test
	void contextLoads() {
	}

}
