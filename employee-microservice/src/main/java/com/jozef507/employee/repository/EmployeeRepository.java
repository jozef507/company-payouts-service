package com.jozef507.employee.repository;

import com.jozef507.employee.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    //List<Employee> findAll();

    Employee findByEmployeeId(Long employeeId);


}
