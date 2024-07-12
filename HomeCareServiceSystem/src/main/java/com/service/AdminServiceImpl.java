package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.AdminRepo;
import com.model.Admin;

@Service
public class AdminServiceImpl implements AdminService{
	
	@Autowired
	private AdminRepo adminRepo;

	@Override
	public Admin addAdmin(Admin a) {
		
		return adminRepo.save(a);
	}

}
