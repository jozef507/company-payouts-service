package com.jozef507.employee.controller;

import com.jozef507.employee.entity.EmploymentRelationship;
import com.jozef507.employee.service.EmploymentRelationshipService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employment-relationships")
@Slf4j
public class EmploymentRelationshipController {

    @Autowired
    private EmploymentRelationshipService employmentRelationshipService;

    @PostMapping("/")
    public EmploymentRelationship saveEmploymentRelationship(@RequestBody EmploymentRelationship employmentRelationship){
        log.info("Inside saveEmploymentRelationship method of EmploymentRelationshipController!");
        return employmentRelationshipService.saveEmploymentRelationship(employmentRelationship);
    }

    @GetMapping("/")
    public List<EmploymentRelationship> findEmploymentRelationships(){
        log.info("Inside findEmploymentRelationships method of EmploymentRelationshipController!");
        return employmentRelationshipService.findEmploymentRelationships();
    }

    @GetMapping("/{id}")
    public EmploymentRelationship findEmploymentRelationshipById(@PathVariable("id") Long employmentRelationshipId){
        log.info("Inside findEmploymentRelationshipById method of EmploymentRelationshipController!");
        return employmentRelationshipService.findEmploymentRelationshipById(employmentRelationshipId);
    }

    @GetMapping("/by-employee/{id}")
    public List<EmploymentRelationship> findEmploymentRelationshipsByEmployee(@PathVariable("id") Long id){
        log.info("Inside findEmploymentRelationshipsByEmployee method of EmploymentRelationshipController!");
        return employmentRelationshipService.findEmploymentRelationshipsByEmployee(id);
    }
}
