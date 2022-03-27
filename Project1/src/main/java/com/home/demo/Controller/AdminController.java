package com.home.demo.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.home.demo.Entity.Application;
import com.home.demo.Entity.Tracker;
import com.home.demo.Exception.AdminException;
import com.home.demo.Service.IAdminService;

@RestController
@RequestMapping(value = "/")
public class AdminController {
	@Autowired
	private IAdminService adminService;

	@GetMapping(value = "/verifycustomer/{appId}")
	public ResponseEntity<String> getCustomerData(@PathVariable Integer appId) throws AdminException {

		String eligibilityStatus = "Not Eligible";
		Application application = adminService.getApplicationData(appId);

		System.out.println("In getCustomerForm controller " + application);

		if (application == null) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Application not found");
		}
		if (application.getDocs() != null && application.getDocs().size() == 3) {
			eligibilityStatus = "Eligible";
		}
		return ResponseEntity.ok(eligibilityStatus);

	}

	@PutMapping(value = "/update/{appId}")
	public Application updateCustomerById(Application application) throws AdminException {
		Application app = adminService.updateCustomerById(application);

		return app;
	}

	@RequestMapping(value = "/approve/{appId}")
	public Tracker approve(@RequestBody Tracker tracker) throws AdminException {

		Tracker appId;
		Tracker tracker1 = new Tracker();
		adminService.approve(tracker1);

		int status = tracker1.getStatus();

		System.err.println("STATUS : " + status);
		// return "approved";
		return tracker1;
	}

	@PutMapping(value = "/reject/{appId}")
	public Tracker rejectStatus(@RequestBody Tracker tracker) throws AdminException {
		Tracker tracker1 = new Tracker();

		tracker1.setStatus(3);
		adminService.reject(tracker1);

		int status = tracker1.getStatus();

		System.err.println("STATUS : " + status);
		return tracker1;
	}

}
