package com.springjdbc.springjdbc.dao;

import com.springjdbc.springjdbc.model.Employee;

public interface EmployDAO {
    public abstract void createEmployee(Employee employee);
    public abstract Employee getEmployee();
    public abstract void updateEmployee(Integer employeeId,String newEmail);
    public abstract Employee deleteEmployee(Integer employeeId);
}
