package com.rentcloud.profileservice.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.rentcloud.profileservice.repository.CustomerRepository;
import com.rentcloud.rentcloud_commons.model.Customer;

public class CustomerServiceImpl implements CustomerService{
	
	@Autowired
	CustomerRepository customerRepository;

	@Override
	public Customer save(Customer customer) {   return customerRepository.save(customer);    }

}
