package com.home.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.home.demo.Dao.ApplicationDao;
import com.home.demo.Dao.IAdminDao;
import com.home.demo.Entity.Application;
import com.home.demo.Entity.Tracker;
import com.home.demo.Exception.AdminException;

@Service
public class AdminService implements IAdminService {
	@Autowired
	private IAdminDao admindao;

	@Autowired
	private ApplicationDao applDao;

	@Override
	public Application getApplicationData(Integer appId) throws AdminException {
		return applDao.getApplication(appId);
	}


	@Override
	public Application updateCustomerById(Application application) throws AdminException {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Tracker approve(Tracker tracker) throws AdminException {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Tracker reject(Tracker tracker) throws AdminException {
		// TODO Auto-generated method stub
		return null;
	}

}