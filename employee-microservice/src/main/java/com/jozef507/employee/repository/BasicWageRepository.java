package com.jozef507.employee.repository;

import com.jozef507.employee.entity.BasicWage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BasicWageRepository extends JpaRepository<BasicWage, Long> {

    BasicWage findByBasicWageId(Long basicWageId);
}
