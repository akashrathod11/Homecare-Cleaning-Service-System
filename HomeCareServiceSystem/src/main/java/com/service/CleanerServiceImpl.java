package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.CleanerRepo;
import com.model.Cleaner;

@Service
public class CleanerServiceImpl implements CleanerService {

     @Autowired
     private CleanerRepo cleanerRepo;
	
	
	@Override
	public Cleaner addCleaner(Cleaner c) {
		
		return cleanerRepo.save(c);
	}
	
	

}
