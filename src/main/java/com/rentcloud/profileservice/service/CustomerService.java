package com.rentcloud.profileservice.service;

import org.springframework.stereotype.Service;

import com.rentcloud.rentcloud_commons.model.Customer;

@Service
public interface CustomerService { 

	//Save Customer
	Customer save(Customer customer); 
	

}
