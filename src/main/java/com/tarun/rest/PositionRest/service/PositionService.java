package com.tarun.rest.PositionRest.service;

import java.util.List;

import com.tarun.rest.PositionRest.entities.Positions;

public interface PositionService {
      
	public List<Positions> getPositions();

	public Positions getPosition(long positionid);

	public Positions addPosition(Positions positions);

	public void deletePostion(long parseLong);

	public Positions updatePosition(Positions positions);
	
}
