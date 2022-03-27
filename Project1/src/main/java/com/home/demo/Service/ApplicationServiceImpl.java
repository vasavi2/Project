package com.home.demo.Service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.home.demo.Dao.ApplicationDao;
import com.home.demo.Entity.Application;

@Service
@Transactional
public class ApplicationServiceImpl implements ApplicationService 
{

	@Autowired
	ApplicationDao adao;
	@Override
	public boolean saveApplication(Application app) {
		return adao.saveApplication(app);
		
	}

	@Override
	public List<Application> getApplications() {
		return adao.getApplications();
		
	}

	@Override
	public Application getApplication(Integer applId) {
		return adao.getApplication(applId);
	}

	

}
