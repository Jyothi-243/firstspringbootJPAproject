package com.jsp.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.springboot.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
