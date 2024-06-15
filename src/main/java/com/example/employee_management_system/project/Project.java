package com.example.employee_management_system.project;

import jakarta.validation.constraints.Pattern;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Document(collection = "project")
public class Project {
    @Pattern(regexp = "\\d", message = "Invalid projectId")
    @Id
    int projectId;
    String projectName;

    public Project(int projectId, String projectName) {
        this.projectId = projectId;
        this.projectName = projectName;
    }

    public Project() {
    }
}
