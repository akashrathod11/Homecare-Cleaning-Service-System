package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.model.Cleaner;
import com.service.CleanerService;

@RestController
public class TestCleanerController {
	
	@Autowired
	private CleanerService cleanerService;
	
  @PostMapping("/saveCleaner")
   public Cleaner save(@RequestBody Cleaner c) {
		
		return cleanerService.addCleaner(c);
	}
	

}
