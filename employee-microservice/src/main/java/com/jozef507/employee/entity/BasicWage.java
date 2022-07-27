package com.jozef507.employee.entity;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@JsonIdentityInfo(generator= ObjectIdGenerators.PropertyGenerator.class, property="basicWageId")
public class BasicWage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long basicWageId;
    private BigDecimal tariffForUnit;
    private Boolean canEmployeeRecordHimself;
    private Boolean mustTimeRecord;
    private Boolean canEmergencyRecord;
    @ManyToOne
    private SalaryConditions salaryConditions;
    @ManyToOne
    private FormOfWages formOfWages;

}
