package com.home.demo.Dao;

import com.home.demo.Entity.Application;
import com.home.demo.Exception.AdminException;



public interface IAdminDao {

	public Application getApplicationData(Integer appId)throws AdminException;
}

