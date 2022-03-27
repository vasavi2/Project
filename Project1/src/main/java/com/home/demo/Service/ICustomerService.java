package com.home.demo.Service;

import java.util.List;


import com.home.demo.Entity.Customer;




public interface ICustomerService {
	public List<Customer> listAllCustomer();
	
	public void  addCustomerDetails(Customer customer);
	
	public String updateEmail(String email);
	
	public String  deleteByEmail(String email);
}