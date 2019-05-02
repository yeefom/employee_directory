package com.yeefom.employeedirectory.dao;

import com.yeefom.employeedirectory.entity.Employee;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path="members") // "employees" by default
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
