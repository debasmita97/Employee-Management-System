package com.example.employee_management_system.bank;

import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "bankdetails")
public class BankDetails {

    @Id
    @Pattern(regexp = "\\D", message = "Invalid bankName")
    private String bankName;
    @Pattern(regexp = "\\d", message = "Invalid accountNumber")
    private String accountNumber;
    @Size(min = 11, max = 11,message = "Invalid IFSE Code")
    @Pattern(regexp ="[a-z, A-Z, 0-9]", message = "Invalid IFSE Code")
    private String ifseCode;
}
