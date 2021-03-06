package com.yeefom.employeedirectory.dao;

import java.util.List;

import javax.persistence.EntityManager;

import com.yeefom.employeedirectory.entity.Employee;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDaoHibernateImpl implements EmployeeDao {

    private EntityManager entityManager;

    @Autowired
    public EmployeeDaoHibernateImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Employee> findAll() {
        Session session = entityManager.unwrap(Session.class);

        Query<Employee> query = session.createQuery("FROM Employee", Employee.class);

        return query.getResultList();
    }

    @Override
    public Employee findById(int id) {
        Session session = entityManager.unwrap(Session.class);

        return session.get(Employee.class, id);
    }

    @Override
    public Employee save(Employee employee) {
        Session session = entityManager.unwrap(Session.class);
        session.saveOrUpdate(employee);

        return employee;
    }

    @Override
    public void delete(int id) {
        Session session = entityManager.unwrap(Session.class);
        Query query = session.createQuery("DELETE FROM Employee WHERE id=:employeeId")
                .setParameter("employeeId", id);

        query.executeUpdate();
    }
}
