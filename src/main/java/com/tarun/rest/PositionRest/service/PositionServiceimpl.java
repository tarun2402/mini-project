package com.tarun.rest.PositionRest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tarun.rest.PositionRest.dao.PositionDao;
import com.tarun.rest.PositionRest.entities.Positions;

@Service
public class PositionServiceimpl implements PositionService {
	@Autowired
	private PositionDao positionDao;
	
	@Override
	public List<Positions> getPositions() {
		return positionDao.findAll();
	}

	@SuppressWarnings("deprecation")
	@Override
	public Positions getPosition(long positionid) {
		return positionDao.getOne(positionid);
	}

	@Override
	public Positions addPosition(Positions positions) {
		positionDao.save(positions);
		return positions;
	}

	@Override
	public void deletePostion(long id) {
	
		positionDao.deleteById(id);
	}

	@Override
	public Positions updatePosition(Positions positions) {
		positionDao.save(positions);
		return positions;
	}
	

}
