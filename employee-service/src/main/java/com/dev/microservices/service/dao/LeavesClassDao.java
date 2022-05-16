package com.dev.microservices.service.dao;

import com.dev.microservices.service.entities.LeavesClass;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LeavesClassDao extends JpaRepository<LeavesClass, Long> {}
