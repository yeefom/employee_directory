package com.yeefom.employeedirectory.dao;

import com.yeefom.employeedirectory.entity.Employee;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
