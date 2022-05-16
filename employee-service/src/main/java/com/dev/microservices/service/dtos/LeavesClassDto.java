package com.dev.microservices.service.dtos;


import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class LeavesClassDto {
    private long classId;
    private String employeeName;
    private long employeeId;
    private String leaveName;
    private long leaveId;
    private int numberOfLeave;
    private int year;
}
