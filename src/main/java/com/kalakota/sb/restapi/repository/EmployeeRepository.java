package com.kalakota.sb.restapi.repository;

import com.kalakota.sb.restapi.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
