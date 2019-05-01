package com.yeefom.employeedirectory.dao;

import java.util.List;

import javax.persistence.EntityManager;

import com.yeefom.employeedirectory.entity.Employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDaoJpaImpl implements EmployeeDao{

    private EntityManager entityManager;

    @Autowired
    public EmployeeDaoJpaImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Employee> findAll() {
        return entityManager
                .createQuery("from Employee", Employee.class)
                .getResultList();
    }

    @Override
    public Employee findById(int id) {
        return entityManager.find(Employee.class, id);
    }

    @Override
    public Employee save(Employee employee) {
        return entityManager.merge(employee);
    }

    @Override
    public void delete(int id) {
        entityManager
                .createQuery("delete from Employee where id=:employeeId")
                .setParameter("employeeId", id)
                .executeUpdate();
    }
}
