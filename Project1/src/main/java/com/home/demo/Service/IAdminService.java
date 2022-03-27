package com.home.demo.Service;

import com.home.demo.Entity.Application;
import com.home.demo.Entity.Tracker;
import com.home.demo.Exception.AdminException;


public interface IAdminService {
	
		public Application getApplicationData(Integer appId)throws AdminException;
		public Application updateCustomerById(Application  application) throws AdminException;
		public Tracker approve(Tracker tracker) throws AdminException;
		public Tracker reject(Tracker tracker) throws AdminException;
		
	}


