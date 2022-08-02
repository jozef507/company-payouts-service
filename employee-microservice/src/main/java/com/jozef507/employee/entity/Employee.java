package com.jozef507.employee.entity;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.*;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@JsonIdentityInfo(generator= ObjectIdGenerators.PropertyGenerator.class, property="employeeId")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long employeeId;
    private String name;
    @Basic
    private java.time.LocalDate birthDate;
    private String phoneNumber;
    private String email;
    private String address;
    private Long userId;

    //bidirectional relationship
    //@OneToMany(mappedBy = "employee")
    //private List<EmploymentRelationship> employmentRelationships;
}
