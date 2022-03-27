package com.home.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.home.demo.Entity.Tracker;
import com.home.demo.Exception.LoanException;
import com.home.demo.Service.ITrackerService;

@RestController
@RequestMapping(value="/")
public class TrackerController {
	
	@Autowired
	private ITrackerService trackerService;
	
	@GetMapping("/getStatus")
	public Integer getStatusById(@RequestBody Tracker  tracker) throws LoanException {
		Integer stat=trackerService.getStatusById(tracker);
		System.err.println("STATUS "+trackerService.getStatusById(tracker));
		return stat;
		
		
		
		
	}
	
	
	

}
