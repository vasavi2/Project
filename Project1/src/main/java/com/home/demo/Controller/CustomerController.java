package com.home.demo.Controller;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.home.demo.Entity.Customer;
import com.home.demo.Service.ICustomerService;

@RestController
@RequestMapping("/customers")
public class CustomerController {
	@Autowired
	private ICustomerService customerService;

	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> newUserRegistration(@RequestBody Customer customer) {
		System.out.println(customer);
		if(Objects.isNull(customer)){
			return ResponseEntity.badRequest().body("Mandatory data missing");
		}
		if(customer.getLastName()==null || customer.getLastName().isBlank() )	{
			
		}
		try {
			customerService.addCustomerDetails(customer);
			
		}
		catch(Exception e) {
			e.printStackTrace();
		return	ResponseEntity.internalServerError().body("Error Occured while saving customer details");
		
			
		}
	
		return ResponseEntity.ok("success");
	}

	@GetMapping
	public List<Customer> getCustomers() {
		Customer c1 = new Customer();
		c1.setEmail("a@gmail.com");
		Customer c2 = new Customer();
		c2.setEmail("b@gmail.com");
		return Arrays.asList(c1, c2);
	}
	
	@GetMapping(path="/{id}")
	public Customer getCustomer(@PathVariable Integer id) {
		Customer c1 = new Customer();
		c1.setCustomerId(id);
		return c1;
		
	}

}
