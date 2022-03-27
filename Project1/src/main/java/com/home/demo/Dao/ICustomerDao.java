package com.home.demo.Dao;

import java.util.List;
import com.home.demo.Entity.Customer;

public interface ICustomerDao 
  {
	
		public List<Customer> listAllCustomer();
		
		public Customer addCustomerDetails(com.home.demo.Entity.Customer customer);
		
		public String updateEmail(String email);
		
		public String  deleteByEmail(String email);

		public Customer updateCustomerDetails(Customer customer);
	}
		
		
	
		


		



