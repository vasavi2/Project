package com.home.demo.Service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.home.demo.Dao.LoginDao;
import com.home.demo.Entity.Login;

@Service
@Transactional
public class LoginServiceImpl implements LoginService {
	
	
	@Autowired
	LoginDao ldao;
	@Override
	 public boolean addLogin(Login l) {
		return ldao.addLogin(l);
	}

	@Override
	public List<Login> getAllLogin(){
		return ldao.getAllLogin();
	}
}












