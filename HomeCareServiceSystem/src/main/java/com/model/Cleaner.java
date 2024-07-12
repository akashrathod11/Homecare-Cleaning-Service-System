package com.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;

@Entity
public class Cleaner {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long cleanerId;
	private String name;
	private String contactInfo;
	private String availability;
	private Double rating;

	@ManyToMany(mappedBy = "cleaners")
	private List<Booking> bookings;

	@OneToMany(mappedBy = "cleaner")
	private List<Review> reviews;

	public Cleaner() {
		super();
	}

	public Cleaner(Long cleanerId, String name, String contactInfo, String availability, Double rating,
			List<Booking> bookings, List<Review> reviews) {
		super();
		this.cleanerId = cleanerId;
		this.name = name;
		this.contactInfo = contactInfo;
		this.availability = availability;
		this.rating = rating;
		this.bookings = bookings;
		this.reviews = reviews;
	}

	public Long getCleanerId() {
		return cleanerId;
	}

	public void setCleanerId(Long cleanerId) {
		this.cleanerId = cleanerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContactInfo() {
		return contactInfo;
	}

	public void setContactInfo(String contactInfo) {
		this.contactInfo = contactInfo;
	}

	public String getAvailability() {
		return availability;
	}

	public void setAvailability(String availability) {
		this.availability = availability;
	}

	public Double getRating() {
		return rating;
	}

	public void setRating(Double rating) {
		this.rating = rating;
	}

	public List<Booking> getBookings() {
		return bookings;
	}

	public void setBookings(List<Booking> bookings) {
		this.bookings = bookings;
	}

	public List<Review> getReviews() {
		return reviews;
	}

	public void setReviews(List<Review> reviews) {
		this.reviews = reviews;
	}

}
