package com.home.demo.Dao;

import java.util.List;

import com.home.demo.Entity.Application;
import com.home.demo.Exception.AdminException;

public interface ApplicationDao {
	public boolean saveApplication(Application app);

	public List<Application> getApplications();

	public Application getApplication(Integer applId);

	public Application updateApplication(Application app) throws AdminException;

}
