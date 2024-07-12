package com.model;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Review {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long reviewId;

	@ManyToOne
	@JoinColumn(name = "customerId", nullable = false)
	private Customer customer;

	@ManyToOne
	@JoinColumn(name = "cleanerId", nullable = false)
	private Cleaner cleaner;

	private Double rating;
	private String comments;
	private Date reviewDate;

	public Review() {
		super();
	}

	public Review(Long reviewId, Customer customer, Cleaner cleaner, Double rating, String comments, Date reviewDate) {
		super();
		this.reviewId = reviewId;
		this.customer = customer;
		this.cleaner = cleaner;
		this.rating = rating;
		this.comments = comments;
		this.reviewDate = reviewDate;
	}

	public Long getReviewId() {
		return reviewId;
	}

	public void setReviewId(Long reviewId) {
		this.reviewId = reviewId;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Cleaner getCleaner() {
		return cleaner;
	}

	public void setCleaner(Cleaner cleaner) {
		this.cleaner = cleaner;
	}

	public Double getRating() {
		return rating;
	}

	public void setRating(Double rating) {
		this.rating = rating;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public Date getReviewDate() {
		return reviewDate;
	}

	public void setReviewDate(Date reviewDate) {
		this.reviewDate = reviewDate;
	}

}
