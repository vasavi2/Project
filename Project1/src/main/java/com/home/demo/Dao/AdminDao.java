package com.home.demo.Dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.home.demo.Entity.Application;
import com.home.demo.Exception.AdminException;


@Repository
public  class AdminDao implements IAdminDao {
	@PersistenceContext
	private EntityManager enitityManager;

	@Override
	public Application getApplicationData(Integer appId) throws AdminException {
		return enitityManager.find(Application.class, appId);
	}

	

	
}