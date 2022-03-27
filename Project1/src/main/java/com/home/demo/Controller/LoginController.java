package com.home.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.home.demo.Entity.Login;
import com.home.demo.Service.LoginService;

@RestController
@RequestMapping("/api")
public class LoginController {

	
	@Autowired
	
	LoginService loginService;
	
	@GetMapping("/l")
	public List<Login> getAllLogin()
	{
		return loginService.getAllLogin();
		
	}
	@PostMapping("/login")
	public boolean addLogin(@RequestBody Login l) {
		return loginService.addLogin(l);
}
}









