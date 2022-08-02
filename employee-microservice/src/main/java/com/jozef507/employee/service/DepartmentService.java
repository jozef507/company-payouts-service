package com.jozef507.employee.service;

import com.jozef507.employee.entity.Component;
import com.jozef507.employee.entity.Department;
import com.jozef507.employee.repository.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class DepartmentService {
    @Autowired
    private DepartmentRepository departmentRepository;

    public Department saveDepartment(Department department){
        log.info("Inside saveDepartment method of DepartmentService!");
        makeDepartmentConnections(department);
        return departmentRepository.save(department);
    }

    public List<Department> findDepartments(){
        log.info("Inside findDepartments method of DepartmentService!");
        return departmentRepository.findAll();
    }

    public Department findDepartmentById(Long departmentId){
        log.info("Inside findDepartmentById method of DepartmentService!");
        return departmentRepository.findByComponentId(departmentId);
    }

    private void makeDepartmentConnections(Department department){
        if(department.getComponents() != null){
            for(Component component : department.getComponents()){
                component.setParent(department);
                if(component instanceof Department)
                    makeDepartmentConnections((Department) component);
            }
        }
    }
}
