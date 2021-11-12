package com.rentcloud.profileservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rentcloud.profileservice.service.CustomerService;
import com.rentcloud.rentcloud_commons.model.Customer;

@RestController
@RequestMapping(value = "/services")
public class ProfileController {

	@Autowired
	CustomerService customerService;
	
	public Customer save(@RequestBody Customer customer) {
		return customerService.save(customer);
	}
}
