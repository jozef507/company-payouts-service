package com.jozef507.employee.service;

import com.jozef507.employee.entity.Employee;
import com.jozef507.employee.repository.EmployeeRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee saveEmployee(Employee employee) {
        log.info("Inside saveEmployee method of EmployeeService!");
        return employeeRepository.save(employee);
    }

    public List<Employee> findEmployees() {
        log.info("Inside findEmployees method of EmployeeService!");
        return employeeRepository.findAll();
    }

    public Employee findEmployeeById(Long employeeId) {
        log.info("Inside findEmployeeById method of EmployeeService!");
        return employeeRepository.findByEmployeeId(employeeId);
    }
}
