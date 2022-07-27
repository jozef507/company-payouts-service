package com.jozef507.employee.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
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
