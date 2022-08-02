package com.jozef507.employee.service;

import com.jozef507.employee.entity.EmploymentRelationship;
import com.jozef507.employee.repository.EmploymentRelationshipRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Slf4j
public class EmploymentRelationshipService {
    @Autowired
    private EmploymentRelationshipRepository employmentRelationshipRepository;

    @Autowired
    EmployeeService employeeService;
    @Transactional
    public EmploymentRelationship saveEmploymentRelationship(EmploymentRelationship employmentRelationship){
        log.info("Inside saveEmploymentRelationship method of EmploymentRelationshipService!");

        //employmentRelationship.setEmployee(employeeService.findEmployeeById(employmentRelationship.getEmployee()));
        return employmentRelationshipRepository.save(employmentRelationship);
    }

    public List<EmploymentRelationship> findEmploymentRelationships(){
        log.info("Inside findEmploymentRelationships method in EmploymentRelationshipService!");
        return employmentRelationshipRepository.findAllEmploymentRelationships();
    }

    public EmploymentRelationship findEmploymentRelationshipById(Long employmentRelationshipId) {
        log.info("Inside findEmploymentRelationshipById method in EmploymentRelationshipService!");
        return employmentRelationshipRepository.findByComponentId(employmentRelationshipId);
    }

    public List<EmploymentRelationship> findEmploymentRelationshipsByEmployee(Long id){
        log.info("Inside findEmploymentRelationshipsByEmployee method in EmploymentRelationshipService!");
        //employeeService.findEmployeeById(id);
        return employmentRelationshipRepository.findAllByEmployeeEmployeeId(id);
    }

}
