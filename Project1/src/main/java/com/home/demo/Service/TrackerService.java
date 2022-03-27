package com.home.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.home.demo.Dao.ITrackerDao;
import com.home.demo.Entity.Tracker;
import com.home.demo.Exception.LoanException;

@Service
public class TrackerService  implements ITrackerService{
	
	@Autowired
	private ITrackerDao trackerDao;
	
	

	@Override
	public Integer getStatusById(Tracker tracker) throws LoanException {
		// TODO Auto-generated method stub
		return trackerDao.getStatusById(tracker);
	}

}
