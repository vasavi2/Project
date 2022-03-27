package com.home.demo.Service;

import java.util.List;

import com.home.demo.Entity.Login;



public interface LoginService {
	
	public List<Login> getAllLogin();
	public boolean addLogin (Login l);

}
