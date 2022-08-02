package com.jozef507.employee.controller;

import com.jozef507.employee.entity.Department;
import com.jozef507.employee.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/")
    public Department saveDepartment(@RequestBody Department department){
        log.info("Inside saveDepartment method of DepartmentController!");
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/")
    public List<Department> findAllDepartments(){
        log.info("Inside saveDepartment method of DepartmentController!");
        return departmentService.findDepartments();
    }

    @GetMapping("/{id}")
    public Department findDepartmentById(@PathVariable("id") Long departmentId){
        log.info("Inside findDepartmentById method of DepartmentController!");
        return departmentService.findDepartmentById(departmentId);
    }
}
