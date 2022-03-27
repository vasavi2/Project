package com.home.demo.Service;


import java.util.List;

import com.home.demo.Entity.Application;



public interface ApplicationService 
{
	
	
	public List<Application> getApplications();
	public Application getApplication(Integer applId);
	boolean saveApplication (Application app);

}