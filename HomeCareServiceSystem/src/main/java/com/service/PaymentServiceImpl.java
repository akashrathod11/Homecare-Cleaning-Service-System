package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.PaymentRepo;
import com.model.Payment;

@Service
public class PaymentServiceImpl implements PaymentService {

	
	@Autowired
	private PaymentRepo paymentRepo;
	
	@Override
	public Payment addPayment(Payment p) {

		return paymentRepo.save(p);
	}

}
