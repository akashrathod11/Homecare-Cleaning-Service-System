package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.ServiceRepo;

@Service
public class ServiceServiceImpl implements ServiceService{

	
	@Autowired
	private ServiceRepo serviceRepo;
	
	
	@Override
	public com.model.Service addService(com.model.Service s) {
		
		return serviceRepo.save(s);
	}

}
