package com.home.demo.Service;

import com.home.demo.Entity.Tracker;
import com.home.demo.Exception.LoanException;

public interface ITrackerService {
	public Integer getStatusById(Tracker tracker) throws LoanException;

}
