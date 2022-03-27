package com.home.demo.Dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.home.demo.Entity.Application;
import com.home.demo.Exception.AdminException;

@Repository
public class ApplicationDaoImpl implements ApplicationDao {
	@Autowired
	EntityManager eMan;

	@Override
	public boolean saveApplication(Application app) {
		eMan.persist(app);
		return true;
	}

	@Override
	public List<Application> getApplications() {

		return eMan.createQuery("from Application", Application.class).getResultList();
	}

	@Override
	public Application getApplication(Integer applId) {
		return eMan.find(Application.class, applId);
	}

	@Override
	public Application updateApplication(Application app) throws AdminException {
		return eMan.merge(app);
	}
}
