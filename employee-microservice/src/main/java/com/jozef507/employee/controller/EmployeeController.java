package com.jozef507.employee.controller;

import com.jozef507.employee.entity.Employee;
import com.jozef507.employee.service.EmployeeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
@Slf4j
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/")
    @PutMapping("/")
    public Employee saveEmployee(@RequestBody Employee employee){
        log.info("Inside saveEmployee method of EmployeeController!");
        return employeeService.saveEmployee(employee);
    }

    @GetMapping("/")
    public List<Employee> findEmployees(){
        log.info("Inside findEmployees method of EmployeeController!");
        return employeeService.findEmployees();

    }
    @GetMapping("/{id}")
    public Employee findEmployeeById(@PathVariable("id") Long employeeId){
        log.info("Inside findEmployeeById method of EmployeeController!");
        return employeeService.findEmployeeById(employeeId);

    }

}
