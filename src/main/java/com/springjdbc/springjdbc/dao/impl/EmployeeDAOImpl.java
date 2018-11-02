package com.springjdbc.springjdbc.dao.impl;

import com.springjdbc.springjdbc.dao.EmployDAO;
import com.springjdbc.springjdbc.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeDAOImpl implements EmployDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Override
    public void createEmployee(Employee employee) {
        String CREATE_EMPLOYEE = "INSERT INTO employee table(employee_name,email,salary) VALUES(?,?,?)";
        jdbcTemplate.update(CREATE_EMPLOYEE,employee.getEmployeeName(),employee.getEmail(),employee.getSalary());
    }

    @Override
    public Employee getEmployee() {
        return null;
    }

    @Override
    public void updateEmployee(Integer employeeId, String newEmail) {

    }

    @Override
    public Employee deleteEmployee(Integer employeeId) {
        return null;
    }
}
