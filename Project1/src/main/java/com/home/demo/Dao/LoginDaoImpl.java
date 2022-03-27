package com.home.demo.Dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.home.demo.Entity.Login;

@Repository
public class LoginDaoImpl  implements LoginDao{
	@Autowired
	EntityManager em;

	@Override
	public boolean addLogin(Login l) {
		// TODO Auto-generated method stub
		em.persist(l);
		return true;
	}

	

	@Override
	public List<Login> getAllLogin() {
		// TODO Auto-generated method stub
		return em.createQuery("from login").getResultList();
		
		
	}

}



