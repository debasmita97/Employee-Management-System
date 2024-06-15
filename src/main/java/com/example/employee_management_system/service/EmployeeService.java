package com.example.employee_management_system.service;

import com.example.employee_management_system.employee.Employee;
import com.example.employee_management_system.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepo employeeRepo;

    public List<Employee> getAllEmployee(){
        return employeeRepo.findAll();
    }

    public Employee addEmploytee(Employee employee) {
        return employeeRepo.save(employee);
    }

    public Optional<Employee> getEmployeeById(String id) {
        return employeeRepo.findById(id);
    }

    public Employee updateEmployee(Employee employee) {
        return employeeRepo.save(employee);
    }

    public void deleteEmployee(String id) {
        employeeRepo.deleteById(id);
    }

    public List<Employee> getEmployeeByIouName(String iouName) {
        return employeeRepo.findByIouIouName(iouName);
    }
}
