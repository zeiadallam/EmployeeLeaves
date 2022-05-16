package com.dev.microservices.service.services;

import com.dev.microservices.service.dao.LeavesClassDao;
import com.dev.microservices.service.dtos.LeavesClassDto;
import com.dev.microservices.service.entities.LeavesClass;
import com.thoughtworks.xstream.mapper.Mapper;
import jdk.internal.module.ModuleLoaderMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class LeavesClassServiceDB implements LeavesClassService {

    private final LeavesClassDao leavesClassDAO;

    @Autowired
    public LeavesClassServiceDB(LeavesClassDao leavesClassDAO) {
        this.leavesClassDAO = leavesClassDAO;
    }


    @Override
    public List<LeavesClassDto> listClasses() {

        return leavesClassDAO
                .findAll()
                .stream()
                .map( classObj -> LeavesClassDto
                        .builder()
                        .leaveName( classObj.getEmployee().getName() )
                        .leaveId( classObj.getEmployee().getId() )
                        .numberOfLeave( classObj.getLeaves().size() )
                        .classId( classObj.getId() )
                        .build()
                )
                .collect(Collectors.toList());
    }

    @Override
    public void saveLeave(LeavesClassDto leavesClassDto) {

        leavesClassDAO.save(new LeavesClass());
    }


}
