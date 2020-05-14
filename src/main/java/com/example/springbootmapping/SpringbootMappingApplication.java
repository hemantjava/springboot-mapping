package com.example.springbootmapping;

import com.example.springbootmapping.entity.Course;
import com.example.springbootmapping.entity.Instructor;
import com.example.springbootmapping.entity.InstructorDetails;
import com.example.springbootmapping.repo.InstructorDetailsRepository;
import com.example.springbootmapping.repo.InstructorRepository;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import sun.tools.jar.CommandLine;

import java.util.HashSet;
import java.util.List;

@Log4j2
@SpringBootApplication
public class SpringbootMappingApplication implements CommandLineRunner {



	@Autowired
	private InstructorRepository instructorRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringbootMappingApplication.class, args);
	}

	@Override
	public void run (String... args) throws Exception {
		InstructorDetails instructorDetails = InstructorDetails.builder()
				.hobby("coding")
				.channel("hemantjava")
				.build();
		Course course1 = Course.builder()
				.title("java")
				.build();
		Course course2 = Course.builder()
				.title("spring")
				.build();

		Instructor instructor = Instructor.builder()
				.name("Hemant")
				.instructorDetails(instructorDetails)
				.build();
		instructor.setCourseDetails(course1,course2);

		Instructor instructorResult = instructorRepository.saveAndFlush(instructor);
		log.info(instructorResult+" "+instructorResult.getInstructorDetails()+" "+instructorResult.getCourseSet());

	}
}
