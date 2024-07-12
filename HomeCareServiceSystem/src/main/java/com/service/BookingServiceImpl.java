package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.BookingRepo;
import com.model.Booking;

@Service
public class BookingServiceImpl implements BookingService {

	@Autowired
	private BookingRepo bookingRepo;
	
	@Override
	public Booking addBooking(Booking b) {
		
		return bookingRepo.save(b);
	}

}
