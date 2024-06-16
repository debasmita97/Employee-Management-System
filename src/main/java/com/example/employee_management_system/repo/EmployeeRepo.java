package com.example.employee_management_system.repo;

import com.example.employee_management_system.employee.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepo extends MongoRepository<Employee, String> {
    List<Employee> findByIouIouName(String iouName);

    List<Employee> findByProjectProjectId(int projectID);

    List<Employee> findByProjectProjectName(String projectName);

    List<Employee> findByDesignationAndLocation(String designation, String location);

    List<Employee> findByEmployeeFirstNameStartsWith(String startWith);
}
