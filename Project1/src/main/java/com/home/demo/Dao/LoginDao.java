package com.home.demo.Dao;

import java.util.List;

import com.home.demo.Entity.Login;


public interface LoginDao {

	public  boolean addLogin(Login l);
	
	public  List<Login> getAllLogin();
	
}
