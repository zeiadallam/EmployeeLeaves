package com.dev.microservices.service.dao;

import com.dev.microservices.service.entities.Leaves;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LeavesDao extends JpaRepository<Leaves, Long> {

    List<Leaves> findByNameContaining(String name);

    List<Leaves> findByAgeBetween(short smallerAge, short biggerAge);

}
