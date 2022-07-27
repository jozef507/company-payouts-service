package com.jozef507.employee.repository;

import com.jozef507.employee.entity.SalaryConditions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SalaryConditionsRepository extends JpaRepository<SalaryConditions, Long> {

    SalaryConditions findBySalaryConditionsId(Long salaryConditionsId);
}
