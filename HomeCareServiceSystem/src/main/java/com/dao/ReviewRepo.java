package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;


import com.model.Review;

public interface ReviewRepo extends JpaRepository<Review, Long>{

}
