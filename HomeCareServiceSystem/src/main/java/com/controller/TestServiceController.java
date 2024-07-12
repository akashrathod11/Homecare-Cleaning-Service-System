package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.model.Service;
import com.service.ServiceService;

@RestController
public class TestServiceController {

	
	@Autowired
	private ServiceService serviceService;
	
	@PostMapping("/saveService")
	public Service save(@RequestBody Service s)
	{
		return serviceService.addService(s);
	}
}
