package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.model.Customer;
import com.service.CustomerService;

@RestController
public class TestCustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	
	@PostMapping("/saveCustomer")
	public Customer save(@RequestBody Customer c)
	{
		return customerService.addCustomer(c);
	}
	
	
	

}
