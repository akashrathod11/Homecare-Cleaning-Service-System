package com.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Service {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long serviceId;
	private String serviceName;
	private String description;
	private Double price;

	@OneToMany(mappedBy = "service")
	private List<Booking> bookings;

	public Service() {
		super();
	}

	public Service(Long serviceId, String serviceName, String description, Double price, List<Booking> bookings) {
		super();
		this.serviceId = serviceId;
		this.serviceName = serviceName;
		this.description = description;
		this.price = price;
		this.bookings = bookings;
	}

	public Long getServiceId() {
		return serviceId;
	}

	public void setServiceId(Long serviceId) {
		this.serviceId = serviceId;
	}

	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public List<Booking> getBookings() {
		return bookings;
	}

	public void setBookings(List<Booking> bookings) {
		this.bookings = bookings;
	}

}
