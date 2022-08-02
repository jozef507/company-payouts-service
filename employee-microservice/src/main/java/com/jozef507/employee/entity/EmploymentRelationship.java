package com.jozef507.employee.entity;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.*;

import javax.persistence.Basic;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@DiscriminatorValue("employment_relationship")
//@JsonTypeName("EmploymentRelationship")
@JsonIdentityInfo(generator= ObjectIdGenerators.PropertyGenerator.class, property="componentId")
public class EmploymentRelationship extends Component {

    /*@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long employmentRelationshipId;*/
    private String name;
    @Basic
    private java.time.LocalDate dateFrom;
    @Basic
    private java.time.LocalDate dateTo;
    private String description;
    @ManyToOne
    private Employee employee;

    public void calculateSalary(){

    }
}
