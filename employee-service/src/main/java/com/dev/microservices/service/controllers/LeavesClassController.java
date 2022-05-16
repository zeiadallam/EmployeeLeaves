package com.dev.microservices.service.controllers;


import com.dev.microservices.service.dtos.LeavesClassDto;
import com.dev.microservices.service.services.LeavesClassService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/leaves")
public class LeavesClassController {


    private final LeavesClassService leavesClassService;

    public LeavesClassController(LeavesClassService leavesClassService) {
        this.leavesClassService = leavesClassService;
    }

    @GetMapping
    public List<LeavesClassDto> listClasses() {
        return leavesClassService.listClasses();
    }

    @PostMapping("/submitLeave")

    public boolean submitLeave(LeavesClassDto leavesClassDto) {
        leavesClassService.saveLeave(leavesClassDto);
        return true;
    }

}
