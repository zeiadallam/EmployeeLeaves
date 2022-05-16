package com.dev.microservices.controller;

import com.dev.microservices.dto.LeavesClassDto;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Controller
@RequestMapping("/")
public class LeavesController {

    private final RestTemplate restTemplate;

    public LeavesController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }


    @GetMapping("/getLeaves")
//    @PreAuthorize("hasAuthority('SCOPE_profile')")
    public ResponseEntity<List<LeavesClassDto>> listClasses() {

        return restTemplate
                .exchange("http://employee-service/claleavesss", HttpMethod.GET, null,
                        new ParameterizedTypeReference<List<LeavesClassDto>>() {});
    }
}
