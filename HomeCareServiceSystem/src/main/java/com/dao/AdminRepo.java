package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.model.Admin;


public interface AdminRepo extends JpaRepository<Admin, Long>{

	Admin findByEmail(String email);
}
