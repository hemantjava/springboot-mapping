package com.example.springbootmapping.repo;

import com.example.springbootmapping.entity.Course;
import com.example.springbootmapping.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Course,Long> {

}
