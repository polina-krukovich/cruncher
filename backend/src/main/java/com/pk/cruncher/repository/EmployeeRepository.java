package com.pk.cruncher.repository;

import com.pk.cruncher.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, UUID> {
    Optional<Employee> findByUid(String uid);
    List<Employee> findAllByDeletedIsFalse();
    List<Employee> findAllByDeletedIsTrue();
}
