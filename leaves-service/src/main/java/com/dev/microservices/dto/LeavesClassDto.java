package com.dev.microservices.dto;


import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class LeavesClassDto {
    private long classId;
    private String employeeName;
    private long employeeId;
    private String leaveName;
    private long leaveId;
    private int numberOfLeave;
    private int year;
}
