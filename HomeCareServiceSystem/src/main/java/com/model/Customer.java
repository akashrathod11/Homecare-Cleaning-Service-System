package com.model;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class Customer {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long customerId;
    private String name;
    private String address;
    private String email;
    private String phoneNumber;
   
    
    @OneToMany(mappedBy = "customer")
    private List<Booking> bookings;
    
    @OneToMany(mappedBy = "customer")
    private List<Review> reviews;

	public Customer() {
		super();
	}

	public Customer(Long customerId, String name, String address, String email, String phoneNumber, 
			List<Booking> bookings, List<Review> reviews) {
		super();
		this.customerId = customerId;
		this.name = name;
		this.address = address;
		this.email = email;
		this.phoneNumber = phoneNumber;
		
		this.bookings = bookings;
		this.reviews = reviews;
	}

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
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
