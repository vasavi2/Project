package com.home.demo.Service;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.home.demo.Dao.ICustomerDao;
import com.home.demo.Entity.Customer;


@Service
public class CustomerService implements ICustomerService{
	@Autowired
	private ICustomerDao customerDao;

	@Override
	
//	public List<Customer> getCustomerList()  {
//		return customerDao.getCustomerList();
//	}
//
//	@Override
//	
//	public boolean addCustomerDetails(Customer customer){
//		return customerDao.addCustomerDetails(customer);
//	}

//	@Override
	public List<Customer> listAllCustomer() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addCustomerDetails(Customer customer) {
		 customerDao.addCustomerDetails(customer);
		
	}

	@Override
	public String updateEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	

}