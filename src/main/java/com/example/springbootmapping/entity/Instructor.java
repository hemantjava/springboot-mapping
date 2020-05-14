package com.example.springbootmapping.entity;

import javassist.SerialVersionUID;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString(exclude = {"instructorDetails","courseSet"})
@Builder
@Entity
public class Instructor implements Serializable {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long id;
    private String name;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "instructorDetails_fk")
    private InstructorDetails instructorDetails;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "instructor_id")
    private Set<Course> courseSet;

   public void setCourseDetails(Course... courses) {
       if(courseSet==null) {
           courseSet  = new HashSet<>();
           for (Course course : courses) {
               courseSet.add(course);
           }
       }
   }

}
