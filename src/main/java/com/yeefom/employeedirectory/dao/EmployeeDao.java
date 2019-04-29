package com.yeefom.employeedirectory.dao;

import java.util.List;

import com.yeefom.employeedirectory.entity.Employee;

public interface EmployeeDao {

    public List<Employee> findAll();

    public Employee findById(int id);

    public void save(Employee employee);

    public void delete(int id);

}
