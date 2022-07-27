package com.jozef507.employee.service;

import com.jozef507.employee.entity.BasicWage;
import com.jozef507.employee.entity.SalaryConditions;
import com.jozef507.employee.repository.BasicWageRepository;
import com.jozef507.employee.repository.SalaryConditionsRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Slf4j
public class SalaryConditionsSevice {

    @Autowired
    private SalaryConditionsRepository salaryConditionsRepository;

    @Autowired
    private BasicWageRepository basicWageRepository;

    @Transactional
    public SalaryConditions saveSalaryConditions(SalaryConditions salaryConditions) {
        log.info("Inside saveSalaryConditions method of SalaryConditionsSevice!");

        for(BasicWage basicWage : salaryConditions.getBasicWages()){
            basicWage.setSalaryConditions(salaryConditions);
        }

        salaryConditionsRepository.save(salaryConditions);
        basicWageRepository.saveAll(salaryConditions.getBasicWages());

        return salaryConditions;
    }

    public List<SalaryConditions> findAllSalaryConditions() {
        log.info("Inside findEmployees method of EmployeeService!");
        return salaryConditionsRepository.findAll();
    }


}
