package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.ReviewRepo;
import com.model.Review;

@Service
public class ReviewServiceImpl implements ReviewService{

	
	@Autowired
	private ReviewRepo reviewRepo;
	
	@Override
	public Review addReview(Review r) {
		
		return reviewRepo.save(r);
	}

}
