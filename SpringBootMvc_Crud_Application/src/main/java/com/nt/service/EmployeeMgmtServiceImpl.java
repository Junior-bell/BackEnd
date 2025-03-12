package com.nt.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.model.Employee;
import com.nt.repo.IEmployeeRepository;

@Service
public class EmployeeMgmtServiceImpl implements IEmployeeMgmtService {

    @Autowired
    private IEmployeeRepository empRepo;

    // Register a new employee
    @Override
    public String registerEmployee(Employee emp) {
        empRepo.save(emp);
        return "Employee registered successfully!";
    }

    // Get all employees
    @Override
    public Iterable<Employee> getAllEmployees() {
        return empRepo.findAll();
    }

    // Get an employee by ID
    @Override
    public Employee getEmployeeById(Integer eno) {
        return empRepo.findById(eno)
                      .orElseThrow(() -> new IllegalArgumentException("Employee not found with ID: " + eno));
    }

    // Delete an employee
    @Override
    public void deleteEmployee(Integer eno) {
        if (empRepo.existsById(eno)) {
            empRepo.deleteById(eno);
        } else {
            throw new IllegalArgumentException("Employee not found with ID: " + eno);
        }
    }

    // Update an existing employee
    @Override
    public String updateEmployee(Employee emp) {
        Optional<Employee> existingEmp = empRepo.findById(emp.getEmpno()); // Fix: Use getEmpno()
        if (existingEmp.isPresent()) {
            empRepo.save(emp);
            return "Employee updated successfully!";
        } else {
            return "Employee with ID " + emp.getEmpno() + " not found!"; // Fix: Use getEmpno()
        }
    }
}
