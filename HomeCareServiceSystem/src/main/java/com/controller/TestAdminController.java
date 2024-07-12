package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dao.AdminRepo;
import com.model.Admin;
import com.model.Booking;
import com.model.Payment;
import com.model.Review;
import com.service.AdminService;
import com.service.BookingService;
import com.service.PaymentService;
import com.service.ReviewService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class TestAdminController {
    
	@Autowired
	private AdminService adminService;
	
	@Autowired
    private	BookingService bookingService;
	
	@Autowired
	private PaymentService paymentService;
	
	@Autowired
	private ReviewService reviewService;
	
	
	
	
	
	
	
	
	
	
	
	

	@PostMapping("/save")
	public Admin save(@RequestBody Admin a) 
	{

		return adminService.addAdmin(a);
	}
	
	@PostMapping("/saveBooking")
	public Booking save(@RequestBody Booking b) {
		
		return bookingService.addBooking(b);
	}
	
	@PostMapping("/savePayment")
	public Payment save(@RequestBody Payment p) {
		
		return paymentService.addPayment(p);

	}
	@PostMapping("/saveReview")
	public Review save(@RequestBody Review r) {
		return reviewService.addReview(r);
		
	}

}
