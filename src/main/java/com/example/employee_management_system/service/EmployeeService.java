package com.example.employee_management_system.service;

import com.example.employee_management_system.employee.Employee;
import com.example.employee_management_system.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.util.ReflectionUtils;

import java.lang.reflect.Field;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepo employeeRepo;

    public List<Employee> getAllEmployee(){
        return employeeRepo.findAll();
    }

    public List<Employee> getAllEmployeePaging(int pageNo, int pageSize){
        Pageable pageable = PageRequest.of(pageNo-1,pageSize);
        return employeeRepo.findAll(pageable).getContent();
    }

    public Employee addEmployee(Employee employee) {
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

    public List<Employee> getEmployeeByProjectId(int projectID) {
        return employeeRepo.findByProjectProjectId(projectID);
    }

    public List<Employee> getEmployeeByProjectName(String projectName) {
        return employeeRepo.findByProjectProjectName(projectName);
    }

    public List<Employee> findEmployeeByDesignationAndLocation(String designation, String location) {
        return employeeRepo.findByDesignationAndLocation(designation,location);
    }

    public List<Employee> findEmployeeFirstNameStartsWith(String startWith) {
        return employeeRepo.findByEmployeeFirstNameStartsWith(startWith);
    }

    public Employee updateEmployeeByField(String id, Map<String, Object> fields) {
        Optional<Employee> existingEmployee = employeeRepo.findById(id);
        if(existingEmployee.isPresent())
        {
            fields.forEach((key,value)-> {
                Field field = ReflectionUtils.findField(Employee.class, key);
                field.setAccessible(true);
                ReflectionUtils.setField(field,existingEmployee.get(),value);
            });
            return employeeRepo.save(existingEmployee.get());
        }
        return null;
    }
}
