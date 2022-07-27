package com.jozef507.employee.controller;

import com.jozef507.employee.entity.SalaryConditions;
import com.jozef507.employee.service.SalaryConditionsSevice;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/salary-conditions")
@Slf4j
public class SalaryConditionsController {

    @Autowired
    private SalaryConditionsSevice salaryConditionsSevice;

    @PostMapping("/")
    public SalaryConditions saveESalaryConditions(@RequestBody SalaryConditions salaryConditions){
        log.info("Inside saveESalaryConditions method of SalaryConditionsController!");
        return salaryConditionsSevice.saveSalaryConditions(salaryConditions);
    }

    @GetMapping("/")
    public List<SalaryConditions> findAllSalaryConditions(){
        log.info("Inside findAllSalaryConditions method of SalaryConditionsController!");
        return salaryConditionsSevice.findAllSalaryConditions();

    }

}
