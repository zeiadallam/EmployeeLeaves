package com.dev.microservices.service.dao;

import com.dev.microservices.service.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeDao extends JpaRepository<Employee, Long> {

    List<Employee> findByNameContaining(String name);
}
