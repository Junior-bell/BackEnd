package com.nt.service;

import com.nt.model.Employee;

public interface IEmployeeMgmtService {
    String registerEmployee(Employee emp);
    Iterable<Employee> getAllEmployees();
    Employee getEmployeeById(Integer eno);
    void deleteEmployee(Integer eno);
    String updateEmployee(Employee emp);
}

