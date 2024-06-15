package com.example.employee_management_system.iou;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Document(collection = "iou")
public class IOU {
    @Id
    String iouName;
    String subIouName;
}
