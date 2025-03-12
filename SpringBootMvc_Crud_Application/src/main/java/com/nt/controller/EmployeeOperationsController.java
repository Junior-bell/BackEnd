package com.nt.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.nt.model.Employee;
import com.nt.service.IEmployeeMgmtService;

@Controller
public class EmployeeOperationsController {

    @Autowired
    private IEmployeeMgmtService empService;

    // Show Home Page
    @GetMapping("/")
    public String showHome() {
        return "home"; // Returns home.jsp
    }

    // Show Employee Report
    @GetMapping("/emp_report")
    public String showEmployeeReport(Map<String, Object> map) {
        Iterable<Employee> itEmps = empService.getAllEmployees();
        map.put("empList", itEmps);
        return "show_employee_report"; // Returns show_employee_report.jsp
    }

    // Show Employee Registration Form
    @GetMapping("/emp_add")
    public String showFormSaveEmployee(@ModelAttribute("emp") Employee emp) {
        return "register_employee"; // Returns register_employee.jsp
    }

    // Save Employee to Database
    @PostMapping("/emp_add")
    public String saveEmployee(@ModelAttribute("emp") Employee emp, Map<String, Object> map) {
        String msg = empService.registerEmployee(emp);
        Iterable<Employee> itEmps = empService.getAllEmployees();
        map.put("resultmsg", msg);
        map.put("empList", itEmps);
        return "show_employee_report"; // Redirects to employee report after saving
    }

    // Delete Employee
    @GetMapping("/emp_delete")
    public String deleteEmployee(@RequestParam("no") Integer eno, Map<String, Object> map) {
        try {
            empService.deleteEmployee(eno);
            map.put("resultmsg", "Employee deleted successfully!");
        } catch (Exception e) {
            map.put("resultmsg", "Error: Unable to delete employee.");
        }
        Iterable<Employee> itEmps = empService.getAllEmployees();
        map.put("empList", itEmps);
        return "show_employee_report";
    }

    // Edit Employee (Show Edit Form)
    @GetMapping("/emp_edit")
    public String showEditEmployeeForm(@RequestParam("no") Integer eno, Map<String, Object> map) {
        Employee emp = empService.getEmployeeById(eno);
        map.put("emp", emp);
        return "edit_employee"; // Returns edit_employee.jsp
    }

    // Update Employee in Database
    @PostMapping("/emp_update")
    public String updateEmployee(@ModelAttribute("emp") Employee emp, Map<String, Object> map) {
        empService.updateEmployee(emp);
        map.put("resultmsg", "Employee updated successfully!");
        Iterable<Employee> itEmps = empService.getAllEmployees();
        map.put("empList", itEmps);
        return "show_employee_report"; // Redirects to employee report after updating
    }
}
