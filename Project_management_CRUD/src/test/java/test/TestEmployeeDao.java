package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;


import Model.Project;
import Repositery.Project_Repositery;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
class TestProject {
	@Autowired
	private Project_Repositery service;

	@Test // to specify a method as the test case
	void testAddProject() {
		List<Project> list = List.of(
				new Project(1L, "Sample Project", "This is a sample project description.",
                        LocalDate.of(2024, 3, 9), LocalDate.of(2024, 3, 31)),
				new Project(1L, "Sample Project 2", "This is a sample project description.",
                        LocalDate.of(2024, 3, 9), LocalDate.of(2024, 3, 31)));
		List<Project> savedproject = service.saveAll(list);
		//1st arg : expected , 2nd arg :actual
		assertEquals(2, savedproject.size());
	}

}
