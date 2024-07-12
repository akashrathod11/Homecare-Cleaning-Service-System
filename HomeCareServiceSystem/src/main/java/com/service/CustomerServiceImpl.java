package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.CustomerRepo;
import com.model.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepo customerRepo;

	@Override
	public Customer addCustomer(Customer c) {

		return customerRepo.save(c);
	}

}
