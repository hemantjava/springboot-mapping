package com.example.springbootmapping;

import com.example.springbootmapping.entity.Student;
import com.example.springbootmapping.repo.CourseRepository;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@Log4j2
@SpringBootApplication
public class SpringbootMappingApplication implements CommandLineRunner {

    @Autowired
    private CourseRepository courseRepository;


    public static void main(String[] args) {
        SpringApplication.run(SpringbootMappingApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {


    }
}
