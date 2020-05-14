package com.example.springbootmapping.repo;

import com.example.springbootmapping.entity.Instructor;
import com.example.springbootmapping.entity.InstructorDetails;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;


@DataJpaTest
@Log4j2
class InstructorDetailsRepositoryTest {

    @Autowired
    private InstructorRepository instructorRepository;
    @Autowired
    private InstructorDetailsRepository instructorDetailsRepository;

    @Test
    void testUniDirectional(){
        List<Instructor> instructorList = instructorRepository.findAll();
        instructorList.forEach((x)->{
            log.info(x+" "+x.getInstructorDetails()+" "+x.getCourseSet());
        });
        Assertions.assertNotNull(instructorList);
    }

    @Test
    void testBiDirectional(){
        List<InstructorDetails> instructorDetailsList = instructorDetailsRepository.findAll();
        instructorDetailsList.forEach((x)->{
            log.info(x+"  "+x.getInstructor());
        });
        Assertions.assertNotNull(instructorDetailsList);
    }

}