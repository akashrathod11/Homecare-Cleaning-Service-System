package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;


import com.model.Service;

public interface ServiceRepo extends JpaRepository<Service, Long>{

}
