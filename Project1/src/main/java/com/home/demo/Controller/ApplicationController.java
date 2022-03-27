package com.home.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.home.demo.Entity.Application;
import com.home.demo.Service.ApplicationService;

@RestController
@RequestMapping("/rest/api/")
public class ApplicationController {

	@Autowired
	ApplicationService applService;

	@GetMapping("/applications")
	public List<Application> getApplications() {
		return applService.getApplications();

	}
	
	@GetMapping("/applications/{applId}")
	public Application getApplication(@PathVariable Integer applId) {
		return applService.getApplication(applId);
		
	}

	@PostMapping("/applications")
	public boolean saveApplication(@RequestBody Application app) {
		return applService.saveApplication(app);
	}
}
