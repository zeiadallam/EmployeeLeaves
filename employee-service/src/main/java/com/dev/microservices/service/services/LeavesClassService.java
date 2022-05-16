package com.dev.microservices.service.services;

import com.dev.microservices.service.dtos.LeavesClassDto;

import java.util.List;

public interface LeavesClassService {

    List<LeavesClassDto> listClasses();

    void saveLeave(LeavesClassDto leavesClassDto);

}
