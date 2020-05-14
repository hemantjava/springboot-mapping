package com.example.springbootmapping.repo;

import com.example.springbootmapping.entity.InstructorDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InstructorDetailsRepository extends JpaRepository<InstructorDetails,Long> {
}
