package com.example.employee_management_system.controller;

import com.example.employee_management_system.employee.Employee;
import com.example.employee_management_system.service.EmployeeService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @PostMapping("/addEmployee")
    public Employee addEmployee(@Valid @RequestBody Employee employee){
        return employeeService.addEmployee(employee);
    }

    @GetMapping(value = "/getAllEmployees")
    public List<Employee> getAllEmployee(){
        return employeeService.getAllEmployee();
    }

    @GetMapping(value = "/getAllEmployeesPagination")
    public List<Employee> getAllEmployeePagination(@RequestParam int pageNo, @RequestParam int pageSize){
        return employeeService.getAllEmployeePaging(pageNo,pageSize);
    }

    @GetMapping(value = "/getEmployeeByID")
    public Optional<Employee> getEmployeeByID(@RequestParam String id){
        return employeeService.getEmployeeById(id);
    }

    @PutMapping(value="/updateEmployee")
    public Employee updateEmployee(@Valid @RequestBody Employee employee){
        return employeeService.updateEmployee(employee);
    }

    @PatchMapping(value = "/updateEmployeePartial")
    public Employee updateLocation(@RequestParam String id, @RequestBody Map<String, Object> fields)
    {
        return employeeService.updateEmployeeByField(id, fields);
    }

    @DeleteMapping(value="/deleteEmployee")
    public void deleteEmployeebyID(@RequestParam String id){
         employeeService.deleteEmployee(id);
    }

    @GetMapping(value = "/getEmployeeByIouName")
    public List<Employee> getEmployeeByIouName(@RequestParam String iouName){
        return employeeService.getEmployeeByIouName(iouName);
    }

    @GetMapping(value = "/getEmployeeByProjectID")
    public List<Employee> getEmployeeByProjectID(@RequestParam int projectID){
        return employeeService.getEmployeeByProjectId(projectID);
    }

    @GetMapping(value = "/getEmployeeByProjectName")
    public List<Employee> getEmployeeByProjectName(@RequestParam String projectName){
        return employeeService.getEmployeeByProjectName(projectName);
    }

    @GetMapping(value = "/getEmployeeByDesignationAndLocation")
    public List<Employee> getEmployeeByDesignationAndLocation(@RequestParam String designation, @RequestParam String location){
        return employeeService.findEmployeeByDesignationAndLocation(designation,location);
    }

    @GetMapping(value = "/getEmployeeFirstNameStartsWith")
    public List<Employee> getEmployeeFirstNameStartsWith(@RequestParam String startWith){
        return employeeService.findEmployeeFirstNameStartsWith(startWith);
    }

}
