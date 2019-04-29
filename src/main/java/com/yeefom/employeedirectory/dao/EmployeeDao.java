package com.yeefom.employeedirectory.dao;

import java.util.List;

import com.yeefom.employeedirectory.entity.Employee;

public interface EmployeeDao {

    public List<Employee> findAll();
}
