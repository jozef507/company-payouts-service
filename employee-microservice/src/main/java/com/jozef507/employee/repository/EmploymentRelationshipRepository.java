package com.jozef507.employee.repository;

import com.jozef507.employee.entity.EmploymentRelationship;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmploymentRelationshipRepository extends JpaRepository<EmploymentRelationship, Long> {
    EmploymentRelationship findByComponentId(Long employmentRelationshipId);

    List<EmploymentRelationship> findAllByEmployeeEmployeeId(Long id);
}
