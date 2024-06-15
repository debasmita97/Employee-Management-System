package com.example.employee_management_system.employee;

import com.example.employee_management_system.bank.BankDetails;
import com.example.employee_management_system.iou.IOU;
import com.example.employee_management_system.project.Project;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Getter
@Setter
@Document
public class Employee {

    @Id
    private String employeeId;
    @NotNull(message = "FirstName can not be null")
    @NotBlank(message = "FirstName can not be blank")
    private String employeeFirstName;
    @NotNull(message = "LastName can not be null")
    @NotBlank(message = "LastName can not be blank")
    private String employeeLastName;
    @NotNull(message = "Email can not be null")
    @NotBlank(message = "Email can not be blank")
    @Email
    private String employeeEmail;
    @NotNull(message = "phonenumber can not be null")
    @NotBlank(message = "phonenumber can not be blank")
    @Pattern(regexp = "\\d{10}$", message = "invalid phoneNumber")
    private String employeeContactNo;
    @NotNull(message = "location can not be null")
    @NotBlank(message = "location can not be blank")
    private String location;
    @NotNull(message = "designation can not be null")
    @NotBlank(message = "designation can not be blank")
    private String designation;
    @NotNull(message = "dateOfJoining can not be null")
    @NotBlank(message = "dateOfJoining can not be blank")
    @PastOrPresent(message = "dateOfJoining must be in past or present")
    @JsonFormat(pattern="dd/MM/yyyy")
    private Date dateOfJoining;
    @NotNull(message = "dateofbirth can not be null")
    @NotBlank(message = "dateofbirth can not be blank")
    @Past(message = "dateofbirth must be in past")
    @JsonFormat(pattern="dd/MM/yyyy")
    private Date dateOfBirth;
    @NotNull(message = "employeeStatus can not be null")
    @NotBlank(message = "employeeStatus can not be blank")
    private String employeeStatus;
    @NotNull(message = "gender can not be null")
    @NotBlank(message = "gender can not be blank")
    @Pattern(regexp = "^(?:m|M|male|Male|f|F|female|Female|Other|other)$", message = "Invalid gender")
    private String gender;
    @NotNull(message = "bloodGroup can not be null")
    @NotBlank(message = "bloodGroup can not be blank")
    @Pattern(regexp = "^(A|B|AB|O)[+-]$\n", message = "invalid bloodgroup")
    private String bloodGroup;
    private Project project;
    private IOU iou;
    private BankDetails bankDetails;



    public Employee(String employeeId, String employeeFirstName, String employeeLastName, String employeeEmail, String
                    employeeContactNo, String location, String designation, Date dateOfJoining, Date dateOfBirth,
                    String employeeStatus, String gender, String bloodGroup, Project project, IOU iou, BankDetails bankDetails) {
        this.employeeId = employeeId;
        this.employeeFirstName = employeeFirstName;
        this.employeeLastName = employeeLastName;
        this.employeeEmail = employeeEmail;
        this.employeeContactNo = employeeContactNo;
        this.location = location;
        this.designation = designation;
        this.dateOfJoining = dateOfJoining;
        this.dateOfBirth = dateOfBirth;
        this.employeeStatus = employeeStatus;
        this.gender = gender;
        this.bloodGroup = bloodGroup;
        this.project = project;
        this.iou = iou;
        this.bankDetails = bankDetails;
    }

    public Employee() {
    }
}
