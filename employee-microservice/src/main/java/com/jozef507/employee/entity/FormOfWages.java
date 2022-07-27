package com.jozef507.employee.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class FormOfWages {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long formOfWagesId;
    private String name;
    private String performanceUnit;
    private String tariffUnit;

}
