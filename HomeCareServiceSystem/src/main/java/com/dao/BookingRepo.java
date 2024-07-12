package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.model.Booking;


public interface BookingRepo extends JpaRepository<Booking, Long>{

}
