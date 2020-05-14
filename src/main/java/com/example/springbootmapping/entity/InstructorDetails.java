package com.example.springbootmapping.entity;

import lombok.*;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString(exclude = "instructor")
@Builder
@Entity
public class InstructorDetails {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long id;
    private String channel;
    private String hobby;

    @OneToOne(mappedBy = "instructorDetails", cascade = CascadeType.ALL)
    private Instructor instructor;

}