package com.example.employee_management_system.controller;

import com.example.employee_management_system.employee.Employee;
import com.example.employee_management_system.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @PostMapping("/addEmployee")
    public Employee addEmployee(@RequestBody Employee employee){
        return employeeService.addEmploytee(employee);
    }

    @GetMapping(value = "/getAllEmployees")
    public List<Employee> getAllEmployee(){
        return employeeService.getAllEmployee();
    }

    @GetMapping(value = "/getEmployee")
    public Optional<Employee> getEmployeeByID(@RequestParam String id){
        return employeeService.getEmployeeById(id);
    }

    @PutMapping(value="/updateEmployee")
    public Employee updateEmployee(@RequestBody Employee employee){
        return employeeService.updateEmployee(employee);
    }

    @DeleteMapping(value="/deleteEmployee")
    public void deleteEmployee(@RequestParam String id){
         employeeService.deleteEmployee(id);
    }

    @GetMapping(value = "/getEmployeeByIouName")
    public List<Employee> getEmployeeByIouName(@RequestParam String iouName){
        return employeeService.getEmployeeByIouName(iouName);
    }
}
