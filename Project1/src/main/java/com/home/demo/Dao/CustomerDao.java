package com.home.demo.Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.home.demo.Entity.Customer;

@Repository
public class CustomerDao implements ICustomerDao {

	@PersistenceContext
	EntityManager em;

	@Override
	@Transactional

	public Customer addCustomerDetails(Customer customer) {
		em.persist(customer);
		return customer;

	}

	@Override
	public List<Customer> listAllCustomer() {
		// TODO Auto-generated method stub
		String sql = "Select customer From Customer customer";
		TypedQuery<Customer> qry = em.createQuery(sql, Customer.class);
		List<Customer> customerList = qry.getResultList();
		return customerList;
	}

	@Override
	@Transactional
	public Customer updateCustomerDetails(Customer customer) {
		// TODO Auto-generated method stub
		Customer user = em.find(Customer.class, customer.getCustomerId());
		em.merge(user);
		return user;
	}
	/*
	 * public Customer getCustomerByEmail() { String
	 * sql="Select customer From Customer customer where email=username"; Query
	 * qry=em.createQuery(sql); Customer customerEmail=((Customer) qry).getEmail();
	 * return qry;
	 * 
	 * }
	 */

	@Override
	@Transactional
	public String deleteByEmail(String email) {
		// TODO Auto-generated method stub
		Customer customer = em.find(Customer.class, email);
		em.remove(customer);
		return customer.getEmail();
	}

	@Override
	public String updateEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}

}
