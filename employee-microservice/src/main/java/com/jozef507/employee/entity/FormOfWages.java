package com.jozef507.employee.entity;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@JsonIdentityInfo(generator= ObjectIdGenerators.PropertyGenerator.class, property="formOfWagesId")
public class FormOfWages {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long formOfWagesId;
    private String name;
    private String performanceUnit;
    private String tariffUnit;

}
