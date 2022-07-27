package com.jozef507.employee.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Basic;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@DiscriminatorValue("employment_relationship")
//@JsonTypeName("EmploymentRelationship")
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
    @ManyToOne
    private Component parent;

    public void calculateSalary(){

    }
}
