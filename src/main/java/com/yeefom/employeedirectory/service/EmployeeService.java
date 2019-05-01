package com.yeefom.employeedirectory.service;

import java.util.List;

import com.yeefom.employeedirectory.entity.Employee;

public interface EmployeeService {

    public List<Employee> findAll();

    public Employee findById(int id);

    public Employee save(Employee employee);

    public void delete(int id);

}
