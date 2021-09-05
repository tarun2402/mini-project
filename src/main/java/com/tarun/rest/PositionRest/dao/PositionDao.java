package com.tarun.rest.PositionRest.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tarun.rest.PositionRest.entities.Positions;

public interface PositionDao extends JpaRepository<Positions, Long> {

}
