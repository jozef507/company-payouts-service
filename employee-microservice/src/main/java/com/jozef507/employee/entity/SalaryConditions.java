package com.jozef507.employee.entity;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@JsonIdentityInfo(generator= ObjectIdGenerators.PropertyGenerator.class, property="salaryConditionsId")
public class SalaryConditions {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long salaryConditionsId;
    @Basic
    private java.time.LocalDate dateFrom;
    @Basic
    private java.time.LocalDate dateTo;
    @ManyToOne
    private EmploymentRelationship employmentRelationship;

    //@OneToMany(/*mappedBy = "salaryConditions",*/cascade = CascadeType.ALL,orphanRemoval = true)
    //@JoinColumn(name = "salary_conditions_id")
    @Transient
    private List<BasicWage> basicWages = new ArrayList<>();;
}
