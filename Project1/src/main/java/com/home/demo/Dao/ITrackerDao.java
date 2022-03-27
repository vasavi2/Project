package com.home.demo.Dao;

import com.home.demo.Entity.Tracker;
import com.home.demo.Exception.LoanException;

public interface ITrackerDao {

	public Integer getStatusById(Tracker tracker) throws LoanException;

}
